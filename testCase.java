
package testJunit;

import junit.framework.TestCase; 


public class testCase extends TestCase {
    Triangle Tri = new Triangle();
    String equilateral = "��������Ϊ�ȱ�������";
    String isosceles = "��������Ϊ����������";
    String scalene = "��������Ϊ������������";
    String nonTri = "�ⲻ��һ��������";
    String res;

    public void testEquilateral(){
        res = Tri.check(1, 1, 1);
        assertEquals(equilateral, res);
    }

    public void testIsosceles(){
        res = Tri.check(1, 1, 2);
        assertEquals(isosceles, res);
    }

    public void testScalene(){
        res = Tri.check(2, 3, 4);
        assertEquals(scalene, res);
    }

    public void testNonTri(){
        res = Tri.check(1, 2, 3);
        assertEquals(nonTri, res);
    }

}