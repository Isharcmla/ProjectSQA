package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_neg_1431040499120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1939;

    public IR_neg_1431040499120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1939, term1939.getClass(), "type", 716486048);
        setIntField(term1941, term1941.getClass(), "type", -466708718);
        setIntField(term1943, term1943.getClass(), "type", 1038029515);
        setIntField(term1945, term1945.getClass(), "type", 1137154606);
        setIntField(term1947, term1947.getClass(), "type", -100681578);
        setField(term1947, term1947.getClass(), "next", null);
        setField(term1947, term1947.getClass(), "first", null);
        setField(term1947, term1947.getClass(), "last", null);
        setField(term1947, term1947.getClass(), "propListHead", null);
        setIntField(term1947, term1947.getClass(), "sourcePosition", 0);
        setField(term1947, term1947.getClass(), "jsType", null);
        setField(term1947, term1947.getClass(), "parent", null);
        setField(term1945, term1945.getClass(), "next", term1947);
        setIntField(term1950, term1950.getClass(), "type", 296568835);
        setField(term1950, term1950.getClass(), "next", null);
        setField(term1950, term1950.getClass(), "first", null);
        setField(term1950, term1950.getClass(), "last", term1947);
        setField(term1950, term1950.getClass(), "propListHead", null);
        setIntField(term1950, term1950.getClass(), "sourcePosition", 0);
        setField(term1950, term1950.getClass(), "jsType", null);
        setField(term1950, term1950.getClass(), "parent", null);
        setField(term1945, term1945.getClass(), "first", term1950);
        setField(term1945, term1945.getClass(), "last", term1943);
        setField(term1945, term1945.getClass(), "propListHead", null);
        setIntField(term1945, term1945.getClass(), "sourcePosition", 0);
        setField(term1945, term1945.getClass(), "jsType", null);
        setField(term1945, term1945.getClass(), "parent", null);
        setField(term1943, term1943.getClass(), "next", term1945);
        setField(term1943, term1943.getClass(), "first", term1947);
        setIntField(term1954, term1954.getClass(), "type", -1608123016);
        setIntField(term1956, term1956.getClass(), "type", -896473214);
        setField(term1956, term1956.getClass(), "next", null);
        setField(term1956, term1956.getClass(), "first", term1950);
        setField(term1956, term1956.getClass(), "last", term1945);
        setField(term1956, term1956.getClass(), "propListHead", null);
        setIntField(term1956, term1956.getClass(), "sourcePosition", 0);
        setField(term1956, term1956.getClass(), "jsType", null);
        setField(term1956, term1956.getClass(), "parent", null);
        setField(term1954, term1954.getClass(), "next", term1956);
        setField(term1954, term1954.getClass(), "first", term1941);
        setField(term1954, term1954.getClass(), "last", term1941);
        setField(term1954, term1954.getClass(), "propListHead", null);
        setIntField(term1954, term1954.getClass(), "sourcePosition", 0);
        setField(term1954, term1954.getClass(), "jsType", null);
        setField(term1954, term1954.getClass(), "parent", null);
        setField(term1943, term1943.getClass(), "last", term1954);
        setField(term1943, term1943.getClass(), "propListHead", null);
        setIntField(term1943, term1943.getClass(), "sourcePosition", 0);
        setField(term1943, term1943.getClass(), "jsType", null);
        setField(term1943, term1943.getClass(), "parent", null);
        setField(term1941, term1941.getClass(), "next", term1943);
        setIntField(term1961, term1961.getClass(), "type", 401203924);
        setField(term1961, term1961.getClass(), "next", term1954);
        setField(term1961, term1961.getClass(), "first", term1956);
        setField(term1961, term1961.getClass(), "last", term1939);
        setField(term1961, term1961.getClass(), "propListHead", null);
        setIntField(term1961, term1961.getClass(), "sourcePosition", 0);
        setField(term1961, term1961.getClass(), "jsType", null);
        setField(term1961, term1961.getClass(), "parent", null);
        setField(term1941, term1941.getClass(), "first", term1961);
        setField(term1941, term1941.getClass(), "last", term1961);
        setField(term1941, term1941.getClass(), "propListHead", null);
        setIntField(term1941, term1941.getClass(), "sourcePosition", 0);
        setField(term1941, term1941.getClass(), "jsType", null);
        setField(term1941, term1941.getClass(), "parent", null);
        setField(term1939, term1939.getClass(), "next", term1941);
        setField(term1939, term1939.getClass(), "first", term1945);
        setField(term1939, term1939.getClass(), "last", term1947);
        setField(term1939, term1939.getClass(), "propListHead", null);
        setIntField(term1939, term1939.getClass(), "sourcePosition", 0);
        setField(term1939, term1939.getClass(), "jsType", null);
        setField(term1939, term1939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1939;
        try {
            callMethod(klass, "neg", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


