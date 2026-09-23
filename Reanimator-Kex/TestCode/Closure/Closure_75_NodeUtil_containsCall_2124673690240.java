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

public class NodeUtil_containsCall_2124673690240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;
     Object term15726;

    public NodeUtil_containsCall_2124673690240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2364 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2374 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2351, term2351.getClass(), "type", -82632953);
        setIntField(term2353, term2353.getClass(), "type", 360972386);
        setIntField(term2355, term2355.getClass(), "type", 0);
        setField(term2355, term2355.getClass(), "next", null);
        setField(term2355, term2355.getClass(), "first", null);
        setField(term2355, term2355.getClass(), "last", null);
        setField(term2355, term2355.getClass(), "propListHead", null);
        setIntField(term2355, term2355.getClass(), "sourcePosition", 0);
        setField(term2355, term2355.getClass(), "jsType", null);
        setField(term2355, term2355.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "next", term2355);
        setIntField(term2358, term2358.getClass(), "type", 0);
        setField(term2358, term2358.getClass(), "next", null);
        setField(term2358, term2358.getClass(), "first", null);
        setField(term2358, term2358.getClass(), "last", null);
        setField(term2358, term2358.getClass(), "propListHead", null);
        setIntField(term2358, term2358.getClass(), "sourcePosition", 0);
        setField(term2358, term2358.getClass(), "jsType", null);
        setField(term2358, term2358.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "first", term2358);
        setIntField(term2361, term2361.getClass(), "type", 0);
        setField(term2361, term2361.getClass(), "next", null);
        setField(term2361, term2361.getClass(), "first", null);
        setField(term2361, term2361.getClass(), "last", null);
        setField(term2361, term2361.getClass(), "propListHead", null);
        setIntField(term2361, term2361.getClass(), "sourcePosition", 0);
        setField(term2361, term2361.getClass(), "jsType", null);
        setField(term2361, term2361.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "last", term2361);
        setField(term2364, term2364.getClass(), "next", null);
        setIntField(term2364, term2364.getClass(), "type", 0);
        setIntField(term2364, term2364.getClass(), "intValue", 0);
        setField(term2364, term2364.getClass(), "objectValue", null);
        setField(term2353, term2353.getClass(), "propListHead", term2364);
        setIntField(term2353, term2353.getClass(), "sourcePosition", 692873905);
        setField(term2353, term2353.getClass(), "jsType", null);
        setField(term2353, term2353.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "next", term2353);
        setIntField(term2368, term2368.getClass(), "type", 0);
        setField(term2368, term2368.getClass(), "next", null);
        setField(term2368, term2368.getClass(), "first", null);
        setField(term2368, term2368.getClass(), "last", null);
        setField(term2368, term2368.getClass(), "propListHead", null);
        setIntField(term2368, term2368.getClass(), "sourcePosition", 0);
        setField(term2368, term2368.getClass(), "jsType", null);
        setField(term2368, term2368.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "first", term2368);
        setIntField(term2371, term2371.getClass(), "type", 0);
        setField(term2371, term2371.getClass(), "next", null);
        setField(term2371, term2371.getClass(), "first", null);
        setField(term2371, term2371.getClass(), "last", null);
        setField(term2371, term2371.getClass(), "propListHead", null);
        setIntField(term2371, term2371.getClass(), "sourcePosition", 0);
        setField(term2371, term2371.getClass(), "jsType", null);
        setField(term2371, term2371.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "last", term2371);
        setField(term2374, term2374.getClass(), "next", null);
        setIntField(term2374, term2374.getClass(), "type", 0);
        setIntField(term2374, term2374.getClass(), "intValue", 0);
        setField(term2374, term2374.getClass(), "objectValue", null);
        setField(term2351, term2351.getClass(), "propListHead", term2374);
        setIntField(term2351, term2351.getClass(), "sourcePosition", 1734759369);
        setField(term2351, term2351.getClass(), "jsType", null);
        setField(term2351, term2351.getClass(), "parent", null);
        term15726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15731 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15734 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15726, term15726.getClass(), "type", -82632953);
        setIntField(term15727, term15727.getClass(), "type", 360972386);
        setIntField(term15728, term15728.getClass(), "type", 0);
        setField(term15728, term15728.getClass(), "next", null);
        setField(term15728, term15728.getClass(), "first", null);
        setField(term15728, term15728.getClass(), "last", null);
        setField(term15728, term15728.getClass(), "propListHead", null);
        setIntField(term15728, term15728.getClass(), "sourcePosition", 0);
        setField(term15728, term15728.getClass(), "jsType", null);
        setField(term15728, term15728.getClass(), "parent", null);
        setField(term15727, term15727.getClass(), "next", term15728);
        setIntField(term15729, term15729.getClass(), "type", 0);
        setField(term15729, term15729.getClass(), "next", null);
        setField(term15729, term15729.getClass(), "first", null);
        setField(term15729, term15729.getClass(), "last", null);
        setField(term15729, term15729.getClass(), "propListHead", null);
        setIntField(term15729, term15729.getClass(), "sourcePosition", 0);
        setField(term15729, term15729.getClass(), "jsType", null);
        setField(term15729, term15729.getClass(), "parent", null);
        setField(term15727, term15727.getClass(), "first", term15729);
        setIntField(term15730, term15730.getClass(), "type", 0);
        setField(term15730, term15730.getClass(), "next", null);
        setField(term15730, term15730.getClass(), "first", null);
        setField(term15730, term15730.getClass(), "last", null);
        setField(term15730, term15730.getClass(), "propListHead", null);
        setIntField(term15730, term15730.getClass(), "sourcePosition", 0);
        setField(term15730, term15730.getClass(), "jsType", null);
        setField(term15730, term15730.getClass(), "parent", null);
        setField(term15727, term15727.getClass(), "last", term15730);
        setField(term15731, term15731.getClass(), "next", null);
        setIntField(term15731, term15731.getClass(), "type", 0);
        setIntField(term15731, term15731.getClass(), "intValue", 0);
        setField(term15731, term15731.getClass(), "objectValue", null);
        setField(term15727, term15727.getClass(), "propListHead", term15731);
        setIntField(term15727, term15727.getClass(), "sourcePosition", 692873905);
        setField(term15727, term15727.getClass(), "jsType", null);
        setField(term15727, term15727.getClass(), "parent", null);
        setField(term15726, term15726.getClass(), "next", term15727);
        setIntField(term15732, term15732.getClass(), "type", 0);
        setField(term15732, term15732.getClass(), "next", null);
        setField(term15732, term15732.getClass(), "first", null);
        setField(term15732, term15732.getClass(), "last", null);
        setField(term15732, term15732.getClass(), "propListHead", null);
        setIntField(term15732, term15732.getClass(), "sourcePosition", 0);
        setField(term15732, term15732.getClass(), "jsType", null);
        setField(term15732, term15732.getClass(), "parent", null);
        setField(term15726, term15726.getClass(), "first", term15732);
        setIntField(term15733, term15733.getClass(), "type", 0);
        setField(term15733, term15733.getClass(), "next", null);
        setField(term15733, term15733.getClass(), "first", null);
        setField(term15733, term15733.getClass(), "last", null);
        setField(term15733, term15733.getClass(), "propListHead", null);
        setIntField(term15733, term15733.getClass(), "sourcePosition", 0);
        setField(term15733, term15733.getClass(), "jsType", null);
        setField(term15733, term15733.getClass(), "parent", null);
        setField(term15726, term15726.getClass(), "last", term15733);
        setField(term15734, term15734.getClass(), "next", null);
        setIntField(term15734, term15734.getClass(), "type", 0);
        setIntField(term15734, term15734.getClass(), "intValue", 0);
        setField(term15734, term15734.getClass(), "objectValue", null);
        setField(term15726, term15726.getClass(), "propListHead", term15734);
        setIntField(term15726, term15726.getClass(), "sourcePosition", 1734759369);
        setField(term15726, term15726.getClass(), "jsType", null);
        setField(term15726, term15726.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2351;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2351, term15726));
    }

};


