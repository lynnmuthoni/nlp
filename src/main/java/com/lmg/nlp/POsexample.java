package com.lmg.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class POsexample {

    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP= Pipeline.getPipeline();

        String text ="Hi there . I am Linet really, looking forward to meet you";
        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList =coreDocument.tokens();
        for (CoreLabel coreLabel:coreLabelList){
            String pos =coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText()+"="+pos);
        }
    }
}
