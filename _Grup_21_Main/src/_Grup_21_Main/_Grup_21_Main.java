package _Grup_21_Main;

import java.util.*;

public class _Grup_21_Main {

    static void printArray(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void reverseArray(int[] dizi, int size) {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = dizi[i];
            dizi[i] = dizi[size - i - 1];
            dizi[size - i - 1] = temp;
        }
        Arrays.toString(dizi);
    }

    public static void main(String[] args) {
        int dataSize = 1024 * 1024;
        float kmemory;
        long endTime, beginTime;
        Runtime gR = Runtime.getRuntime();
        float memory1, memory2;

        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];
        int[] d = new int[1000];
        int[] e = new int[1000];
        int[] f = new int[1000];
        int[] g = new int[50000];
        int[] h = new int[50000];
        int[] k = new int[50000];
        int[] l = new int[500000];
        int[] m = new int[500000];
        int[] n = new int[500000];
        int[] p = new int[2500000];
        int[] s = new int[2500000];
        int[] t = new int[2500000];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000000);
            b[i] = a[i];
            c[i] = a[i];
        }
        for (int i = 0; i < d.length; i++) {
            d[i] = r.nextInt(1000000);
            e[i] = d[i];
            f[i] = d[i];
        }
        for (int i = 0; i < g.length; i++) {
            g[i] = r.nextInt(1000000);
            h[i] = g[i];
            k[i] = g[i];
        }
        for (int i = 0; i < l.length; i++) {
            l[i] = r.nextInt(1000000);
            m[i] = l[i];
            n[i] = l[i];
        }
        for (int i = 0; i < p.length; i++) {
            p[i] = r.nextInt(1000000);
            s[i] = p[i];
            t[i] = p[i];
        }

        _Grup_21_CountingSort cs = new _Grup_21_CountingSort();
        _Grup_21_InsertionSort is = new _Grup_21_InsertionSort();
        _Grup_21_HeapSort hs = new _Grup_21_HeapSort();

        // Rastgele Cou
        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(a);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 Rastgele eleman Couting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(d);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 Rastgele eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(g);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 Rastgele eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(l);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 Rastgele eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(p);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 Rastgele eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Rastgele İns
        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(b);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 Rastgele eleman İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println(" İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(e);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 Rastgele eleman İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(h);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 Rastgele eleman İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println(" İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(m);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 Rastgele eleman İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(s);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 Rastgele eleman İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        // Rastgele Heap
        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(c);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 Rastgele eleman Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(f);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 Rastgele eleman Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(k);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 Rastgele eleman Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(n);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 Rastgele eleman Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(t);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 Rastgele eleman Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Büyükten Küçüğe Cou
        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(a);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 Büyükten Küçüğe eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(d);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 Büyükten Küçüğe eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(g);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 Büyükten Küçüğe eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(l);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 Büyükten Küçüğe eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(p);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 Büyükten Küçüğe eleman Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Büyükten Küçüğe İns
        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(b);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 eleman Büyükten Küçüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

       
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(e);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 eleman Büyükten Küçüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

       
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(h);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 eleman Büyükten Küçüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

       
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(m);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 eleman Büyükten Küçüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

      
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(s);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 eleman Büyükten Küçüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Büyükten Küçüğe Heap
        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(c);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 eleman Büyükten Küçüğe  Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(f);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 eleman Büyükten Küçüğe  Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(k);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 eleman Büyükten Küçüğe  Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(n);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 eleman Büyükten Küçüğe  Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(t);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 eleman Büyükten Küçüğe  Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Küçükten Büyüğe Cou
        
        reverseArray(a, a.length);
        System.out.println("\n Küçükten Büyüğe Sıralı Dizinin Sıralanmadan Önceki Hali  : ");
        printArray(a);
        cs._Grup_21_countSort(a);
        System.out.println("\n Counting Sort İle Dizinin Sıralandıktan Sonraki Hali :  ");
        printArray(a);
        System.out.println();

        reverseArray(a, a.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(a);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 eleman Küçükten Büyüğe Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(d, d.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(d);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 eleman Küçükten Büyüğe Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(g, g.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(g);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 eleman Küçükten Büyüğe Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(l, l.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(l);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 eleman Küçükten Büyüğe Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(p, p.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        cs._Grup_21_countSort(p);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.00 eleman Küçükten Büyüğe Couinting Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Counting Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Küçükten Büyüğe İns
        reverseArray(b, b.length);
        System.out.println("\n Küçükten Büyüğe Sıralı Dizinin Sıralanmadan Önceki Hali  : ");
        printArray(b);
        is._Grup_21_InsertionSort(b);
        System.out.println("\n İnsertion Sort İle Dizinin Sıralandıktan Sonraki Hali :  ");
        printArray(b);

        reverseArray(b, b.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(b);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 eleman Küçükten Büyüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(e, e.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(e);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 eleman Küçükten Büyüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(h, h.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(h);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 eleman Küçükten Büyüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(l, l.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(l);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 eleman Küçükten Büyüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(s, s.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        is._Grup_21_InsertionSort(s);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 eleman Küçükten Büyüğe İnsertion Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("İnsertion Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        //Küçükten Büyüğe Heap
        reverseArray(c, c.length);
        System.out.println("\n Küçükten Büyüğe Sıralı Dizinin Sıralanmadan Önceki Hali  : ");
        printArray(c);
        hs._Grup_21_Sort(c);
        System.out.println("\n Heap Sort ile Dizinin Sıralandıktan Sonraki Hali :  ");
        printArray(c);
        System.out.println();

        reverseArray(c, c.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(c);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 100 eleman Küçükten Büyüğe Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(f, f.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(f);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 1.000 eleman Küçükten Büyüğe Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(k, k.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(k);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 50.000 eleman Küçükten Büyüğe Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(n, n.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(n);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 500.000 eleman Küçükten Büyüğe Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

        reverseArray(t, t.length);
        memory1 = gR.freeMemory();
        beginTime = System.currentTimeMillis();
        hs._Grup_21_Sort(t);
        endTime = System.currentTimeMillis();
        memory2 = gR.freeMemory();
        kmemory = (memory1 - memory2) / dataSize;
        System.out.println("\n 2.500.000 eleman Küçükten Büyüğe Heap Sort Çalışma Süresi : " + (endTime - beginTime) + "Milisaniye ");
        System.out.println("Heap Sort Tarafından Kullanılan Hafıza " + kmemory + " MB");

    }
}
