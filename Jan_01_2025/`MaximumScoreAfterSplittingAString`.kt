package Jan_01_2025

import kotlin.math.max

class `MaximumScoreAfterSplittingAString` {

    fun maxScore(s: String): Int {
        if (s.isNullOrEmpty()){
            return 0
        }
        var totalOnesCount = 0
        var maxLength = -1
        var leftZerosCount = 0
        var leftOnesCount = 0

        if (s != null) {
            for (i in s){
                if (i == '1'){
                    totalOnesCount++
                }
            }
        }

        for (i in 0 until s.length-1){
            if (s[i] == '0'){
                leftZerosCount++
            }
            else if (s[i] == '1'){
                leftOnesCount++
            }
            maxLength = max(maxLength , leftZerosCount+(totalOnesCount - leftOnesCount))
        }

        return maxLength
    }
}