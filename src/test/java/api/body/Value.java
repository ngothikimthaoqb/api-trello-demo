package api.body;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@lombok.Value
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class Value {

    @JsonProperty("usingProxy")
    private Boolean usingProxy;
    @JsonProperty("status")
    private String status;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("ipAddress")
    private String ipAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
