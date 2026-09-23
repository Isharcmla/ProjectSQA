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

public class ObjectMapper_readValue_486003865337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5447;

    public ObjectMapper_readValue_486003865337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5447 = newInstance(Class.forName("java.net.URL"));
        Object term5497 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term5447, term5447.getClass(), "protocol", "http");
        setField(term5447, term5447.getClass(), "host", "www.wikipedia.org");
        setIntField(term5447, term5447.getClass(), "port", -1);
        setField(term5447, term5447.getClass(), "file", "");
        setField(term5447, term5447.getClass(), "query", null);
        setField(term5447, term5447.getClass(), "authority", "www.wikipedia.org");
        setField(term5447, term5447.getClass(), "path", "");
        setField(term5447, term5447.getClass(), "userInfo", null);
        setField(term5447, term5447.getClass(), "ref", null);
        setField(term5447, term5447.getClass(), "hostAddress", null);
        setField(term5497, term5497.getClass(), "proxy", null);
        setIntField(term5497, term5497.getClass(), "proxyPort", -1);
        setField(term5447, term5447.getClass(), "handler", term5497);
        setField(term5447, term5447.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term5447;
        args[1] = null;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


