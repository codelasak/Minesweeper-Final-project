import java.util.ArrayList;

public class Handler {

    private ArrayList<Cell> current = new ArrayList<Cell>();
    private ArrayList<Cell> queue = new ArrayList<Cell>();

    private static int flaggedCells = 0;
    
    public void click(Cell cell) {
        int discoveredCells = 0;
        if(!cell.isFlagged()) {
            cell.setEnabled(false);
            cell.setDiscovered(true);

            int position = cell.getPosition();
            if(cell.getType() == 0) {
                if(position < App.GRIDSIZE) {
                    if(position % App.GRIDSIZE == 0) {
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE)));
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE + 1)));
                        queue.add(Grid.cellGrid.get((position + 1)));
                    } else if(position % App.GRIDSIZE == App.GRIDSIZE - 1) {
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE)));
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE - 1)));
                        queue.add(Grid.cellGrid.get((position - 1)));
                    } else {
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE)));
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE + 1)));
                        queue.add(Grid.cellGrid.get((position + App.GRIDSIZE - 1)));
                        queue.add(Grid.cellGrid.get((position + 1)));
                        queue.add(Grid.cellGrid.get((position - 1)));
                    }
                } else if(position >= (App.GRIDSIZE * (App.GRIDSIZE - 1))) {
                    if(position % App.GRIDSIZE == 0) {
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE)));
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE + 1)));
                        queue.add(Grid.cellGrid.get((position + 1)));
                    } else if(position % App.GRIDSIZE == App.GRIDSIZE - 1) {
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE)));
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE - 1)));
                        queue.add(Grid.cellGrid.get((position - 1)));
                    } else {
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE)));
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE + 1)));
                        queue.add(Grid.cellGrid.get((position - App.GRIDSIZE - 1)));
                        queue.add(Grid.cellGrid.get((position + 1)));
                        queue.add(Grid.cellGrid.get((position - 1)));
                    }
                } else if(position % App.GRIDSIZE == 0) {
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE)));
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE + 1)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE + 1)));
                    queue.add(Grid.cellGrid.get((position + 1)));
                } else if(position % App.GRIDSIZE == App.GRIDSIZE - 1) {
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE)));
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE - 1)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE - 1)));
                    queue.add(Grid.cellGrid.get((position - 1)));
                } else {
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE)));
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE - 1)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE - 1)));
                    queue.add(Grid.cellGrid.get((position - App.GRIDSIZE + 1)));
                    queue.add(Grid.cellGrid.get((position + App.GRIDSIZE + 1)));
                    queue.add(Grid.cellGrid.get((position - 1)));
                    queue.add(Grid.cellGrid.get((position + 1)));
                }
            } else if(cell.getType() == 2) {
                int dangerCount = 0;
                if(position < App.GRIDSIZE) {
                    if(position % App.GRIDSIZE == 0) {
                        if(Grid.cellGrid.get(position + App.GRIDSIZE).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + App.GRIDSIZE + 1).getType() == 1) dangerCount++; 
                        if(Grid.cellGrid.get(position + 1).getType() == 1) dangerCount++;
                    } else if(position % App.GRIDSIZE == App.GRIDSIZE - 1) {
                        if(Grid.cellGrid.get(position + App.GRIDSIZE).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + App.GRIDSIZE - 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - 1).getType() == 1) dangerCount++;
                    } else {
                        if(Grid.cellGrid.get(position + App.GRIDSIZE).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + App.GRIDSIZE + 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + App.GRIDSIZE - 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - 1).getType() == 1) dangerCount++;
                        System.out.println(dangerCount);
                    }
                } else if(position >= (App.GRIDSIZE * (App.GRIDSIZE - 1))) {
                    if(position % App.GRIDSIZE == 0) {
                        if(Grid.cellGrid.get(position - App.GRIDSIZE).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - App.GRIDSIZE + 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + 1).getType() == 1) dangerCount++;
                    } else if(position % App.GRIDSIZE == App.GRIDSIZE - 1) {
                        if(Grid.cellGrid.get(position - App.GRIDSIZE).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - App.GRIDSIZE - 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - 1).getType() == 1) dangerCount++;
                    } else {
                        if(Grid.cellGrid.get(position - App.GRIDSIZE).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - App.GRIDSIZE + 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - App.GRIDSIZE - 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position + 1).getType() == 1) dangerCount++;
                        if(Grid.cellGrid.get(position - 1).getType() == 1) dangerCount++;
                    }
                } else if(position % App.GRIDSIZE == 0) {
                    if(Grid.cellGrid.get(position - App.GRIDSIZE).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get(position + App.GRIDSIZE).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get(position - App.GRIDSIZE + 1).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get(position + App.GRIDSIZE + 1).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get(position + 1).getType() == 1) dangerCount++;
                } else if(position % App.GRIDSIZE == App.GRIDSIZE - 1) {
                    if(Grid.cellGrid.get((position - App.GRIDSIZE)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position + App.GRIDSIZE)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position - App.GRIDSIZE - 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position + App.GRIDSIZE - 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position - 1)).getType() == 1) dangerCount++;
                } else {
                    if(Grid.cellGrid.get((position - App.GRIDSIZE)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position + App.GRIDSIZE)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position - App.GRIDSIZE - 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position + App.GRIDSIZE - 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position - App.GRIDSIZE + 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position + App.GRIDSIZE + 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position - 1)).getType() == 1) dangerCount++;
                    if(Grid.cellGrid.get((position + 1)).getType() == 1) dangerCount++;
                }
                cell.setText(String.valueOf(dangerCount));
            } else if(cell.getType() == 1) {
                for(int x = 0; x < Grid.cellGrid.size(); x++) {
                    Grid.cellGrid.get(x).setEnabled(false);
                    Grid.cellGrid.get(x).setText("");
                    if(Grid.cellGrid.get(x).getType() == 1) {Grid.cellGrid.get(x).setText("X");}
                }
                cell.setText("*");
            }  

            for(int x = 0; x < queue.size(); x++) {
                if(!queue.get(x).isDiscovered()) {
                    current.add(queue.get(x));
                    queue.get(x).setDiscovered(true);
                }
            }
            queue.clear();
            while(!current.isEmpty()) {
                Cell temp = current.get(0);
                current.remove(0);
                temp.clickButton();
            }

            for(int x = 0; x < Grid.cellGrid.size(); x++) {
                if(Grid.cellGrid.get(x).isDiscovered()) {
                    discoveredCells++;
                }
            }

            if(discoveredCells == Grid.cellGrid.size() - App.MINECOUNT) {
                for(int x = 0; x < Grid.cellGrid.size(); x++) {
                    if(Grid.cellGrid.get(x).getType() == 1) {
                        Grid.cellGrid.get(x).setEnabled(false);
                        Grid.cellGrid.get(x).setText("X");
                    } else {
                        Grid.cellGrid.get(x).setEnabled(false);
                        Grid.cellGrid.get(x).setText(":)");
                    }
                }
            }
        }   
    }
    public void open(Cell cell) {
        cell.setEnabled(false);
        // int x = cell.getType();
        // cell.setText( x.toString() );
 
        if (cell.getType()==1){
            cell.setText("X");
  
        }
        else if (cell.getType()==2){
            cell.setText("1"); 
        }
        else if (cell.getType()==0){
            cell.setText(""); 
        }
        else{
            cell.setText("X");
            
        }
        
    }
    public void close (Cell cell) {
        cell.setEnabled(true);
        // cell.setDiscovered(false);
        if (cell.getType()==1){
            cell.setText("");
  
        }
        else{
            cell.setText("");
            
        }

        
    }

    public void rightClick(Cell cell) {
        if(!cell.isDiscovered()) {
            if(!cell.isFlagged()) {
                cell.setFlagged(true);
                cell.setText("F");
                flaggedCells++;
                UI.update(flaggedCells);
            } else {
                cell.setFlagged(false);
                cell.setText("");
                flaggedCells--;
                UI.update(flaggedCells);
            }
        }
    }
}