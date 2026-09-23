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

public class ObjectReader_inputStream_2035325451246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;

    public ObjectReader_inputStream_2035325451246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814 = newInstance(Class.forName("java.net.URL"));
        Object term856 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term814, term814.getClass(), "protocol", "http");
        setField(term814, term814.getClass(), "host", "www.yahoo.com");
        setIntField(term814, term814.getClass(), "port", -1);
        setField(term814, term814.getClass(), "file", "");
        setField(term814, term814.getClass(), "query", null);
        setField(term814, term814.getClass(), "authority", "www.yahoo.com");
        setField(term814, term814.getClass(), "path", "");
        setField(term814, term814.getClass(), "userInfo", null);
        setField(term814, term814.getClass(), "ref", null);
        setField(term814, term814.getClass(), "hostAddress", null);
        setField(term856, term856.getClass(), "proxy", null);
        setIntField(term856, term856.getClass(), "proxyPort", -1);
        setField(term814, term814.getClass(), "handler", term856);
        setField(term814, term814.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term814;
        try {
            callMethod(klass, "_inputStream", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


