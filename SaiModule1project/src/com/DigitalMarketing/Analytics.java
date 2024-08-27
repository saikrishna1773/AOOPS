package com.DigitalMarketing;

public class Analytics {
	
	public static double calculateCTR(Ad ad) {
        if (ad.getImpressions() == 0) {
            return 0.0;
        }
        return (double) ad.getClicks() / ad.getImpressions();
    }

}
