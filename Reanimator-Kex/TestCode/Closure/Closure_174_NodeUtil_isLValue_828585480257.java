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

public class NodeUtil_isLValue_828585480257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2460;

    public NodeUtil_isLValue_828585480257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2460, term2460.getClass(), "type", -1780848958);
        setIntField(term2462, term2462.getClass(), "type", 1235045850);
        setIntField(term2464, term2464.getClass(), "type", -75143033);
        setIntField(term2466, term2466.getClass(), "type", 797015478);
        setIntField(term2468, term2468.getClass(), "type", 717574276);
        setField(term2468, term2468.getClass(), "next", null);
        setField(term2468, term2468.getClass(), "first", null);
        setField(term2468, term2468.getClass(), "last", null);
        setField(term2468, term2468.getClass(), "propListHead", null);
        setIntField(term2468, term2468.getClass(), "sourcePosition", 0);
        setField(term2468, term2468.getClass(), "jsType", null);
        setField(term2468, term2468.getClass(), "parent", null);
        setField(term2466, term2466.getClass(), "next", term2468);
        setIntField(term2471, term2471.getClass(), "type", 1795369860);
        setField(term2471, term2471.getClass(), "next", null);
        setField(term2471, term2471.getClass(), "first", null);
        setField(term2471, term2471.getClass(), "last", term2468);
        setField(term2471, term2471.getClass(), "propListHead", null);
        setIntField(term2471, term2471.getClass(), "sourcePosition", 0);
        setField(term2471, term2471.getClass(), "jsType", null);
        setField(term2471, term2471.getClass(), "parent", null);
        setField(term2466, term2466.getClass(), "first", term2471);
        setField(term2466, term2466.getClass(), "last", term2464);
        setField(term2466, term2466.getClass(), "propListHead", null);
        setIntField(term2466, term2466.getClass(), "sourcePosition", 0);
        setField(term2466, term2466.getClass(), "jsType", null);
        setField(term2466, term2466.getClass(), "parent", null);
        setField(term2464, term2464.getClass(), "next", term2466);
        setField(term2464, term2464.getClass(), "first", term2468);
        setIntField(term2475, term2475.getClass(), "type", 43200329);
        setIntField(term2477, term2477.getClass(), "type", 998679955);
        setField(term2477, term2477.getClass(), "next", null);
        setField(term2477, term2477.getClass(), "first", term2471);
        setField(term2477, term2477.getClass(), "last", term2466);
        setField(term2477, term2477.getClass(), "propListHead", null);
        setIntField(term2477, term2477.getClass(), "sourcePosition", 0);
        setField(term2477, term2477.getClass(), "jsType", null);
        setField(term2477, term2477.getClass(), "parent", null);
        setField(term2475, term2475.getClass(), "next", term2477);
        setField(term2475, term2475.getClass(), "first", term2462);
        setField(term2475, term2475.getClass(), "last", term2462);
        setField(term2475, term2475.getClass(), "propListHead", null);
        setIntField(term2475, term2475.getClass(), "sourcePosition", 0);
        setField(term2475, term2475.getClass(), "jsType", null);
        setField(term2475, term2475.getClass(), "parent", null);
        setField(term2464, term2464.getClass(), "last", term2475);
        setField(term2464, term2464.getClass(), "propListHead", null);
        setIntField(term2464, term2464.getClass(), "sourcePosition", 0);
        setField(term2464, term2464.getClass(), "jsType", null);
        setField(term2464, term2464.getClass(), "parent", null);
        setField(term2462, term2462.getClass(), "next", term2464);
        setIntField(term2482, term2482.getClass(), "type", 953741504);
        setField(term2482, term2482.getClass(), "next", term2475);
        setField(term2482, term2482.getClass(), "first", term2477);
        setField(term2482, term2482.getClass(), "last", term2460);
        setField(term2482, term2482.getClass(), "propListHead", null);
        setIntField(term2482, term2482.getClass(), "sourcePosition", 0);
        setField(term2482, term2482.getClass(), "jsType", null);
        setField(term2482, term2482.getClass(), "parent", null);
        setField(term2462, term2462.getClass(), "first", term2482);
        setField(term2462, term2462.getClass(), "last", term2482);
        setField(term2462, term2462.getClass(), "propListHead", null);
        setIntField(term2462, term2462.getClass(), "sourcePosition", 0);
        setField(term2462, term2462.getClass(), "jsType", null);
        setField(term2462, term2462.getClass(), "parent", null);
        setField(term2460, term2460.getClass(), "next", term2462);
        setField(term2460, term2460.getClass(), "first", term2466);
        setField(term2460, term2460.getClass(), "last", term2468);
        setField(term2460, term2460.getClass(), "propListHead", null);
        setIntField(term2460, term2460.getClass(), "sourcePosition", 0);
        setField(term2460, term2460.getClass(), "jsType", null);
        setField(term2460, term2460.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2460;
        try {
            callMethod(klass, "isLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


