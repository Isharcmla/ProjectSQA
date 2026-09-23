package org.jsoup.helper;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;

public class HttpConnection_encodeUrl_202081653245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term15394;
     Object term15302;

    public HttpConnection_encodeUrl_202081653245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("java.net.URL"));
        Object term167 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term123, term123.getClass(), "protocol", "http");
        setField(term123, term123.getClass(), "host", "www.google.com");
        setIntField(term123, term123.getClass(), "port", -1);
        setField(term123, term123.getClass(), "file", "");
        setField(term123, term123.getClass(), "query", null);
        setField(term123, term123.getClass(), "authority", "www.google.com");
        setField(term123, term123.getClass(), "path", "");
        setField(term123, term123.getClass(), "userInfo", null);
        setField(term123, term123.getClass(), "ref", null);
        setField(term123, term123.getClass(), "hostAddress", null);
        setField(term167, term167.getClass(), "proxy", null);
        setIntField(term167, term167.getClass(), "proxyPort", -1);
        setField(term123, term123.getClass(), "handler", term167);
        setField(term123, term123.getClass(), "tempState", null);
        term15394 = newInstance(Class.forName("java.net.URL"));
        Object term15405 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term15394, term15394.getClass(), "protocol", "http");
        setField(term15394, term15394.getClass(), "host", "www.google.com");
        setIntField(term15394, term15394.getClass(), "port", -1);
        setField(term15394, term15394.getClass(), "file", "");
        setField(term15394, term15394.getClass(), "query", null);
        setField(term15394, term15394.getClass(), "authority", "www.google.com");
        setField(term15394, term15394.getClass(), "path", "");
        setField(term15394, term15394.getClass(), "userInfo", null);
        setField(term15394, term15394.getClass(), "ref", null);
        setField(term15394, term15394.getClass(), "hostAddress", null);
        setField(term15405, term15405.getClass(), "proxy", null);
        setIntField(term15405, term15405.getClass(), "proxyPort", -1);
        setField(term15394, term15394.getClass(), "handler", term15405);
        setField(term15394, term15394.getClass(), "tempState", null);
        term15302 = newInstance(Class.forName("java.net.URL"));
        Object term15346 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term15302, term15302.getClass(), "protocol", "http");
        setField(term15302, term15302.getClass(), "host", "www.google.com");
        setIntField(term15302, term15302.getClass(), "port", -1);
        setField(term15302, term15302.getClass(), "file", "");
        setField(term15302, term15302.getClass(), "query", null);
        setField(term15302, term15302.getClass(), "authority", "www.google.com");
        setField(term15302, term15302.getClass(), "path", "");
        setField(term15302, term15302.getClass(), "userInfo", null);
        setField(term15302, term15302.getClass(), "ref", null);
        setField(term15302, term15302.getClass(), "hostAddress", null);
        setField(term15346, term15346.getClass(), "proxy", null);
        setIntField(term15346, term15346.getClass(), "proxyPort", -1);
        setField(term15302, term15302.getClass(), "handler", term15346);
        setField(term15302, term15302.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term123;
        Object retValue = callMethod(klass, "encodeUrl", argTypes, null, args);
        assertTrue(recursiveEquals(term123, term15394));
        assertTrue(recursiveEquals(retValue, term15302));
    }

};


