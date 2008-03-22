package org.boris.functionserver;

import java.util.HashMap;
import java.util.Map;

import org.boris.variantcodec.VTStruct;
import org.boris.variantcodec.Variant;

public class RequestMap implements RequestHandler 
{
    private Map<String, Request> requests = new HashMap();
    
    public void add(String name, Request r) {
        this.requests.put(name, r);
    }
    
    public void remove(String name) {
        this.requests.remove(name);
    }
    
    public void clear() {
        this.requests.clear();
    }
    
    public Variant execute(String name, VTStruct args) throws RequestException {
        Request r = requests.get(name);
        if(r == null) {
            throw new RequestException("Unknown request: " + name);
        }
        return r.execute(args);
    }

}
