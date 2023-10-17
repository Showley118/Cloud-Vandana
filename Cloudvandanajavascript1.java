function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");
    // Reverse each word in the array
    let reversedWords = words.map(word => {
        // Reverse the characters of the word
        return word.split("").reverse().join("");
    });
    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(" ");
    return reversedSentence;
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"
