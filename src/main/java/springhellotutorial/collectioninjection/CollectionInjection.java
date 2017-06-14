package springhellotutorial.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Денис on 14.06.2017.
 */
public class CollectionInjection {
    List documentList;
    Set documentSet;
    Map documentMap;
    Properties documentProp;

    public List getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List documentList) {
        System.out.println("List of documents: " + documentList);
        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        System.out.println("set of documents: " + documentSet);
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("Map of Documents: " + documentMap);
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        this.documentMap = documentMap;
    }

    public Properties getDocumentProp() {
        System.out.println("property of documents: " + documentProp);
        return documentProp;
    }

    public void setDocumentProp(Properties documentProp) {
        this.documentProp = documentProp;
    }
}
