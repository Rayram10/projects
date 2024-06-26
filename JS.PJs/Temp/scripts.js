document.addEventListener('DOMContentLoaded', function () {
    const tempSubmit = document.getElementById('tempSubmit');
    const tempConversionF = document.getElementById('tempConversionF');
    const tempConversionC = document.getElementById('tempConversionC');
    const result = document.getElementById('result');

    tempSubmit.onclick = function () {
        const tempInputValue = parseFloat(document.getElementById('tempInput').value);

        if (isNaN(tempInputValue)) {
            result.innerHTML = "Please enter a valid number.";
            return;
        }

        if (tempConversionF.checked) {
            let conversion = fahrenheit(tempInputValue);
            result.innerHTML = conversion.toFixed(2);
        } else if (tempConversionC.checked) {
            let conversion = celsius(tempInputValue);
            result.innerHTML = conversion.toFixed(2);
        } else {
            result.innerHTML = "Please pick a conversion.";
        }
    }

    function fahrenheit(temp) {
        return temp * 1.8 + 32;
    }

    function celsius(temp) {
        return (temp - 32) / 1.8;
    }
});
