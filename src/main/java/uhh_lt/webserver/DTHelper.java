package uhh_lt.webserver;

import org.jobimtext.api.struct.Order2;
import org.jobimtext.api.struct.WebThesaurusDatastructure;

import java.io.BufferedInputStream;
import java.util.List;

public class DTHelper {

    WebThesaurusDatastructure dt;

    public DTHelper(String config) {
        this.loadDTconfig(config);
    }

    public void loadDTconfig(String configName) {
        dt = new WebThesaurusDatastructure(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream(configName)));
        dt.connect();
    }

    public List<Order2> getSimilarTerms(String term) {
        return dt.getSimilarTerms(term);
    }
}
