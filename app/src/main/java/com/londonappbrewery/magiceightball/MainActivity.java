package com.londonappbrewery.magiceightball;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
import static com.londonappbrewery.magiceightball.R.id.image_eightBall;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = (ImageView) findViewById(image_eightBall);
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Button askButton = (Button) findViewById(R.id.ask_button);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = new Random().nextInt(4); // 5 random numbers
                ballDisplay.setImageResource(ballArray[number]);
                Log.i("Magic", "baller");
            }
        });
    }
}
