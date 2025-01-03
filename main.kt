import Jan_01_2025.MaximumScoreAfterSplittingAString
import Jan_03_2025.NumberOfWaysToSplitArray


fun main(){

    val maximumScore = MaximumScoreAfterSplittingAString().maxScore("")
    println(maximumScore)

    val nums = intArrayOf(1,2,3)
    val numberOfWaysToSplitArray = NumberOfWaysToSplitArray().waysToSplitArray(nums)
    println("number ways to split array is : $numberOfWaysToSplitArray")

}