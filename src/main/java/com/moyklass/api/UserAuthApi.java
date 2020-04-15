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


import com.moyklass.api.model.MKAuthResult;
import com.moyklass.api.model.MKErrorHandling;
import com.moyklass.api.model.MKUserAuth;
import com.moyklass.api.model.MKUserRestoreKey;
import com.moyklass.api.model.MKUserRestorePassword;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAuthApi {
    private ApiClient localVarApiClient;

    public UserAuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserAuthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1UserAuthLoginPost
     * @param mkUserAuth Параметры авторизации (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе авторизация не пройдет.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthLoginPostCall(MKUserAuth mkUserAuth, String origin, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = mkUserAuth;

        // create path and map variables
        String localVarPath = "/v1/user/auth/login";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (origin != null) {
            localVarHeaderParams.put("Origin", localVarApiClient.parameterToString(origin));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserAuthLoginPostValidateBeforeCall(MKUserAuth mkUserAuth, String origin, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'mkUserAuth' is set
        if (mkUserAuth == null) {
            throw new ApiException("Missing the required parameter 'mkUserAuth' when calling v1UserAuthLoginPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1UserAuthLoginPostCall(mkUserAuth, origin, _callback);
        return localVarCall;

    }

    /**
     * Авторизация аккаунта
     * Для авторизации используются реквизиты аккаунта 
     * @param mkUserAuth Параметры авторизации (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе авторизация не пройдет.  (optional)
     * @return MKAuthResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public MKAuthResult v1UserAuthLoginPost(MKUserAuth mkUserAuth, String origin) throws ApiException {
        ApiResponse<MKAuthResult> localVarResp = v1UserAuthLoginPostWithHttpInfo(mkUserAuth, origin);
        return localVarResp.getData();
    }

    /**
     * Авторизация аккаунта
     * Для авторизации используются реквизиты аккаунта 
     * @param mkUserAuth Параметры авторизации (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе авторизация не пройдет.  (optional)
     * @return ApiResponse&lt;MKAuthResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MKAuthResult> v1UserAuthLoginPostWithHttpInfo(MKUserAuth mkUserAuth, String origin) throws ApiException {
        okhttp3.Call localVarCall = v1UserAuthLoginPostValidateBeforeCall(mkUserAuth, origin, null);
        Type localVarReturnType = new TypeToken<MKAuthResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Авторизация аккаунта (asynchronously)
     * Для авторизации используются реквизиты аккаунта 
     * @param mkUserAuth Параметры авторизации (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе авторизация не пройдет.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthLoginPostAsync(MKUserAuth mkUserAuth, String origin, final ApiCallback<MKAuthResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserAuthLoginPostValidateBeforeCall(mkUserAuth, origin, _callback);
        Type localVarReturnType = new TypeToken<MKAuthResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserAuthLogoutPost
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Успешный выход </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthLogoutPostCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/user/auth/logout";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "userSession", "xCookieToken", "xCsrfToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserAuthLogoutPostValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1UserAuthLogoutPostCall(_callback);
        return localVarCall;

    }

    /**
     * Логаут аккаунта
     * Метод для выхода из системы. Сбрасывает сессию аккаунта. 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Успешный выход </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public void v1UserAuthLogoutPost() throws ApiException {
        v1UserAuthLogoutPostWithHttpInfo();
    }

    /**
     * Логаут аккаунта
     * Метод для выхода из системы. Сбрасывает сессию аккаунта. 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Успешный выход </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> v1UserAuthLogoutPostWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = v1UserAuthLogoutPostValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Логаут аккаунта (asynchronously)
     * Метод для выхода из системы. Сбрасывает сессию аккаунта. 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Успешный выход </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthLogoutPostAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserAuthLogoutPostValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserAuthRefreshPost
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthRefreshPostCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/user/auth/refresh";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "userSession", "xCookieToken", "xCsrfToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserAuthRefreshPostValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1UserAuthRefreshPostCall(_callback);
        return localVarCall;

    }

    /**
     * Обновление сессии
     * Обновление сессии аккаунта. создает новую сессию с новым таймаутом и новым токеном CSRF. Старая сессия при этом перестает действовать 
     * @return MKAuthResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public MKAuthResult v1UserAuthRefreshPost() throws ApiException {
        ApiResponse<MKAuthResult> localVarResp = v1UserAuthRefreshPostWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Обновление сессии
     * Обновление сессии аккаунта. создает новую сессию с новым таймаутом и новым токеном CSRF. Старая сессия при этом перестает действовать 
     * @return ApiResponse&lt;MKAuthResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MKAuthResult> v1UserAuthRefreshPostWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = v1UserAuthRefreshPostValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<MKAuthResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Обновление сессии (asynchronously)
     * Обновление сессии аккаунта. создает новую сессию с новым таймаутом и новым токеном CSRF. Старая сессия при этом перестает действовать 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Результат авторизации </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Ошибка авторизации </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthRefreshPostAsync(final ApiCallback<MKAuthResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserAuthRefreshPostValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<MKAuthResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserAuthSendRestoreKeyPost
     * @param mkUserRestoreKey Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе ключ не будет отправлен.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Ключ отправлен </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Email не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthSendRestoreKeyPostCall(MKUserRestoreKey mkUserRestoreKey, String origin, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = mkUserRestoreKey;

        // create path and map variables
        String localVarPath = "/v1/user/auth/sendRestoreKey";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (origin != null) {
            localVarHeaderParams.put("Origin", localVarApiClient.parameterToString(origin));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserAuthSendRestoreKeyPostValidateBeforeCall(MKUserRestoreKey mkUserRestoreKey, String origin, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'mkUserRestoreKey' is set
        if (mkUserRestoreKey == null) {
            throw new ApiException("Missing the required parameter 'mkUserRestoreKey' when calling v1UserAuthSendRestoreKeyPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1UserAuthSendRestoreKeyPostCall(mkUserRestoreKey, origin, _callback);
        return localVarCall;

    }

    /**
     * Ключ восстановления пароля
     * Отправляет на указанный email ключ для восстановления пароля
     * @param mkUserRestoreKey Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе ключ не будет отправлен.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Ключ отправлен </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Email не найден </td><td>  -  </td></tr>
     </table>
     */
    public void v1UserAuthSendRestoreKeyPost(MKUserRestoreKey mkUserRestoreKey, String origin) throws ApiException {
        v1UserAuthSendRestoreKeyPostWithHttpInfo(mkUserRestoreKey, origin);
    }

    /**
     * Ключ восстановления пароля
     * Отправляет на указанный email ключ для восстановления пароля
     * @param mkUserRestoreKey Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе ключ не будет отправлен.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Ключ отправлен </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Email не найден </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> v1UserAuthSendRestoreKeyPostWithHttpInfo(MKUserRestoreKey mkUserRestoreKey, String origin) throws ApiException {
        okhttp3.Call localVarCall = v1UserAuthSendRestoreKeyPostValidateBeforeCall(mkUserRestoreKey, origin, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Ключ восстановления пароля (asynchronously)
     * Отправляет на указанный email ключ для восстановления пароля
     * @param mkUserRestoreKey Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе ключ не будет отправлен.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Ключ отправлен </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Ошибка валидации </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Email не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthSendRestoreKeyPostAsync(MKUserRestoreKey mkUserRestoreKey, String origin, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserAuthSendRestoreKeyPostValidateBeforeCall(mkUserRestoreKey, origin, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserAuthSetPasswordPost
     * @param mkUserRestorePassword Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе пароль не будет восстановлен.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Пароль установлен </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Ключ не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthSetPasswordPostCall(MKUserRestorePassword mkUserRestorePassword, String origin, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = mkUserRestorePassword;

        // create path and map variables
        String localVarPath = "/v1/user/auth/setPassword";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (origin != null) {
            localVarHeaderParams.put("Origin", localVarApiClient.parameterToString(origin));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserAuthSetPasswordPostValidateBeforeCall(MKUserRestorePassword mkUserRestorePassword, String origin, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'mkUserRestorePassword' is set
        if (mkUserRestorePassword == null) {
            throw new ApiException("Missing the required parameter 'mkUserRestorePassword' when calling v1UserAuthSetPasswordPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1UserAuthSetPasswordPostCall(mkUserRestorePassword, origin, _callback);
        return localVarCall;

    }

    /**
     * Установка пароля
     * Устанавливает пароль на основе указанного ключа восстановления
     * @param mkUserRestorePassword Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе пароль не будет восстановлен.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Пароль установлен </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Ключ не найден </td><td>  -  </td></tr>
     </table>
     */
    public void v1UserAuthSetPasswordPost(MKUserRestorePassword mkUserRestorePassword, String origin) throws ApiException {
        v1UserAuthSetPasswordPostWithHttpInfo(mkUserRestorePassword, origin);
    }

    /**
     * Установка пароля
     * Устанавливает пароль на основе указанного ключа восстановления
     * @param mkUserRestorePassword Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе пароль не будет восстановлен.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Пароль установлен </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Ключ не найден </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> v1UserAuthSetPasswordPostWithHttpInfo(MKUserRestorePassword mkUserRestorePassword, String origin) throws ApiException {
        okhttp3.Call localVarCall = v1UserAuthSetPasswordPostValidateBeforeCall(mkUserRestorePassword, origin, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Установка пароля (asynchronously)
     * Устанавливает пароль на основе указанного ключа восстановления
     * @param mkUserRestorePassword Параметры для отправки ключа (required)
     * @param origin Имя сервера, с которого производится запрос. Домен должен быть прописан в настройках личного кабинета, иначе пароль не будет восстановлен.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Пароль установлен </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Ключ не найден </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserAuthSetPasswordPostAsync(MKUserRestorePassword mkUserRestorePassword, String origin, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserAuthSetPasswordPostValidateBeforeCall(mkUserRestorePassword, origin, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
