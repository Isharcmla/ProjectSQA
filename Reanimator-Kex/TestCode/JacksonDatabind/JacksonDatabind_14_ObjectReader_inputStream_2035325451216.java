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

public class ObjectReader_inputStream_2035325451216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794;

    public ObjectReader_inputStream_2035325451216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term794 = newInstance(Class.forName("java.net.URL"));
        Object term836 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term794, term794.getClass(), "protocol", "http");
        setField(term794, term794.getClass(), "host", "www.yahoo.com");
        setIntField(term794, term794.getClass(), "port", -1);
        setField(term794, term794.getClass(), "file", "");
        setField(term794, term794.getClass(), "query", null);
        setField(term794, term794.getClass(), "authority", "www.yahoo.com");
        setField(term794, term794.getClass(), "path", "");
        setField(term794, term794.getClass(), "userInfo", null);
        setField(term794, term794.getClass(), "ref", null);
        setField(term794, term794.getClass(), "hostAddress", null);
        setField(term836, term836.getClass(), "proxy", null);
        setIntField(term836, term836.getClass(), "proxyPort", -1);
        setField(term794, term794.getClass(), "handler", term836);
        setField(term794, term794.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term794;
        try {
            callMethod(klass, "_inputStream", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


