public class Main {

    public static void main(String[] args) {
        String palindrome = "madam";
        System.out.println(checkPalindrome(palindrome));
    }

    public static boolean checkPalindrome(String inputString) {
        {
            int flag = 0;
            for(int i = 0; i < inputString.length(); i++)
            {
                if(inputString.charAt(i)!=inputString.charAt(inputString.length()-1-i))
                {
                    flag++;
                    break;
                }
            }
            if(flag == 0)
                return true;
            else
                return false;
        }

    }

}
