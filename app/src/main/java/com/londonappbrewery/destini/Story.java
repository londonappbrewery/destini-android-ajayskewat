package com.londonappbrewery.destini;

public class Story {
    int mStory;
    int mBottomText;
    int mTopTex;
    int mTopNext;
    int mBottomNext;

    public Story(int story, int bottomText, int topTex, int topNext, int bottomNext) {
        mStory = story;
        mBottomText = bottomText;
        mTopTex = topTex;
        mTopNext = topNext;
        mBottomNext = bottomNext;
    }

    public int getTopNext() {
        return mTopNext;
    }


    public int getBottomNext() {
        return mBottomNext;
    }

    public int getStory() {
        return mStory;
    }

    public int getBottomText() {
        return mBottomText;
    }

    public int getTopTex() {
        return mTopTex;
    }
}
