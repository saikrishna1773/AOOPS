package com.DigitalMarketing;

public class Ad {
	
	private String content;
    private int impressions;
    private int clicks;

    public Ad(String content) {
        this.content = content;
        this.impressions = 0;
        this.clicks = 0;
    }

    public String getContent() {
        return content;
    }

    public int getImpressions() {
        return impressions;
    }

    public void incrementImpressions() {
        this.impressions++;
    }

    public int getClicks() {
        return clicks;
    }

    public void incrementClicks() {
        this.clicks++;
    }

}
