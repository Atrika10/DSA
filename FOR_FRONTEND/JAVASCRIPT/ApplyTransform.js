var map = function(arr, fn) {
    // create a new array
    let resArr = new Array(arr.length);
    // store new element which is being returned from given function
    for(let i=0; i<arr.length; i++){
        resArr[i] = fn(arr[i], i);
    }
    return resArr;
};