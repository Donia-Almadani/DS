


package list;

import java.util.*;
/**
 *
 * @author Donia
 */
//____________________________________________________________________________
 public class LList{
     Node head=null;
     Node tail=null;
     int size=0;
     public  void AddLast(int ele){
     if(size==0){
       Node newEle=new Node(ele);
       head=newEle;
       tail=newEle;
       size++;
               
     }
     else{
         Node newEle=new Node(ele);
         tail.next=newEle;  
         tail=newEle;
         size++;
     }
     }
     public void AddFirst(int ele){
       if(size==0){
          Node newEle=new Node(ele);
          head=newEle;
          tail=newEle;
          size++;
     }
       else{
         Node newEle=new Node(ele);
        newEle.next=head;
         head=newEle;
         size++;
       }
     }
     public void printL(){
        Node d=head;
        if(d!=null){
        for(int i=0;i<size;i++){
            System.out.print(d.data+"  ");
         if(d.next==null){
             break;
         }
            d=d.next;
       
     }
        }
         System.out.println("");
     }
     public void DeleteBeginning(){
         head=head.next;
     }
     
 }
//_____________________________________________________________________________________________
class Node{
        int data;
        Node next;
        
        Node(int d) 
        { data = d;}
    }
//______________main_____________________________________________________________________________
 class list{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LList nn=new LList();
      
       for(;;){
           try{
        System.out.println("1. Add new node at the end of LL\n" +
                            "2. Delete a node from the beginning of LL\n" +
                            "3. Print all data in the LL\n" +
                            "4. Exit \n");
        int num=in.nextInt();
        if (num==1){
            System.out.println("Enter Element:");
            int element=in.nextInt();
            nn.AddLast(element);
        }
        else if(num==2){
            nn.DeleteBeginning();
        
        }
        else if(num==3){
         nn.printL();
        } 
        else if(num==4){
            System.out.println(""+nn.head.next.next.data);
            break;
        }
        }catch(Exception e){
               System.out.println("*************invalid value************");
                in.nextLine();
             
        }
       }
       
    } 
}
