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

public class ObjectReader_readValues_1870576169227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709;

    public ObjectReader_readValues_1870576169227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709 = newInstance(Class.forName("java.net.URL"));
        Object term753 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term709, term709.getClass(), "protocol", "http");
        setField(term709, term709.getClass(), "host", "www.google.com");
        setIntField(term709, term709.getClass(), "port", -1);
        setField(term709, term709.getClass(), "file", "");
        setField(term709, term709.getClass(), "query", null);
        setField(term709, term709.getClass(), "authority", "www.google.com");
        setField(term709, term709.getClass(), "path", "");
        setField(term709, term709.getClass(), "userInfo", null);
        setField(term709, term709.getClass(), "ref", null);
        setField(term709, term709.getClass(), "hostAddress", null);
        setField(term753, term753.getClass(), "proxy", null);
        setIntField(term753, term753.getClass(), "proxyPort", -1);
        setField(term709, term709.getClass(), "handler", term753);
        setField(term709, term709.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term709;
        try {
            callMethod(klass, "readValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


