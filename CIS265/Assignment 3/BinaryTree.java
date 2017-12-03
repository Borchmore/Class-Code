class BinaryTree{
   
   Node root;
   Node current;
   
   BinaryTree(){
      root = null;
      current = null;
   }
   
   public void preorderPrint(Node node){
      
      System.out.println(node.line);
      
      if(!(node.left == null)){
         preorderPrint(node.left);
      }
      
      if(!(node.right == null)){
         preorderPrint(node.right);
      }
   }
   
   public void inorderPrint(Node node){
      
      if(!(node.left == null)){
         inorderPrint(node.left);
      }
      
      System.out.println(node.line);
      
      if(!(node.right == null)){
         inorderPrint(node.right);
      }
   }
   
   public void postorderPrint(Node node){
      
      if(!(node.left == null)){
         postorderPrint(node.left);
      }
      
      if(!(node.right == null)){
         postorderPrint(node.right);
      }
      
      System.out.println(node.line);
   }
   
   public void preorderPrint(){
      preorderPrint(root);
      System.out.println();
   }
   
   public void inorderPrint(){
      inorderPrint(root);
      System.out.println();
   }
   
   public void postorderPrint(){
      postorderPrint(root);
      System.out.println();
   }
}