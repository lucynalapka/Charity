const categories = document.querySelectorAll('input[name=categories]:checked');
const quantity = document.querySelector('#quantity');
const institution = document.querySelector('input[name=institutions]:checked');
const zipCode = document.querySelector('#zipCode');
const street = document.querySelector('#street');
const city = document.querySelector('#city');
const phone = document.querySelector('#phone');
const pickUpDate = document.querySelector('#pickUpDate');
const pickUpTime = document.querySelector('#pickUpTime');
const pickUpComment = document.querySelector('#pickUpComment');

const quant = document.querySelector('#quant');
const inst = document.querySelector('#inst');
const str = document.querySelector('#str');
const cit = document.querySelector('#cit');
const zip = document.querySelector('#zip');
const no = document.querySelector('#no');
const date = document.querySelector('#date');
const time = document.querySelector('#time');
const com = document.querySelector('#com');


const confirm = document.querySelector('#confirm');


confirm.addEventListener('click', sumUp);

function sumUp(){
quant.innerText = quantity.value + " worki z kategorii: " + chosen;
inst.innerText =  " Dla fundacji: " + institution.value;
str.innerText = street.value;
cit.innerText = city.value;
zip.innerText = zipCode.value;
no.innerText = phone.value;
date.innerText = pickUpDate.value;
time.innerText = pickUpTime.value;
com.innerText = com.value;

}
let chosen = '';
categories.forEach(function (el){
    chosen += el.innerText;
})