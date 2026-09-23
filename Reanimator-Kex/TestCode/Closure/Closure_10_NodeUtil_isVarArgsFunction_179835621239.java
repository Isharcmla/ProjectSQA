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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isVarArgsFunction_179835621239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2220;

    public NodeUtil_isVarArgsFunction_179835621239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2220, term2220.getClass(), "type", 1460702778);
        setIntField(term2222, term2222.getClass(), "type", -1398142433);
        setIntField(term2224, term2224.getClass(), "type", -1112119058);
        setIntField(term2226, term2226.getClass(), "type", 2073858334);
        setIntField(term2228, term2228.getClass(), "type", -1693535639);
        setField(term2228, term2228.getClass(), "next", null);
        setField(term2228, term2228.getClass(), "first", null);
        setField(term2228, term2228.getClass(), "last", null);
        setField(term2228, term2228.getClass(), "propListHead", null);
        setIntField(term2228, term2228.getClass(), "sourcePosition", 0);
        setField(term2228, term2228.getClass(), "jsType", null);
        setField(term2228, term2228.getClass(), "parent", null);
        setField(term2226, term2226.getClass(), "next", term2228);
        setIntField(term2231, term2231.getClass(), "type", 1344744036);
        setField(term2231, term2231.getClass(), "next", null);
        setField(term2231, term2231.getClass(), "first", null);
        setField(term2231, term2231.getClass(), "last", term2228);
        setField(term2231, term2231.getClass(), "propListHead", null);
        setIntField(term2231, term2231.getClass(), "sourcePosition", 0);
        setField(term2231, term2231.getClass(), "jsType", null);
        setField(term2231, term2231.getClass(), "parent", null);
        setField(term2226, term2226.getClass(), "first", term2231);
        setField(term2226, term2226.getClass(), "last", term2224);
        setField(term2226, term2226.getClass(), "propListHead", null);
        setIntField(term2226, term2226.getClass(), "sourcePosition", 0);
        setField(term2226, term2226.getClass(), "jsType", null);
        setField(term2226, term2226.getClass(), "parent", null);
        setField(term2224, term2224.getClass(), "next", term2226);
        setField(term2224, term2224.getClass(), "first", term2228);
        setIntField(term2235, term2235.getClass(), "type", -1272268399);
        setIntField(term2237, term2237.getClass(), "type", 1120271104);
        setField(term2237, term2237.getClass(), "next", null);
        setField(term2237, term2237.getClass(), "first", term2231);
        setField(term2237, term2237.getClass(), "last", term2226);
        setField(term2237, term2237.getClass(), "propListHead", null);
        setIntField(term2237, term2237.getClass(), "sourcePosition", 0);
        setField(term2237, term2237.getClass(), "jsType", null);
        setField(term2237, term2237.getClass(), "parent", null);
        setField(term2235, term2235.getClass(), "next", term2237);
        setField(term2235, term2235.getClass(), "first", term2222);
        setField(term2235, term2235.getClass(), "last", term2222);
        setField(term2235, term2235.getClass(), "propListHead", null);
        setIntField(term2235, term2235.getClass(), "sourcePosition", 0);
        setField(term2235, term2235.getClass(), "jsType", null);
        setField(term2235, term2235.getClass(), "parent", null);
        setField(term2224, term2224.getClass(), "last", term2235);
        setField(term2224, term2224.getClass(), "propListHead", null);
        setIntField(term2224, term2224.getClass(), "sourcePosition", 0);
        setField(term2224, term2224.getClass(), "jsType", null);
        setField(term2224, term2224.getClass(), "parent", null);
        setField(term2222, term2222.getClass(), "next", term2224);
        setIntField(term2242, term2242.getClass(), "type", -128435804);
        setField(term2242, term2242.getClass(), "next", term2235);
        setField(term2242, term2242.getClass(), "first", term2237);
        setField(term2242, term2242.getClass(), "last", term2220);
        setField(term2242, term2242.getClass(), "propListHead", null);
        setIntField(term2242, term2242.getClass(), "sourcePosition", 0);
        setField(term2242, term2242.getClass(), "jsType", null);
        setField(term2242, term2242.getClass(), "parent", null);
        setField(term2222, term2222.getClass(), "first", term2242);
        setField(term2222, term2222.getClass(), "last", term2242);
        setField(term2222, term2222.getClass(), "propListHead", null);
        setIntField(term2222, term2222.getClass(), "sourcePosition", 0);
        setField(term2222, term2222.getClass(), "jsType", null);
        setField(term2222, term2222.getClass(), "parent", null);
        setField(term2220, term2220.getClass(), "next", term2222);
        setField(term2220, term2220.getClass(), "first", term2226);
        setField(term2220, term2220.getClass(), "last", term2228);
        setField(term2220, term2220.getClass(), "propListHead", null);
        setIntField(term2220, term2220.getClass(), "sourcePosition", 0);
        setField(term2220, term2220.getClass(), "jsType", null);
        setField(term2220, term2220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2220;
        try {
            callMethod(klass, "isVarArgsFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


