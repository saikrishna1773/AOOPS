package com.DigitalMarketing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; // Use BeforeEach instead of Before
import org.junit.jupiter.api.Test;

class AnalyticsTest {

    private Ad ad;

    @BeforeEach // Replace @Before with @BeforeEach
    public void setUp() {
        ad = new Ad("Summer Sale Ad");
    }

    @Test
    public void testCalculateCTR() {
        ad.incrementImpressions();
        ad.incrementClicks();
        double ctr = Analytics.calculateCTR(ad);
        assertEquals(1.0, ctr, 0.001);

        ad.incrementImpressions();
        ctr = Analytics.calculateCTR(ad);
        assertEquals(0.5, ctr, 0.001);
    }

    @Test
    public void testCTRNoImpressions() {
        double ctr = Analytics.calculateCTR(ad);
        assertEquals(0.0, ctr, 0.001);
    }
}
