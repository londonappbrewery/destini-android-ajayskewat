package com.londonappbrewery.destini;

import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final int NO_OPTION = 0;

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mTopButton;
    private Button mBottomButton;

    private  int mStoryIndex;

    Story [] mStories = new Story[]{
            new Story(R.string.T1_Story,R.string.T1_Ans2,R.string.T1_Ans1,2,1),
            new Story(R.string.T2_Story,R.string.T2_Ans2,R.string.T2_Ans1,2,3),
            new Story(R.string.T3_Story,R.string.T3_Ans2,R.string.T3_Ans1,4,5),
            new Story(R.string.T4_End,NO_OPTION,NO_OPTION,NO_OPTION,NO_OPTION),
            new Story(R.string.T5_End,NO_OPTION,NO_OPTION,NO_OPTION,NO_OPTION),
            new Story(R.string.T6_End,NO_OPTION,NO_OPTION,NO_OPTION,NO_OPTION),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        if(savedInstanceState == null){
            mStoryIndex =0;
        }
        else{
            mStoryIndex = savedInstanceState.getInt("StoryIndexKey");
        }

       showStory(mStoryIndex);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mStories[mStoryIndex].getTopNext();
                showStory(mStoryIndex);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mStories[mStoryIndex].getBottomNext();
                showStory(mStoryIndex);
            }
        });

    }

    private void showStory(int nextStoryIndex) {
        mTextView.setText(mStories[nextStoryIndex].getStory());

        if(mStories[nextStoryIndex].getTopTex() == NO_OPTION) {
            mTopButton.setVisibility(View.GONE);
        }
        else {
            mTopButton.setText(mStories[nextStoryIndex].getTopTex());
        }

        if(mStories[nextStoryIndex].getBottomNext() == NO_OPTION) {
            mBottomButton.setVisibility(View.GONE);
        }
        else {
            mBottomButton.setText(mStories[nextStoryIndex].getBottomText());
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outBuild){
        super.onSaveInstanceState(outBuild);
        outBuild.putInt("StoryIndexKey",mStoryIndex);
    }
}
