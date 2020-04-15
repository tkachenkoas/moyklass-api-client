/*
 * API для работы с CRM \"Мой Класс\"
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.moyklass.api;

import com.google.gson.reflect.TypeToken;
import com.moyklass.api.invoker.*;
import com.moyklass.api.model.MKIntegration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternalApi {
    private ApiClient localVarApiClient;

    public InternalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InternalApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1InternalIntegrationsGet
     * @param serviceType Тип сервиса (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список интеграций </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InternalIntegrationsGetCall(Long serviceType, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/internal/integrations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (serviceType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("serviceType", serviceType));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "companyApiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1InternalIntegrationsGetValidateBeforeCall(Long serviceType, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1InternalIntegrationsGetCall(serviceType, _callback);
        return localVarCall;

    }

    /**
     * Интеграции
     * Возвращает список всех интеграций
     * @param serviceType Тип сервиса (optional)
     * @return List&lt;MKIntegration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список интеграций </td><td>  -  </td></tr>
     </table>
     */
    public List<MKIntegration> v1InternalIntegrationsGet(Long serviceType) throws ApiException {
        ApiResponse<List<MKIntegration>> localVarResp = v1InternalIntegrationsGetWithHttpInfo(serviceType);
        return localVarResp.getData();
    }

    /**
     * Интеграции
     * Возвращает список всех интеграций
     * @param serviceType Тип сервиса (optional)
     * @return ApiResponse&lt;List&lt;MKIntegration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список интеграций </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MKIntegration>> v1InternalIntegrationsGetWithHttpInfo(Long serviceType) throws ApiException {
        okhttp3.Call localVarCall = v1InternalIntegrationsGetValidateBeforeCall(serviceType, null);
        Type localVarReturnType = new TypeToken<List<MKIntegration>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Интеграции (asynchronously)
     * Возвращает список всех интеграций
     * @param serviceType Тип сервиса (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список интеграций </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InternalIntegrationsGetAsync(Long serviceType, final ApiCallback<List<MKIntegration>> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1InternalIntegrationsGetValidateBeforeCall(serviceType, _callback);
        Type localVarReturnType = new TypeToken<List<MKIntegration>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
