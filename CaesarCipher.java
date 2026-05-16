import java.util.*;
 
class CaesarCipher
{
    public static void main(String args[])
    {
      Scanner sc  = new Scanner(System.in);     // create an object to allow reading from the screen
      int shift, msgsize, i;
      char ch, ch1;
      String encrypt= "", decrypt = "";
      
      String message = prompt("Enter the desired message (at least 6 in length):  ", sc, 6);          
      message = message.toLowerCase();        // convert of message to lower case
      msgsize = message.length();             // determine the length of the message 
                  
      String shiftval = prompt("Enter the value by which each letter of the string is to be shifted: ", sc, 1);
      shift = Integer.parseInt(shiftval);     // accept key to determine how many spaces to shift alphabet
      System.out.println();
      System.out.print("********* ");
                                  
/************************** ENCRYPTION SECTION *************************************************************************/
		System.out.print("The encrypted message is: ");
      
	   char emsg[] = message.toCharArray();   // convert message to individual standing characters

      for(i = 0; i < msgsize; i++)
       {
          if(Character.isLetter(emsg[i]))
          {
            ch = (char)(((int)emsg[i] + shift - 97) % 26 + 97); // find the encryption equal for letter
            encrypt += ch;
          } 
         else if(emsg[i] == ' ')
         {
            encrypt += emsg[i];            // add for spaces in correct location as in message
         } 
       }
       System.out.println(encrypt);       // print encrypted message 
       System.out.println();
       System.out.print("********* ");

 /************************** DECRYPTION SECTION *************************************************************************/
          
		  System.out.print("The decrypted message is: ");
         
        char dmsg[] = encrypt.toCharArray();   // convert encrypted message to individual standing characters
       
        for(i = 0; i < encrypt.length(); i++)
          if(Character.isLetter(dmsg[i]))
           {
              if(((int) dmsg[i] - shift) < 97)
                 ch1 = (char)(((int)dmsg[i] - shift - 97 + 26) % 26 + 97);
              else
                 ch1 = (char)(((int)dmsg[i] - shift - 97) % 26 + 97);
              decrypt += ch1;
           } 
           else if(dmsg[i] == ' ')
             decrypt += dmsg[i];             // add for spaces in correct location as in message           
         System.out.println(decrypt);
    }                                        // ending main program 
  
/************************ GETTING USER INPUT ***************************************************************************/
    private static String prompt(String promptText, Scanner sc, int minLen) 
    { 
    /* receive text from program and displys on the screen for user to see */
    
        String s;
        do 
        {
            System.out.print(promptText);
            s = sc.nextLine().trim();        // accept message from user
        } 
        while (s.length() < minLen);
        return s;
    }
  
/**********************************************************************************************************************/      
}