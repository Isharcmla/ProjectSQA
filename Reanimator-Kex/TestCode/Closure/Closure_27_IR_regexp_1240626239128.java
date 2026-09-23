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

public class IR_regexp_1240626239128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;
     Object term2238;

    public IR_regexp_1240626239128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2211, term2211.getClass(), "type", 1631305277);
        setIntField(term2213, term2213.getClass(), "type", 162113491);
        setIntField(term2215, term2215.getClass(), "type", -932147928);
        setIntField(term2217, term2217.getClass(), "type", 487369012);
        setIntField(term2219, term2219.getClass(), "type", -179238712);
        setField(term2219, term2219.getClass(), "next", null);
        setField(term2219, term2219.getClass(), "first", null);
        setField(term2219, term2219.getClass(), "last", null);
        setField(term2219, term2219.getClass(), "propListHead", null);
        setIntField(term2219, term2219.getClass(), "sourcePosition", 0);
        setField(term2219, term2219.getClass(), "jsType", null);
        setField(term2219, term2219.getClass(), "parent", null);
        setField(term2217, term2217.getClass(), "next", term2219);
        setIntField(term2222, term2222.getClass(), "type", -2018735535);
        setField(term2222, term2222.getClass(), "next", null);
        setField(term2222, term2222.getClass(), "first", null);
        setField(term2222, term2222.getClass(), "last", term2219);
        setField(term2222, term2222.getClass(), "propListHead", null);
        setIntField(term2222, term2222.getClass(), "sourcePosition", 0);
        setField(term2222, term2222.getClass(), "jsType", null);
        setField(term2222, term2222.getClass(), "parent", null);
        setField(term2217, term2217.getClass(), "first", term2222);
        setField(term2217, term2217.getClass(), "last", term2215);
        setField(term2217, term2217.getClass(), "propListHead", null);
        setIntField(term2217, term2217.getClass(), "sourcePosition", 0);
        setField(term2217, term2217.getClass(), "jsType", null);
        setField(term2217, term2217.getClass(), "parent", null);
        setField(term2215, term2215.getClass(), "next", term2217);
        setField(term2215, term2215.getClass(), "first", term2219);
        setIntField(term2226, term2226.getClass(), "type", -2009613557);
        setIntField(term2228, term2228.getClass(), "type", 654195547);
        setField(term2228, term2228.getClass(), "next", null);
        setField(term2228, term2228.getClass(), "first", term2222);
        setField(term2228, term2228.getClass(), "last", term2217);
        setField(term2228, term2228.getClass(), "propListHead", null);
        setIntField(term2228, term2228.getClass(), "sourcePosition", 0);
        setField(term2228, term2228.getClass(), "jsType", null);
        setField(term2228, term2228.getClass(), "parent", null);
        setField(term2226, term2226.getClass(), "next", term2228);
        setField(term2226, term2226.getClass(), "first", term2213);
        setField(term2226, term2226.getClass(), "last", term2213);
        setField(term2226, term2226.getClass(), "propListHead", null);
        setIntField(term2226, term2226.getClass(), "sourcePosition", 0);
        setField(term2226, term2226.getClass(), "jsType", null);
        setField(term2226, term2226.getClass(), "parent", null);
        setField(term2215, term2215.getClass(), "last", term2226);
        setField(term2215, term2215.getClass(), "propListHead", null);
        setIntField(term2215, term2215.getClass(), "sourcePosition", 0);
        setField(term2215, term2215.getClass(), "jsType", null);
        setField(term2215, term2215.getClass(), "parent", null);
        setField(term2213, term2213.getClass(), "next", term2215);
        setIntField(term2233, term2233.getClass(), "type", 1622857008);
        setField(term2233, term2233.getClass(), "next", term2226);
        setField(term2233, term2233.getClass(), "first", term2228);
        setField(term2233, term2233.getClass(), "last", term2211);
        setField(term2233, term2233.getClass(), "propListHead", null);
        setIntField(term2233, term2233.getClass(), "sourcePosition", 0);
        setField(term2233, term2233.getClass(), "jsType", null);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2213, term2213.getClass(), "first", term2233);
        setField(term2213, term2213.getClass(), "last", term2233);
        setField(term2213, term2213.getClass(), "propListHead", null);
        setIntField(term2213, term2213.getClass(), "sourcePosition", 0);
        setField(term2213, term2213.getClass(), "jsType", null);
        setField(term2213, term2213.getClass(), "parent", null);
        setField(term2211, term2211.getClass(), "next", term2213);
        setField(term2211, term2211.getClass(), "first", term2217);
        setField(term2211, term2211.getClass(), "last", term2219);
        setField(term2211, term2211.getClass(), "propListHead", null);
        setIntField(term2211, term2211.getClass(), "sourcePosition", 0);
        setField(term2211, term2211.getClass(), "jsType", null);
        setField(term2211, term2211.getClass(), "parent", null);
        term2238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2238, term2238.getClass(), "type", 934338954);
        setIntField(term2240, term2240.getClass(), "type", 598635505);
        setIntField(term2242, term2242.getClass(), "type", -944986533);
        setIntField(term2244, term2244.getClass(), "type", 1894454926);
        setIntField(term2246, term2246.getClass(), "type", 1415142780);
        setField(term2246, term2246.getClass(), "next", null);
        setField(term2246, term2246.getClass(), "first", null);
        setField(term2246, term2246.getClass(), "last", null);
        setField(term2246, term2246.getClass(), "propListHead", null);
        setIntField(term2246, term2246.getClass(), "sourcePosition", 0);
        setField(term2246, term2246.getClass(), "jsType", null);
        setField(term2246, term2246.getClass(), "parent", null);
        setField(term2244, term2244.getClass(), "next", term2246);
        setIntField(term2249, term2249.getClass(), "type", -574105759);
        setField(term2249, term2249.getClass(), "next", null);
        setField(term2249, term2249.getClass(), "first", null);
        setField(term2249, term2249.getClass(), "last", term2246);
        setField(term2249, term2249.getClass(), "propListHead", null);
        setIntField(term2249, term2249.getClass(), "sourcePosition", 0);
        setField(term2249, term2249.getClass(), "jsType", null);
        setField(term2249, term2249.getClass(), "parent", null);
        setField(term2244, term2244.getClass(), "first", term2249);
        setField(term2244, term2244.getClass(), "last", term2242);
        setField(term2244, term2244.getClass(), "propListHead", null);
        setIntField(term2244, term2244.getClass(), "sourcePosition", 0);
        setField(term2244, term2244.getClass(), "jsType", null);
        setField(term2244, term2244.getClass(), "parent", null);
        setField(term2242, term2242.getClass(), "next", term2244);
        setField(term2242, term2242.getClass(), "first", term2246);
        setIntField(term2253, term2253.getClass(), "type", 376834234);
        setIntField(term2255, term2255.getClass(), "type", -1911972560);
        setField(term2255, term2255.getClass(), "next", null);
        setField(term2255, term2255.getClass(), "first", term2249);
        setField(term2255, term2255.getClass(), "last", term2244);
        setField(term2255, term2255.getClass(), "propListHead", null);
        setIntField(term2255, term2255.getClass(), "sourcePosition", 0);
        setField(term2255, term2255.getClass(), "jsType", null);
        setField(term2255, term2255.getClass(), "parent", null);
        setField(term2253, term2253.getClass(), "next", term2255);
        setField(term2253, term2253.getClass(), "first", term2240);
        setField(term2253, term2253.getClass(), "last", term2240);
        setField(term2253, term2253.getClass(), "propListHead", null);
        setIntField(term2253, term2253.getClass(), "sourcePosition", 0);
        setField(term2253, term2253.getClass(), "jsType", null);
        setField(term2253, term2253.getClass(), "parent", null);
        setField(term2242, term2242.getClass(), "last", term2253);
        setField(term2242, term2242.getClass(), "propListHead", null);
        setIntField(term2242, term2242.getClass(), "sourcePosition", 0);
        setField(term2242, term2242.getClass(), "jsType", null);
        setField(term2242, term2242.getClass(), "parent", null);
        setField(term2240, term2240.getClass(), "next", term2242);
        setIntField(term2260, term2260.getClass(), "type", -642716895);
        setField(term2260, term2260.getClass(), "next", term2253);
        setField(term2260, term2260.getClass(), "first", term2255);
        setField(term2260, term2260.getClass(), "last", term2238);
        setField(term2260, term2260.getClass(), "propListHead", null);
        setIntField(term2260, term2260.getClass(), "sourcePosition", 0);
        setField(term2260, term2260.getClass(), "jsType", null);
        setField(term2260, term2260.getClass(), "parent", null);
        setField(term2240, term2240.getClass(), "first", term2260);
        setField(term2240, term2240.getClass(), "last", term2260);
        setField(term2240, term2240.getClass(), "propListHead", null);
        setIntField(term2240, term2240.getClass(), "sourcePosition", 0);
        setField(term2240, term2240.getClass(), "jsType", null);
        setField(term2240, term2240.getClass(), "parent", null);
        setField(term2238, term2238.getClass(), "next", term2240);
        setField(term2238, term2238.getClass(), "first", term2244);
        setField(term2238, term2238.getClass(), "last", term2246);
        setField(term2238, term2238.getClass(), "propListHead", null);
        setIntField(term2238, term2238.getClass(), "sourcePosition", 0);
        setField(term2238, term2238.getClass(), "jsType", null);
        setField(term2238, term2238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2211;
        args[1] = term2238;
        try {
            callMethod(klass, "regexp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


