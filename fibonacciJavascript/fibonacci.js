var input = prompt("input an index: ");
if (validate(input)){
    var value = fibonacci(input * 1);
    if (value === Infinity){
        alert("index is too big.");
    }
    else{
        alert("the value of index " + input + " is " + value);
    }
}

function validate(message){
        if (isNaN(message) || message < 0){
            alert("index must be a non-negative integer.");
            return false;
        }
        for (c of message){
            if (c == "."){
                alert("index must be an integer.");
            return false;
            }
        }
    return true;
}

function fibonacci(index){
    if (index <= 1){
        return index;
    }

    var fibonacciValue;
    var preOne = 1;
    var preTwo = 0;
    for (let i = 2; i <= index; i++){
        fibonacciValue = preOne + preTwo;
        preTwo = preOne;
        preOne = fibonacciValue;
    }
    return fibonacciValue;
}