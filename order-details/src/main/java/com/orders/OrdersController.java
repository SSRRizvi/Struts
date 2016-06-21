package com.orders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.orders.model.Order;
import com.orders.process.SoapUIProcess;

@Controller
public class OrdersController {
	
	@RequestMapping(value = "/rest/getOrderDetails/{orderId}", method = RequestMethod.GET)
	public ResponseEntity getOrderDetails(@PathVariable("orderId") String orderId){
		Order order = new Order();
		order.setOrderId(orderId);
		order.setMessage("nnnnnnnnnnnnnnn");
		String[] items={"AA","D0"};
		order.setItems("aa");
    	return new ResponseEntity<Order>(order,HttpStatus.OK);
    }
	
	@RequestMapping(value = "/rest/getMessage", method = RequestMethod.GET)
	public ResponseEntity getMessage(){
		SoapUIProcess soapUIProcess = new SoapUIProcess();
    	return new ResponseEntity<String>("aaaaaaaaaaaaaaaaa::"+soapUIProcess.executeSoap(),HttpStatus.OK);
    }
	
	public static void main(String[] args) {
		OrdersController cntr= new OrdersController();
		System.out.println("get message"+cntr.getMessage());
	}
}
