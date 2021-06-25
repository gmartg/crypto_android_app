package com.geoapp

import java.net.HttpURLConnection
import java.net.URL

class HttpCommunicator {

    fun sendGet(id: Int): Boolean {
        val url = URL("http://localhost:5000/" + id)

        var response: Boolean;
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET

            println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

            inputStream.bufferedReader().use {
                response = it.readLine().equals(true);
            }
        }
        return response;
    }
}