package io.address.verification.client.api;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.address.verification.client.ApiClient;
import io.address.verification.client.model.Address;
import io.address.verification.client.model.Holder;
import io.address.verification.client.model.ResponseVerification;
import io.address.verification.client.model.VerificationRequest;
import io.address.verification.client.model.VerificationResponse200;
import okhttp3.OkHttpClient;

public class VerificationsApiTest {
	
	private Logger logger = LoggerFactory.getLogger(VerificationsApiTest.class.getName());
	
    private final VerificationsApi api = new VerificationsApi();
    
    private ApiClient apiClient = null;
    
    private String xApiKey = "your_api_key";
    
    private String url = "the_url";
    
    @Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS).build();
		apiClient.setHttpClient(okHttpClient);
	}
    
    @Test
    public void createVerificationTest() throws Exception {
        
        VerificationRequest body = new VerificationRequest();
        body.setRequestId(UUID.fromString(UUID.randomUUID().toString()));
        body.setSubscriptionId(UUID.fromString("30f34b94-1ed3-4522-a624-1614d4223939"));
        body.setServiceCode("CFE");
        body.setContractNumber("0000000000000012306");
        body.setAcceptanceDate("2020-04-12T22:20:50.52Z");
        body.setAcceptance("Y");
        
        Holder holder = new Holder();
        holder.setName("Vlad");
        holder.setSecondName("Eddie");
        holder.setLastName("Teples");
        holder.setSecondLastName("Fuentes");
        
        Address address = new Address();
        address.setStreetAddress("love street 525");
        address.setSettlement("Centro");
        address.setCity("Cuahutemoc");
        address.setState("CDMX");
        address.setZipCode("06000");
        
        body.setHolder(holder);
        body.setAddress(address);
        
        ResponseVerification response = api.createVerification(xApiKey, body);
        
        logger.info(response.toString());
		
		//Assert.assertTrue(response != null);
    }
    
    
    @Test
    public void getVerificationByrequestIdTest() throws Exception {
       
    	String requestId = "3111ea35-556b-4a74-9454-8e47a6168392";
        VerificationResponse200 response = api.getVerificationByrequestId( xApiKey, requestId);
        logger.info(response.toString());
        Assert.assertTrue(response != null);
    }
    
}
