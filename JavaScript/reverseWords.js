function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Convert the word into an array of characters, reverse it, and join it back
    return word.split('').reverse().join(''); // chnages
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"