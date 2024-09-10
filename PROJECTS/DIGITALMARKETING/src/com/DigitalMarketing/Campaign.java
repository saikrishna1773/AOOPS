package com.DigitalMarketing;
import java.util.*;
public class Campaign {
	
	private String name;
    private List<Ad> ads;

    public Campaign(String name) {
        this.name = name;
        this.ads = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void addAd(Ad ad) {
        ads.add(ad);
    }

}
