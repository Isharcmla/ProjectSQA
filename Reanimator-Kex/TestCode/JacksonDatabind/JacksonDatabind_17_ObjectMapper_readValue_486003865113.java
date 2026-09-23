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

public class ObjectMapper_readValue_486003865113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6392;

    public ObjectMapper_readValue_486003865113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6392 = newInstance(Class.forName("java.net.URL"));
        Object term6442 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term6392, term6392.getClass(), "protocol", "http");
        setField(term6392, term6392.getClass(), "host", "www.wikipedia.org");
        setIntField(term6392, term6392.getClass(), "port", -1);
        setField(term6392, term6392.getClass(), "file", "");
        setField(term6392, term6392.getClass(), "query", null);
        setField(term6392, term6392.getClass(), "authority", "www.wikipedia.org");
        setField(term6392, term6392.getClass(), "path", "");
        setField(term6392, term6392.getClass(), "userInfo", null);
        setField(term6392, term6392.getClass(), "ref", null);
        setField(term6392, term6392.getClass(), "hostAddress", null);
        setField(term6442, term6442.getClass(), "proxy", null);
        setIntField(term6442, term6442.getClass(), "proxyPort", -1);
        setField(term6392, term6392.getClass(), "handler", term6442);
        setField(term6392, term6392.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term6392;
        args[1] = null;
        callMethod(klass, "readValue", argTypes, null, args);
    }

};


