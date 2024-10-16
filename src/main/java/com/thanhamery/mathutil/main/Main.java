package com.thanhamery.mathutil.main;


import static com.thanhamery.mathutil.core.MathUtility.*;

public class Main {
    public static void main(String[] args) {

        //testFactorialGivenRightArgument0RunsWell();
        //testFactorialGivenRightArgument1RunsWell();
        //testFactorialGivenRightArgument5RunsWell();
        testFactorialGivenWrongArgumentMinus5ThrowsException();
    }

    //Về lí thuyết ta phải test với data n = 2, 3,.. 20


    //TEST CASE #4:
    //DESCRIPTION: TEST FACTORIAL WITH INVALID ARGUMENT, E.G N = -5
    //STEPS:
    //      CALL GETFACTORIAL(-5)
    //EXPECTED RESUTL:
    //      AN EXCEPTION IS THROWN - KÌ VỌNG 1 NGOẠI LỆ XH

    //DIỄN GIẢI THÊM TA TEST N ÂM, TA SẼ NHẬN VỀ CHỬI -> HÀM TA CHẠY ĐÚNG NHƯ THIẾT KẾ
    //THẤY NGỌAI LỆ MỪNG RƠI NƯỚC MẮT

    static void testFactorialGivenWrongArgumentMinus5ThrowsException(){
        getFactorial(-5);

    }


    //TEST CASE #3: TỰ VIẾT NOT MÔ TẢ
    static void testFactorialGivenRightArgument5RunsWell(){


        System.out.println("5! expected: 120 "
                + "\nActual value:" + getFactorial(5));
    }

    //TEST CASE #2:
    //Description: Check getFactorial() method with valid argument (n = 1)
    //Step/Procedures: (cách test, các bước verify hàm, chức năng)
    //      Call function/method with n = 1  getFactorial(1)
    //      To have 1 as the result of 1!

    //Status (passed/falied-bug): mình phải run hàm và nhìn giá trị trả về mới biết hàm chạy đúng hay sai
    //      PASSED!!!!!!!
    //CHẠY TEST CASE/LÀM CÁC BƯỚC Ở TRÊN ĐỂ XÁC ĐỊNH ĐC HÀM ĐÚNG SAI
    //  -> GỌI LÀ TEST RUN



    static void testFactorialGivenRightArgument1RunsWell(){
        int n = 1;
        long expectedResult = 1; //hy vọng 1! = 1
        long actualResult = getFactorial(n);
        //SO SÁNH BẰNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
        // -> GỌI LÀ TEST RUN

        System.out.println("1! expected: " + expectedResult
                + "\nActual value:" + actualResult);

    }

    //các test case để dưới đây
    static void testFactorialGivenRightArgument0RunsWell(){
        //Đề thi PE viết như thế này:
        //TEST CASE #1:
        //Description: Check getFactorial() function with valid argument (n = 0)
        //Steps:
        //      Call function/method with n = 0 getFactorial(0)
        //Expected result:
        //          Get 1 as a result of 0!
        //Actual result/Status (passed, field)  (waiting for test run)
        //

        //TEST RUN: Run cái test case
        long expectedResult = 1;
        //long actualResult = MathUtility.getFactorial(0);    //named-argument
        long actualResult = getFactorial(0);
        System.out.println("Expected value:" + expectedResult
                        + " | Actual value:" + actualResult);

    }
}