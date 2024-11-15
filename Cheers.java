// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String name = args[0];
                int num = Integer.parseInt(args[1]);
                int name_len = name.length();
                int i = 0;
                char letter;
                while(i < name_len){
                        letter = name.charAt(i);
                        if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' ||letter == 'I' ||
                                letter == 'L' || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' ||
                                letter == 'S' || letter == 'X'){
                                        System.out.println("Give me an " + letter + ": " + letter + "!");
                                 }
                        else{
                                System.out.println("Give me a  " + letter + ": " + letter + "!");   
                        }
                        i++;
                }
                System.out.println("What does that spell?");
                for (int j = 0; j < num; j++){
                        System.out.println(name + "!!!");
                }
        }
}
