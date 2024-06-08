import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceSimilarity {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the sentence 1: ");

        var sentence1 = br.readLine().split(" ");

        System.out.print("\nEnter the sentence 2: ");

        var sentence2 = br.readLine().split(" ");

        System.out.print("\nEnter similar pairs: ");

        var similarPairs = Arrays.stream(br.readLine().split(" ")).toList();

        var pairs = new ArrayList<List<String>>();

        similarPairs.stream().spliterator().forEachRemaining(pair -> pairs.add(Arrays.asList(pair.split(","))));

        System.out.println("Are sentences similar: " + areSentencesSimilar(sentence1, sentence2, pairs));

    }


    public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {

        // System.out.println(sentence1);
        // System.out.println(sentence2);

        System.out.println(sentence1.length);
        System.out.println(sentence2.length);

        similarPairs.stream().spliterator().forEachRemaining(pair -> {
            String.join(",", pair.get(0), pair.get(1));
        });

        if (sentence1.length != sentence2.length)
            return false;

        for (int i = 0; i < sentence1.length; i++) {

            System.out.println(sentence1[i]);
            System.out.println(sentence2[i]);

            if (!similarPairs.isEmpty()) {
                System.out.println(similarPairs.get(i).get(0));
                System.out.println(similarPairs.get(i).get(1));
                System.out.println(sentence1[i].equals(similarPairs.get(i).get(0)));
                System.out.println(sentence2[i].equals(similarPairs.get(i).get(1)));
                if (!(sentence1[i].equals(similarPairs.get(i).get(0)) || sentence1[i].equals(similarPairs.get(i).get(1)))
                        || !(sentence2[i].equals(similarPairs.get(i).get(0)) || sentence2[i].equals(similarPairs.get(i).get(1)))) {
                    System.out.println("here!!!!");
                    return false;
                }
            }

        }

        return true;

    }
}
