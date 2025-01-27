/**
   This class determines the grade for a final exam.
*/

public class FinalExam extends GradedActivity
{
   private int numQuestions;  // Number of questions
   private int numMissed;     // Questions missed

   /**
      The constructor sets the number of questions on the
      exam and the number of questions missed.
      @param questions The number of questions.
      @param missed The number of questions missed.
   */

   public FinalExam(int questions, int missed)
   {
      double numericScore;  // To hold a numeric score

      // Set the numQuestions and numMissed fields.
      numQuestions = questions;
      numMissed = missed;

      // Calculate the numeric score for this exam.
      numericScore = 100.0 - (missed * getPointsEach());

      // Call the inherited setScore method to
      // set the numeric score.
      setScore(numericScore);
   }

   /**
      The getNumQuestions method returns the number of 
      questions on the exam.
      @return The value of the numQuestions field.
   */

   public int getNumQuestions()
   {
      return numQuestions;
   }

   /**
      The getNumMissed method returns the number of 
      questions missed.
      @return The value of the numMissed field.
   */

   public int getNumMissed()
   {
      return numMissed;
   }
   
   /**
      The getPointsEach method returns the number of
      points each question is worth.
      @return The points for each question.
   */

   public double getPointsEach()
   {
      return 100.0 / numQuestions;
   }
}