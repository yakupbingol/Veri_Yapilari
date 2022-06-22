package _Grup_21_Main;

public class _Grup_21_CountingSort {
    
    int _Grup_21_getMax(int[] dizi) {
        int max = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }
        return max; 
    }
    
    void _Grup_21_countSort(int[] dizi) 
    {
        int[] output = new int[dizi.length + 1];
        int max = _Grup_21_getMax(dizi);
        int[] count = new int[max + 1]; 

        for (int i = 0; i <= max; ++i) {
            count[i] = 0; 
        }

        for (int i = 0; i < dizi.length; i++) 
        {
            count[dizi[i]]++;
        }

        for (int i = max - 1 ; i >= 0; i--) {
            count[i] += count[i + 1];  
        }
        for (int i = dizi.length - 1; i >= 0; i--) {
            output[count[dizi[i]] - 1] = dizi[i];
            count[dizi[i]]--; 
        }

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = output[i];
        }
    }
    
}
