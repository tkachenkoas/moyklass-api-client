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


import java.time.LocalDate;
import com.moyklass.api.model.MKErrorHandling;
import com.moyklass.api.model.MKUserBills;
import com.moyklass.api.model.MKUserPayments;
import com.moyklass.api.model.MKUserSubscriptions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPaymentsApi {
    private ApiClient localVarApiClient;

    public UserPaymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserPaymentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1UserBillsGet
     * @param date Дата списания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param includeRecords Включить в ответ записи на занятия (optional, default to false)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Списания </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserBillsGetCall(List<LocalDate> date, Boolean includeRecords, Long userId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/user/bills";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "date", date));
        }

        if (includeRecords != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeRecords", includeRecords));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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

        String[] localVarAuthNames = new String[] { "userSession", "xCookieToken", "xCsrfToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserBillsGetValidateBeforeCall(List<LocalDate> date, Boolean includeRecords, Long userId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1UserBillsGetCall(date, includeRecords, userId, offset, limit, _callback);
        return localVarCall;

    }

    /**
     * Списания ученика
     * Возвращает списания за занятия, за истекшие абонементы.
     * @param date Дата списания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param includeRecords Включить в ответ записи на занятия (optional, default to false)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @return MKUserBills
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Списания </td><td>  -  </td></tr>
     </table>
     */
    public MKUserBills v1UserBillsGet(List<LocalDate> date, Boolean includeRecords, Long userId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<MKUserBills> localVarResp = v1UserBillsGetWithHttpInfo(date, includeRecords, userId, offset, limit);
        return localVarResp.getData();
    }

    /**
     * Списания ученика
     * Возвращает списания за занятия, за истекшие абонементы.
     * @param date Дата списания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param includeRecords Включить в ответ записи на занятия (optional, default to false)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @return ApiResponse&lt;MKUserBills&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Списания </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MKUserBills> v1UserBillsGetWithHttpInfo(List<LocalDate> date, Boolean includeRecords, Long userId, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = v1UserBillsGetValidateBeforeCall(date, includeRecords, userId, offset, limit, null);
        Type localVarReturnType = new TypeToken<MKUserBills>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Списания ученика (asynchronously)
     * Возвращает списания за занятия, за истекшие абонементы.
     * @param date Дата списания. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param includeRecords Включить в ответ записи на занятия (optional, default to false)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Списания </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserBillsGetAsync(List<LocalDate> date, Boolean includeRecords, Long userId, Integer offset, Integer limit, final ApiCallback<MKUserBills> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserBillsGetValidateBeforeCall(date, includeRecords, userId, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<MKUserBills>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserPaymentsGet
     * @param date Дата платежа. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список платежей </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка в параметрах фильтра </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserPaymentsGetCall(List<LocalDate> date, Long userId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/user/payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "date", date));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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

        String[] localVarAuthNames = new String[] { "userSession", "xCookieToken", "xCsrfToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserPaymentsGetValidateBeforeCall(List<LocalDate> date, Long userId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1UserPaymentsGetCall(date, userId, offset, limit, _callback);
        return localVarCall;

    }

    /**
     * Платежи ученика
     * Возвращает список платежей
     * @param date Дата платежа. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @return MKUserPayments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список платежей </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка в параметрах фильтра </td><td>  -  </td></tr>
     </table>
     */
    public MKUserPayments v1UserPaymentsGet(List<LocalDate> date, Long userId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<MKUserPayments> localVarResp = v1UserPaymentsGetWithHttpInfo(date, userId, offset, limit);
        return localVarResp.getData();
    }

    /**
     * Платежи ученика
     * Возвращает список платежей
     * @param date Дата платежа. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @return ApiResponse&lt;MKUserPayments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список платежей </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка в параметрах фильтра </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MKUserPayments> v1UserPaymentsGetWithHttpInfo(List<LocalDate> date, Long userId, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = v1UserPaymentsGetValidateBeforeCall(date, userId, offset, limit, null);
        Type localVarReturnType = new TypeToken<MKUserPayments>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Платежи ученика (asynchronously)
     * Возвращает список платежей
     * @param date Дата платежа. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список платежей </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка в параметрах фильтра </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserPaymentsGetAsync(List<LocalDate> date, Long userId, Integer offset, Integer limit, final ApiCallback<MKUserPayments> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserPaymentsGetValidateBeforeCall(date, userId, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<MKUserPayments>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserSubscriptionsGet
     * @param date Дата продажи. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param statusId Статус абонемента (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список абонементов </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserSubscriptionsGetCall(List<LocalDate> date, Long userId, List<Integer> statusId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/user/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "date", date));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (statusId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "statusId", statusId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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

        String[] localVarAuthNames = new String[] { "userSession", "xCookieToken", "xCsrfToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserSubscriptionsGetValidateBeforeCall(List<LocalDate> date, Long userId, List<Integer> statusId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1UserSubscriptionsGetCall(date, userId, statusId, offset, limit, _callback);
        return localVarCall;

    }

    /**
     * Абонементы
     * Возвращает список абонементов
     * @param date Дата продажи. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param statusId Статус абонемента (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @return MKUserSubscriptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список абонементов </td><td>  -  </td></tr>
     </table>
     */
    public MKUserSubscriptions v1UserSubscriptionsGet(List<LocalDate> date, Long userId, List<Integer> statusId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<MKUserSubscriptions> localVarResp = v1UserSubscriptionsGetWithHttpInfo(date, userId, statusId, offset, limit);
        return localVarResp.getData();
    }

    /**
     * Абонементы
     * Возвращает список абонементов
     * @param date Дата продажи. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param statusId Статус абонемента (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @return ApiResponse&lt;MKUserSubscriptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список абонементов </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MKUserSubscriptions> v1UserSubscriptionsGetWithHttpInfo(List<LocalDate> date, Long userId, List<Integer> statusId, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = v1UserSubscriptionsGetValidateBeforeCall(date, userId, statusId, offset, limit, null);
        Type localVarReturnType = new TypeToken<MKUserSubscriptions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Абонементы (asynchronously)
     * Возвращает список абонементов
     * @param date Дата продажи. Если указана одна дата, то происходит поиск только по одной дате. Если указаны 2 даты, то производится поиск по диапазону (optional)
     * @param userId ID ученика (optional)
     * @param statusId Статус абонемента (optional)
     * @param offset Номер первой записи. Используется для постраничного вывода. (optional, default to 0)
     * @param limit Максимальное количество возвращаемых строк. Используется для постраничного вывода. (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Список абонементов </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserSubscriptionsGetAsync(List<LocalDate> date, Long userId, List<Integer> statusId, Integer offset, Integer limit, final ApiCallback<MKUserSubscriptions> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserSubscriptionsGetValidateBeforeCall(date, userId, statusId, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<MKUserSubscriptions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
