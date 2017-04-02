

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class QuizTest {

    /* test challenger class components */
    
    // test set name and password methods
    @Test
    public void challengerTest1() {
        Challenger challenger = new Challenger("name", "password", null); // intialize challenger object

        // check name and password
        assertEquals("name", challenger.getName());
        assertEquals("password", challenger.getPassword());

        // change name and password
        challenger.setName("otherName");
        challenger.setPassword("otherPassword");

        // check name and password change
        assertEquals("otherName", challenger.getName());
        assertEquals("otherPassword", challenger.getPassword());
    }

    // test addScore and getScores methods
    @Test
    public void challengerTest2() {
        Challenger challenger = new Challenger("name", "password", null); // intialize challenger object
        ArrayList<Integer> expected = new ArrayList<>(); // intialize array of integers

        // add scores to challenger
        challenger.addScore(1);
        challenger.addScore(2);
        challenger.addScore(3);
        challenger.addScore(4);

        // add scores to array
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        // check getScores
        assertEquals(expected, challenger.getScores());
    }
    
    // test constructor and get name and password methods
    @Test
    public void challengerTest3() {
        Challenger challenger = new Challenger("name", "password", null); // intialize challenger object

        // check name and password
        assertEquals("name", challenger.getName());
        assertEquals("password", challenger.getPassword());
    }

    // test addScore and getScores methods if return scores in order rank
    @Test
    public void challengerTest4() {
        Challenger challenger = new Challenger("name", "password", null); // intialize challenger object
        ArrayList<Integer> expected = new ArrayList<>(); // intialize array of integers  

        // add scores to challenger unsorted
        challenger.addScore(4);
        challenger.addScore(1);
        challenger.addScore(3);
        challenger.addScore(2);

        // add scores sorted
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        // check getScores 
        assertEquals(expected, challenger.getScores());
    }

    /* test challengers class components */
    
    // test constructor, add and found methods
    @Test
    public void challengersTest1() {
        Challengers challenger = new Challengers(); // intialize challengers object

        // add challenger name to challengers
        challenger.add("name", "password");
        
        // check name if found in challengers
        assertTrue(challenger.found("name"));
    }

    // test get password
    @Test
    public void challengersTest2() {
        Challengers challenger = new Challengers(); // intialize challengers object

        // add challenger name and password to challengers
        challenger.add("name", "password");
        
        // check password
        assertEquals("password",challenger.getPassword("name"));
    }

    // test addScore and score methods (run this method just one time because file is updated)
    @Test
    public void challengersTest3() {
        Challengers challenger = new Challengers(); // intialize challengers object

        // add challenger name and password to challengers
        challenger.add("name", "password");
        
        ArrayList<Integer> expected = new ArrayList<>(); // intialize array of integers

        // add scores to challenger
        challenger.addScore("name",1);
        challenger.addScore("name",2);
        challenger.addScore("name",3);
        challenger.addScore("name",4);

        // add scores to array
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        // check score
        assertEquals(expected, challenger.score("name"));
    }
    
    /* test questions class behaviors */
    
    // test constructor and getQuestion method
    @Test
    public void QuestionsTest1() {
        Questions q = new Questions("a"); // declare question object to get different questions of (Food Category)

        // print question, choices and answer
        String question[] = q.getQuestion().split("!!!") ;
        System.out.println("Question in foud is " + question[0]);
        System.out.println("Answer is " + question[1]);
        // check if two questions is not equals
        assertTrue(!q.getQuestion().equals(q.getQuestion()));
    }
    
    // test difference of questions
    @Test
    public void QuestionsTest2() {
        Questions q = new Questions("b"); // declare question object to get different questions of (Captalize Category)
        
        // print question, choices and answer
        String question[] = q.getQuestion().split("!!!") ;
        System.out.println("Question in foud is " + question[0]);
        System.out.println("Answer is " + question[1]);
        // check if two questions is not equals
        assertTrue(!q.getQuestion().equals(q.getQuestion()));
    }
}
