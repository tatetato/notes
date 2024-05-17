public class MyArray {
    public static void main(String[] args) {
        // String[] f = { "春", "なつ", "aki", "冬" };
        // // System.out.println("春");
        // for (String season : f) {
        // System.out.println(season);
        // }

        // int[] e = { 3, 9, 11, 5, 7, 2 };
        // int z = 0;
        // for (int x : e) {
        // z = z + x;
        // }
        // System.out.println(z);

        // double sum;
        // double[] d = {
        // 2.345,
        // 98.07,
        // 444.4
        // };
        // sum = 0;
        // for (double x : d) {
        // sum = sum + x;
        // }
        // System.out.println(sum);

        int[] myIntArray = { 49, 16, 189, 91, 124, 63, 170, 92, 162, 139, 133, 8, 59, 97, 148, 124, 104, 90, 93, 95, 29,
                32, 28, 147, 25, 2, 31, 143, 35, 43, 167, 89, 43, 57, 21, 41, 106, 34, 119, 192, 199, 137, 174, 7, 94,
                29, 37, 133, 151, 130, 152, 168, 41, 17, 199, 36, 1, 2, 29, 137, 67, 83, 41, 62, 147, 24, 32, 180, 17,
                186, 53, 102, 199, 21, 103, 76, 40, 104, 181, 15, 78, 153, 136, 159, 152, 185, 181, 112, 78, 163, 101,
                130, 147, 19, 155, 119, 190, 49, 114, 64, 149, 124, 57, 137, 102, 115, 132, 163, 27, 135, 183, 48, 66,
                172, 113, 65, 6, 150, 59, 3, 125, 97, 132, 48, 135, 128, 178, 177, 160, 23, 175, 89, 162, 20, 22, 45,
                186, 24, 104, 88, 60, 92, 79, 11, 110, 30, 151, 185, 127, 35, 76, 129, 122, 94, 12, 133, 131, 127, 65,
                79, 156, 103, 91, 130, 124, 55, 184, 38, 69, 72, 17, 110, 112, 21, 50, 92, 8, 148, 77, 101, 63, 68, 181,
                110, 17, 153, 162, 29, 123, 130, 165, 149, 79, 12, 57, 193, 135, 111, 100 };
        double[] myDoubleArray = { 93.41, -44.31, -43.00, -29.61, -72.81, 32.77, -47.33, 29.90, 22.26, -91.29, -7.14,
                -42.75, 144.35, 189.92, 93.18, 17.28, 16.72, -4.09, -4.97, -100.21, -26.88, 70.37, 71.33, 109.70,
                -66.83, 134.77, -176.81, -34.65, 87.76, -92.03, 42.16, -47.53, 55.37, 86.10, 34.59, 86.87, 213.23,
                124.35, -13.97, 193.02, 199.20, 158.75, 101.43, 1.21, 189.40, -38.51, 73.55, -56.17, -133.40, 41.94,
                52.50, -128.34, 77.82, 1.80, 128.07, 49.13, 29.28, 35.25, 11.22, 78.32, 104.00, 94.90, 81.96, -48.02,
                -139.74, 101.12, -7.44, 98.71, 6.84, -53.40, -22.20, -53.79, 60.77, 164.17, 100.39, -61.11, 40.34,
                -2.54, -9.45, 146.11, 20.13, 4.05, 32.46, 123.98, 42.77, -159.81, -105.69, 100.32, 35.54, -30.46,
                -89.94, -88.45, -25.59, -80.14, -99.20, 139.58, 61.82, 62.76, -32.72, 65.53, -90.71, 55.16, 103.21,
                22.55, -49.11, 23.12, -82.58, -8.66, 35.45, 89.84, -5.63, -144.31, -159.29, 39.49, 53.82, 243.50,
                -39.53, 7.94, -128.30, 90.35, -85.16, -46.05, -5.77, 191.62, 144.53, -6.69, 239.98, 29.11, -165.53,
                74.32, -126.04, 33.55, -19.69, 9.87, -218.15, -4.07, -19.72, 26.23, 160.06, 24.33, 31.49, 168.37,
                -129.53, -7.29, 6.28, -71.06, -89.27, -96.34, -125.16, 105.06, 37.64, 178.99, -12.89, -68.09, 3.55,
                78.88, 91.70, 25.16, -116.97, 28.59, 106.19, 37.77, -67.46, 187.84, -39.17, -63.61, 193.15, -79.07,
                43.28, -201.66, -110.62, 25.93, 146.01, 145.04, -30.62, 21.24, -37.57, -83.01, 115.34, 227.82, 123.08,
                15.19, -64.62, 42.03, 108.63, 13.59, 8.06, 11.77, -2.67, 47.88, -3.21, -153.55, 71.13, -16.88, -120.06,
                164.53, 168.08, 86.15, 32.52 };

        int intSum = 0;
        for (int i : myIntArray) {
            intSum = intSum + i;
        }

        double doubleSum = 0;
        for (double i : myDoubleArray) {
            doubleSum = doubleSum + i;
        }

        double intAverage = Double.valueOf(intSum) / myIntArray.length;
        double doubleAverage = doubleSum / myDoubleArray.length;

        double sumTemp = 0;
        for (double i : myIntArray) {
            sumTemp = sumTemp + (i - intAverage) * (i - intAverage);
        }
        double intVariance = sumTemp / myIntArray.length;

        sumTemp = 0;
        for (double i : myDoubleArray) {
            sumTemp = sumTemp + (i - doubleAverage) * (i - doubleAverage);
        }
        double doubleVariance = sumTemp / myIntArray.length;

        System.out.println("length of my int array is: " + myIntArray.length);
        System.out.println("length of my double array is: " + myDoubleArray.length);
        System.out.println("----------");
        System.out.println("sum of my int array is: " + intSum);
        System.out.println("sum of my double array is: " + doubleSum);
        System.out.println("----------");
        System.out.println("average of my int array is: " + intAverage);
        System.out.println("average of my double array is: " + doubleAverage);
        System.out.println("----------");
        System.out.println("variance of my int array is: " + intVariance);
        System.out.println("variance of my double array is: " + doubleVariance);
    }

}
