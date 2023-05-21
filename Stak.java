
package stack;
import java.util.Scanner;

 class Stack{
     int pottom ;
     int top=-1;
     int arr[]=new int[5];
  public Stack(){
      
  }  
  public int top(){
     return arr[top];
  }
  public void push(int ele){
      if(isFull()){
          System.out.println("stack is full");
                  
      }else {
      top=top+1;
      arr[top]=ele;
      }
  }
  public boolean isFull(){
     if(arr.length==(top+1)){
       return true;  
     }
     else
         return false;
  }
  public int pop(){
      if(!isEmpty()){
         int ele=arr[top];
         arr[top]=0;
         top=top-1;
         
         
         return ele;
      }
      return -0;
  }
  
  public boolean isEmpty(){
      if(top<0){
          return true;
      }
      else
          return false;
  }
 
   
   
        

    }
        public class main{
         public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack  st=new Stack();
        
        Stack ob=new Stack();
        for(;;){
             try{
            System.out.print("1.Add element to stack(push)\n2-return the top of the stack and remove it (pop)\n3.print size of the stack\n4.print element of the stack\n5.Exit\n:");
            int num=in.nextInt();
            
            if(num==1){
                System.out.println("Enter element: ");int ele=in.nextInt();
                
              st.push(ele);
                
            }
            else if(num==2){
                
              System.out.println("pop : "+st.pop());
            }
            else if(num==3){
                int size=st.top+1;
                System.out.println("The size= "+size);
            }
            else if(num==4){
              for(int i=0;i<=st.top;i++){
                  System.out.print(st.arr[i]+" ");
              }
                System.out.println("");
            }
            else if(num==5){
                    break;
                    }
               
        }catch(Exception e){
               System.out.println("*************invalid value************");
                in.nextLine();
             
        }
        }
             
        //_____________________________queue_part____________________
          queue q=new queue();
        for(;;){
             try{
        
            System.out.print("1.Add element to queue(enqueue)\n2.Remove element from queue and return it (dequeue)\n3.print element of the queue\n4.print size of the queue\n5.exit\n::");
            int num=in.nextInt();
          
            
            if(num==1){
                System.out.println("Enter the Element");int ele=in.nextInt();
                q.enqueue(ele);
            }else if(num==2){
              System.out.println("The front: "+  q.dequeue());
            }else if(num==3){
            for(int i=q.front;i!=q.rear;i=(i+1)%q.size){
                System.out.print(q.arrq[i]+" ");
              }
                System.out.print(q.arrq[q.rear]+"\n");
              
            }else if(num==4){
                System.out.println("The size:"+ q.size());
                
            }else if(num==5)break;
           
        }catch(Exception e){
               System.out.println("*************invalid value************");
                in.nextLine();
             
        }
        }
    }
         
}
        
 class queue{
     Scanner in=new Scanner(System.in);
     int size=5;
     int arrq[]=new int[size];
     int front=0;
     int rear=-1;
     int co=0;
     public void enqueue(int e){
        if((!isFull())){
            rear=(rear+1)%5;
            arrq[rear]=e;
            co++;
         }else System.out.println("**Queue is full**");
              
     }
     public int dequeue(){
         if(!isEmpty()){
             int ele= arrq[front];
             arrq[front]=0;
             
           front++;
           co--;
          return ele;  
         }
      return -0;
     }
     public int first(){
         return  arrq[front];
         
     }
     public boolean isFull(){
         if (co==size)return true;
       return false;
               
     }
      public boolean isEmpty(){
         if (co==0)return true;
       return false;
               
     }
    
     public int size(){
       return co;
     }
     
 }


    
