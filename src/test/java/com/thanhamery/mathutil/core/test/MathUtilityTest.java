package com.thanhamery.mathutil.core.test;


import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static com.thanhamery.mathutil.core.MathUtility.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //Test case #3:Check getFactorial() with n = -5... to see the Exception
    //tôi muốn thấy có ngoại lệ xuất hiện trong tình huống n âm or n > 20
    //ngoại lệ có xh như dự kiến hay ko... nếu có thì phải là màu xanh!!!
    //NGHE KĨ: có ngoại lệ nhưng là màu xanh, vì ngoại lệ xh như dự kiến
    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
        //getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(22);});
    }



    //Test case #2: Check getFactorial() with n = 5 to see resullt of 120
    @Test
    void testFactorialGivenRightArgument5RunsWell() {
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        
    }

    //Cấu trúc test case: ID, Desc, Steps/Procedures, Expected Result,
    //                  Actual Result, Status: Passed, Failed,
    //                  Test Date, Bug # (bug id) Bugzilla (Bug DB)
    //                  Jira


    //Test case #1: Check getFactorial() with n = 0 to see resullt of 1
    //

    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        long expectedValue = 1;  //hy vọng 0! trả về 1
        long actualValue = getFactorial(0);

        //so sánh
        //truyền thống ta sout() in kết quả và nhìn = mắt để đoán đúng sai
        //hiện đại: xài thêm tool, thư viện, unit testing framework JUnit
        //giúp đôi mắt ta nhìn kết quả đúng sai qua 2 màu xanh và đỏ
        //não và mắt ko cần nhìn, đoán và kết luận như truyền thống
        //mà nay thấy đỏ => tạch, xanh => ổn
        assertEquals(expectedValue, actualValue);

        //giống nhau màu xanh, lệch nhau màu đỏ hàm chạy ko ra kq như mong đợi
    }
}

//QUY TẮC XANH ĐỎ CỦA UNIT TEST TOOL/FRAMEWORK
//NẾU TẤT CẢ CÁC TEST CASE PASSED (EXPECTED == ACTUAL) => MÀU XANH
//CHỈ CẦN 1 TRONG NHỮNG TEST CASE FAILED (EXPECTED != ACUTUAL) => MÀU ĐỎ
//LÝ DO: HÀM ĐÃ ĐÚNG THÌ PHẢI ĐÚNG HẾT VỚI CÁC TEST CASE ĐÃ ĐƯA RA!!!
//MẮT CHỈ NHÌN 2 TÍN HIỆU - XANH, ĐỎ THEO STYLE GỘP CÁC KẾT QUẢ
//XANH: ĐÚNG HẾT, ĐỎ: 1 THẰNG NÀO CHẾT -> BỎ HÀM, FIX LẠI!!!

//KĨ THUẬT VIẾT CODE TEST HÀM LUÔN, DÙNG 2 TRẠNG THÁI XANH ĐỎ, CỨ LIÊN TỤC CODE
//XONG CHẠY XANH, ĐỎ, SỬA, CHẠY LẠI XANH ĐỎ, TỐI ƯU CHỈNH CODE, CHẠY LẠI XANH
//ĐỎ, XANH ĐỎ LIÊN TỤC TRONG QUÁ TRÌNH VIẾT CODE ĐC GỌI LÀ TDD
//TEST DRIVEN DEVELOPMENT - VIẾT CODE SONG HÀNH CÙNG CODE TEST
