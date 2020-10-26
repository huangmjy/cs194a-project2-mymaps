# My Maps 

## *Michelle Huang*

**My Maps** displays a list of maps, each of which show user-defined markers with a title, description, and location. The user can also create a new map. 

Time spent: **5** hours spent in total

## Functionality 

The following **required** functionality is completed:

* [X] The list of map titles is displayed.
* [X] After tapping on a map title, the associated markers in the map are shown.
* [X] The user is able to create a new map.

The following **extensions** are implemented:

* [X] When the user taps on a pin in the create view, a dialogue will pop up to confirm whether or not they want to delete the pin. 

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://i.ibb.co/Gp2dMB8/cs194a-mymaps-demo.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

## Notes

* Spent quite some time trouble shooting an error that told me to update Play Services even after installing it from the SDK Manager, was eventually resolved after I installed a different emulator
* Ran into these errors: "'lateinit' modifier is not allowed on properties with initializer" & "Classifier 'MapsAdapter' does not have a companion object, and thus must be initialized here", still not sure what caused it, errors were resolved by pasting "private lateinit var mapAdapter: MapsAdapter" typed out in a different text editor
* For some reason, Imgur automatically converted my .gif to .mp4 :(

## License

    Copyright [2020] [Michelle Huang]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.