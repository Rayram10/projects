const guessButton = document.getElementById('guessButton');
const randomNum = document.getElementById('randomNum');
const result  = document.getElementById('result');



let max = 5;



guessButton.onclick = function () {
    const num = Math.floor(Math.random() * max) + 1;
    randomNum.innerText = num;
    const userGuess = document.getElementById('userGuess').value;
    if (isNaN(userGuess)){
        randomNum.innerText = "Enter a number";
        
    }
    else{

        let resultText = num == userGuess ? "correct" : "wrong";
        result.innerText = resultText;
    }
   

    

}
document.getElementById('one').onclick = function () {
    document.getElementById('hTwo').innerText = "Guess a number 1-5"
    max = 5;
}
document.getElementById('two').onclick = function () {
    document.getElementById('hTwo').innerText = "Guess a number 1-10"
    max = 10;
}
document.getElementById('three').onclick = function () {
    document.getElementById('hTwo').innerText = "Guess a number 1-15"
    max = 15;
}
document.getElementById('four').onclick = function () {
    document.getElementById('hTwo').innerText = "Guess a number 1-20"
    max = 20;
}
