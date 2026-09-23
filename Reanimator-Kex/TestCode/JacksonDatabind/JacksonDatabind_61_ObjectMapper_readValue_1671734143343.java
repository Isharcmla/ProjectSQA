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

public class ObjectMapper_readValue_1671734143343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5781;

    public ObjectMapper_readValue_1671734143343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5781 = newInstance(Class.forName("java.net.URL"));
        Object term5823 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term5781, term5781.getClass(), "protocol", "http");
        setField(term5781, term5781.getClass(), "host", "www.yahoo.com");
        setIntField(term5781, term5781.getClass(), "port", -1);
        setField(term5781, term5781.getClass(), "file", "");
        setField(term5781, term5781.getClass(), "query", null);
        setField(term5781, term5781.getClass(), "authority", "www.yahoo.com");
        setField(term5781, term5781.getClass(), "path", "");
        setField(term5781, term5781.getClass(), "userInfo", null);
        setField(term5781, term5781.getClass(), "ref", null);
        setField(term5781, term5781.getClass(), "hostAddress", null);
        setField(term5823, term5823.getClass(), "proxy", null);
        setIntField(term5823, term5823.getClass(), "proxyPort", -1);
        setField(term5781, term5781.getClass(), "handler", term5823);
        setField(term5781, term5781.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.type.TypeReference");
        Object[] args = new Object[2];
        args[0] = term5781;
        args[1] = null;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


