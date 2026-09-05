@SuppressWarnings("unused")
class class_12 
{
    public static void main(String args[]){
        // int a[] = {45, 78, 32, 90, 65, 49};
        // Marks_analysis s = new Marks_analysis();
        // System.out.println(s.Max_marks(a));
        // System.out.println(s.Min_marks(a));
        // System.out.print(s.Above_than(a,50));
    }
}

@SuppressWarnings("unused")
class Marks_analysis
{
    int Max_marks(int a[]){
        int max = a[0];
        for(int i = 1 ; i < a.length; i++){
            max = Math.max(max,a[i]);
        }
        return max;
    }

    int Min_marks(int a[]){
        int min = a[0];
        for(int i = 1 ; i < a.length; i++){
            min = Math.min (min,a[i]);
        }
        return min;
    }

    int Above_than(int a[] , int range) {
        int count = 0;
        for(int i = 0 ; i< a.length ; i++){
            if(a[i]>range)
                count++;
        }
        return count;
        
    }

}

@SuppressWarnings("unused")
class Price_analysis
{
    int Max_price(int a[]){
        int max = a[0];
        for(int i = 1 ; i < a.length; i++){
            max = Math.max(max,a[i]);
        }
        return max;
    }

    int Min_price(int a[]){
        int min = a[0];
        for(int i = 1 ; i < a.length; i++){
            min = Math.min (min,a[i]);
        }
        return min;
    }

    int[] Arrange_order(int a[]){
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
}

@SuppressWarnings("unused")
class Score_analysis
{
    int Max_score(int a[]){
        int max = a[0];
        for(int i = 1 ; i < a.length; i++){
            max = Math.max(max,a[i]);
        }
        return max;
    }

    int Min_score(int a[]){
        int min = a[0];
        for(int i = 1 ; i < a.length; i++){
            min = Math.min (min,a[i]);
        }
        return min;
    }

    int total_score(int a[]){
        int total = 0;
        for(int i : a)
            total += i;
        return total;
    }
}

