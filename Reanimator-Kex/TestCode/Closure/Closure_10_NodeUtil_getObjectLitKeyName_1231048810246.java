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

public class NodeUtil_getObjectLitKeyName_1231048810246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2485;

    public NodeUtil_getObjectLitKeyName_1231048810246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2485, term2485.getClass(), "type", 953741504);
        setIntField(term2487, term2487.getClass(), "type", 1389452261);
        setIntField(term2489, term2489.getClass(), "type", 1615957955);
        setIntField(term2491, term2491.getClass(), "type", 1779370220);
        setIntField(term2493, term2493.getClass(), "type", -1716046610);
        setField(term2493, term2493.getClass(), "next", null);
        setField(term2493, term2493.getClass(), "first", null);
        setField(term2493, term2493.getClass(), "last", null);
        setField(term2493, term2493.getClass(), "propListHead", null);
        setIntField(term2493, term2493.getClass(), "sourcePosition", 0);
        setField(term2493, term2493.getClass(), "jsType", null);
        setField(term2493, term2493.getClass(), "parent", null);
        setField(term2491, term2491.getClass(), "next", term2493);
        setIntField(term2496, term2496.getClass(), "type", 65264024);
        setField(term2496, term2496.getClass(), "next", null);
        setField(term2496, term2496.getClass(), "first", null);
        setField(term2496, term2496.getClass(), "last", term2493);
        setField(term2496, term2496.getClass(), "propListHead", null);
        setIntField(term2496, term2496.getClass(), "sourcePosition", 0);
        setField(term2496, term2496.getClass(), "jsType", null);
        setField(term2496, term2496.getClass(), "parent", null);
        setField(term2491, term2491.getClass(), "first", term2496);
        setField(term2491, term2491.getClass(), "last", term2489);
        setField(term2491, term2491.getClass(), "propListHead", null);
        setIntField(term2491, term2491.getClass(), "sourcePosition", 0);
        setField(term2491, term2491.getClass(), "jsType", null);
        setField(term2491, term2491.getClass(), "parent", null);
        setField(term2489, term2489.getClass(), "next", term2491);
        setField(term2489, term2489.getClass(), "first", term2493);
        setIntField(term2500, term2500.getClass(), "type", -1885268968);
        setIntField(term2502, term2502.getClass(), "type", 277855691);
        setField(term2502, term2502.getClass(), "next", null);
        setField(term2502, term2502.getClass(), "first", term2496);
        setField(term2502, term2502.getClass(), "last", term2491);
        setField(term2502, term2502.getClass(), "propListHead", null);
        setIntField(term2502, term2502.getClass(), "sourcePosition", 0);
        setField(term2502, term2502.getClass(), "jsType", null);
        setField(term2502, term2502.getClass(), "parent", null);
        setField(term2500, term2500.getClass(), "next", term2502);
        setField(term2500, term2500.getClass(), "first", term2487);
        setField(term2500, term2500.getClass(), "last", term2487);
        setField(term2500, term2500.getClass(), "propListHead", null);
        setIntField(term2500, term2500.getClass(), "sourcePosition", 0);
        setField(term2500, term2500.getClass(), "jsType", null);
        setField(term2500, term2500.getClass(), "parent", null);
        setField(term2489, term2489.getClass(), "last", term2500);
        setField(term2489, term2489.getClass(), "propListHead", null);
        setIntField(term2489, term2489.getClass(), "sourcePosition", 0);
        setField(term2489, term2489.getClass(), "jsType", null);
        setField(term2489, term2489.getClass(), "parent", null);
        setField(term2487, term2487.getClass(), "next", term2489);
        setIntField(term2507, term2507.getClass(), "type", 675891483);
        setField(term2507, term2507.getClass(), "next", term2500);
        setField(term2507, term2507.getClass(), "first", term2502);
        setField(term2507, term2507.getClass(), "last", term2485);
        setField(term2507, term2507.getClass(), "propListHead", null);
        setIntField(term2507, term2507.getClass(), "sourcePosition", 0);
        setField(term2507, term2507.getClass(), "jsType", null);
        setField(term2507, term2507.getClass(), "parent", null);
        setField(term2487, term2487.getClass(), "first", term2507);
        setField(term2487, term2487.getClass(), "last", term2507);
        setField(term2487, term2487.getClass(), "propListHead", null);
        setIntField(term2487, term2487.getClass(), "sourcePosition", 0);
        setField(term2487, term2487.getClass(), "jsType", null);
        setField(term2487, term2487.getClass(), "parent", null);
        setField(term2485, term2485.getClass(), "next", term2487);
        setField(term2485, term2485.getClass(), "first", term2491);
        setField(term2485, term2485.getClass(), "last", term2493);
        setField(term2485, term2485.getClass(), "propListHead", null);
        setIntField(term2485, term2485.getClass(), "sourcePosition", 0);
        setField(term2485, term2485.getClass(), "jsType", null);
        setField(term2485, term2485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2485;
        try {
            callMethod(klass, "getObjectLitKeyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


