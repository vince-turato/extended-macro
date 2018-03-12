package powermacros.transforms;

import powermacros.extract.Extraction;
import powermacros.replace.Replace;

public class ExtractReplaceRegex extends ExtractReplaceMethod {
    String regexStr;

    public ExtractReplaceRegex(Extraction extraction, String regexStr){
        super(extraction);
        this.regexStr = regexStr;
    }
    public ExtractReplaceRegex(Replace replace, String regexStr){
        super(replace);
        this.regexStr = regexStr;
    }

    @Override
    public String getReplacedExtraction(String requestResponse) {
        return regexStr;
    }

    @Override
    public String getExtractionArgument() {
        return regexStr;
    }



}