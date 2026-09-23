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
import java.lang.Object;

public class NodeUtil_maybeAddFinally_1429693753232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2135;

    public NodeUtil_maybeAddFinally_1429693753232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2148 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2158 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2135, term2135.getClass(), "type", -1747711865);
        setIntField(term2137, term2137.getClass(), "type", -232352320);
        setIntField(term2139, term2139.getClass(), "type", 0);
        setField(term2139, term2139.getClass(), "next", null);
        setField(term2139, term2139.getClass(), "first", null);
        setField(term2139, term2139.getClass(), "last", null);
        setField(term2139, term2139.getClass(), "propListHead", null);
        setIntField(term2139, term2139.getClass(), "sourcePosition", 0);
        setField(term2139, term2139.getClass(), "jsType", null);
        setField(term2139, term2139.getClass(), "parent", null);
        setField(term2137, term2137.getClass(), "next", term2139);
        setIntField(term2142, term2142.getClass(), "type", 0);
        setField(term2142, term2142.getClass(), "next", null);
        setField(term2142, term2142.getClass(), "first", null);
        setField(term2142, term2142.getClass(), "last", null);
        setField(term2142, term2142.getClass(), "propListHead", null);
        setIntField(term2142, term2142.getClass(), "sourcePosition", 0);
        setField(term2142, term2142.getClass(), "jsType", null);
        setField(term2142, term2142.getClass(), "parent", null);
        setField(term2137, term2137.getClass(), "first", term2142);
        setIntField(term2145, term2145.getClass(), "type", 0);
        setField(term2145, term2145.getClass(), "next", null);
        setField(term2145, term2145.getClass(), "first", null);
        setField(term2145, term2145.getClass(), "last", null);
        setField(term2145, term2145.getClass(), "propListHead", null);
        setIntField(term2145, term2145.getClass(), "sourcePosition", 0);
        setField(term2145, term2145.getClass(), "jsType", null);
        setField(term2145, term2145.getClass(), "parent", null);
        setField(term2137, term2137.getClass(), "last", term2145);
        setField(term2148, term2148.getClass(), "next", null);
        setIntField(term2148, term2148.getClass(), "type", 0);
        setIntField(term2148, term2148.getClass(), "intValue", 0);
        setField(term2148, term2148.getClass(), "objectValue", null);
        setField(term2137, term2137.getClass(), "propListHead", term2148);
        setIntField(term2137, term2137.getClass(), "sourcePosition", -1602072035);
        setField(term2137, term2137.getClass(), "jsType", null);
        setField(term2137, term2137.getClass(), "parent", null);
        setField(term2135, term2135.getClass(), "next", term2137);
        setIntField(term2152, term2152.getClass(), "type", 0);
        setField(term2152, term2152.getClass(), "next", null);
        setField(term2152, term2152.getClass(), "first", null);
        setField(term2152, term2152.getClass(), "last", null);
        setField(term2152, term2152.getClass(), "propListHead", null);
        setIntField(term2152, term2152.getClass(), "sourcePosition", 0);
        setField(term2152, term2152.getClass(), "jsType", null);
        setField(term2152, term2152.getClass(), "parent", null);
        setField(term2135, term2135.getClass(), "first", term2152);
        setIntField(term2155, term2155.getClass(), "type", 0);
        setField(term2155, term2155.getClass(), "next", null);
        setField(term2155, term2155.getClass(), "first", null);
        setField(term2155, term2155.getClass(), "last", null);
        setField(term2155, term2155.getClass(), "propListHead", null);
        setIntField(term2155, term2155.getClass(), "sourcePosition", 0);
        setField(term2155, term2155.getClass(), "jsType", null);
        setField(term2155, term2155.getClass(), "parent", null);
        setField(term2135, term2135.getClass(), "last", term2155);
        setField(term2158, term2158.getClass(), "next", null);
        setIntField(term2158, term2158.getClass(), "type", 0);
        setIntField(term2158, term2158.getClass(), "intValue", 0);
        setField(term2158, term2158.getClass(), "objectValue", null);
        setField(term2135, term2135.getClass(), "propListHead", term2158);
        setIntField(term2135, term2135.getClass(), "sourcePosition", 1902624392);
        setField(term2135, term2135.getClass(), "jsType", null);
        setField(term2135, term2135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2135;
        try {
            callMethod(klass, "maybeAddFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


