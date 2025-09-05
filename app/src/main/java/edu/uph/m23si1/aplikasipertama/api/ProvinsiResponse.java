package edu.uph.m23si1.aplikasipertama.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import edu.uph.m23si1.aplikasipertama.model.Provinsi;

public class ProvinsiResponse {
    @SerializedName("data")
    private List<Provinsi> data;
    public List<Provinsi> getData() { return data; }
}