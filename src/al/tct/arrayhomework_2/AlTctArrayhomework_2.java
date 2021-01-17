
package al.tct.arrayhomework_2;

import static java.lang.Math.abs;
import java.util.Arrays;
import java.util.Scanner;


public class AlTctArrayhomework_2 {

    

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 //  UShtrimi 1       
//        int [] numbers = {4,8,6,1,2,9,4};
//        int min=100;
//        int m=0;
//        for(int i=0; i<numbers.length-1; i++)
//        {
//            if (Math.abs(numbers[i+1]-numbers[i])<min)
//            {
//                min = Math.abs(numbers[i+1]-numbers[i]);
//                m=i;
//            }
//        }
//       System.out.println("Distanca me e vogel :" + min + " dhe indexet respective " + m + " dhe " + (m+1));

//////////////////////////////////////////////////////////////////////////////////////////////////////
//Ushtimi 2

//        System.out.println("Vendosni madhesine e vektorit");
//       int s =input.nextInt();
//int [] numbers= new int[s];
//int [] numbers2 =new int[s];
//int k=0;
//for(int i=0; i<numbers.length;i++)
//{
//    numbers[i]=input.nextInt();
//    numbers2[i]=-1;
//    
//}
//for(int i =0; i<numbers.length; i++)
//{boolean duplicate = false;
//    for(int j=0; j< numbers2.length; j++)
//    {
//        if(numbers[i]==numbers2[j])
//        {
//            duplicate=true;
//            break;
//        }
//        
//    }
//    if(duplicate==false)
//    {
//        numbers2[k]=numbers[i];
//        k++;
//    }
//}
//
//for(int i = 0; i<numbers2.length; i++)
//{
//    System.out.print(numbers2[i]+",");
//}

// Ushtrimi 3
// Menyra 1
//System.out.println("vendosni stringun e pare: ");
//String  s1=input.nextLine().toLowerCase();
//String [] s1V2= s1.split(" ");
//System.out.println("vendosni stringun e dyte: ");
//String s2= input.nextLine().toLowerCase();
//String [] s2V2= s2.split(" ");
//	if((s1.length()!=s2.length()))
//        {
//            System.out.println("Nuk eshte anagram");
//       
//        }
//        else
//        {      String str1="";
//               String str2="";
//            for(int i=0; i<s1V2.length; i++)
//            {
//              str1+=s1V2[i];
//              str2 += s2V2[i];
//            }
//            char [] char1=str1.toCharArray();
//            char[] char2 = str2.toCharArray();
//            boolean is_Anagram=true;
//            for(int i = 0; i< char1.length; i++)
//            {
//                for(int j=0; j< char2.length; j++)
//                {
//                    if(char1[i]==char2[j])
//                    {
//                        is_Anagram= true;
//                        char2[j]=' ' ;
//                    }
//                    else
//                    {
//                        is_Anagram=false;
//                        break;
//                    }
//                }
//            }
//                if(is_Anagram=true)
//                {
//                    System.out.println("Jane anagram");
//                }
//                else
//                {
//                    System.out.println("Nuk jane anagram");
//                }
//             
//            
//        }
// Menyra 2
//System.out.println("vendosni stringun e pare: ");
//String  string1 =input.nextLine().toLowerCase();
//System.out.println("vendosni stringun e dyte: ");
//String string2= input.nextLine().toLowerCase();
//
//     char[] stringu1 = string1.replaceAll("[\\s]", "").toCharArray();
//     char[] stringu2 = string2.replaceAll("[\\s]", "").toCharArray();
//   
//     Arrays.sort(stringu1);
//     Arrays.sort(stringu2);
//     if(Arrays.equals(stringu1, stringu2))
//     {
//         System.out.println("Jane anagram");
//     }
//     else{
//         System.out.println("Nuk jane anagram");
//     }

// Ushtrimi 4
//        System.out.println("Vendosni nnja fjali");
//       String s=input.nextLine().toLowerCase();
//       char [] stringu=s.replaceAll("[\\s]","").toCharArray();
//       int [] freq = new int[26];
//       char [] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//       for(int i=0; i<freq.length; i++)
//       {
//           freq[i]=0;
//       }
//       for(int i=0; i<stringu.length; i++)
//       {
//           for(int j=0; j<alphabet.length; j++)
//           {
//               if(stringu[i]==alphabet[j])
//                   freq[j]++;
//           }
//       }
//       for (int i = 0; i<alphabet.length;i++)
//       {
//           System.out.print( alphabet[i] + " : " + freq[i]+" , ");
//           
//       }
//       int sum=0;
//        for (int i = 0; i < freq.length; i++) {
//            sum=sum+freq[i];
//            
//        }
//        for (int i = 0; i < alphabet.length; i++) {
//            System.out.println("Germa " + alphabet[i] + " ka % frekuences " + (double)freq[i]/sum);
//            
//        }
//        int tempFreq;
//        char tempChar;
//        for(int i=1; i<freq.length; i++)
//        {
//           for(int j=0; j<i; j++)
//           {
//               if(freq[j]>freq[i])
//               {
//                   tempFreq=freq[i];
//                   tempChar=alphabet[i];
//                   freq[i]=freq[j];
//                   alphabet[i]=alphabet[j];
//                   freq[j]=tempFreq;
//                   alphabet[j]=tempChar;
//                
//                   
//               }
//           }
//        }
//      System.out.print("Rend rrites ");
//         for (int i = 0; i < alphabet.length; i++) {
//             System.out.print( alphabet[i] + " ;");
//            
//        }
//         System.out.println("");
//         System.out.print("Rend zbrites " );
//         for (int i = alphabet.length -1; i>=0; i--) {
//             System.out.print( alphabet[i] + " ;");
//            
//        }
        
// Ushtrimi Scrabble

String [] words = {" ", "EAIONRTLSU", "DG", "BCMP2", "FHVWY", "K", "JX", "QZ"};
int [] score = {0,1,2,3,4,5,8,10};

        System.out.println("vendosni nje string: ");
        String str=input.nextLine().toUpperCase();
        
        int sum=0;
        for(int i =0; i<str.length(); i++)
        {
            for(int j=0; j< words.length; j++)
            {
               int a= words[j].indexOf(str.charAt(i));
               if(a!=-1)
                { sum=sum+score[j];
                break;
                }
                
            }
        }
        System.out.println("piket e arritura jane : " + sum);   
    }  
    
}
