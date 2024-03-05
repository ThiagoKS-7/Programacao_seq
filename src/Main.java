import exercises.*;
import interfaces.Exercise;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Loop chamando referência ao método comum entre as classes
        new ArrayList<>(Arrays.asList(
                new Exercise_1(),
                new Exercise_2(),
                new Exercise_3(),
                new Exercise_3_1(),
                new Exercise_4(),
                new Exercise_5()
        )).forEach(Exercise::execute);
    }
}