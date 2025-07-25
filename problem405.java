class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hex = "0123456789abcdef".toCharArray();
        return toHexHelper(num, hex);
    }
    private String toHexHelper(int num, char[] hex) {
        if (num == 0) return "";
        // & 15 gets last 4 bits
        // >>> 4 does unsigned shift
        return toHexHelper(num >>> 4, hex) + hex[num & 15];
    }
}
