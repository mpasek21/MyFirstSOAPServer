package com.soapsoapsoap;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
//Service Endpoint Interface
@WebService // oznaczenie klasy jako SEO (Service Endpoint Interface)
@SOAPBinding(style = Style.RPC)
interface MyFirstSOAPInterface{
    @WebMethod String getHelloWorldAsString(String name);
    @WebMethod long getDaysBetweenDates(String date1,String date2);
}