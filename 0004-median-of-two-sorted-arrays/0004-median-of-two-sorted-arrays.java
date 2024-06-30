class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        int sum=0;
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int total = list.size();
        if (total % 2 == 1) {
            return list.get(total / 2);
        } else {
            return (list.get(total / 2 - 1) + list.get(total / 2)) / 2.0;
        }
    }
}