package com.dawn.pojo;

public class Cloud {
    private Long id;
    private int zoneId;
    private String zoneName;
    private String groupName;
    private String accessKey;
    private String secretKey;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Cloud() {
    }

    public Cloud(Long id, int zoneId, String groupName, String accessKey, String secretKey) {
        this.id = id;
        this.zoneId = zoneId;
        this.groupName = groupName;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    @Override
    public String toString() {
        return "Cloud{" +
                "id=" + id +
                ", zoneId=" + zoneId +
                ", zoneName='" + zoneName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", accessKey='" + accessKey + '\'' +
                ", secretKey='" + secretKey + '\'' +
                '}';
    }
}
