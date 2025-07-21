class Solution {
    public String intToRoman(int num) {
        // Arrays of Roman symbols and their corresponding values
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,  4,  1};
        String[] symbols ={"M",  "CM","D", "CD","C", "XC","L", "XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        // Loop through values and symbols
        for(int i = 0; i < values.length && num > 0; i++) {
            while(num >= values[i]) {
                num -= values[i];              // Subtract value from number
                sb.append(symbols[i]);         // Append the Roman symbol
            }
        }
        return sb.toString();
    }
}
