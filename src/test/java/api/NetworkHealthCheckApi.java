package api;

import api.body.NetworkHealthCheckRequest;
import commons.RestResource;
import io.restassured.response.Response;

public class NetworkHealthCheckApi {

    public static Response post(NetworkHealthCheckRequest request) {
        return RestResource.post(ApiPath.NETWORK_HEALTH_CHECK, request);
    }
}
