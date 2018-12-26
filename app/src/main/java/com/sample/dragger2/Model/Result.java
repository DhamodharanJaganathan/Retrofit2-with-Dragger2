package com.sample.dragger2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("headers")
    @Expose
    private Headers headers;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("url")
    @Expose
    private String url;


    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public class Headers {

        @SerializedName("Accept")
        @Expose
        private String accept;
        @SerializedName("Accept-Encoding")
        @Expose
        private String acceptEncoding;
        @SerializedName("Accept-Language")
        @Expose
        private String acceptLanguage;
        @SerializedName("Connection")
        @Expose
        private String connection;
        @SerializedName("Content-Type")
        @Expose
        private String contentType;
        @SerializedName("Host")
        @Expose
        private String host;
        @SerializedName("Origin")
        @Expose
        private String origin;
        @SerializedName("Referer")
        @Expose
        private String referer;
        @SerializedName("User-Agent")
        @Expose
        private String userAgent;

        public String getAccept() {
            return accept;
        }

        public void setAccept(String accept) {
            this.accept = accept;
        }

        public String getAcceptEncoding() {
            return acceptEncoding;
        }

        public void setAcceptEncoding(String acceptEncoding) {
            this.acceptEncoding = acceptEncoding;
        }

        public String getAcceptLanguage() {
            return acceptLanguage;
        }

        public void setAcceptLanguage(String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
        }

        public String getConnection() {
            return connection;
        }

        public void setConnection(String connection) {
            this.connection = connection;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getReferer() {
            return referer;
        }

        public void setReferer(String referer) {
            this.referer = referer;
        }

        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
        }

    }
}