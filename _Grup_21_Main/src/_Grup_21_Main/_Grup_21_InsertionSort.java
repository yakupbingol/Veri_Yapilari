package _Grup_21_Main;

public class _Grup_21_InsertionSort {
    public void _Grup_21_InsertionSort (int[] dizi)
    {
        int uzunluk = dizi.length;
        for(int i=1; i<uzunluk; i++)
        {
           int key = dizi[i];
           int j = i-1;
           while(j >= 0 && key > dizi[j])
           {
              dizi[j+1] = dizi[j];
              j = j-1;
           }
           dizi[j+1] = key;
        }
    }
}
