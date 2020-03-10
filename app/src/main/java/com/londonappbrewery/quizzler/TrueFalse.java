package com.londonappbrewery.quizzler;

public class TrueFalse {
    private int mQuestionID;
    private boolean Answer;

    public TrueFalse(int questionResourceID,boolean trueOrfalse){
        mQuestionID=questionResourceID;
        Answer =trueOrfalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return Answer;
    }

    public void setAnswer(boolean answer) {
        Answer = answer;
    }
}
