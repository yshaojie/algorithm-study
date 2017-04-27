package com.self;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 解析搜狗数据集
 * Created by shaojieyue
 * Created time 2017-04-27 17:57
 */
public class ProcessSogouData {
    public static void main(String[] args) throws IOException {
        String file = "/home/shaojieyue/tools/data/news_sohusite_xml.dat";
        String sourceData = "/home/shaojieyue/tools/source_data.txt";
        File sourceFile = new File(sourceData);
        if (sourceFile.exists()) {
            sourceFile.delete();
        }
        sourceFile.createNewFile();
        final LineIterator lineIterator = FileUtils.lineIterator(new File(file), "GBK");
        final String prefix = "<content>";
        final String tail = "</content>";
        int i = 0;
        List<String> texts = new ArrayList<String>();
        while (lineIterator.hasNext()){
            final String line = lineIterator.nextLine().trim();
            if (line.startsWith(prefix)) {
                final String content = line.substring(prefix.length(), line.length() -tail.length()+1);
                final Result parse = ToAnalysis.parse(content);
                final List<Term> terms = parse.getTerms();
                StringBuilder stringBuilder = new StringBuilder();
                for (Term term : terms) {
                    if (StringUtils.isNotBlank(term.getNatureStr()) && term.getName().length() > 1) {
                        stringBuilder.append(term.getName()).append(" ");
                    }
                }
                stringBuilder.append("\r\n");
                FileUtils.write(sourceFile,stringBuilder.toString(),"UTF-8",true);
            }
        }
    }
}
