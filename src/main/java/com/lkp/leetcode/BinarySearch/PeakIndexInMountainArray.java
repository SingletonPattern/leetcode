package com.lkp.leetcode.BinarySearch;

/**
 *@className PeakIndexInMountainArray
 *@description 山脉数组的峰顶索引
 *@Auther 85291173@qq.com
 *@Date 2019/9/30 17:25
 *@Version
 */
 public class PeakIndexInMountainArray {
	/**
	 *我们把符合下列属性的数组 A 称作山脉：
	 
	 A.length >= 3
	 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
	 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
	 示例 1：
	 输入：[0,1,0]
	 输出：1
	 示例 2：
	 输入：[0,2,1,0]
	 输出：1
	 *
	 *
	 */
	public int peakIndexInMountainArray(int[] A) {
		int left = 0;
		int right = A.length -1;
		while (left <= right){
			int mid = (left + right) >>>1;
			if(A[mid-1] <A[mid] && A[mid] < A[mid+1]){
				left = mid + 1;
			}else if(A[mid-1] >A[mid] && A[mid] > A[mid+1]){
				right = mid - 1;
			}else {
				return mid;
			}
		}
		return left;
	}
}
