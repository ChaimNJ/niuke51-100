package _056_offer_ReplaceSpace;


public class Solution {

    /**
     * O(n^2)
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
    /**
     * O(n)
     * 先找出空格数量，字符串加上一个2*空格数等于结果字符串的长度
     * p指向原来字符串尾部，q指向结果字符串尾部，p遇到空格q写入%20，指导q为0
     * @param str
     * @return
     */
    public String replaceSpace_1(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                sb.append('%');
                sb.append('2');
                sb.append('0');
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
