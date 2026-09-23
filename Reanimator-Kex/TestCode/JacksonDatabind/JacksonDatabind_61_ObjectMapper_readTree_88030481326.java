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

public class ObjectMapper_readTree_88030481326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public ObjectMapper_readTree_88030481326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339 = newInstance(Class.forName("java.net.URL"));
        Object term383 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term339, term339.getClass(), "protocol", "http");
        setField(term339, term339.getClass(), "host", "www.oracle.com");
        setIntField(term339, term339.getClass(), "port", -1);
        setField(term339, term339.getClass(), "file", "");
        setField(term339, term339.getClass(), "query", null);
        setField(term339, term339.getClass(), "authority", "www.oracle.com");
        setField(term339, term339.getClass(), "path", "");
        setField(term339, term339.getClass(), "userInfo", null);
        setField(term339, term339.getClass(), "ref", null);
        setField(term339, term339.getClass(), "hostAddress", null);
        setField(term383, term383.getClass(), "proxy", null);
        setIntField(term383, term383.getClass(), "proxyPort", -1);
        setField(term339, term339.getClass(), "handler", term383);
        setField(term339, term339.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term339;
        try {
            callMethod(klass, "readTree", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


