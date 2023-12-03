public class FirstCharCheck {
    public static void main(String[] args){
        System.out.println(repFirstChar("test"));

    }
    public static String repFirstChar(String s){

      char c = s.charAt(0);
      if(Character.isUpperCase(c)){
          return "upper";
      }else if (Character.isLowerCase(c)){
            return "lower";
        }  else if (Character.isDigit(c)){
          return "digit";
        }else{
          return "other";
        }

    }
}
