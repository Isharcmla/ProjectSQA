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

public class ObjectReader_readValue_382527584185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;

    public ObjectReader_readValue_382527584185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = newInstance(Class.forName("java.net.URL"));
        Object term420 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term376, term376.getClass(), "protocol", "http");
        setField(term376, term376.getClass(), "host", "www.oracle.com");
        setIntField(term376, term376.getClass(), "port", -1);
        setField(term376, term376.getClass(), "file", "");
        setField(term376, term376.getClass(), "query", null);
        setField(term376, term376.getClass(), "authority", "www.oracle.com");
        setField(term376, term376.getClass(), "path", "");
        setField(term376, term376.getClass(), "userInfo", null);
        setField(term376, term376.getClass(), "ref", null);
        setField(term376, term376.getClass(), "hostAddress", null);
        setField(term420, term420.getClass(), "proxy", null);
        setIntField(term420, term420.getClass(), "proxyPort", -1);
        setField(term376, term376.getClass(), "handler", term420);
        setField(term376, term376.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term376;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


