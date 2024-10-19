package com.thanhamery.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //@Test là 1 phần ANNOTATION của framework, biến cái hàm của ta thành hàm MAIN
    //Để có thể RUN. Hàm bình thường chỉ có thể trong MAIN() để chạy
    //@Test biến hàm bất kì thành MAIN()

    //Kĩ thuật DDT - DATA DRIVEN TESTING: là kĩ thuật tách bộ DATA kiểm thử ra
    //Khỏi các câu lệnh kiểm thử, mục đích giúp Developer nhìn nhanh đc xem
    //bộ test case còn thiếu case nào hay ko.
    //Kĩ thuật này còn gọi tên khác là tham số hóa bộ DATA kiểm thử
    //                          PARAMETERIZED TESTING

    //Ta làm riêng 1 hàm, phải là STATIC, để lưu bộ data kiểm thử

    public static Object[][] initTestData() {
        return new Object[][]
                {
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24,},
                        {5, 120},
                        {6, 7200}
                };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentsRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException() {
        return new Integer[] {-1, -2, -3, -4, -5, -6, -100, 21, 22, 23, 24, 100}; //bên C# gọi là Object Init Solarization

    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactorialGivenWrongArgumentsThrowException(int n) {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtility.getFactorial(n));
    }
}