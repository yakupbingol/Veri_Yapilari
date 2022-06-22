package _Grup_21_Main;

public class _Grup_21_HeapSort {
    
    public int _Grup_21_Left(int i){
        return (2 *i +1);
    }
    
    public int _Grup_21_Right(int i){
        return (2*i + 2);
    }
    
    public void _Grup_21_Sort(int[] dizi){
        int n = dizi.length;
        
        for(int i = n / 2 - 1; i>= 0; i--){
            _Grup_21_Heapify(dizi, n, i);
        }
        
        for(int i = n - 1;i>= 0; i--){
            int temp = dizi[0];
            dizi[0] = dizi[i];
            dizi[i] = temp;
            _Grup_21_Heapify(dizi, i, 0);
        }  
    }
    
    public void _Grup_21_Heapify (int[] dizi ,int n, int i){
        int largest = i;
        int left = _Grup_21_Left(i);
        int right = _Grup_21_Right(i);
        
        if (left < n && dizi[left] < dizi[largest])
            largest = left;
        if(right < n && dizi[right] < dizi[largest])
            largest = right;
        if (largest != i) {
            int temp = dizi[i];
            dizi[i] = dizi[largest];
            dizi[largest] = temp;
            
            _Grup_21_Heapify(dizi, n, largest);
        }
    }  
}


