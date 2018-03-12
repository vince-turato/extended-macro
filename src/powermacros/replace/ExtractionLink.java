package powermacros.replace;

import powermacros.extract.Extraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExtractionLink {
    private Map<String, Extraction> linkedExtracts = new HashMap<>();


    public void add(Extraction ext) {
        if(!this.getLinkedExtractMap().containsKey(ext.getId())){
            linkedExtracts.put(ext.getId(), ext);
        }
    }

    public Map<String, Extraction> getLinkedExtractMap() {
        return linkedExtracts;
    }

    public ArrayList<Extraction> getLinkedExtractList() {
        ArrayList<Extraction> rtnList = new ArrayList<>();
        rtnList.addAll(getLinkedExtractMap().values());
        return rtnList;
    }

    public void setLinkedExtracts(Map<String, Extraction> linkedExtracts) {
        this.linkedExtracts = linkedExtracts;
    }



}