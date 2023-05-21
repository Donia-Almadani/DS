
package collections;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Donia
 */
public class Collections {
    static HashSet<Integer> list=new HashSet<Integer>(); 
    static Deque<String> d=new ArrayDeque<String>();
    static PriorityQueue<String> queue=new  PriorityQueue<String>();
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
       
        for(;;){
        try{
            System.out.println("1. Hash Set\n" +
                               "2. Array Deque\n" +
                               "3. Priority Queue\n4. Exit");
             int number=in.nextInt();
             
            //_________________________________________________Hash Set____________________
            if(number==1){
                for(;;){
                    char c=menu();
                    if( c=='a'){
            
                        System.out.println("Enter number: ");
                        int num=in.nextInt();
                        list.add(num);
 
                    }if(c=='b'){
                        System.out.println("Enter number : ");
                        int num=in.nextInt();
                        list.remove(num);
                        
                   }if(c=='c'){
                      
                       Iterator it=list.iterator();
                       while(it.hasNext()){
                        System.out.print(it.next()+" ");
                       }
                       System.out.println(" ");
                        
                   }
                    if(c=='d')break;
               }
            }
            //_________________________________________________Array Deque_________________
            if(number==2){
                for(;;){
                char c=menu();
                if(c=='a'){
                    System.out.println("Enter String: ");
                    String str=in.next();
                    d.add(str);
                }if(c=='b'){
                    System.out.println("Enter String: ");
                    String str=in.next();
                    d.remove(str);
                }if(c=='c'){
                    for(String str:d)
                    System.out.print(str+" ");
                 System.out.println(" ");
                 
                }if(c=='d')break;
                }
                
            }
            //________________________________________________Priority Queue_____________
            if(number==3){
                for(;;){
                char c=menu();
                if(c=='a'){
                    System.out.println("Enter String: ");
                    String str=in.next();
                    queue.add(str);  
                }if(c=='b'){
                    System.out.println("Enter String: ");
                    String str=in.next();
                    queue.remove(str);
                }if(c=='c'){
                    System.out.println("Head: "+queue.element());
                    for(String str:queue){
                    System.out.print(str+" ");}
                    System.out.println(" ");
                }if(c=='d')break;
                }
                
            }if(number==4)break;
            }catch(Exception e){
               System.out.println("*************invalid value************");
                in.nextLine();
             
        }
        }
   }
    
    //_______________________Method to print menu_______
    public static char menu(){
        Scanner in=new Scanner(System.in); 
        System.out.println("a. Add element \n" +
        "b. Remove element\n" +
        "c. Print elements\nd. Exit");
        System.out.println("Enter : ");
        char c=in.next().charAt(0);
        
        return c;
    }
    
   
    
}
