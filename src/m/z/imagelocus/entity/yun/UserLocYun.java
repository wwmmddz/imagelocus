package m.z.imagelocus.entity.yun;

/**
 * @author Winnid
 * @Title:百度LBS云存储实体类
 * @Description:百度LBS云存储实体类
 * @date 13-9-15
 * @Version V1.0
 * Created by Winnid on 13-9-15.
 */
public class UserLocYun {

    private Integer id;
    private double[] location = new double[2];
    //经度,纬度
    private double latitude;//纬度
    private double longitude;//经度

    private String province;//省
    private Integer city_id;//市id
    private String city;//城市名
    private String district;//区名
    private String address;//地址
    private String tags;//	标签以空格分隔

    private Integer geotable_id;//表主键,记录关联的geotable的标识

    private String title;//poi名称
    private int coord_type;//用户上传的坐标的类型//1：未加密的GPS坐标2：国测局加密3：百度加密


    private Integer distance;//距离
    private Integer weight;//权重

    //自定义字段
    private String app_user_id;
    private String username;
    private String userhead;
    private String phone;
    private int sex;

    public Integer getGeotable_id() {
        return geotable_id;
    }

    public void setGeotable_id(Integer geotable_id) {
        this.geotable_id = geotable_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCoord_type() {
        return coord_type;
    }

    public void setCoord_type(int coord_type) {
        this.coord_type = coord_type;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getApp_user_id() {
        return app_user_id;
    }

    public void setApp_user_id(String app_user_id) {
        this.app_user_id = app_user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getUserhead() {
        return userhead;
    }

    public void setUserhead(String userhead) {
        this.userhead = userhead;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
