package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends Activity implements View.OnClickListener {
    Button btNext, btPrev;
    ImageView ivImage;
    int currentImage = 0;
    int[] ImageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        btNext = (Button) findViewById(R.id.nextImage);
        btPrev = (Button) findViewById(R.id.prevImage);
        ivImage = (ImageView) findViewById(R.id.ivImage);

        btNext.setOnClickListener(this);
        btPrev.setOnClickListener(this);
        ImageID = new int[]{R.drawable.tulips, R.drawable.penguins, R.drawable.image};
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nextImage:
                currentImage++;
                currentImage %= 3;
                ivImage.setImageResource(ImageID[currentImage]);

                break;
            case R.id.prevImage:
                currentImage--;
                if (currentImage < 0)
                    currentImage += 3;
                currentImage %= 3;
                ivImage.setImageResource(ImageID[currentImage]);
                break;
        }


    }
}
