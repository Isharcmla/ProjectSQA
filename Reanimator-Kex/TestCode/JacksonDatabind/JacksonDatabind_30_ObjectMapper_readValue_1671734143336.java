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

public class ObjectMapper_readValue_1671734143336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5373;

    public ObjectMapper_readValue_1671734143336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5373 = newInstance(Class.forName("java.net.URL"));
        Object term5415 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term5373, term5373.getClass(), "protocol", "http");
        setField(term5373, term5373.getClass(), "host", "www.yahoo.com");
        setIntField(term5373, term5373.getClass(), "port", -1);
        setField(term5373, term5373.getClass(), "file", "");
        setField(term5373, term5373.getClass(), "query", null);
        setField(term5373, term5373.getClass(), "authority", "www.yahoo.com");
        setField(term5373, term5373.getClass(), "path", "");
        setField(term5373, term5373.getClass(), "userInfo", null);
        setField(term5373, term5373.getClass(), "ref", null);
        setField(term5373, term5373.getClass(), "hostAddress", null);
        setField(term5415, term5415.getClass(), "proxy", null);
        setIntField(term5415, term5415.getClass(), "proxyPort", -1);
        setField(term5373, term5373.getClass(), "handler", term5415);
        setField(term5373, term5373.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.type.TypeReference");
        Object[] args = new Object[2];
        args[0] = term5373;
        args[1] = null;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


