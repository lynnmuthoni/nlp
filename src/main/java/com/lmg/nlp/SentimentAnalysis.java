package com.lmg.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class SentimentAnalysis {
    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP =Pipeline.getPipeline();
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the text");
        String text= "I am very happy.She is very sas";



        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences=coreDocument.sentences();
        for (CoreSentence sentence: sentences){
            String sentiment=sentence.sentiment();
          
    System.out.println(sentiment+"\t"+sentence);
        }

    }
}
