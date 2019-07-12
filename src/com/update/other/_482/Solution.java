package com.update.other._482;

/**
 * 给定一个密钥字符串S，只包含字母，数字以及 '-'（破折号）。N 个 '-' 将字符串分成了 N+1 组。给定一个数字 K，重新格式化字符串，除了第一个分组以外，每个分组要包含 K 个字符，第一个分组至少要包含 1 个字符。两个分组之间用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
 * <p>
 * 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
 * <p>
 * 示例 1：
 * <p>
 * 输入：S = "5F3Z-2e-9-w", K = 4
 * <p>
 * 输出："5F3Z-2E9W"
 * <p>
 * 解释：字符串 S 被分成了两个部分，每部分 4 个字符；
 * 注意，两个额外的破折号需要删掉。
 * <p>
 * 示例 2：
 * <p>
 * 输入：S = "2-5g-3-J", K = 2
 * <p>
 * 输出："2-5G-3J"
 * <p>
 * 解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String string = "5F3Z-2e-9-w";
        int key = 4;
        System.out.println(solution.licenseKeyFormatting(string, key));
    }

    public String licenseKeyFormatting(String S, int K) {
        String result = S.replace("-", "");
        char[] chars = result.toCharArray();
        int tempIndex = result.length() - 1;
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        while (tempIndex >= 0) {
            if (temp >= K) {
                sb.append("-");
                temp = 0;
            } else {
                sb.append(chars[tempIndex]);
                temp++;
                tempIndex--;
            }
        }
        return sb.reverse().toString().toUpperCase();
    }
}