/** The complicated stuff.
 * I needed to retrieve a token and store it for use in the android application, this way that Twitter knows I am a real person using their services
 * This part of the code was the most challenging, because most of it is getting the token to work for the application
 * Once the token has been received, I was then able to get tweets from Twitter as long as I had the "bearer" token
 * Without a token authenticating myself, there would be no code.
 * Twitter's developer website provided me with an access token and access token secret; however, I had no idea how to implement it, so I made...
 * ...the assumption that I did not have it, which was probably a significantly more difficult task if I had the knowledge of its uses
 * This token only allows for the JSON data to be retrieved, so I needed to convert JSON text to a readable text on the screen using GSON library
 * The array list will only pull up the last 20 tweets, a sufficient amount to get some key information about Fordham for newcomers to the University
 */

/*
package com.example.newtwitter;

import android.util.Base64;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.example.newtwitter.HttpUtil;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class TwitterAPI {

    private String twitterApiKey;
    private String twitterAPISecret;
    final static String TWITTER_TOKEN_URL = "https://api.twitter.com/oauth2/token";
    final static String TWITTER_STREAM_URL = "https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=";

    public TwitterAPI(String twitterAPIKey, String twitterApiSecret){
        this.twitterApiKey = twitterAPIKey;
        this.twitterAPISecret = twitterApiSecret;
    }

    public ArrayList<TwitterTweet> getTwitterTweets(String screenName) {
        ArrayList<TwitterTweet> twitterTweetArrayList = null;
        try {
            String twitterUrlApiKey = URLEncoder.encode(twitterApiKey, "utf-8");
            String twitterUrlApiSecret = URLEncoder.encode(twitterAPISecret, "utf-8");
            String twitterKeySecret = twitterUrlApiKey + ":" + twitterUrlApiSecret;
            String twitterKeyBase64 = Base64.encodeToString(twitterKeySecret.getBytes(), Base64.NO_WRAP);
            TwitterAuthToken twitterAuthToken = getTwitterAuthToken(twitterKeyBase64);
            twitterTweetArrayList = getTwitterTweets(screenName, twitterAuthToken);
        } catch (UnsupportedEncodingException ex) {
        } catch (IllegalStateException ex1) {
        }
        return twitterTweetArrayList;
    }

    public ArrayList<TwitterTweet> getTwitterTweets(String screenName,
                                                     TwitterAuthToken twitterAuthToken) {
        ArrayList<TwitterTweet> twitterTweetArrayList = null;
        if (twitterAuthToken != null && twitterAuthToken.token_type.equals("bearer")) {
            HttpGet httpGet = new HttpGet(TWITTER_STREAM_URL + screenName);
            httpGet.setHeader("Authorization", "Bearer " + twitterAuthToken.access_token);
            httpGet.setHeader("Content-Type", "application/json");
            HttpUtil httpUtil = new HttpUtil();
            String twitterTweets = httpUtil.getHttpResponse(httpGet);
            twitterTweetArrayList = convertJsonToTwitterTweet(twitterTweets);
        }
        return twitterTweetArrayList;
    }

    public TwitterAuthToken getTwitterAuthToken(String twitterKeyBase64) throws UnsupportedEncodingException {
        HttpPost httpPost = new HttpPost(TWITTER_TOKEN_URL);
        httpPost.setHeader("Authorization", "Basic " + twitterKeyBase64);
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        httpPost.setEntity(new StringEntity("grant_type=client_credentials"));
        HttpUtil httpUtil = new HttpUtil();
        String twitterJsonResponse = httpUtil.getHttpResponse(httpPost);
        return convertJsonToTwitterAuthToken(twitterJsonResponse);
    }

    private TwitterAuthToken convertJsonToTwitterAuthToken(String jsonAuth) {
        TwitterAuthToken twitterAuthToken = null;
        if (jsonAuth != null && jsonAuth.length() > 0) {
            try {
                Gson gson = new Gson();
                twitterAuthToken = gson.fromJson(jsonAuth, TwitterAuthToken.class);
            } catch (IllegalStateException ex) { }
        }
        return twitterAuthToken;
    }

    private ArrayList<TwitterTweet> convertJsonToTwitterTweet(String twitterTweets) {
        ArrayList<TwitterTweet> twitterTweetArrayList = null;
        if (twitterTweets != null && twitterTweets.length() > 0) {
            try {
                Gson gson = new Gson();
                twitterTweetArrayList =
                        gson.fromJson(twitterTweets, new TypeToken<ArrayList<TwitterTweet>>(){}.getType());
            } catch (IllegalStateException e) {
            }
        }
        return twitterTweetArrayList;
    }
    private class TwitterAuthToken {
        String token_type;
        String access_token;
    }
}*/