
package ddl;
import java.util.Scanner;
//_____________________DLL class__________
class dList{
     Node head=null;
     Node tail=null;
     Node prov=null;
     int size=0;
 //__________________Add Node method___________ 
     public  void Add(int ele){
     if(size==0){
       Node newEle=new Node(ele);
       head=newEle;
       tail=newEle;
       
       size++;        
     }
     else if(1==size){
         Node newEle=new Node(ele);  
          
          head.next=newEle;
          newEle.prev=head;
          tail=newEle;
          size++;       
     }
     else{
         Node newEle=new Node(ele);
         newEle.prev=head;
         newEle.next=head.next;
         head.next=newEle; 
         Node t=newEle.next;
         t.prev=newEle;
         size++; 
     }
     }
   //____________Delet Node Method____________________ 
     public void Delet(int ele){
         
          Node d=head;
      if(size!=0){
        for(int i=0;i<size;i++){
           
         if(d.data==ele){            
            
           if(d.data==head.data){
              head=d.next;
              head.prev=null;
              size--;

            }
          else if(d.data==tail.data){
               tail=d.prev;  
               tail.next=null;
               size--;
           }
          else{
              Node pr=d.prev;
              Node ne=d.next;
              pr.next=ne;
              ne.prev=pr;
              size--;
          }
         }
          d=d.next;
        }
        }
         
     }
    //_________________print Node Method________________      
      public void printL(){
        Node d=head;
        if(d!=null){
        for(int i=0;;i++){
            System.out.print(d.data+"  ");
         if(d.next==null){
             break;
         }
            d=d.next;
       
     }
        }
         System.out.println("");
     }
     }
//________________Node class____________________
      class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int d) 
        { data = d;
        }
     }
//_____________________Main_____________________
public class DDL {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     dList ne=new dList();
     for(;;){
         try{
        System.out.println("Enter num\n1-Add new node to DLL\n2-Delete a node from DDL\n3-Show how many nodes in DLL\n4-print all data in the DLL\n5-Exit");
        int num=in.nextInt();
        if(num==1){
            System.out.println("Enter Element");
            int ele=in.nextInt();
             ne.Add(ele);
        }
        else if(num==2){
           System.out.println("Enter Element");
            int ele=in.nextInt();
            ne.Delet(ele);
        }else if(num==3){
            System.out.println(" Number of element: "+(ne.size));  
        }else if(num==4){
          ne.printL();
        }else if(num==5){
            break;
        }
         }catch(Exception e){
               System.out.println("*************invalid value************");
                in.nextLine();
             
        }
    }
    }
    
}
