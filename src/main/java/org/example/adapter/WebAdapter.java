package org.example.adapter;

//Adaptor class that integrates the Target Interface
public class WebAdapter implements WebRequest {

    private WebService webService;

    public void connect(WebService webService) {
        this.webService = webService;
    }

    @Override
    public int request(Object request) {
        //Json result = this.toJson(request);
        return 0;
    }
}
