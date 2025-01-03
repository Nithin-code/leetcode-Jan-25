package Jan_03_2025

class NumberOfWaysToSplitArray {


    fun waysToSplitArray(nums: IntArray): Int {
        var res : Long = 0
        var currentSum : Long = 0
        var totalSum : Long = 0
        if (nums.isEmpty()){
            return 0
        }
        for (element in nums){
            totalSum+= element
        }

        for (i in 0..nums.size-2){
            currentSum+=nums[i]
            if (currentSum>=(totalSum-currentSum)){
                res++
            }
        }

        return res.toInt()
    }
}