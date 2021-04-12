var input = prompt("input an index: ");
if (validate(input)){
    var value = fibonacci(input * 1);
    alert("the value of index " + input + " is " + value);
}

function validate(message){
        if (isNaN(message) || message <= 0){
            alert("index must be positive integer.");
            return false;
        }
        for (c of message){
            if (c == "."){
                alert("index must be positive integer.");
            return false;
            }
        }
    return true;
}

function fibonacci(index){
    var fibonacciValue = 1;
    if (index <= 2){
        return fibonacciValue;
    }

    fibonacciValue = fibonacci(index - 1) + fibonacci(index - 2);
    return fibonacciValue;
}