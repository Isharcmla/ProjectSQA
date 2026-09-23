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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectMapper_readValue_1671734143112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6318;

    public ObjectMapper_readValue_1671734143112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6318 = newInstance(Class.forName("java.net.URL"));
        Object term6360 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term6318, term6318.getClass(), "protocol", "http");
        setField(term6318, term6318.getClass(), "host", "www.yahoo.com");
        setIntField(term6318, term6318.getClass(), "port", -1);
        setField(term6318, term6318.getClass(), "file", "");
        setField(term6318, term6318.getClass(), "query", null);
        setField(term6318, term6318.getClass(), "authority", "www.yahoo.com");
        setField(term6318, term6318.getClass(), "path", "");
        setField(term6318, term6318.getClass(), "userInfo", null);
        setField(term6318, term6318.getClass(), "ref", null);
        setField(term6318, term6318.getClass(), "hostAddress", null);
        setField(term6360, term6360.getClass(), "proxy", null);
        setIntField(term6360, term6360.getClass(), "proxyPort", -1);
        setField(term6318, term6318.getClass(), "handler", term6360);
        setField(term6318, term6318.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.type.TypeReference");
        Object[] args = new Object[2];
        args[0] = term6318;
        args[1] = null;
        callMethod(klass, "readValue", argTypes, null, args);
    }

};


