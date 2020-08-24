package com.demo.lambda;

public class RequestResource<T>
{
    private String id;
    private String httpMethod;
    private T requestObject;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getHttpMethod()
    {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod)
    {
        this.httpMethod = httpMethod;
    }

    public T getRequestObject()
    {
        return requestObject;
    }

    public void setRequestObject(T requestObject)
    {
        this.requestObject = requestObject;
    }

    @Override public String toString()
    {
        return "RequestResource{" +
                   "id='" + id + '\'' +
                   ", httpMethod='" + httpMethod + '\'' +
                   ", requestObject=" + requestObject +
                   '}';
    }
}
