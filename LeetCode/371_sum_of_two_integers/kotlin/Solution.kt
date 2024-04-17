
class Solution {
    var positiveValues = mutableListOf<Int>()
    var negativeValues = mutableListOf<Int>()

    fun getSum(a: Int, b: Int): Int {

        if (a>0) addPositive(a)
        else
            addNegative(a)

        if (b>0) addPositive(b)
        else
            addNegative(b)
        

        if (positiveValues.size>0) return positiveValues.size
            return -negativeValues.size
    }




    fun addPositive(pos: Int){
        for (i in 1..pos){
            if (negativeValues.size > 0) {
                negativeValues.removeAt(0)
            } else {
                positiveValues.add(i)
            }
        }
    }

    fun addNegative(neg: Int){
        for (i in 1..Math.abs(neg)){
            if (positiveValues.size > 0) {
                positiveValues.removeAt(0)
            } else {
                negativeValues.add(i)
            }
        }

    }
    
}

/*
SLOW :
Runtime: 192 ms, faster than 13.89% of Kotlin online submissions for Sum of Two Integers.
Memory Usage: 33.4 MB, less than 13.89% of Kotlin online submissions for Sum of Two Integers.
Next challenges:
Largest Component Size by Common Factor
Minimum Swaps to Make Strings Equal
Best Position for a Service Centre
*/
    
    
