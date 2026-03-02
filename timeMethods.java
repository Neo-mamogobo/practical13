

import java.lang.Math.*;   import java.io.*;   import java.text.*;

public class timeMethods{
    public static int N =30;
    public static void main(String[] args){
        int[] X = new int[N];
        for(int i = 0; i < X.length; i++){
            X[i] = i;
        }

        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;

        runTime = 0;
        for(repetition = 0; repetition < repetitions; repetition++) {
            start = System.nanoTime();

            openchained rp = new openchained(30);

            finish = System.nanoTime();

            time = (double)(finish - start);
            runTime += time;
            runTime2 += (time*time); }

        double aveRuntime = runTime/repetitions;
        double stdDeviation =
                Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

        long startlp, finishlp;
        double runTimelp = 0, runTime2lp = 0, timelp;
        double totalTimelp = 0.0;
        int p = N;
        int repetitionlp, repetitionslp = 30;

        runTimelp = 0;
        for(repetitionlp = 0; repetitionlp < repetitionslp; repetitionlp++) {
            startlp = System.nanoTime();

            chainedH.Node.Hashtable ch = new chainedH.Node.Hashtable(30);

            finishlp = System.nanoTime();

            timelp = (double)(finishlp - startlp);
            runTimelp += timelp;
            runTime2lp += (timelp*timelp); }

        double aveRuntimelp = runTimelp/repetitionslp;
        double stdDeviationlp =
                Math.sqrt(runTime2lp - repetitionslp*aveRuntimelp*aveRuntimelp)/(repetitionslp-1);

        System.out.print("\n\n\fStatistics\n");
        System.out.println("________________________________________________");
        System.out.println("Total time   =           " + runTime/1000 + "s.");
        System.out.println("Total time²  =           " + runTime2);
        System.out.println("Average time =           " + fiveD.format(aveRuntime/1000)
                + "s. " + '±' + " " + fourD.format(stdDeviation) + "ms.");
        System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
        System.out.println("n            =           " + n);
        System.out.println("Average time / run =     " + fiveD.format(aveRuntime/n*1000)
                + 'µ' + "s. ");

        System.out.println("Repetitions  =             " + repetitions);
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println(); }


    }
