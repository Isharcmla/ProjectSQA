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

public class PeepholeFoldConstants_tryFoldInForcedStringContext_93302308464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463;
     Object term1465;

    public PeepholeFoldConstants_tryFoldInForcedStringContext_93302308464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1463 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1463, term1463.getClass(), "late", true);
        setField(term1463, term1463.getClass(), "compiler", null);
        term1465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1465, term1465.getClass(), "type", -516303035);
        setIntField(term1467, term1467.getClass(), "type", -2143043890);
        setIntField(term1469, term1469.getClass(), "type", -2138825831);
        setIntField(term1471, term1471.getClass(), "type", 1454781562);
        setIntField(term1473, term1473.getClass(), "type", -27944011);
        setField(term1473, term1473.getClass(), "next", null);
        setField(term1473, term1473.getClass(), "first", null);
        setField(term1473, term1473.getClass(), "last", null);
        setField(term1473, term1473.getClass(), "propListHead", null);
        setIntField(term1473, term1473.getClass(), "sourcePosition", 0);
        setField(term1473, term1473.getClass(), "jsType", null);
        setField(term1473, term1473.getClass(), "parent", null);
        setField(term1471, term1471.getClass(), "next", term1473);
        setIntField(term1476, term1476.getClass(), "type", -20614472);
        setField(term1476, term1476.getClass(), "next", null);
        setField(term1476, term1476.getClass(), "first", null);
        setField(term1476, term1476.getClass(), "last", term1473);
        setField(term1476, term1476.getClass(), "propListHead", null);
        setIntField(term1476, term1476.getClass(), "sourcePosition", 0);
        setField(term1476, term1476.getClass(), "jsType", null);
        setField(term1476, term1476.getClass(), "parent", null);
        setField(term1471, term1471.getClass(), "first", term1476);
        setField(term1471, term1471.getClass(), "last", term1469);
        setField(term1471, term1471.getClass(), "propListHead", null);
        setIntField(term1471, term1471.getClass(), "sourcePosition", 0);
        setField(term1471, term1471.getClass(), "jsType", null);
        setField(term1471, term1471.getClass(), "parent", null);
        setField(term1469, term1469.getClass(), "next", term1471);
        setField(term1469, term1469.getClass(), "first", term1473);
        setIntField(term1480, term1480.getClass(), "type", 947449400);
        setIntField(term1482, term1482.getClass(), "type", -763799087);
        setField(term1482, term1482.getClass(), "next", null);
        setField(term1482, term1482.getClass(), "first", term1476);
        setField(term1482, term1482.getClass(), "last", term1471);
        setField(term1482, term1482.getClass(), "propListHead", null);
        setIntField(term1482, term1482.getClass(), "sourcePosition", 0);
        setField(term1482, term1482.getClass(), "jsType", null);
        setField(term1482, term1482.getClass(), "parent", null);
        setField(term1480, term1480.getClass(), "next", term1482);
        setField(term1480, term1480.getClass(), "first", term1467);
        setField(term1480, term1480.getClass(), "last", term1467);
        setField(term1480, term1480.getClass(), "propListHead", null);
        setIntField(term1480, term1480.getClass(), "sourcePosition", 0);
        setField(term1480, term1480.getClass(), "jsType", null);
        setField(term1480, term1480.getClass(), "parent", null);
        setField(term1469, term1469.getClass(), "last", term1480);
        setField(term1469, term1469.getClass(), "propListHead", null);
        setIntField(term1469, term1469.getClass(), "sourcePosition", 0);
        setField(term1469, term1469.getClass(), "jsType", null);
        setField(term1469, term1469.getClass(), "parent", null);
        setField(term1467, term1467.getClass(), "next", term1469);
        setIntField(term1487, term1487.getClass(), "type", 1207142014);
        setField(term1487, term1487.getClass(), "next", term1480);
        setField(term1487, term1487.getClass(), "first", term1482);
        setField(term1487, term1487.getClass(), "last", term1465);
        setField(term1487, term1487.getClass(), "propListHead", null);
        setIntField(term1487, term1487.getClass(), "sourcePosition", 0);
        setField(term1487, term1487.getClass(), "jsType", null);
        setField(term1487, term1487.getClass(), "parent", null);
        setField(term1467, term1467.getClass(), "first", term1487);
        setField(term1467, term1467.getClass(), "last", term1487);
        setField(term1467, term1467.getClass(), "propListHead", null);
        setIntField(term1467, term1467.getClass(), "sourcePosition", 0);
        setField(term1467, term1467.getClass(), "jsType", null);
        setField(term1467, term1467.getClass(), "parent", null);
        setField(term1465, term1465.getClass(), "next", term1467);
        setField(term1465, term1465.getClass(), "first", term1471);
        setField(term1465, term1465.getClass(), "last", term1473);
        setField(term1465, term1465.getClass(), "propListHead", null);
        setIntField(term1465, term1465.getClass(), "sourcePosition", 0);
        setField(term1465, term1465.getClass(), "jsType", null);
        setField(term1465, term1465.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1465;
        try {
            callMethod(klass, "tryFoldInForcedStringContext", argTypes, term1463, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


