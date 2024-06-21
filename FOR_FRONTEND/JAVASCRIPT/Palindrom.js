var isPalindrome = function(x) {
    let revNum = 0;
    let oriNum = x;
    while(x >0){
        let rem = x%10;
        revNum = revNum*10 + rem;
        x = Math.floor(x/10);   // in js x/10 return floating-point number, that's why we perform Math.floor function which will give us the int value
    }
    if(oriNum == revNum){
        return true
    }
    return false;
};
console.log(isPalindrome(121));      // true
console.log(isPalindrome(12100));   // false