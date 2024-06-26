const magicBall = document.getElementById("magicBall");
const shakeButton = document.getElementById('shakeButton');
const text = document.getElementById("answer");





function answer(){
    const resultNumber = Math.floor(Math.random() * 5);
    const ballFace = getBallFace(resultNumber)
    text.innerHTML = ballFace;
    changeImage();
    
    
    

}
function getBallFace(resultNumber){
    switch(resultNumber) {
        case 0: return "Maybe"
        case 1: return "yes"
        case 2: return "no"
        case 3: return "the world may never know"
        case 4: return "You are cooked"
    }

}

shakeButton.addEventListener('click', () => {
    reset();
    magicBall.classList.add("shake-animation");
    setTimeout(() => {
        magicBall.classList.remove("shake-animation");
        answer()

    }, 3500);

})
function changeImage(){
    magicBall.classList.add("fadeIn-animation"); 
    text.classList.add("fadeIn-animation");
    magicBall.src = "img/8ballas-removebg-preview.png";
    
    
    setTimeout(() => {
        text.classList.remove("fadeIn-animation");
        magicBall.classList.remove("fadeIn-animation");
        

    }, 1000);


}
function reset(){
    magicBall.src = "img/8ball-removebg-preview.png";
    text.innerHTML = "";



}
