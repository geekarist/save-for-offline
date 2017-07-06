# Save Page Library

## Installation

Add this dependency to your build.gradle:

    compile 'jonas.tool:save-page:1.0'

## Usage

Create a `PageSaver` object:

    PageSaver saver = new PageSaver(callback);

Call `getPage()`:

    saver.getPage("https://en.wikipedia.org/wiki/Main_Page", directory, "index.html");

Now you can open that page offline.
