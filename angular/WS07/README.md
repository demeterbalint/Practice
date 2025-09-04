1. Display all the genres individually in the `AppComponent` by iterating through the `genres` array
2. When clicked, make the genre names call the `choseGenre()` function with the index of the selected genre
3. Let the `BandPickerComponent` receive the `genre` property from its parent's `chosenGenre`
4. Display the band names only for the chosen genre and handle clicking on them by calling the `displayBandImage()`
   function with the proper argument
5. In the `BandImageService` class create a property called `imageUrlUpdate` of type `Subject` (with the generic type
   string)
6. Let the `displayBandImage` function call the `imageUrlUpdate` Subject's `next` function and pass the url string to it
7. Have `BandImageComponent` subscribe to the `imageUrlUpdate` Subject and save the emitted data to the `imageUrl`
   instance variable
8. Let the html template use this `imageUrl` property as the source of its `img`
