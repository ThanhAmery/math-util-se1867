package com.thanhamery.mathutil.core;

//ta tạo bộ thư viện cung cấp các hàm tiện ích liên quan toán học
//vì là đồ tiện ích dùng chung, tool cho nhiều nơi sử dụng -> hàm static

public class MathUtility {

    //hàm tính giai thừa n! = 1.2.3...n
    //ko tính giai thừa âm
    //0! = 1! = 1
    //20! vừa đủ kiểu long, 18 con số 0
    //bài này ko chơi với 21! trở lên
    public static long getFactorial(int n) {

        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n!!!. n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;  //0! là 1

        //sống sót đến chỗ này, n = 2 3 4 5...20
        //vòng for nhân dồn - nguyên lý con heo đất
        long result = 1; //tích ban đầu là 1
        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }
}
