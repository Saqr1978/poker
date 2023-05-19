document.getElementById("handClick").addEventListener("click", getHand);

async function getHand() {
    let handArray;

    handArray = await fetch("http://localhost:8080/cards/hand")
    .then((response) => response.json());

    displayUnsortedCards(handArray[0]);
    displaySortedCards(handArray[1]);

}

function displayUnsortedCards(unSortedHand) {
    // placing unsorted card on the page
    for (let index = 1; index < 11; index++) {
        document.getElementById("unsorted" + index).innerHTML = "<img style=\"height: 170px; width: 100px;\" src=\"./"
        + unSortedHand[index-1].color.toLowerCase() + "/" + unSortedHand[index-1].value.toLowerCase() + ".jpg\">";
    }
}

function displaySortedCards(sortedHand) {
    // placing sorted card on the page
    for (let index = 1; index < 11; index++) {
        document.getElementById("sorted" + index).innerHTML = "<img style=\"height: 170px; width: 100px;\" src=\"./"
        + sortedHand[index-1].color.toLowerCase() + "/" + sortedHand[index-1].value.toLowerCase() + ".jpg\">";
    }
}