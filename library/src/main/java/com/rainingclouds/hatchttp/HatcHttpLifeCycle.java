package com.rainingclouds.hatchttp;

/**
 * Created by sudam on 07/09/15.
 */
public interface HatcHttpLifeCycle {
    void onPreExecute(HatcHttpRequest request);
    void onPostExecute(HatcHttpRequest request);
}
