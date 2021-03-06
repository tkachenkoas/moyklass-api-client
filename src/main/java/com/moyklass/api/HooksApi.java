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

import com.moyklass.api.invoker.ApiCallback;
import com.moyklass.api.invoker.ApiClient;
import com.moyklass.api.invoker.ApiException;
import com.moyklass.api.invoker.ApiResponse;
import com.moyklass.api.invoker.Configuration;
import com.moyklass.api.invoker.Pair;
import com.moyklass.api.invoker.ProgressRequestBody;
import com.moyklass.api.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.moyklass.api.model.MKFbEvent;
import com.moyklass.api.model.MKIgEvent;
import com.moyklass.api.model.MKVkEvent;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HooksApi {
    private ApiClient localVarApiClient;

    public HooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HooksApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1HooksAmoEventsUniqueKeyPost
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param leads Список сделок (optional)
     * @param contacts Список контактов (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksAmoEventsUniqueKeyPostCall(String uniqueKey, Object leads, Object contacts, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/hooks/amoEvents/{uniqueKey}"
            .replaceAll("\\{" + "uniqueKey" + "\\}", localVarApiClient.escapeString(uniqueKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (leads != null) {
            localVarFormParams.put("leads", leads);
        }

        if (contacts != null) {
            localVarFormParams.put("contacts", contacts);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "companyApiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1HooksAmoEventsUniqueKeyPostValidateBeforeCall(String uniqueKey, Object leads, Object contacts, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uniqueKey' is set
        if (uniqueKey == null) {
            throw new ApiException("Missing the required parameter 'uniqueKey' when calling v1HooksAmoEventsUniqueKeyPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1HooksAmoEventsUniqueKeyPostCall(uniqueKey, leads, contacts, _callback);
        return localVarCall;

    }

    /**
     * Реакция на события от amoCRM интеграций
     * Принимает запрос от amoCRM
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param leads Список сделок (optional)
     * @param contacts Список контактов (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public Object v1HooksAmoEventsUniqueKeyPost(String uniqueKey, Object leads, Object contacts) throws ApiException {
        ApiResponse<Object> localVarResp = v1HooksAmoEventsUniqueKeyPostWithHttpInfo(uniqueKey, leads, contacts);
        return localVarResp.getData();
    }

    /**
     * Реакция на события от amoCRM интеграций
     * Принимает запрос от amoCRM
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param leads Список сделок (optional)
     * @param contacts Список контактов (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> v1HooksAmoEventsUniqueKeyPostWithHttpInfo(String uniqueKey, Object leads, Object contacts) throws ApiException {
        okhttp3.Call localVarCall = v1HooksAmoEventsUniqueKeyPostValidateBeforeCall(uniqueKey, leads, contacts, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Реакция на события от amoCRM интеграций (asynchronously)
     * Принимает запрос от amoCRM
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param leads Список сделок (optional)
     * @param contacts Список контактов (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksAmoEventsUniqueKeyPostAsync(String uniqueKey, Object leads, Object contacts, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1HooksAmoEventsUniqueKeyPostValidateBeforeCall(uniqueKey, leads, contacts, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1HooksFbEventsGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ответ для подтверждения </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksFbEventsGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/hooks/fbEvents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain"
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
    private okhttp3.Call v1HooksFbEventsGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1HooksFbEventsGetCall(_callback);
        return localVarCall;

    }

    /**
     * Подтверждение подписки на события FB
     * 
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ответ для подтверждения </td><td>  -  </td></tr>
     </table>
     */
    public String v1HooksFbEventsGet() throws ApiException {
        ApiResponse<String> localVarResp = v1HooksFbEventsGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Подтверждение подписки на события FB
     * 
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ответ для подтверждения </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> v1HooksFbEventsGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = v1HooksFbEventsGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Подтверждение подписки на события FB (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ответ для подтверждения </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksFbEventsGetAsync(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1HooksFbEventsGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1HooksFbEventsPost
     * @param mkFbEvent Информация о событиях генераций лидов (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Ошибка сервера </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksFbEventsPostCall(MKFbEvent mkFbEvent, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = mkFbEvent;

        // create path and map variables
        String localVarPath = "/v1/hooks/fbEvents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "companyApiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1HooksFbEventsPostValidateBeforeCall(MKFbEvent mkFbEvent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'mkFbEvent' is set
        if (mkFbEvent == null) {
            throw new ApiException("Missing the required parameter 'mkFbEvent' when calling v1HooksFbEventsPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1HooksFbEventsPostCall(mkFbEvent, _callback);
        return localVarCall;

    }

    /**
     * Реакция на события от FB интеграций
     * Принимает запрос от FB API
     * @param mkFbEvent Информация о событиях генераций лидов (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Ошибка сервера </td><td>  -  </td></tr>
     </table>
     */
    public Object v1HooksFbEventsPost(MKFbEvent mkFbEvent) throws ApiException {
        ApiResponse<Object> localVarResp = v1HooksFbEventsPostWithHttpInfo(mkFbEvent);
        return localVarResp.getData();
    }

    /**
     * Реакция на события от FB интеграций
     * Принимает запрос от FB API
     * @param mkFbEvent Информация о событиях генераций лидов (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Ошибка сервера </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> v1HooksFbEventsPostWithHttpInfo(MKFbEvent mkFbEvent) throws ApiException {
        okhttp3.Call localVarCall = v1HooksFbEventsPostValidateBeforeCall(mkFbEvent, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Реакция на события от FB интеграций (asynchronously)
     * Принимает запрос от FB API
     * @param mkFbEvent Информация о событиях генераций лидов (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Ошибка сервера </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksFbEventsPostAsync(MKFbEvent mkFbEvent, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1HooksFbEventsPostValidateBeforeCall(mkFbEvent, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1HooksIgEventsIntegrationIdPost
     * @param integrationId ID интеграции (required)
     * @param mkIgEvent Информация о событии (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный внутренний секретный ключ </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksIgEventsIntegrationIdPostCall(Long integrationId, MKIgEvent mkIgEvent, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = mkIgEvent;

        // create path and map variables
        String localVarPath = "/v1/hooks/igEvents/{integrationId}"
            .replaceAll("\\{" + "integrationId" + "\\}", localVarApiClient.escapeString(integrationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "companyApiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1HooksIgEventsIntegrationIdPostValidateBeforeCall(Long integrationId, MKIgEvent mkIgEvent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'integrationId' is set
        if (integrationId == null) {
            throw new ApiException("Missing the required parameter 'integrationId' when calling v1HooksIgEventsIntegrationIdPost(Async)");
        }
        
        // verify the required parameter 'mkIgEvent' is set
        if (mkIgEvent == null) {
            throw new ApiException("Missing the required parameter 'mkIgEvent' when calling v1HooksIgEventsIntegrationIdPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1HooksIgEventsIntegrationIdPostCall(integrationId, mkIgEvent, _callback);
        return localVarCall;

    }

    /**
     * Реакция на события от Instagram интеграций
     * Принимает запрос от сервиса Instagram
     * @param integrationId ID интеграции (required)
     * @param mkIgEvent Информация о событии (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный внутренний секретный ключ </td><td>  -  </td></tr>
     </table>
     */
    public String v1HooksIgEventsIntegrationIdPost(Long integrationId, MKIgEvent mkIgEvent) throws ApiException {
        ApiResponse<String> localVarResp = v1HooksIgEventsIntegrationIdPostWithHttpInfo(integrationId, mkIgEvent);
        return localVarResp.getData();
    }

    /**
     * Реакция на события от Instagram интеграций
     * Принимает запрос от сервиса Instagram
     * @param integrationId ID интеграции (required)
     * @param mkIgEvent Информация о событии (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный внутренний секретный ключ </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> v1HooksIgEventsIntegrationIdPostWithHttpInfo(Long integrationId, MKIgEvent mkIgEvent) throws ApiException {
        okhttp3.Call localVarCall = v1HooksIgEventsIntegrationIdPostValidateBeforeCall(integrationId, mkIgEvent, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Реакция на события от Instagram интеграций (asynchronously)
     * Принимает запрос от сервиса Instagram
     * @param integrationId ID интеграции (required)
     * @param mkIgEvent Информация о событии (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный внутренний секретный ключ </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksIgEventsIntegrationIdPostAsync(Long integrationId, MKIgEvent mkIgEvent, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1HooksIgEventsIntegrationIdPostValidateBeforeCall(integrationId, mkIgEvent, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1HooksTildaUniqueKeyPost
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param tranid Уникальный номер заявки (optional)
     * @param formid Номер блока, с которого была отправка (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksTildaUniqueKeyPostCall(String uniqueKey, String tranid, String formid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/hooks/tilda/{uniqueKey}"
            .replaceAll("\\{" + "uniqueKey" + "\\}", localVarApiClient.escapeString(uniqueKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (tranid != null) {
            localVarFormParams.put("tranid", tranid);
        }

        if (formid != null) {
            localVarFormParams.put("formid", formid);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "companyApiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1HooksTildaUniqueKeyPostValidateBeforeCall(String uniqueKey, String tranid, String formid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uniqueKey' is set
        if (uniqueKey == null) {
            throw new ApiException("Missing the required parameter 'uniqueKey' when calling v1HooksTildaUniqueKeyPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1HooksTildaUniqueKeyPostCall(uniqueKey, tranid, formid, _callback);
        return localVarCall;

    }

    /**
     * Реакция на события от Tilda интеграций
     * Принимает запрос от Tilda
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param tranid Уникальный номер заявки (optional)
     * @param formid Номер блока, с которого была отправка (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public Object v1HooksTildaUniqueKeyPost(String uniqueKey, String tranid, String formid) throws ApiException {
        ApiResponse<Object> localVarResp = v1HooksTildaUniqueKeyPostWithHttpInfo(uniqueKey, tranid, formid);
        return localVarResp.getData();
    }

    /**
     * Реакция на события от Tilda интеграций
     * Принимает запрос от Tilda
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param tranid Уникальный номер заявки (optional)
     * @param formid Номер блока, с которого была отправка (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> v1HooksTildaUniqueKeyPostWithHttpInfo(String uniqueKey, String tranid, String formid) throws ApiException {
        okhttp3.Call localVarCall = v1HooksTildaUniqueKeyPostValidateBeforeCall(uniqueKey, tranid, formid, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Реакция на события от Tilda интеграций (asynchronously)
     * Принимает запрос от Tilda
     * @param uniqueKey Уникальный ключ интеграции (required)
     * @param tranid Уникальный номер заявки (optional)
     * @param formid Номер блока, с которого была отправка (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный ключ интеграции </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksTildaUniqueKeyPostAsync(String uniqueKey, String tranid, String formid, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1HooksTildaUniqueKeyPostValidateBeforeCall(uniqueKey, tranid, formid, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1HooksVkEventsIntegrationIdPost
     * @param integrationId ID интеграции (required)
     * @param mkVkEvent Информация о событии в группе (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный секретный ключ callback сервера или id группы </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksVkEventsIntegrationIdPostCall(Long integrationId, MKVkEvent mkVkEvent, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = mkVkEvent;

        // create path and map variables
        String localVarPath = "/v1/hooks/vkEvents/{integrationId}"
            .replaceAll("\\{" + "integrationId" + "\\}", localVarApiClient.escapeString(integrationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "companyApiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1HooksVkEventsIntegrationIdPostValidateBeforeCall(Long integrationId, MKVkEvent mkVkEvent, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'integrationId' is set
        if (integrationId == null) {
            throw new ApiException("Missing the required parameter 'integrationId' when calling v1HooksVkEventsIntegrationIdPost(Async)");
        }
        
        // verify the required parameter 'mkVkEvent' is set
        if (mkVkEvent == null) {
            throw new ApiException("Missing the required parameter 'mkVkEvent' when calling v1HooksVkEventsIntegrationIdPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1HooksVkEventsIntegrationIdPostCall(integrationId, mkVkEvent, _callback);
        return localVarCall;

    }

    /**
     * Реакция на события от VK интеграций
     * Принимает запрос от VK API
     * @param integrationId ID интеграции (required)
     * @param mkVkEvent Информация о событии в группе (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный секретный ключ callback сервера или id группы </td><td>  -  </td></tr>
     </table>
     */
    public String v1HooksVkEventsIntegrationIdPost(Long integrationId, MKVkEvent mkVkEvent) throws ApiException {
        ApiResponse<String> localVarResp = v1HooksVkEventsIntegrationIdPostWithHttpInfo(integrationId, mkVkEvent);
        return localVarResp.getData();
    }

    /**
     * Реакция на события от VK интеграций
     * Принимает запрос от VK API
     * @param integrationId ID интеграции (required)
     * @param mkVkEvent Информация о событии в группе (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный секретный ключ callback сервера или id группы </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> v1HooksVkEventsIntegrationIdPostWithHttpInfo(Long integrationId, MKVkEvent mkVkEvent) throws ApiException {
        okhttp3.Call localVarCall = v1HooksVkEventsIntegrationIdPostValidateBeforeCall(integrationId, mkVkEvent, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Реакция на события от VK интеграций (asynchronously)
     * Принимает запрос от VK API
     * @param integrationId ID интеграции (required)
     * @param mkVkEvent Информация о событии в группе (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Неверный секретный ключ callback сервера или id группы </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1HooksVkEventsIntegrationIdPostAsync(Long integrationId, MKVkEvent mkVkEvent, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1HooksVkEventsIntegrationIdPostValidateBeforeCall(integrationId, mkVkEvent, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
