## OOP Final Project


<img src="finalProject_ffinal\image\screenshot.png"/>

**Abstract**
`What is Minesweeper?`
First, Minesweeper is a single-player puzzle video game. The objective of the game is to clear a rectangular board containing hidden "mines" or bombs without detonating any of them, with help from clues about the number of neighbouring mines in each field. The game originates from the 1960s, and it has been written for many computing platforms in use today. 

The project was coded with 5 classes named: App, Cell, Grid, Handler and window.  In the next sections the each of classes was explained. The Replit online editor was used as editor. You can access to live demo code with this link. 

App class was contained of 3 public static final variables named WIDTH, GRIDSIZE and MINECOUNT. There is an object named Handler. Handler will be explained in next sections. 

Cell class extends JButton and there are private functions of type, position, discovered and flagged. In the class was used MouseListener and MouseEvent. MouseListener is notified changes of state of mouse. It is notified against MouseEvent. 

Grid class extends JPanel and in the class cell was created. In the createCells was placed mines and types of randomly by math library. 

Handler class was contained of game functions. Flood fill2 was used control cell positions. Flood fill, also called seed fill, is an algorithm that determines and alters the area connected to a given node in a multi-dimensional array with some matching attribute. 
Window class was used for display. JFrame object was created for holds all the other interface components. 

## UML

<img src="finalProject_ffinal\image\UML2CODE.png"/>
Note: Generated with  `Code2UML`

## References

1.	Wikipedia: Minesweeper (video game). https://en.wikipedia.org/wiki/Minesweeper_(video_game)
2.	Wikipedia: Flood fill 
https://en.wikipedia.org/wiki/Flood_fill 
3.	Java Minesweeper - Zetcode Blog
https://zetcode.com/javagames/minesweeper/ 
4.	How to Make Minesweeper in Java – CodingWithTim (Youtube)
https://www.youtube.com/watch?v=DvqURR_XN5U  
