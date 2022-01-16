package api.body;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Value
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class NetworkHealthCheckRequest {

    @JsonProperty("deviceInfo")
    DeviceInfo deviceInfo;
    @JsonProperty("domains")
    List<String> domains;
    @JsonProperty("timeout")
    Integer timeout;
    @JsonIgnore
    Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
