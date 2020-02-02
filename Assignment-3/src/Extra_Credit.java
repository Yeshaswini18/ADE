import java.util.Scanner;

public class Extra_Credit {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input String :");
        String inputSentence = scan.nextLine();
        String outputSentence = reverse(inputSentence);
        System.out.println("Input Sentence : " + inputSentence);
        System.out.println("Output Sentence : " + outputSentence);

    }


    public static String reverse(String inputSentence) {
        String[] sentence = inputSentence.split("\\s+");
        StringBuilder outputSentence = new StringBuilder();
        for (int i = sentence.length-1; i >= 0; i--)
        {
            outputSentence.append(sentence[i]).append(" ");
        }
        return outputSentence.toString();
    }
}
