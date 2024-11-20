// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String name = args[0];
                name = name.toUpperCase();
                int num = Integer.parseInt(args[1]);
                int name_len = name.length();
                char letter;
                for(int i=0;i<name_len;i++){
                        letter = name.charAt(i);
                        if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' ||letter == 'I' ||
                                letter == 'L' || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' ||
                                letter == 'S' || letter == 'X'){
                                        System.out.println("Give me an " + letter + ": " + letter + "!");
                                 }
                        else{
                                System.out.println("Give me a  " + letter + ": " + letter + "!");   
                        }
                }
                System.out.println("What does that spell?");
                for (int j = 0; j < num; j++){
                        System.out.println(name + "!!!");
                }
        }
}
