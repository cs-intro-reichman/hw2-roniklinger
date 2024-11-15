public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        //int N = Integer.parseInt(args[0]);
        String time = args[0];
        int minutesadd = Integer.parseInt(args[1]);
        String hoursSt = (time.charAt(0) + "" + time.charAt(1));
        int hours = Integer.valueOf(hoursSt);
        String minutesSt = (time.charAt(3) + "" + time.charAt(4));
        int minutes = Integer.valueOf(minutesSt);

        int total_minutes = (hours * 60) + minutes + minutesadd;
        int new_hour = (total_minutes / 60) % 24;
        int new_minutes = total_minutes - ((total_minutes / 60)* 60);
        String final_hour = "";
        
        if(new_hour < 10){
            if(new_minutes < 10){
                final_hour = "0" + new_hour + ":" + "0" + new_minutes;
            }
            else{
                final_hour = "0" + new_hour + ":" + new_minutes;
            }
        }
        else{
            if(new_minutes < 10){
                final_hour = new_hour + ":" + "0" + new_minutes;
            }
            else{
                final_hour = new_hour + ":" + new_minutes;
            }
        }
        System.out.println( final_hour);
    }
}
