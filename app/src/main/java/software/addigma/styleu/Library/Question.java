package software.addigma.styleu.Library;

public class Question {

    private String mQuestion [] = {
        "Siapa anda ?",
            "Siapa saya ?",
            "Lah saya siapa ?",

    };

    private String mChoices [][] = {
            {"kang begal","orang nyusahin","gak bisa farming"},
            {"Wizard","Maehwa","Witch"},
            {"Lah ngegas!","siapa ya ?","Memangnya kau siapa ?"}

    };

    private String mCorretAnswer[] = {"gak bisa farming","Witch","Lah ngegas!"};
    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorretAnswer[a];
        return answer;
    }
    public int getLength(){
        return mQuestion.length;
    }
}
