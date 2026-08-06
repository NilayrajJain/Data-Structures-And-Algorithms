class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n1 = g.length;
        int n2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;
        while(j<n1 && i<n2)
        {
            if(s[i]>=g[j])
            {
                count++;
                j++;
            }
            i++;
        }

        return count;
    }
}