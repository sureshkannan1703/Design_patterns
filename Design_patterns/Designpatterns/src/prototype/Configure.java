package prototype;

public class Configure implements Configurable<Configure> {

    private Integer configId;

    private String configName;

    private Integer configValue;

    private Boolean isEnabled;

    private String type;

    public Configure(Integer configId, String configName, Integer configValue, Boolean isEnabled, String type) {
        this.configId = configId;
        this.configName = configName;
        this.configValue = configValue;
        this.isEnabled = isEnabled;
        this.type = type;
    }

    @Override
    public Configure clone() {
        return new Configure(this.configId, this.configName,this.configValue, this.isEnabled,this.type);
    }

    public Integer getConfigId() {
        return configId;
    }

    public String getConfigName() {
        return configName;
    }

    public Integer getConfigValue() {
        return configValue;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public String getType() {
        return type;
    }
}
