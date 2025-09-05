package edu.uph.m23si1.aplikasipertama.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/provinces.json")
    Call<ProvinsiResponse> getProvinces();

    @GET("api/regencies/{province_code}.json")
    Call<KotaResponse> getCities(@Path("province_code") String provinceCode);
}
