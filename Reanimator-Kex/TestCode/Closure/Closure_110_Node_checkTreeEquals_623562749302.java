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

public class Node_checkTreeEquals_623562749302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3387;
     Object term3414;

    public Node_checkTreeEquals_623562749302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3387, term3387.getClass(), "type", -1231122778);
        setIntField(term3389, term3389.getClass(), "type", 1923558221);
        setIntField(term3391, term3391.getClass(), "type", 1762934060);
        setIntField(term3393, term3393.getClass(), "type", -859828739);
        setIntField(term3395, term3395.getClass(), "type", 1986855642);
        setField(term3395, term3395.getClass(), "next", null);
        setField(term3395, term3395.getClass(), "first", null);
        setField(term3395, term3395.getClass(), "last", null);
        setField(term3395, term3395.getClass(), "propListHead", null);
        setIntField(term3395, term3395.getClass(), "sourcePosition", 0);
        setField(term3395, term3395.getClass(), "jsType", null);
        setField(term3395, term3395.getClass(), "parent", null);
        setField(term3393, term3393.getClass(), "next", term3395);
        setIntField(term3398, term3398.getClass(), "type", 1280322790);
        setField(term3398, term3398.getClass(), "next", null);
        setField(term3398, term3398.getClass(), "first", null);
        setField(term3398, term3398.getClass(), "last", term3395);
        setField(term3398, term3398.getClass(), "propListHead", null);
        setIntField(term3398, term3398.getClass(), "sourcePosition", 0);
        setField(term3398, term3398.getClass(), "jsType", null);
        setField(term3398, term3398.getClass(), "parent", null);
        setField(term3393, term3393.getClass(), "first", term3398);
        setField(term3393, term3393.getClass(), "last", term3391);
        setField(term3393, term3393.getClass(), "propListHead", null);
        setIntField(term3393, term3393.getClass(), "sourcePosition", 0);
        setField(term3393, term3393.getClass(), "jsType", null);
        setField(term3393, term3393.getClass(), "parent", null);
        setField(term3391, term3391.getClass(), "next", term3393);
        setField(term3391, term3391.getClass(), "first", term3395);
        setIntField(term3402, term3402.getClass(), "type", -1592307668);
        setIntField(term3404, term3404.getClass(), "type", -203832871);
        setField(term3404, term3404.getClass(), "next", null);
        setField(term3404, term3404.getClass(), "first", term3398);
        setField(term3404, term3404.getClass(), "last", term3393);
        setField(term3404, term3404.getClass(), "propListHead", null);
        setIntField(term3404, term3404.getClass(), "sourcePosition", 0);
        setField(term3404, term3404.getClass(), "jsType", null);
        setField(term3404, term3404.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "next", term3404);
        setField(term3402, term3402.getClass(), "first", term3389);
        setField(term3402, term3402.getClass(), "last", term3389);
        setField(term3402, term3402.getClass(), "propListHead", null);
        setIntField(term3402, term3402.getClass(), "sourcePosition", 0);
        setField(term3402, term3402.getClass(), "jsType", null);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3391, term3391.getClass(), "last", term3402);
        setField(term3391, term3391.getClass(), "propListHead", null);
        setIntField(term3391, term3391.getClass(), "sourcePosition", 0);
        setField(term3391, term3391.getClass(), "jsType", null);
        setField(term3391, term3391.getClass(), "parent", null);
        setField(term3389, term3389.getClass(), "next", term3391);
        setIntField(term3409, term3409.getClass(), "type", 1151963130);
        setField(term3409, term3409.getClass(), "next", term3402);
        setField(term3409, term3409.getClass(), "first", term3404);
        setField(term3409, term3409.getClass(), "last", term3387);
        setField(term3409, term3409.getClass(), "propListHead", null);
        setIntField(term3409, term3409.getClass(), "sourcePosition", 0);
        setField(term3409, term3409.getClass(), "jsType", null);
        setField(term3409, term3409.getClass(), "parent", null);
        setField(term3389, term3389.getClass(), "first", term3409);
        setField(term3389, term3389.getClass(), "last", term3409);
        setField(term3389, term3389.getClass(), "propListHead", null);
        setIntField(term3389, term3389.getClass(), "sourcePosition", 0);
        setField(term3389, term3389.getClass(), "jsType", null);
        setField(term3389, term3389.getClass(), "parent", null);
        setField(term3387, term3387.getClass(), "next", term3389);
        setField(term3387, term3387.getClass(), "first", term3393);
        setField(term3387, term3387.getClass(), "last", term3395);
        setField(term3387, term3387.getClass(), "propListHead", null);
        setIntField(term3387, term3387.getClass(), "sourcePosition", 0);
        setField(term3387, term3387.getClass(), "jsType", null);
        setField(term3387, term3387.getClass(), "parent", null);
        term3414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3414, term3414.getClass(), "type", -1855819749);
        setIntField(term3416, term3416.getClass(), "type", 1059048043);
        setIntField(term3418, term3418.getClass(), "type", 537273345);
        setIntField(term3420, term3420.getClass(), "type", -346107257);
        setIntField(term3422, term3422.getClass(), "type", -1577393360);
        setField(term3422, term3422.getClass(), "next", null);
        setField(term3422, term3422.getClass(), "first", null);
        setField(term3422, term3422.getClass(), "last", null);
        setField(term3422, term3422.getClass(), "propListHead", null);
        setIntField(term3422, term3422.getClass(), "sourcePosition", 0);
        setField(term3422, term3422.getClass(), "jsType", null);
        setField(term3422, term3422.getClass(), "parent", null);
        setField(term3420, term3420.getClass(), "next", term3422);
        setIntField(term3425, term3425.getClass(), "type", 1112256038);
        setField(term3425, term3425.getClass(), "next", null);
        setField(term3425, term3425.getClass(), "first", null);
        setField(term3425, term3425.getClass(), "last", term3422);
        setField(term3425, term3425.getClass(), "propListHead", null);
        setIntField(term3425, term3425.getClass(), "sourcePosition", 0);
        setField(term3425, term3425.getClass(), "jsType", null);
        setField(term3425, term3425.getClass(), "parent", null);
        setField(term3420, term3420.getClass(), "first", term3425);
        setField(term3420, term3420.getClass(), "last", term3418);
        setField(term3420, term3420.getClass(), "propListHead", null);
        setIntField(term3420, term3420.getClass(), "sourcePosition", 0);
        setField(term3420, term3420.getClass(), "jsType", null);
        setField(term3420, term3420.getClass(), "parent", null);
        setField(term3418, term3418.getClass(), "next", term3420);
        setField(term3418, term3418.getClass(), "first", term3422);
        setIntField(term3429, term3429.getClass(), "type", 1504698817);
        setIntField(term3431, term3431.getClass(), "type", -2018333791);
        setField(term3431, term3431.getClass(), "next", null);
        setField(term3431, term3431.getClass(), "first", term3425);
        setField(term3431, term3431.getClass(), "last", term3420);
        setField(term3431, term3431.getClass(), "propListHead", null);
        setIntField(term3431, term3431.getClass(), "sourcePosition", 0);
        setField(term3431, term3431.getClass(), "jsType", null);
        setField(term3431, term3431.getClass(), "parent", null);
        setField(term3429, term3429.getClass(), "next", term3431);
        setField(term3429, term3429.getClass(), "first", term3416);
        setField(term3429, term3429.getClass(), "last", term3416);
        setField(term3429, term3429.getClass(), "propListHead", null);
        setIntField(term3429, term3429.getClass(), "sourcePosition", 0);
        setField(term3429, term3429.getClass(), "jsType", null);
        setField(term3429, term3429.getClass(), "parent", null);
        setField(term3418, term3418.getClass(), "last", term3429);
        setField(term3418, term3418.getClass(), "propListHead", null);
        setIntField(term3418, term3418.getClass(), "sourcePosition", 0);
        setField(term3418, term3418.getClass(), "jsType", null);
        setField(term3418, term3418.getClass(), "parent", null);
        setField(term3416, term3416.getClass(), "next", term3418);
        setIntField(term3436, term3436.getClass(), "type", -742476678);
        setField(term3436, term3436.getClass(), "next", term3429);
        setField(term3436, term3436.getClass(), "first", term3431);
        setField(term3436, term3436.getClass(), "last", term3414);
        setField(term3436, term3436.getClass(), "propListHead", null);
        setIntField(term3436, term3436.getClass(), "sourcePosition", 0);
        setField(term3436, term3436.getClass(), "jsType", null);
        setField(term3436, term3436.getClass(), "parent", null);
        setField(term3416, term3416.getClass(), "first", term3436);
        setField(term3416, term3416.getClass(), "last", term3436);
        setField(term3416, term3416.getClass(), "propListHead", null);
        setIntField(term3416, term3416.getClass(), "sourcePosition", 0);
        setField(term3416, term3416.getClass(), "jsType", null);
        setField(term3416, term3416.getClass(), "parent", null);
        setField(term3414, term3414.getClass(), "next", term3416);
        setField(term3414, term3414.getClass(), "first", term3420);
        setField(term3414, term3414.getClass(), "last", term3422);
        setField(term3414, term3414.getClass(), "propListHead", null);
        setIntField(term3414, term3414.getClass(), "sourcePosition", 0);
        setField(term3414, term3414.getClass(), "jsType", null);
        setField(term3414, term3414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3414;
        try {
            callMethod(klass, "checkTreeEquals", argTypes, term3387, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


