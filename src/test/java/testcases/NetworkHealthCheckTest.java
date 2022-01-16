package testcases;

import api.body.DeviceInfo;
import api.body.NetworkHealthCheckRequest;
import api.body.NetworkHealthCheckResponse;
import api.NetworkHealthCheckApi;
import commons.StatusCode;
import data.NetworkHealthCheckData;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NetworkHealthCheckTest {

    @Test
    public void networkHealthCheck() {
        DeviceInfo deviceInfo = deviceInfoBuilder(NetworkHealthCheckData.getInstance().getPlatformName(),
                NetworkHealthCheckData.getInstance().getPlatformVersion(), NetworkHealthCheckData.getInstance().getUdid());

        NetworkHealthCheckRequest requestNetwork = networkHealthCheckRequestBuilder(deviceInfo,
                NetworkHealthCheckData.getInstance().getDomains(),
                Integer.parseInt(NetworkHealthCheckData.getInstance().getTimeout()));
        Response response = NetworkHealthCheckApi.post(requestNetwork);
        assertStatusCode(response.statusCode(), StatusCode.CODE_200.code);
        assertNetworkHealthCheck(response.as(NetworkHealthCheckResponse.class));
    }

    public DeviceInfo deviceInfoBuilder(String platformName, String platformVersion, String udid) {
        return DeviceInfo.builder().
                platformName(platformName).
                platformVersion(platformVersion).
                udid(udid).
                build();
    }

    public NetworkHealthCheckRequest networkHealthCheckRequestBuilder(DeviceInfo deviceInfo, List<String> domains, int timeout) {
        return NetworkHealthCheckRequest.builder().
                deviceInfo(deviceInfo).
                domains(domains).
                timeout(timeout).
                build();
    }

    public void assertNetworkHealthCheck(NetworkHealthCheckResponse responseNetwork) {
        assertThat(responseNetwork.getType(), equalTo(NetworkHealthCheckData.getInstance().getType()));
        assertThat(responseNetwork.getValue().getStatus(), equalTo(NetworkHealthCheckData.getInstance().getStatusNotConnect()));
        assertThat(responseNetwork.getValue().getUsingProxy(), equalTo(Boolean.parseBoolean(NetworkHealthCheckData.getInstance().getUsingProxy())));
    }

    public void assertStatusCode(int actualStatusCode, int expectedStatusCode) {
        assertThat(actualStatusCode, equalTo(expectedStatusCode));
    }
}
