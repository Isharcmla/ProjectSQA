package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addList_71041459249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2146;
     Object term2157;
     Object term2184;

    public CodeGenerator_addList_71041459249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2147 = new HashMap();
        term2146 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2146, term2146.getClass(), "ESCAPED_JS_STRINGS", term2147);
        setField(term2146, term2146.getClass(), "cc", null);
        setField(term2146, term2146.getClass(), "outputCharsetEncoder", null);
        term2157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2157, term2157.getClass(), "type", -1465035361);
        setIntField(term2159, term2159.getClass(), "type", 1090617576);
        setIntField(term2161, term2161.getClass(), "type", -1547384488);
        setIntField(term2163, term2163.getClass(), "type", 1442160736);
        setIntField(term2165, term2165.getClass(), "type", 1114000454);
        setField(term2165, term2165.getClass(), "next", null);
        setField(term2165, term2165.getClass(), "first", null);
        setField(term2165, term2165.getClass(), "last", null);
        setField(term2165, term2165.getClass(), "propListHead", null);
        setIntField(term2165, term2165.getClass(), "sourcePosition", 0);
        setField(term2165, term2165.getClass(), "jsType", null);
        setField(term2165, term2165.getClass(), "parent", null);
        setField(term2163, term2163.getClass(), "next", term2165);
        setIntField(term2168, term2168.getClass(), "type", -556405712);
        setField(term2168, term2168.getClass(), "next", null);
        setField(term2168, term2168.getClass(), "first", null);
        setField(term2168, term2168.getClass(), "last", term2165);
        setField(term2168, term2168.getClass(), "propListHead", null);
        setIntField(term2168, term2168.getClass(), "sourcePosition", 0);
        setField(term2168, term2168.getClass(), "jsType", null);
        setField(term2168, term2168.getClass(), "parent", null);
        setField(term2163, term2163.getClass(), "first", term2168);
        setField(term2163, term2163.getClass(), "last", term2161);
        setField(term2163, term2163.getClass(), "propListHead", null);
        setIntField(term2163, term2163.getClass(), "sourcePosition", 0);
        setField(term2163, term2163.getClass(), "jsType", null);
        setField(term2163, term2163.getClass(), "parent", null);
        setField(term2161, term2161.getClass(), "next", term2163);
        setField(term2161, term2161.getClass(), "first", term2165);
        setIntField(term2172, term2172.getClass(), "type", -1845499264);
        setIntField(term2174, term2174.getClass(), "type", -505439934);
        setField(term2174, term2174.getClass(), "next", null);
        setField(term2174, term2174.getClass(), "first", term2168);
        setField(term2174, term2174.getClass(), "last", term2163);
        setField(term2174, term2174.getClass(), "propListHead", null);
        setIntField(term2174, term2174.getClass(), "sourcePosition", 0);
        setField(term2174, term2174.getClass(), "jsType", null);
        setField(term2174, term2174.getClass(), "parent", null);
        setField(term2172, term2172.getClass(), "next", term2174);
        setField(term2172, term2172.getClass(), "first", term2159);
        setField(term2172, term2172.getClass(), "last", term2159);
        setField(term2172, term2172.getClass(), "propListHead", null);
        setIntField(term2172, term2172.getClass(), "sourcePosition", 0);
        setField(term2172, term2172.getClass(), "jsType", null);
        setField(term2172, term2172.getClass(), "parent", null);
        setField(term2161, term2161.getClass(), "last", term2172);
        setField(term2161, term2161.getClass(), "propListHead", null);
        setIntField(term2161, term2161.getClass(), "sourcePosition", 0);
        setField(term2161, term2161.getClass(), "jsType", null);
        setField(term2161, term2161.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "next", term2161);
        setIntField(term2179, term2179.getClass(), "type", -344842608);
        setField(term2179, term2179.getClass(), "next", term2172);
        setField(term2179, term2179.getClass(), "first", term2174);
        setField(term2179, term2179.getClass(), "last", term2157);
        setField(term2179, term2179.getClass(), "propListHead", null);
        setIntField(term2179, term2179.getClass(), "sourcePosition", 0);
        setField(term2179, term2179.getClass(), "jsType", null);
        setField(term2179, term2179.getClass(), "parent", null);
        setField(term2159, term2159.getClass(), "first", term2179);
        setField(term2159, term2159.getClass(), "last", term2179);
        setField(term2159, term2159.getClass(), "propListHead", null);
        setIntField(term2159, term2159.getClass(), "sourcePosition", 0);
        setField(term2159, term2159.getClass(), "jsType", null);
        setField(term2159, term2159.getClass(), "parent", null);
        setField(term2157, term2157.getClass(), "next", term2159);
        setField(term2157, term2157.getClass(), "first", term2163);
        setField(term2157, term2157.getClass(), "last", term2165);
        setField(term2157, term2157.getClass(), "propListHead", null);
        setIntField(term2157, term2157.getClass(), "sourcePosition", 0);
        setField(term2157, term2157.getClass(), "jsType", null);
        setField(term2157, term2157.getClass(), "parent", null);
        term2184 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2157;
        args[1] = term2184;
        try {
            callMethod(klass, "addList", argTypes, term2146, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


