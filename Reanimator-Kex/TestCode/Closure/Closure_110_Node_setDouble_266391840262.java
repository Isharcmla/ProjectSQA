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
import java.lang.Double;

public class Node_setDouble_266391840262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2222;
     Object term2249;

    public Node_setDouble_266391840262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2222, term2222.getClass(), "type", 1857693976);
        setIntField(term2224, term2224.getClass(), "type", 1631305277);
        setIntField(term2226, term2226.getClass(), "type", 162113491);
        setIntField(term2228, term2228.getClass(), "type", -932147928);
        setIntField(term2230, term2230.getClass(), "type", 487369012);
        setField(term2230, term2230.getClass(), "next", null);
        setField(term2230, term2230.getClass(), "first", null);
        setField(term2230, term2230.getClass(), "last", null);
        setField(term2230, term2230.getClass(), "propListHead", null);
        setIntField(term2230, term2230.getClass(), "sourcePosition", 0);
        setField(term2230, term2230.getClass(), "jsType", null);
        setField(term2230, term2230.getClass(), "parent", null);
        setField(term2228, term2228.getClass(), "next", term2230);
        setIntField(term2233, term2233.getClass(), "type", -179238712);
        setField(term2233, term2233.getClass(), "next", null);
        setField(term2233, term2233.getClass(), "first", null);
        setField(term2233, term2233.getClass(), "last", term2230);
        setField(term2233, term2233.getClass(), "propListHead", null);
        setIntField(term2233, term2233.getClass(), "sourcePosition", 0);
        setField(term2233, term2233.getClass(), "jsType", null);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2228, term2228.getClass(), "first", term2233);
        setField(term2228, term2228.getClass(), "last", term2226);
        setField(term2228, term2228.getClass(), "propListHead", null);
        setIntField(term2228, term2228.getClass(), "sourcePosition", 0);
        setField(term2228, term2228.getClass(), "jsType", null);
        setField(term2228, term2228.getClass(), "parent", null);
        setField(term2226, term2226.getClass(), "next", term2228);
        setField(term2226, term2226.getClass(), "first", term2230);
        setIntField(term2237, term2237.getClass(), "type", -658524954);
        setIntField(term2239, term2239.getClass(), "type", -2009613557);
        setField(term2239, term2239.getClass(), "next", null);
        setField(term2239, term2239.getClass(), "first", term2233);
        setField(term2239, term2239.getClass(), "last", term2228);
        setField(term2239, term2239.getClass(), "propListHead", null);
        setIntField(term2239, term2239.getClass(), "sourcePosition", 0);
        setField(term2239, term2239.getClass(), "jsType", null);
        setField(term2239, term2239.getClass(), "parent", null);
        setField(term2237, term2237.getClass(), "next", term2239);
        setField(term2237, term2237.getClass(), "first", term2224);
        setField(term2237, term2237.getClass(), "last", term2224);
        setField(term2237, term2237.getClass(), "propListHead", null);
        setIntField(term2237, term2237.getClass(), "sourcePosition", 0);
        setField(term2237, term2237.getClass(), "jsType", null);
        setField(term2237, term2237.getClass(), "parent", null);
        setField(term2226, term2226.getClass(), "last", term2237);
        setField(term2226, term2226.getClass(), "propListHead", null);
        setIntField(term2226, term2226.getClass(), "sourcePosition", 0);
        setField(term2226, term2226.getClass(), "jsType", null);
        setField(term2226, term2226.getClass(), "parent", null);
        setField(term2224, term2224.getClass(), "next", term2226);
        setIntField(term2244, term2244.getClass(), "type", 654195547);
        setField(term2244, term2244.getClass(), "next", term2237);
        setField(term2244, term2244.getClass(), "first", term2239);
        setField(term2244, term2244.getClass(), "last", term2222);
        setField(term2244, term2244.getClass(), "propListHead", null);
        setIntField(term2244, term2244.getClass(), "sourcePosition", 0);
        setField(term2244, term2244.getClass(), "jsType", null);
        setField(term2244, term2244.getClass(), "parent", null);
        setField(term2224, term2224.getClass(), "first", term2244);
        setField(term2224, term2224.getClass(), "last", term2244);
        setField(term2224, term2224.getClass(), "propListHead", null);
        setIntField(term2224, term2224.getClass(), "sourcePosition", 0);
        setField(term2224, term2224.getClass(), "jsType", null);
        setField(term2224, term2224.getClass(), "parent", null);
        setField(term2222, term2222.getClass(), "next", term2224);
        setField(term2222, term2222.getClass(), "first", term2228);
        setField(term2222, term2222.getClass(), "last", term2230);
        setField(term2222, term2222.getClass(), "propListHead", null);
        setIntField(term2222, term2222.getClass(), "sourcePosition", 0);
        setField(term2222, term2222.getClass(), "jsType", null);
        setField(term2222, term2222.getClass(), "parent", null);
        term2249 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2249;
        try {
            callMethod(klass, "setDouble", argTypes, term2222, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


