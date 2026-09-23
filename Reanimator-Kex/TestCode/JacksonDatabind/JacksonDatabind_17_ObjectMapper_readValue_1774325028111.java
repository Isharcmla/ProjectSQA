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

public class ObjectMapper_readValue_1774325028111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6240;

    public ObjectMapper_readValue_1774325028111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6240 = newInstance(Class.forName("java.net.URL"));
        Object term6284 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term6240, term6240.getClass(), "protocol", "http");
        setField(term6240, term6240.getClass(), "host", "www.google.com");
        setIntField(term6240, term6240.getClass(), "port", -1);
        setField(term6240, term6240.getClass(), "file", "");
        setField(term6240, term6240.getClass(), "query", null);
        setField(term6240, term6240.getClass(), "authority", "www.google.com");
        setField(term6240, term6240.getClass(), "path", "");
        setField(term6240, term6240.getClass(), "userInfo", null);
        setField(term6240, term6240.getClass(), "ref", null);
        setField(term6240, term6240.getClass(), "hostAddress", null);
        setField(term6284, term6284.getClass(), "proxy", null);
        setIntField(term6284, term6284.getClass(), "proxyPort", -1);
        setField(term6240, term6240.getClass(), "handler", term6284);
        setField(term6240, term6240.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term6240;
        args[1] = null;
        callMethod(klass, "readValue", argTypes, null, args);
    }

};


