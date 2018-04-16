package software.addigma.styleu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import software.addigma.styleu.Library.Question;


public class Quiz extends AppCompatActivity {
    private Question mQuestion = new Question();
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(3);

    private int mQuestionNumber;
    private TextView mQuestionView;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;

    private String mAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionView = (TextView) findViewById(R.id.questionText);
        mChoice1 = (Button) findViewById(R.id.choice1);
        mChoice2 = (Button) findViewById(R.id.choice2);
        mChoice3 = (Button) findViewById(R.id.choice3);
        updateQuestion();
        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mChoice1.getText() == mAnswer){

                }
            }
        });
        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mChoice1.getText() == mAnswer){

                }
            }
        });
        mChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mChoice1.getText() == mAnswer){

                }
            }
        });
    }
    private void updateQuestion(){
        randomNumber = mQuestionNumber;
        if(mQuestionNumber< mQuestion.getLength()){
            mQuestionView.setText(mQuestion.getQuestion(mQuestionNumber));
            mChoice1.setText(mQuestion.getChoice1(mQuestionNumber));
            mChoice1.setText(mQuestion.getChoice2(mQuestionNumber));
            mChoice3.setText(mQuestion.getChoice3(mQuestionNumber));

            mAnswer = mQuestion.getCorrectAnswer(mQuestionNumber);
        }else{
            Toast.makeText(Quiz.this , "Test is over",Toast.LENGTH_SHORT).show();
        }


    }


    private void updateScore(int point) {

    }
}
