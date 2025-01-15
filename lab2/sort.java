
public class sort {
   public static void main(String[] args) {
     int []arr=new int[args.length];
     for(int i=0;i<args.length;i++){
      arr[i]=Integer.parseInt(args[i]);
     }
     int temp=0;
     for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if (arr[j]>arr[j+1]){
          temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
}
for (int i=0;i<arr.length;i++){
  System.out.println(arr[i]);
}
}}
