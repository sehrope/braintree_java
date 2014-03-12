package com.braintreegateway;

/**
 * Provides a fluent interface to build up requests for client tokens, which are
 *   used to authenticate requests clients make directly on behalf of merchants
 */
public class ClientTokenRequest extends Request {
    private String customerId;
    private ClientTokenOptionsRequest optionsRequest;

    public String getCustomerId() {
        return customerId;
    }

    public ClientTokenRequest customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public ClientTokenOptionsRequest getOptions() {
        return optionsRequest;
    }

    public ClientTokenRequest options(ClientTokenOptionsRequest optionsRequest) {
        this.optionsRequest = optionsRequest;
        return this;
    }

    @Override
    public String toXML() {
        return buildRequest("clientToken").toXML();
    }

    protected RequestBuilder buildRequest(String root) {
        RequestBuilder builder = new RequestBuilder(root);

        if (customerId != null) {
          builder.addElement("customerId", customerId);
        }

        if (optionsRequest != null) {
          builder.addElement("options", optionsRequest);
        }

        return builder;
    }
}