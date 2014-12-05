// Jose Sierra
// CSE2 - hw11 
// 


public class MatrixSorter{
  public static void main(String arg[]){
      
      
      
      
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
}



