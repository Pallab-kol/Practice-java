class ErrMsg { 
    final int INERR = 0; 
    final int OUTERR = 1; 
    final int DISKERR = 2; 
    final int INDEXERR = 3; 
    
    String[] msgs = { 
        "Input error.", 
        "Output error.", 
        "Disk full.", 
        "Index out of bound." 
    }; 
    
    String getErrMsg(int i) { 
        if (i >= 0 && i < msgs.length) { 
            return msgs[i]; 
        } else { 
            System.out.println("Invalid Error code."); 
            return "Unknown Error"; // Added return statement here
        } 
    } 
} 

class FinalD { 
    public static void main(String [] args) { 
        ErrMsg err = new ErrMsg(); 
        System.out.println(err.getErrMsg(err.INERR)); 
    } 
}
