package com.example.networkdemo;

import java.io.Serializable;

public class IpData implements Serializable {
    private String ip;
    private String country;
    private String city;
    private String isp;
    private String area;
    private String region;
    private String county;


    private String country_id;
    private String area_id;
    private String region_id;
    private String city_id;
    private String isp_id;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public void setIsp_id(String isp_id) {
        this.isp_id = isp_id;
    }


    public String getIp() {
        return ip;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public String getRegion() {
        return region;
    }

    public String getCounty() {
        return county;
    }

    public String getIsp() {
        return isp;
    }

    public String getCountry_id() {
        return country_id;
    }

    public String getArea_id() {
        return area_id;
    }

    public String getRegion_id() {
        return region_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public String getIsp_id() {
        return isp_id;
    }





}
