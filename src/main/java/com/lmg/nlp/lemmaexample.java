package com.lmg.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class lemmaexample {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();
        String text = "I am trying here";

        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList=coreDocument.tokens();
        for(CoreLabel coreLabel: coreLabelList){
            String lemma =coreLabel.lemma();
            System.out.println(coreLabel.originalText()+"="+lemma);
        }
    }
}
