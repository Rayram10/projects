const randomPassword = document.getElementById('randomPassword');
const generateButton = document.getElementById('generateButton');
const upperCase = document.getElementById('upperCase');
const lowerCase = document.getElementById('lowerCase');
const numbers = document.getElementById('numbers');
const symbols = document.getElementById('symbols');


var slider = document.getElementById("myRange");
var output = document.getElementById("sliderNum");

const upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const lowerCaseLetters = "acdefghijklmnopqrstuvwxyz";
const nums = "0123456789";
const symbolsForJs = "!@#$%^&*()*+,-./:;<=>?";







output.innerHTML = slider.value;

slider.oninput = function() {
  output.innerHTML = this.value;
}

generateButton.onclick = function() {
  let includedChars = "";
  let charLength = slider.value;
  
  
  if (upperCase.checked) {
    includedChars += upperCaseLetters;
  }
  if (lowerCase.checked){
    includedChars += lowerCaseLetters;
  }
  if (numbers.checked){
    includedChars += nums
  }
  if (symbols.checked){
    includedChars += symbolsForJs;
  }
  if (includedChars == ""){
    randomPassword.innerHTML = "Check characters used !!";
  }
  
  
  let code =  generatePassword(charLength, includedChars)
  randomPassword.innerHTML = code; 
}

function generatePassword(charLengths, includedChar) {
  let password = "";
  for (let i = 0; i < charLengths; i++) {
    let randomIndex = Math.floor(Math.random () *  includedChar.length);
    password += includedChar[randomIndex]; 
  }
  return password

}