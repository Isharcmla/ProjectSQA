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

public class ObjectReader_readValue_382527584211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public ObjectReader_readValue_382527584211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391 = newInstance(Class.forName("java.net.URL"));
        Object term435 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term391, term391.getClass(), "protocol", "http");
        setField(term391, term391.getClass(), "host", "www.oracle.com");
        setIntField(term391, term391.getClass(), "port", -1);
        setField(term391, term391.getClass(), "file", "");
        setField(term391, term391.getClass(), "query", null);
        setField(term391, term391.getClass(), "authority", "www.oracle.com");
        setField(term391, term391.getClass(), "path", "");
        setField(term391, term391.getClass(), "userInfo", null);
        setField(term391, term391.getClass(), "ref", null);
        setField(term391, term391.getClass(), "hostAddress", null);
        setField(term435, term435.getClass(), "proxy", null);
        setIntField(term435, term435.getClass(), "proxyPort", -1);
        setField(term391, term391.getClass(), "handler", term435);
        setField(term391, term391.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term391;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


