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

    public void setTopNext(int topNext) {
        mTopNext = topNext;
    }

    public int getBottomNext() {
        return mBottomNext;
    }

    public void setBottomNext(int bottomNext) {
        mBottomNext = bottomNext;
    }

    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public int getBottomText() {
        return mBottomText;
    }

    public void setBottomText(int bottomText) {
        mBottomText = bottomText;
    }

    public int getTopTex() {
        return mTopTex;
    }

    public void setTopTex(int topTex) {
        mTopTex = topTex;
    }
}
