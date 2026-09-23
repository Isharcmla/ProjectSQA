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

public class IR_sub_437076168123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2047;
     Object term2074;

    public IR_sub_437076168123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2047, term2047.getClass(), "type", 1815951606);
        setIntField(term2049, term2049.getClass(), "type", 1105016932);
        setIntField(term2051, term2051.getClass(), "type", -365784998);
        setIntField(term2053, term2053.getClass(), "type", -1893236300);
        setIntField(term2055, term2055.getClass(), "type", -1858909368);
        setField(term2055, term2055.getClass(), "next", null);
        setField(term2055, term2055.getClass(), "first", null);
        setField(term2055, term2055.getClass(), "last", null);
        setField(term2055, term2055.getClass(), "propListHead", null);
        setIntField(term2055, term2055.getClass(), "sourcePosition", 0);
        setField(term2055, term2055.getClass(), "jsType", null);
        setField(term2055, term2055.getClass(), "parent", null);
        setField(term2053, term2053.getClass(), "next", term2055);
        setIntField(term2058, term2058.getClass(), "type", -280113263);
        setField(term2058, term2058.getClass(), "next", null);
        setField(term2058, term2058.getClass(), "first", null);
        setField(term2058, term2058.getClass(), "last", term2055);
        setField(term2058, term2058.getClass(), "propListHead", null);
        setIntField(term2058, term2058.getClass(), "sourcePosition", 0);
        setField(term2058, term2058.getClass(), "jsType", null);
        setField(term2058, term2058.getClass(), "parent", null);
        setField(term2053, term2053.getClass(), "first", term2058);
        setField(term2053, term2053.getClass(), "last", term2051);
        setField(term2053, term2053.getClass(), "propListHead", null);
        setIntField(term2053, term2053.getClass(), "sourcePosition", 0);
        setField(term2053, term2053.getClass(), "jsType", null);
        setField(term2053, term2053.getClass(), "parent", null);
        setField(term2051, term2051.getClass(), "next", term2053);
        setField(term2051, term2051.getClass(), "first", term2055);
        setIntField(term2062, term2062.getClass(), "type", 1409095253);
        setIntField(term2064, term2064.getClass(), "type", 315179039);
        setField(term2064, term2064.getClass(), "next", null);
        setField(term2064, term2064.getClass(), "first", term2058);
        setField(term2064, term2064.getClass(), "last", term2053);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2062, term2062.getClass(), "next", term2064);
        setField(term2062, term2062.getClass(), "first", term2049);
        setField(term2062, term2062.getClass(), "last", term2049);
        setField(term2062, term2062.getClass(), "propListHead", null);
        setIntField(term2062, term2062.getClass(), "sourcePosition", 0);
        setField(term2062, term2062.getClass(), "jsType", null);
        setField(term2062, term2062.getClass(), "parent", null);
        setField(term2051, term2051.getClass(), "last", term2062);
        setField(term2051, term2051.getClass(), "propListHead", null);
        setIntField(term2051, term2051.getClass(), "sourcePosition", 0);
        setField(term2051, term2051.getClass(), "jsType", null);
        setField(term2051, term2051.getClass(), "parent", null);
        setField(term2049, term2049.getClass(), "next", term2051);
        setIntField(term2069, term2069.getClass(), "type", -1835923897);
        setField(term2069, term2069.getClass(), "next", term2062);
        setField(term2069, term2069.getClass(), "first", term2064);
        setField(term2069, term2069.getClass(), "last", term2047);
        setField(term2069, term2069.getClass(), "propListHead", null);
        setIntField(term2069, term2069.getClass(), "sourcePosition", 0);
        setField(term2069, term2069.getClass(), "jsType", null);
        setField(term2069, term2069.getClass(), "parent", null);
        setField(term2049, term2049.getClass(), "first", term2069);
        setField(term2049, term2049.getClass(), "last", term2069);
        setField(term2049, term2049.getClass(), "propListHead", null);
        setIntField(term2049, term2049.getClass(), "sourcePosition", 0);
        setField(term2049, term2049.getClass(), "jsType", null);
        setField(term2049, term2049.getClass(), "parent", null);
        setField(term2047, term2047.getClass(), "next", term2049);
        setField(term2047, term2047.getClass(), "first", term2053);
        setField(term2047, term2047.getClass(), "last", term2055);
        setField(term2047, term2047.getClass(), "propListHead", null);
        setIntField(term2047, term2047.getClass(), "sourcePosition", 0);
        setField(term2047, term2047.getClass(), "jsType", null);
        setField(term2047, term2047.getClass(), "parent", null);
        term2074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2074, term2074.getClass(), "type", -341287775);
        setIntField(term2076, term2076.getClass(), "type", -1651110911);
        setIntField(term2078, term2078.getClass(), "type", -1934033808);
        setIntField(term2080, term2080.getClass(), "type", 950322609);
        setIntField(term2082, term2082.getClass(), "type", -2023791789);
        setField(term2082, term2082.getClass(), "next", null);
        setField(term2082, term2082.getClass(), "first", null);
        setField(term2082, term2082.getClass(), "last", null);
        setField(term2082, term2082.getClass(), "propListHead", null);
        setIntField(term2082, term2082.getClass(), "sourcePosition", 0);
        setField(term2082, term2082.getClass(), "jsType", null);
        setField(term2082, term2082.getClass(), "parent", null);
        setField(term2080, term2080.getClass(), "next", term2082);
        setIntField(term2085, term2085.getClass(), "type", 353974456);
        setField(term2085, term2085.getClass(), "next", null);
        setField(term2085, term2085.getClass(), "first", null);
        setField(term2085, term2085.getClass(), "last", term2082);
        setField(term2085, term2085.getClass(), "propListHead", null);
        setIntField(term2085, term2085.getClass(), "sourcePosition", 0);
        setField(term2085, term2085.getClass(), "jsType", null);
        setField(term2085, term2085.getClass(), "parent", null);
        setField(term2080, term2080.getClass(), "first", term2085);
        setField(term2080, term2080.getClass(), "last", term2078);
        setField(term2080, term2080.getClass(), "propListHead", null);
        setIntField(term2080, term2080.getClass(), "sourcePosition", 0);
        setField(term2080, term2080.getClass(), "jsType", null);
        setField(term2080, term2080.getClass(), "parent", null);
        setField(term2078, term2078.getClass(), "next", term2080);
        setField(term2078, term2078.getClass(), "first", term2082);
        setIntField(term2089, term2089.getClass(), "type", 1418551216);
        setIntField(term2091, term2091.getClass(), "type", -626779272);
        setField(term2091, term2091.getClass(), "next", null);
        setField(term2091, term2091.getClass(), "first", term2085);
        setField(term2091, term2091.getClass(), "last", term2080);
        setField(term2091, term2091.getClass(), "propListHead", null);
        setIntField(term2091, term2091.getClass(), "sourcePosition", 0);
        setField(term2091, term2091.getClass(), "jsType", null);
        setField(term2091, term2091.getClass(), "parent", null);
        setField(term2089, term2089.getClass(), "next", term2091);
        setField(term2089, term2089.getClass(), "first", term2076);
        setField(term2089, term2089.getClass(), "last", term2076);
        setField(term2089, term2089.getClass(), "propListHead", null);
        setIntField(term2089, term2089.getClass(), "sourcePosition", 0);
        setField(term2089, term2089.getClass(), "jsType", null);
        setField(term2089, term2089.getClass(), "parent", null);
        setField(term2078, term2078.getClass(), "last", term2089);
        setField(term2078, term2078.getClass(), "propListHead", null);
        setIntField(term2078, term2078.getClass(), "sourcePosition", 0);
        setField(term2078, term2078.getClass(), "jsType", null);
        setField(term2078, term2078.getClass(), "parent", null);
        setField(term2076, term2076.getClass(), "next", term2078);
        setIntField(term2096, term2096.getClass(), "type", -1150062870);
        setField(term2096, term2096.getClass(), "next", term2089);
        setField(term2096, term2096.getClass(), "first", term2091);
        setField(term2096, term2096.getClass(), "last", term2074);
        setField(term2096, term2096.getClass(), "propListHead", null);
        setIntField(term2096, term2096.getClass(), "sourcePosition", 0);
        setField(term2096, term2096.getClass(), "jsType", null);
        setField(term2096, term2096.getClass(), "parent", null);
        setField(term2076, term2076.getClass(), "first", term2096);
        setField(term2076, term2076.getClass(), "last", term2096);
        setField(term2076, term2076.getClass(), "propListHead", null);
        setIntField(term2076, term2076.getClass(), "sourcePosition", 0);
        setField(term2076, term2076.getClass(), "jsType", null);
        setField(term2076, term2076.getClass(), "parent", null);
        setField(term2074, term2074.getClass(), "next", term2076);
        setField(term2074, term2074.getClass(), "first", term2080);
        setField(term2074, term2074.getClass(), "last", term2082);
        setField(term2074, term2074.getClass(), "propListHead", null);
        setIntField(term2074, term2074.getClass(), "sourcePosition", 0);
        setField(term2074, term2074.getClass(), "jsType", null);
        setField(term2074, term2074.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2047;
        args[1] = term2074;
        try {
            callMethod(klass, "sub", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


