package io.address.verification.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.address.verification.client.ApiCallback;
import io.address.verification.client.ApiClient;
import io.address.verification.client.ApiException;
import io.address.verification.client.ApiResponse;
import io.address.verification.client.Configuration;
import io.address.verification.client.Pair;
import io.address.verification.client.ProgressRequestBody;
import io.address.verification.client.ProgressResponseBody;
import io.address.verification.client.model.ResponseVerification;
import io.address.verification.client.model.VerificationRequest;
import io.address.verification.client.model.VerificationResponse200;

public class VerificationsApi {
    private ApiClient apiClient;
    public VerificationsApi() {
        this(Configuration.getDefaultApiClient());
    }
    public VerificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call createVerificationCall(String xApiKey, VerificationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVerificationValidateBeforeCall(String xApiKey, VerificationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling createVerification(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createVerification(Async)");
        }
        
        okhttp3.Call call = createVerificationCall(xApiKey, body, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseVerification createVerification(String xApiKey, VerificationRequest body) throws ApiException {
        ApiResponse<ResponseVerification> resp = createVerificationWithHttpInfo(xApiKey, body);
        return resp.getData();
    }
    
    public ApiResponse<ResponseVerification> createVerificationWithHttpInfo(String xApiKey, VerificationRequest body) throws ApiException {
        okhttp3.Call call = createVerificationValidateBeforeCall(xApiKey, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseVerification>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call createVerificationAsync(String xApiKey, VerificationRequest body, final ApiCallback<VerificationResponse200> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = createVerificationValidateBeforeCall(xApiKey, body, progressListener, progressRequestListener);
        //Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public okhttp3.Call getVerificationByrequestIdCall(String xApiKey, String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{requestId}"
            .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVerificationByrequestIdValidateBeforeCall(String xApiKey, String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getVerificationByrequestId(Async)");
        }
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling getVerificationByrequestId(Async)");
        }
        
        okhttp3.Call call = getVerificationByrequestIdCall( xApiKey, requestId, progressListener, progressRequestListener);
        return call;
    }
    
    public VerificationResponse200 getVerificationByrequestId(String xApiKey, String requestId) throws ApiException {
        ApiResponse<VerificationResponse200> resp = getVerificationByrequestIdWithHttpInfo(xApiKey, requestId);
        return resp.getData();
    }
    
    public ApiResponse<VerificationResponse200> getVerificationByrequestIdWithHttpInfo(String xApiKey, String requestId) throws ApiException {
        okhttp3.Call call = getVerificationByrequestIdValidateBeforeCall( xApiKey, requestId, null, null);
        Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getVerificationByrequestIdAsync(String xSignature, String xApiKey, String username, String password, String requestId, final ApiCallback<VerificationResponse200> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getVerificationByrequestIdValidateBeforeCall(xApiKey, requestId, progressListener, progressRequestListener);
        //Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
