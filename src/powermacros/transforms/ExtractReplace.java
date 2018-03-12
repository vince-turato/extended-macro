package powermacros.transforms;

import powermacros.extract.Extraction;
import powermacros.replace.Replace;

public class ExtractReplace {
    private TransformTypes type;
    private String id;
    private ExtractReplaceMethod extractReplaceMethod;

    public ExtractReplace(){

    }

    public ExtractReplace(String name, TransformTypes type){
        this.id = name;
        this.setType(type);
    }
    public void setExtractReplaceMethod(Extraction extraction, TransformTypes type, String typeArgs[]) {
        if(this.getType().equals(TransformTypes.JAVASCRIPT) || this.getType().equals(TransformTypes.PYTHON)){
            this.extractReplaceMethod = new ExtractReplaceScript(extraction, typeArgs[0]);
        }else if(this.getType().equals(TransformTypes.REGEX)){
            this.extractReplaceMethod = new ExtractReplaceRegex(extraction, typeArgs[0]);
        }else if(this.getType().equals(TransformTypes.STARTEND)){
            this.extractReplaceMethod = new ExtractReplaceStartStop(extraction, typeArgs[1], typeArgs[2]);
        }
    }
    public void setExtractReplaceMethod(Replace replace, TransformTypes type, String typeArgs[]) {
        if(this.getType().equals(TransformTypes.JAVASCRIPT) || this.getType().equals(TransformTypes.PYTHON)){
            this.extractReplaceMethod = new ExtractReplaceScript(replace, typeArgs[0]);
        }else if(this.getType().equals(TransformTypes.REGEX)){
            this.extractReplaceMethod = new ExtractReplaceRegex(replace, typeArgs[0]);
        }else if(this.getType().equals(TransformTypes.STARTEND)){
            this.extractReplaceMethod = new ExtractReplaceStartStop(replace, typeArgs[1], typeArgs[2]);
        }
    }

    public ExtractReplaceMethod getExtractReplaceMethod(){return extractReplaceMethod;}

    public TransformTypes getType(){
        return this.type;
    }
    public void setType(TransformTypes type){ this.type = type;}
    public String getTypeString() {
        return this.type.text();
    }
    public void setTypeString(String type) {
        this.type = TransformTypes.valueOf(type);
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


}