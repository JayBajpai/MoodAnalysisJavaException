package src.test.java.com.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	 @Test
	    public void givenNullMood_ShouldReturnHappy() throws MoodAnalysisException {
	        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
	        String mood = moodAnalyser.analyseMood("This is a Happy message");
	        Assertions.assertEquals("HAPPY", mood);

	    }

}
