
package tree;
/**
 *
 * @author Donia
 */

import java.util.Scanner;
import javax.swing.plaf.RootPaneUI;
class node{
    static node root;
    int data;
    node left;
   node right;
  public node(int data ){
      
      this.data=data;
      this.left=null;
      this.right=nulkll;
  }
    
}
//-----------------------------------------------------------
class treeBi{
     node ro;
      int coun = 0;
    public void add(node newnode,node ro){
        
      if(node.root==null){
        node.root=newnode;
        ro=newnode;
         coun++;
      }
       if(newnode.data>ro.data) {
           if(ro.right==null){
           ro.right=newnode;
           coun++;
           }
           else { add(newnode,ro.right);}
        }else{
           if(ro.left==null){
               ro.left=newnode; 
               coun++;
           }
           else add(newnode,ro.left);
       }
}
    public void delete(int ele){
        
    }
    public int minNode(){
        
        return 0;
    }
    public void findNode(int val,node ro){
        if(ro==null){return;}
          if(val>ro.data) {
            findNode(val,ro.right);
        }
          if(val<ro.data){ 
              findNode(val,ro.left);          
        }
          if(val==ro.data){
              
          }
    }
    public void print(){
        System.out.println(node.root.data);
        if(ro.left!=null){
            System.out.println(ro.left);
        }
        if(ro.right!=null){
            System.out.println(ro.right);
        }
        
    }
    
}
//------------------------------------------------------------------------
public class Tree {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        treeBi ne=new treeBi();
        for(;;){
        System.out.println("Enter num\n1-Add a node\n2-Delete a node\n3-Show minimum node\n4-Find a node\n5-Print all nodes\n6-Exit");
         int num=in.nextInt();
         if(num==1){
             System.out.println("enter vslue: ");
             int val=in.nextInt();
            node no=new node(val);
            ne.add(no,node.root);
         }else if(num==2){ 
             
         }else if(num==3){
        
         }else if(num==4){
             
         }else if(num==5){
             ne.print();
         }else if(num==6){
            break; 
         }
        }
    
    }
    
}
