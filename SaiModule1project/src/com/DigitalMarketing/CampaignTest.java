package com.DigitalMarketing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampaignTest {

    private Campaign campaign;

    @BeforeEach 
    public void setUp() {
        campaign = new Campaign("Summer Sale");
    }

    @Test
    public void testCampaignCreation() {
        assertNotNull(campaign);
        assertEquals("Summer Sale", campaign.getName());
    }

    @Test
    public void testAddAdToCampaign() {
        Ad ad = new Ad("Buy 1 Get 1 Free");
        campaign.addAd(ad);
        assertEquals(1, campaign.getAds().size());
        assertEquals("Buy 1 Get 1 Free", campaign.getAds().get(0).getContent());
    }
}
