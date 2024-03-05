import exercises.Exercise_1;
import exercises.Exercise_2;
import exercises.Exercise_3;
import interfaces.Exercise;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Exercise> exercises = new ArrayList<>(Arrays.asList(
                new Exercise_1(),
                new Exercise_2(),
                new Exercise_3()
        ));
        for(Exercise e : exercises) {
            e.execute();
        }
    }
}