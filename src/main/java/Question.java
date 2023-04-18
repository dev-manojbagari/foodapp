@Data
public class Question {

    private String questionId;
    private String description;
    private Difficulty difficulty;

    public  Question(String description,Difficulty difficulty,int question_count){
         this.questionId = "Q" + question_count;
          this.difficulty = difficulty;
    }
}

