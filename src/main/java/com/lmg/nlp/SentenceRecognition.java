package com.lmg.nlp;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognition {
    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();
        String text="hi. Linet here very passionate";
        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences=coreDocument.sentences();
        for(CoreSentence sentence:sentences){
            System.out.println(sentences.toString());
        }

    }
}
