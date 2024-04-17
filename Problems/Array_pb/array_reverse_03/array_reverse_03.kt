
// using kotlin

fun main(){
    val test = arrayOf(1,2,3,4,5)
    invArray_01(test)
    printArray(test)
    invArray_02(test)
    printArray(test)
}


fun invArray_01(array: Array<Int>){
    val size = array.size      
    val midIdx = size%2 as Int 
    var tmp = array[0]         
    for(i in array.indices){   
        array[i] = array[size-1-i] 
        array[size-1-i] = tmp      
        if (i == midIdx ) break    
        tmp = array[i+1]
    }        
}


fun invArray_02(array: Array<Int>){
    var start = 0
    var end   = array.size-1
             
    while(start<end){  
        val tmp = array[start]
        array[start] = array[end]
        array[end] = tmp
        start++ 
        end--       
    }
}


inline fun <reified T> printArray(array: Array<T>){
    for(item in array){
        println(" $item ")
    }    
}
