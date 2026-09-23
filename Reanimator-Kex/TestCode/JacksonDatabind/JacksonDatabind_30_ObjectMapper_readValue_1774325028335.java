package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectMapper_readValue_1774325028335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5295;

    public ObjectMapper_readValue_1774325028335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5295 = newInstance(Class.forName("java.net.URL"));
        Object term5339 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term5295, term5295.getClass(), "protocol", "http");
        setField(term5295, term5295.getClass(), "host", "www.google.com");
        setIntField(term5295, term5295.getClass(), "port", -1);
        setField(term5295, term5295.getClass(), "file", "");
        setField(term5295, term5295.getClass(), "query", null);
        setField(term5295, term5295.getClass(), "authority", "www.google.com");
        setField(term5295, term5295.getClass(), "path", "");
        setField(term5295, term5295.getClass(), "userInfo", null);
        setField(term5295, term5295.getClass(), "ref", null);
        setField(term5295, term5295.getClass(), "hostAddress", null);
        setField(term5339, term5339.getClass(), "proxy", null);
        setIntField(term5339, term5339.getClass(), "proxyPort", -1);
        setField(term5295, term5295.getClass(), "handler", term5339);
        setField(term5295, term5295.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term5295;
        args[1] = null;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


