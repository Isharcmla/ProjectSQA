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
import java.lang.Boolean;

public class Node_toString_619780254267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2387;
     Object term2414;
     Object term2434;
     Object term2436;
     Object term2438;

    public Node_toString_619780254267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2387, term2387.getClass(), "type", -114460662);
        setIntField(term2389, term2389.getClass(), "type", -355376034);
        setIntField(term2391, term2391.getClass(), "type", 588390599);
        setIntField(term2393, term2393.getClass(), "type", -95969566);
        setIntField(term2395, term2395.getClass(), "type", -68615285);
        setField(term2395, term2395.getClass(), "next", null);
        setField(term2395, term2395.getClass(), "first", null);
        setField(term2395, term2395.getClass(), "last", null);
        setField(term2395, term2395.getClass(), "propListHead", null);
        setIntField(term2395, term2395.getClass(), "sourcePosition", 0);
        setField(term2395, term2395.getClass(), "jsType", null);
        setField(term2395, term2395.getClass(), "parent", null);
        setField(term2393, term2393.getClass(), "next", term2395);
        setIntField(term2398, term2398.getClass(), "type", -337504086);
        setField(term2398, term2398.getClass(), "next", null);
        setField(term2398, term2398.getClass(), "first", null);
        setField(term2398, term2398.getClass(), "last", term2395);
        setField(term2398, term2398.getClass(), "propListHead", null);
        setIntField(term2398, term2398.getClass(), "sourcePosition", 0);
        setField(term2398, term2398.getClass(), "jsType", null);
        setField(term2398, term2398.getClass(), "parent", null);
        setField(term2393, term2393.getClass(), "first", term2398);
        setField(term2393, term2393.getClass(), "last", term2391);
        setField(term2393, term2393.getClass(), "propListHead", null);
        setIntField(term2393, term2393.getClass(), "sourcePosition", 0);
        setField(term2393, term2393.getClass(), "jsType", null);
        setField(term2393, term2393.getClass(), "parent", null);
        setField(term2391, term2391.getClass(), "next", term2393);
        setField(term2391, term2391.getClass(), "first", term2395);
        setIntField(term2402, term2402.getClass(), "type", 532588266);
        setIntField(term2404, term2404.getClass(), "type", -1286686332);
        setField(term2404, term2404.getClass(), "next", null);
        setField(term2404, term2404.getClass(), "first", term2398);
        setField(term2404, term2404.getClass(), "last", term2393);
        setField(term2404, term2404.getClass(), "propListHead", null);
        setIntField(term2404, term2404.getClass(), "sourcePosition", 0);
        setField(term2404, term2404.getClass(), "jsType", null);
        setField(term2404, term2404.getClass(), "parent", null);
        setField(term2402, term2402.getClass(), "next", term2404);
        setField(term2402, term2402.getClass(), "first", term2389);
        setField(term2402, term2402.getClass(), "last", term2389);
        setField(term2402, term2402.getClass(), "propListHead", null);
        setIntField(term2402, term2402.getClass(), "sourcePosition", 0);
        setField(term2402, term2402.getClass(), "jsType", null);
        setField(term2402, term2402.getClass(), "parent", null);
        setField(term2391, term2391.getClass(), "last", term2402);
        setField(term2391, term2391.getClass(), "propListHead", null);
        setIntField(term2391, term2391.getClass(), "sourcePosition", 0);
        setField(term2391, term2391.getClass(), "jsType", null);
        setField(term2391, term2391.getClass(), "parent", null);
        setField(term2389, term2389.getClass(), "next", term2391);
        setIntField(term2409, term2409.getClass(), "type", -284885486);
        setField(term2409, term2409.getClass(), "next", term2402);
        setField(term2409, term2409.getClass(), "first", term2404);
        setField(term2409, term2409.getClass(), "last", term2387);
        setField(term2409, term2409.getClass(), "propListHead", null);
        setIntField(term2409, term2409.getClass(), "sourcePosition", 0);
        setField(term2409, term2409.getClass(), "jsType", null);
        setField(term2409, term2409.getClass(), "parent", null);
        setField(term2389, term2389.getClass(), "first", term2409);
        setField(term2389, term2389.getClass(), "last", term2409);
        setField(term2389, term2389.getClass(), "propListHead", null);
        setIntField(term2389, term2389.getClass(), "sourcePosition", 0);
        setField(term2389, term2389.getClass(), "jsType", null);
        setField(term2389, term2389.getClass(), "parent", null);
        setField(term2387, term2387.getClass(), "next", term2389);
        setField(term2387, term2387.getClass(), "first", term2393);
        setField(term2387, term2387.getClass(), "last", term2395);
        setField(term2387, term2387.getClass(), "propListHead", null);
        setIntField(term2387, term2387.getClass(), "sourcePosition", 0);
        setField(term2387, term2387.getClass(), "jsType", null);
        setField(term2387, term2387.getClass(), "parent", null);
        term2414 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2415 = (byte[]) newByteArray(16);
        setField(term2414, term2414.getClass(), "value", term2415);
        setByteField(term2414, term2414.getClass(), "coder", (byte) 47);
        setIntField(term2414, term2414.getClass(), "count", 1791984446);
        term2434 = new Boolean(true);
        term2436 = new Boolean(true);
        term2438 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term2414;
        args[1] = term2434;
        args[2] = term2436;
        args[3] = term2438;
        try {
            callMethod(klass, "toString", argTypes, term2387, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


