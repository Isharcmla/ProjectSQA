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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_containsType_951752563197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165;
     Object term2192;

    public NodeUtil_containsType_951752563197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2178 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2188 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2165, term2165.getClass(), "type", 1985432430);
        setIntField(term2167, term2167.getClass(), "type", 1354781442);
        setIntField(term2169, term2169.getClass(), "type", 0);
        setField(term2169, term2169.getClass(), "next", null);
        setField(term2169, term2169.getClass(), "first", null);
        setField(term2169, term2169.getClass(), "last", null);
        setField(term2169, term2169.getClass(), "propListHead", null);
        setIntField(term2169, term2169.getClass(), "sourcePosition", 0);
        setField(term2169, term2169.getClass(), "jsType", null);
        setField(term2169, term2169.getClass(), "parent", null);
        setField(term2167, term2167.getClass(), "next", term2169);
        setIntField(term2172, term2172.getClass(), "type", 0);
        setField(term2172, term2172.getClass(), "next", null);
        setField(term2172, term2172.getClass(), "first", null);
        setField(term2172, term2172.getClass(), "last", null);
        setField(term2172, term2172.getClass(), "propListHead", null);
        setIntField(term2172, term2172.getClass(), "sourcePosition", 0);
        setField(term2172, term2172.getClass(), "jsType", null);
        setField(term2172, term2172.getClass(), "parent", null);
        setField(term2167, term2167.getClass(), "first", term2172);
        setIntField(term2175, term2175.getClass(), "type", 0);
        setField(term2175, term2175.getClass(), "next", null);
        setField(term2175, term2175.getClass(), "first", null);
        setField(term2175, term2175.getClass(), "last", null);
        setField(term2175, term2175.getClass(), "propListHead", null);
        setIntField(term2175, term2175.getClass(), "sourcePosition", 0);
        setField(term2175, term2175.getClass(), "jsType", null);
        setField(term2175, term2175.getClass(), "parent", null);
        setField(term2167, term2167.getClass(), "last", term2175);
        setField(term2178, term2178.getClass(), "next", null);
        setIntField(term2178, term2178.getClass(), "type", 0);
        setIntField(term2178, term2178.getClass(), "intValue", 0);
        setField(term2178, term2178.getClass(), "objectValue", null);
        setField(term2167, term2167.getClass(), "propListHead", term2178);
        setIntField(term2167, term2167.getClass(), "sourcePosition", -829441157);
        setField(term2167, term2167.getClass(), "jsType", null);
        setField(term2167, term2167.getClass(), "parent", null);
        setField(term2165, term2165.getClass(), "next", term2167);
        setIntField(term2182, term2182.getClass(), "type", 0);
        setField(term2182, term2182.getClass(), "next", null);
        setField(term2182, term2182.getClass(), "first", null);
        setField(term2182, term2182.getClass(), "last", null);
        setField(term2182, term2182.getClass(), "propListHead", null);
        setIntField(term2182, term2182.getClass(), "sourcePosition", 0);
        setField(term2182, term2182.getClass(), "jsType", null);
        setField(term2182, term2182.getClass(), "parent", null);
        setField(term2165, term2165.getClass(), "first", term2182);
        setIntField(term2185, term2185.getClass(), "type", 0);
        setField(term2185, term2185.getClass(), "next", null);
        setField(term2185, term2185.getClass(), "first", null);
        setField(term2185, term2185.getClass(), "last", null);
        setField(term2185, term2185.getClass(), "propListHead", null);
        setIntField(term2185, term2185.getClass(), "sourcePosition", 0);
        setField(term2185, term2185.getClass(), "jsType", null);
        setField(term2185, term2185.getClass(), "parent", null);
        setField(term2165, term2165.getClass(), "last", term2185);
        setField(term2188, term2188.getClass(), "next", null);
        setIntField(term2188, term2188.getClass(), "type", 0);
        setIntField(term2188, term2188.getClass(), "intValue", 0);
        setField(term2188, term2188.getClass(), "objectValue", null);
        setField(term2165, term2165.getClass(), "propListHead", term2188);
        setIntField(term2165, term2165.getClass(), "sourcePosition", -1489991025);
        setField(term2165, term2165.getClass(), "jsType", null);
        setField(term2165, term2165.getClass(), "parent", null);
        term2192 = new Integer(-1542979444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2165;
        args[1] = term2192;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


