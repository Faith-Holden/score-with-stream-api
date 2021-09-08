package solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        Score[] scores = new Score[]{
                new Score("Smith","John",70),
                new Score("Doe","Mary",85),
                new Score("Page","Alice",82),
                new Score("Cooper","Jill",97),
                new Score("Flintstone","Fred",66),
                new Score("Rubble","Barney",80),
                new Score("Smith","Judy",48),
                new Score("Dean","James",90),
                new Score("Russ","Joe",55),
                new Score("Wolfe","Bill",73),
                new Score("Dart","Mary",54),
                new Score("Rogers","Chris",78),
                new Score("Toole","Pat",51),
                new Score("Khan","Omar",93),
                new Score("Smith","Ann",95)
        };

        System.out.println("________________________________________________");
        System.out.println("Number of scores.");
        System.out.println(Arrays.stream(scores).count());
        System.out.println("________________________________________________");
        System.out.println("Average score.");
        System.out.println( Arrays.stream(scores).mapToDouble(score -> score.score).average());
        System.out.println("________________________________________________");
        System.out.println("Number of A's.");
        System.out.println( Arrays.stream(scores).mapToDouble(score -> score.score).
                filter(testScore -> testScore >= 90).count());

        System.out.println("________________________________________________");
        System.out.println("People scoring less than 70 points.");
        List<String> lowScores = Arrays.stream(scores).
                filter(score -> score.score<70).map(score -> {return score.firstName + " "+ score.lastName;}).
                collect(Collectors.toList());
        System.out.println(lowScores);
        lowScores.stream().forEach(System.out::println);

        System.out.println("________________________________________________");
        System.out.println("Scores, ordered alphabetically by last name.");
        Arrays.stream(scores).
                sorted(Comparator.comparing((Score score) -> score.lastName)).
                forEach(score -> System.out.println(score.firstName + " " + score.lastName + " => " + score.score));

        System.out.println("________________________________________________");
        System.out.println("Scores, ordered by score from lowest to highest.");
        Arrays.stream(scores).
                sorted(Comparator.comparing((Score score) -> score.score)).
                forEach(score -> System.out.println(score.firstName + " " + score.lastName + " => " + score.score));

    }
}
