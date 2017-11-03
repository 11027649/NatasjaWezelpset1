package natasjawezel.natasjawezel__pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms, mustache, hat, eyes, eyebrows, glasses, shoes, mouth, nose, ears;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = findViewById(R.id.arms);
        mustache = findViewById(R.id.mustache);
        hat = findViewById(R.id.hat);
        eyes = findViewById(R.id.eyes);
        eyebrows = findViewById(R.id.eyebrows);
        glasses = findViewById(R.id.glasses);
        shoes = findViewById(R.id.shoes);
        mouth = findViewById(R.id.mouth);
        nose = findViewById(R.id.nose);
        ears = findViewById(R.id.ears);
    }

    @Override
    public void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);

        int arms_vis = arms.getVisibility();
        int mustache_vis = mustache.getVisibility();
        int hat_vis = hat.getVisibility();
        int eyes_vis = eyes.getVisibility();
        int eyebrows_vis = eyebrows.getVisibility();
        int glasses_vis = glasses.getVisibility();
        int shoes_vis = shoes.getVisibility();
        int mouth_vis = mouth.getVisibility();
        int nose_vis = nose.getVisibility();
        int ears_vis = ears.getVisibility();

        outState.putInt("arms", arms_vis);
        outState.putInt("mustache", mustache_vis);
        outState.putInt("hat", hat_vis);
        outState.putInt("eyes", eyes_vis);
        outState.putInt("eyebrows", eyebrows_vis);
        outState.putInt("glasses", glasses_vis);
        outState.putInt("shoes", shoes_vis);
        outState.putInt("mouth", mouth_vis);
        outState.putInt("nose", nose_vis);
        outState.putInt("ears", ears_vis);
    }

    @Override
    public void onRestoreInstanceState (Bundle inState) {
        super.onRestoreInstanceState(inState);

        int arms_vis_R = inState.getInt("arms");
        int mustache_vis_R = inState.getInt("mustache");
        int hat_vis_R = inState.getInt("hat");
        int eyes_vis_R = inState.getInt("eyes");
        int eyebrows_vis_R = inState.getInt("eyebrows");
        int glasses_vis_R = inState.getInt("glasses");
        int shoes_vis_R = inState.getInt("shoes");
        int mouth_vis_R = inState.getInt("mouth");
        int nose_vis_R = inState.getInt("nose");
        int ears_vis_R = inState.getInt("ears");

        arms.setVisibility(arms_vis_R);
        mustache.setVisibility(mustache_vis_R);
        hat.setVisibility(hat_vis_R);
        eyes.setVisibility(eyes_vis_R);
        eyebrows.setVisibility(eyebrows_vis_R);
        glasses.setVisibility(glasses_vis_R);
        shoes.setVisibility(shoes_vis_R);
        mouth.setVisibility(mouth_vis_R);
        nose.setVisibility(nose_vis_R);
        ears.setVisibility(ears_vis_R);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.check_ears:
                if (checked)
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_arms:
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_eyes:
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_eyebrows:
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_hat:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_glasses:
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_mouth:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_shoes:
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_nose:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;

            case R.id.check_mustache:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
