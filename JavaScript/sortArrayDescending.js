function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const originalArray = [5, 2, 9, 1, 5, 6];
const sortedArray = sortArrayDescending(originalArray);

console.log(sortedArray); // Output: [9, 6, 5, 5, 2, 1]
