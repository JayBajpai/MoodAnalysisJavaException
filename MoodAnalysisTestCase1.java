package moodAnalyserPrograms;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalysisTestCase1 {



    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalysis moodAnalyser = new MoodAnalysis(null);
        String mood = moodAnalyser.analyseMood("This is a Happy message");
        Assertions.assertEquals("HAPPY", mood);

    }
}