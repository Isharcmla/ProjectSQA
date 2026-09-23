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

public class ObjectReader_inputStream_2035325451233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;

    public ObjectReader_inputStream_2035325451233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term769 = newInstance(Class.forName("java.net.URL"));
        Object term811 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term769, term769.getClass(), "protocol", "http");
        setField(term769, term769.getClass(), "host", "www.yahoo.com");
        setIntField(term769, term769.getClass(), "port", -1);
        setField(term769, term769.getClass(), "file", "");
        setField(term769, term769.getClass(), "query", null);
        setField(term769, term769.getClass(), "authority", "www.yahoo.com");
        setField(term769, term769.getClass(), "path", "");
        setField(term769, term769.getClass(), "userInfo", null);
        setField(term769, term769.getClass(), "ref", null);
        setField(term769, term769.getClass(), "hostAddress", null);
        setField(term811, term811.getClass(), "proxy", null);
        setIntField(term811, term811.getClass(), "proxyPort", -1);
        setField(term769, term769.getClass(), "handler", term811);
        setField(term769, term769.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term769;
        try {
            callMethod(klass, "_inputStream", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


