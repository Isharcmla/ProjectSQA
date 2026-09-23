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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_containsType_1974866574263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2303;
     Object term2324;
     Object term16312;

    public NodeUtil_containsType_1974866574263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2303, term2303.getClass(), "type", 941003590);
        setIntField(term2305, term2305.getClass(), "type", 1811833766);
        setIntField(term2307, term2307.getClass(), "type", 0);
        setField(term2307, term2307.getClass(), "next", null);
        setField(term2307, term2307.getClass(), "first", null);
        setField(term2307, term2307.getClass(), "last", null);
        setField(term2307, term2307.getClass(), "propListHead", null);
        setIntField(term2307, term2307.getClass(), "sourcePosition", 0);
        setField(term2307, term2307.getClass(), "jsType", null);
        setField(term2307, term2307.getClass(), "parent", null);
        setField(term2305, term2305.getClass(), "next", term2307);
        setIntField(term2310, term2310.getClass(), "type", 0);
        setField(term2310, term2310.getClass(), "next", null);
        setField(term2310, term2310.getClass(), "first", null);
        setField(term2310, term2310.getClass(), "last", null);
        setField(term2310, term2310.getClass(), "propListHead", null);
        setIntField(term2310, term2310.getClass(), "sourcePosition", 0);
        setField(term2310, term2310.getClass(), "jsType", null);
        setField(term2310, term2310.getClass(), "parent", null);
        setField(term2305, term2305.getClass(), "first", term2310);
        setIntField(term2313, term2313.getClass(), "type", 0);
        setField(term2313, term2313.getClass(), "next", null);
        setField(term2313, term2313.getClass(), "first", null);
        setField(term2313, term2313.getClass(), "last", null);
        setField(term2313, term2313.getClass(), "propListHead", null);
        setIntField(term2313, term2313.getClass(), "sourcePosition", 0);
        setField(term2313, term2313.getClass(), "jsType", null);
        setField(term2313, term2313.getClass(), "parent", null);
        setField(term2305, term2305.getClass(), "last", term2313);
        setField(term2305, term2305.getClass(), "propListHead", null);
        setIntField(term2305, term2305.getClass(), "sourcePosition", 0);
        setField(term2305, term2305.getClass(), "jsType", null);
        setField(term2305, term2305.getClass(), "parent", null);
        setField(term2303, term2303.getClass(), "next", term2305);
        setIntField(term2317, term2317.getClass(), "type", 0);
        setField(term2317, term2317.getClass(), "next", null);
        setField(term2317, term2317.getClass(), "first", null);
        setField(term2317, term2317.getClass(), "last", null);
        setField(term2317, term2317.getClass(), "propListHead", null);
        setIntField(term2317, term2317.getClass(), "sourcePosition", 0);
        setField(term2317, term2317.getClass(), "jsType", null);
        setField(term2317, term2317.getClass(), "parent", null);
        setField(term2303, term2303.getClass(), "first", term2317);
        setIntField(term2320, term2320.getClass(), "type", 0);
        setField(term2320, term2320.getClass(), "next", null);
        setField(term2320, term2320.getClass(), "first", null);
        setField(term2320, term2320.getClass(), "last", null);
        setField(term2320, term2320.getClass(), "propListHead", null);
        setIntField(term2320, term2320.getClass(), "sourcePosition", 0);
        setField(term2320, term2320.getClass(), "jsType", null);
        setField(term2320, term2320.getClass(), "parent", null);
        setField(term2303, term2303.getClass(), "last", term2320);
        setField(term2303, term2303.getClass(), "propListHead", null);
        setIntField(term2303, term2303.getClass(), "sourcePosition", 0);
        setField(term2303, term2303.getClass(), "jsType", null);
        setField(term2303, term2303.getClass(), "parent", null);
        term2324 = new Integer(2011764585);
        term16312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16312, term16312.getClass(), "type", 941003590);
        setIntField(term16313, term16313.getClass(), "type", 1811833766);
        setIntField(term16314, term16314.getClass(), "type", 0);
        setField(term16314, term16314.getClass(), "next", null);
        setField(term16314, term16314.getClass(), "first", null);
        setField(term16314, term16314.getClass(), "last", null);
        setField(term16314, term16314.getClass(), "propListHead", null);
        setIntField(term16314, term16314.getClass(), "sourcePosition", 0);
        setField(term16314, term16314.getClass(), "jsType", null);
        setField(term16314, term16314.getClass(), "parent", null);
        setField(term16313, term16313.getClass(), "next", term16314);
        setIntField(term16315, term16315.getClass(), "type", 0);
        setField(term16315, term16315.getClass(), "next", null);
        setField(term16315, term16315.getClass(), "first", null);
        setField(term16315, term16315.getClass(), "last", null);
        setField(term16315, term16315.getClass(), "propListHead", null);
        setIntField(term16315, term16315.getClass(), "sourcePosition", 0);
        setField(term16315, term16315.getClass(), "jsType", null);
        setField(term16315, term16315.getClass(), "parent", null);
        setField(term16313, term16313.getClass(), "first", term16315);
        setIntField(term16316, term16316.getClass(), "type", 0);
        setField(term16316, term16316.getClass(), "next", null);
        setField(term16316, term16316.getClass(), "first", null);
        setField(term16316, term16316.getClass(), "last", null);
        setField(term16316, term16316.getClass(), "propListHead", null);
        setIntField(term16316, term16316.getClass(), "sourcePosition", 0);
        setField(term16316, term16316.getClass(), "jsType", null);
        setField(term16316, term16316.getClass(), "parent", null);
        setField(term16313, term16313.getClass(), "last", term16316);
        setField(term16313, term16313.getClass(), "propListHead", null);
        setIntField(term16313, term16313.getClass(), "sourcePosition", 0);
        setField(term16313, term16313.getClass(), "jsType", null);
        setField(term16313, term16313.getClass(), "parent", null);
        setField(term16312, term16312.getClass(), "next", term16313);
        setIntField(term16317, term16317.getClass(), "type", 0);
        setField(term16317, term16317.getClass(), "next", null);
        setField(term16317, term16317.getClass(), "first", null);
        setField(term16317, term16317.getClass(), "last", null);
        setField(term16317, term16317.getClass(), "propListHead", null);
        setIntField(term16317, term16317.getClass(), "sourcePosition", 0);
        setField(term16317, term16317.getClass(), "jsType", null);
        setField(term16317, term16317.getClass(), "parent", null);
        setField(term16312, term16312.getClass(), "first", term16317);
        setIntField(term16318, term16318.getClass(), "type", 0);
        setField(term16318, term16318.getClass(), "next", null);
        setField(term16318, term16318.getClass(), "first", null);
        setField(term16318, term16318.getClass(), "last", null);
        setField(term16318, term16318.getClass(), "propListHead", null);
        setIntField(term16318, term16318.getClass(), "sourcePosition", 0);
        setField(term16318, term16318.getClass(), "jsType", null);
        setField(term16318, term16318.getClass(), "parent", null);
        setField(term16312, term16312.getClass(), "last", term16318);
        setField(term16312, term16312.getClass(), "propListHead", null);
        setIntField(term16312, term16312.getClass(), "sourcePosition", 0);
        setField(term16312, term16312.getClass(), "jsType", null);
        setField(term16312, term16312.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2303;
        args[1] = term2324;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term2303, 2011764585));
        assertTrue(recursiveEquals(term2324, term16312));
    }

};


