

@SuppressWarnings("unused")
class class_11 {
    public static void main(String args[]){
      
    }
    static int Max_Element(int a[]){
        int max = a[0];
        for(int i = 1 ; i < a.length; i++){
            max = Math.max(max,a[i]);
        }
        return max;
    }

    static int Min_Element(int a[]){
        int min = a[0];
        for(int i = 1 ; i < a.length; i++){
            min = Math.min (min,a[i]);
        }
        return min;
    }

    static int Max2_Element(int a[]){
        int max = a[0];
        int except = Max_Element(a);
        for(int i = 1 ; i < a.length; i++){
            if(a[i]==except)
                continue;
            max = Math.max(max,a[i]);
        }
        return max;
    }


    static int Count_even(int a[]){
        int count = 0;
        for(int i = 0 ; i<a.length ; i++)
            if(a[i]%2==0)
                count++;
        return count ;
    }
    
    static int Count_Odd(int a[]){
        int count = 0;
        for(int i = 0 ; i<a.length ; i++)
            if(a[i]%2!=0)
                count++;
        return count ;
    }
    
    static int[] Reverse(int a[]){
       int start = 0 ;
       int end = a.length-1;
       while(start < end){
        a[start] = a[start] + a[end];
        a[end] = a[start] - a[end];
        a[start] = a[start] - a[end];
        start ++;
        end --;
       }
        return a;
    }

    static int[] Bubble_short(int a[]){
        for(int x = ( a.length-1 );  x!=0 ;x--)
       { int temp  ;
        for(int j = 0 ; j<x && x!=0   ; j++)
         { if(a[j+1]<a[j])
          { temp = a[j+1];
          a[j+1] = a[j];
          a[j] = temp;
           }
        }
    }
      return a; 
    }

    static void Duplicate(int a[]){
        a = Bubble_short(a);

        for(int i = 0 ; i < a.length ;i++){
            int temp = a[i];
            int count = 0 ;
            for(int j = i+1 ;j < a.length; j++ ){
                if(temp == a[j])
                  count++;
            }
            if(count != 0 )
               System.out.print(a[i]+"\t");
            i += count;

        }
    }

    static int[] move_zero(int a[]){
        for(int i = 0 ; i < a.length; i++) {
            if (a[i] == 0) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length - 1] = 0;
            }
        }
        return a;
    }

    static int Missing_no(int a[]){
        int x = a.length - 1 ;
        int Sn = (a[x] *(a[x] + 1))/2;
        int sum = 0;
        for(int i =  0 ; i <= x ; i++)
            sum += a[i];
        return  Sn - sum;
    }

}

  