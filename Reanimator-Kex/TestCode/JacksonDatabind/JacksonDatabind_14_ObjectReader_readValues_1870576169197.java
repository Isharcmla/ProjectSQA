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

public class ObjectReader_readValues_1870576169197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702;

    public ObjectReader_readValues_1870576169197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702 = newInstance(Class.forName("java.net.URL"));
        Object term746 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term702, term702.getClass(), "protocol", "http");
        setField(term702, term702.getClass(), "host", "www.google.com");
        setIntField(term702, term702.getClass(), "port", -1);
        setField(term702, term702.getClass(), "file", "");
        setField(term702, term702.getClass(), "query", null);
        setField(term702, term702.getClass(), "authority", "www.google.com");
        setField(term702, term702.getClass(), "path", "");
        setField(term702, term702.getClass(), "userInfo", null);
        setField(term702, term702.getClass(), "ref", null);
        setField(term702, term702.getClass(), "hostAddress", null);
        setField(term746, term746.getClass(), "proxy", null);
        setIntField(term746, term746.getClass(), "proxyPort", -1);
        setField(term702, term702.getClass(), "handler", term746);
        setField(term702, term702.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term702;
        try {
            callMethod(klass, "readValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


