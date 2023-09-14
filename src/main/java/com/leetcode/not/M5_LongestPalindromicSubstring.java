package main.java.com.leetcode.not;

public class M5_LongestPalindromicSubstring {
    static public String longestPalindrome(String s) {
        if (s.length() <= 1 || s.length() > 1000) return s;
        if (s.contentEquals(new StringBuilder(s).reverse())) return s;

        String res = "";

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (temp.contentEquals(new StringBuilder(temp).reverse()) && temp.length() > res.length()) {
                    res = temp;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abb"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("caaaaa"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("uhrfjotnewtodhmbplsaolnpcdaohiytmfllukijouxipvqohtsgxbtfoxyfkfczkfwhzimbefiohmtimrcxbpgcxogystdkcqujvbxsgirpccdnvejtljftwkdpsqpflzwruwwdzovsbmwbcvlftkjnxqaguvtsycylqzquqkbnybnbaeahbxejhphwrpmymcemuhljwtuvxefqfzjhskuqhifydkxpnfwfxkpeexnjltfqwfvchphmtsrsyayxukvmlqodshqwbeaxhcxdbssnrdzvxtusngwqdxvluauphmmbwmgtazjwvolenegwbmjfwprfuswamyvgrgshqocnhirgyakbkkggviorawadzhjipjjgiwpelwxvtaegauerbwpalofrbghfhnublttqtcmqskcocwwwxpnckrnbepusjyohsrretrqyvgnbezuvwmzizcefxyumtdwnqjkgsktyuacfpnqocqjxcurmipjfqmjqrkdeqsfseyigqlwmzgqhivbqalcxhlzgtsfjbdbfqiedogrqasgmimifdexbjjpfusxsypxobxjtcwxnkpgkdpgskgkvezkriixpxkkattyplnpdbdifforxozfngmlgcunbnubzamgkkfbswuqfqrvzjqmlfqxeqpjaqayodtetsecmfbplscmslpqiyhhykftzkkhshxqvdwmwowokpluwyvavwvofwqtdilwqjgrprukzyhckuspyzaoe"));
        System.out.println(longestPalindrome("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
        System.out.println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
