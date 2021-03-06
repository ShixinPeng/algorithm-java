//  main.c
//  P2_homework
//
//  Created by shixinPeng on 2021/2/19.
//  Copyright © 2021 psx. All rights reserved.
//

#include <stdio.h>
#include <assert.h>

void test2_57(){
    // float 不能准确描述的正整数值 2^(n+1) + 1
        int int_float_post_int = (int)(pow(2,(23+1)));
        test_show_bytes(65537);
        test_show_bytes(1);
}
void test2_58(){
    // 测试大小端
    int r = is_little_endian();
    printf("r = %d \n",r);
}

void test2_59(){
    int x = 0x89ABCDEF;
    int y = 0x76543210;
    int z = group_mask(x,y);
    printf("x=0x%X y=0x%X 组成=0x%X\n",x,y,z);
}

void test2_60(){
    
    int w = sizeof(unsigned) << 3;
    printf("w=%d\n",w);
    unsigned x = 0x12345678;
    unsigned a1 = replace_byte(x,1,0xAB);
    printf("replace_byte(0x%X,2,0xAB) --> 0x%X \n",x,a1);
    
    unsigned a2 = replace_byte(x,0,0xAB);
    printf("replace_byte(0x%X,0,0xAB) --> 0x%X \n",x,a2);
    
}
void test2_61(){
    int a = 0x0fFFFF0F;
    int b = 0x0F0;
    int c = 0xFFF;
    int d = 0x000FFFFF;
    
    int ax = check_x(a);
    printf("A:%d\n",ax);
    int bx = check_x(b);
    printf("B:%d\n",bx);
    int cx = check_x(c);
    printf("C:%d\n",cx);
    int dx = check_x(d);
    printf("D:%d\n",dx);
    
}

void test2_61_2(){
    int all_bit_one = -0;
    int all_bit_zero = 0;
    
    assert(check_a(all_bit_one));
    assert(!check_b(all_bit_one));
    assert(check_c(all_bit_one));
    assert(!check_d(all_bit_one));
    
}

int main(int argc, const char * argv[]) {
    // insert code here...
    printf("Hello, World!\n");
    
//    test2_57()
//    test2_58();
//    test2_59();
//    test2_60();
//    test2_61();
    test2_61_2();
    
    return 0;
}

