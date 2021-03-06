package com.lombok.iak.project_01networking.api;

import com.lombok.iak.project_01networking.model.Job;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hayi on 11/01/18.
 */

public interface GitAPI {

    /**
     * TODO - 04: Membuat Interface Endpoint.
     *
     */

    @GET("positions/{id}.json")
    Call<Job> getJob(@Path("id") String idJob);

}
