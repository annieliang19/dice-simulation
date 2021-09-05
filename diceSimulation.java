public class diceSimulation{

    public static void main(String[] args){
    
    double x = Double.parseDouble(args[0]);
    int [] frequencies = new int[13];
    double[] frequencies2 = {0,0,1.0/36,2.0/36,3.0/36,4.0/36,5.0/36,6.0/36,5.0/36,4.0/36,3.0/36,2.0/36,1.0/36};

        for (int i =1; i<=6; i++){
            for (int j = 1; j<=6; j++){
                frequencies[i+j]++;
            }
        
        }



    double[] probabilities = new double[13];

    for (int k = 1; k<=12; k++){
    probabilities[k] = frequencies[k]/(36.0);
    System.out.print(probabilities[k]+ " ");
    System.out.println(frequencies2[k]);
        }



    }
