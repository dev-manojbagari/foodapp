@NoArgsConstructor
@Data
public class ContestParticipate extends  Contest{
   private int rank;
   private int  solvedQuestions;
   private Status participationStatus;
   private int initial_rating;
   private int final_rating;

   public ContestParticipate(Contest contest, User creator) {
      super();

   }
}

