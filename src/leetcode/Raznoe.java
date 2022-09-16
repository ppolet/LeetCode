/*
 * Задачи не из LeetCode
 */
package leetcode;

public class Raznoe {
}

/*
https://habr.com/ru/company/tinkoff/blog/686996/
Написать метод, который будет возвращать true, если поданный на вход массив int содержит 3 и более последовательных числа в любом месте. 
Задачу необходимо решить не более чем одним циклом.
*/
class Raznoe1 {
    public boolean isTrue(int[] a) {
        if (a.length < 2) return false;
        
        for(int i = 2; i < a.length; i++){
            if (a[i] - a[i-1] == 1 && a[i-1] - a[i-2] == 1) return true;
        }
        
        return false;
    }
}
