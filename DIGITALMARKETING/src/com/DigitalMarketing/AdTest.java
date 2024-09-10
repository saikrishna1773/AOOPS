package com.DigitalMarketing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

class AdTest {

    private Ad ad;

    @BeforeEach 
    public void setUp() {
        ad = new Ad("Discount 50%");
    }

    @Test
    public void testAdCreation() {
        assertNotNull(ad);
        assertEquals("Discount 50%", ad.getContent());
    }

    @Test
    public void testAdImpressions() {
        ad.incrementImpressions();
        assertEquals(1, ad.getImpressions());
    }

    @Test
    public void testAdClicks() {
        ad.incrementClicks();
        assertEquals(1, ad.getClicks());
    }
}
