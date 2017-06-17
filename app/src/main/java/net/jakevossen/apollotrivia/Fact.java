package net.jakevossen.apollotrivia;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jake on 6/16/2017.
 */

public class Fact {
    private String question;
    private ArrayList<String> answers = new ArrayList<String>();
    private int correctAnswerIndex;
    private String correctAnswer;
    private String explanation;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Fact(String question, ArrayList<String> answersIn, int correctAnswerIndex, String explanation){
        this.question = question;
        this.answers.add(answersIn.get(0));
        this.answers.add(answersIn.get(1));
        this.answers.add(answersIn.get(2));
        this.answers.add(answersIn.get(3));
        this.correctAnswerIndex = correctAnswerIndex;
        this.correctAnswer = answers.get(correctAnswerIndex);
        this.explanation = explanation;
        randomize(answers);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void randomize(ArrayList<String> arr) {
        long seed = System.nanoTime();
        Collections.shuffle(arr, new Random(seed));
    }

    public String getQuestion(){
        return question;
    }
    public String getAnswer0(){
        return answers.get(0);
    }
    public String getAnswer1(){
        return answers.get(1);
    }
    public String getAnswer2(){
        return answers.get(2);
    }
    public String getAnswer3(){
        return answers.get(3);
    }
    public String getAnswer(int index){
        return answers.get(index);
    }
    public ArrayList<String> getAnswers(int index){
        return answers;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public int correctAnswerIndex(){
        return correctAnswerIndex;
    }
    public String getExplanation() {
        return explanation;
    }
}
