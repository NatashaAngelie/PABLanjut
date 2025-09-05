package edu.uph.m23si1.aplikasipertama.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import edu.uph.m23si1.aplikasipertama.model.Kota;
public class KotaResponse {
    @SerializedName("data")
    private List<Kota> data;
    public List<Kota> getData() { return data; }
}