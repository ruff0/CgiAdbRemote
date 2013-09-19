package uk.org.baverstock.cgiadbremote;

import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class NullHttpSession implements NanoHTTPD.IHTTPSession {
    @Override
    public void execute() throws IOException {}

    @Override
    public Map<String, String> getParms() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Deprecated
    @Override
    public String getUri() {
        // Deprecated - not used by nanohttp, but supported for legacy.
        return getPath();
    }

    @Override
    public NanoHTTPD.Method getMethod() {
        return null;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }

    @Override
    public NanoHTTPD.CookieHandler getCookies() {
        return null;
    }

    @Override
    public void parseBody(Map<String, String> stringStringMap) throws IOException, NanoHTTPD.ResponseException {}
}