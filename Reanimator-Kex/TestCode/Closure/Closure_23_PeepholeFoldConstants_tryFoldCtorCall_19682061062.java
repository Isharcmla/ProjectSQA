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

public class PeepholeFoldConstants_tryFoldCtorCall_19682061062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1405;
     Object term1407;

    public PeepholeFoldConstants_tryFoldCtorCall_19682061062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1405 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1405, term1405.getClass(), "late", false);
        setField(term1405, term1405.getClass(), "compiler", null);
        term1407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1407, term1407.getClass(), "type", -197820800);
        setIntField(term1409, term1409.getClass(), "type", 723812297);
        setIntField(term1411, term1411.getClass(), "type", 1639448749);
        setIntField(term1413, term1413.getClass(), "type", 873659088);
        setIntField(term1415, term1415.getClass(), "type", -975748721);
        setField(term1415, term1415.getClass(), "next", null);
        setField(term1415, term1415.getClass(), "first", null);
        setField(term1415, term1415.getClass(), "last", null);
        setField(term1415, term1415.getClass(), "propListHead", null);
        setIntField(term1415, term1415.getClass(), "sourcePosition", 0);
        setField(term1415, term1415.getClass(), "jsType", null);
        setField(term1415, term1415.getClass(), "parent", null);
        setField(term1413, term1413.getClass(), "next", term1415);
        setIntField(term1418, term1418.getClass(), "type", 433248783);
        setField(term1418, term1418.getClass(), "next", null);
        setField(term1418, term1418.getClass(), "first", null);
        setField(term1418, term1418.getClass(), "last", term1415);
        setField(term1418, term1418.getClass(), "propListHead", null);
        setIntField(term1418, term1418.getClass(), "sourcePosition", 0);
        setField(term1418, term1418.getClass(), "jsType", null);
        setField(term1418, term1418.getClass(), "parent", null);
        setField(term1413, term1413.getClass(), "first", term1418);
        setField(term1413, term1413.getClass(), "last", term1411);
        setField(term1413, term1413.getClass(), "propListHead", null);
        setIntField(term1413, term1413.getClass(), "sourcePosition", 0);
        setField(term1413, term1413.getClass(), "jsType", null);
        setField(term1413, term1413.getClass(), "parent", null);
        setField(term1411, term1411.getClass(), "next", term1413);
        setField(term1411, term1411.getClass(), "first", term1415);
        setIntField(term1422, term1422.getClass(), "type", -1736183862);
        setIntField(term1424, term1424.getClass(), "type", 897010381);
        setField(term1424, term1424.getClass(), "next", null);
        setField(term1424, term1424.getClass(), "first", term1418);
        setField(term1424, term1424.getClass(), "last", term1413);
        setField(term1424, term1424.getClass(), "propListHead", null);
        setIntField(term1424, term1424.getClass(), "sourcePosition", 0);
        setField(term1424, term1424.getClass(), "jsType", null);
        setField(term1424, term1424.getClass(), "parent", null);
        setField(term1422, term1422.getClass(), "next", term1424);
        setField(term1422, term1422.getClass(), "first", term1409);
        setField(term1422, term1422.getClass(), "last", term1409);
        setField(term1422, term1422.getClass(), "propListHead", null);
        setIntField(term1422, term1422.getClass(), "sourcePosition", 0);
        setField(term1422, term1422.getClass(), "jsType", null);
        setField(term1422, term1422.getClass(), "parent", null);
        setField(term1411, term1411.getClass(), "last", term1422);
        setField(term1411, term1411.getClass(), "propListHead", null);
        setIntField(term1411, term1411.getClass(), "sourcePosition", 0);
        setField(term1411, term1411.getClass(), "jsType", null);
        setField(term1411, term1411.getClass(), "parent", null);
        setField(term1409, term1409.getClass(), "next", term1411);
        setIntField(term1429, term1429.getClass(), "type", -15712667);
        setField(term1429, term1429.getClass(), "next", term1422);
        setField(term1429, term1429.getClass(), "first", term1424);
        setField(term1429, term1429.getClass(), "last", term1407);
        setField(term1429, term1429.getClass(), "propListHead", null);
        setIntField(term1429, term1429.getClass(), "sourcePosition", 0);
        setField(term1429, term1429.getClass(), "jsType", null);
        setField(term1429, term1429.getClass(), "parent", null);
        setField(term1409, term1409.getClass(), "first", term1429);
        setField(term1409, term1409.getClass(), "last", term1429);
        setField(term1409, term1409.getClass(), "propListHead", null);
        setIntField(term1409, term1409.getClass(), "sourcePosition", 0);
        setField(term1409, term1409.getClass(), "jsType", null);
        setField(term1409, term1409.getClass(), "parent", null);
        setField(term1407, term1407.getClass(), "next", term1409);
        setField(term1407, term1407.getClass(), "first", term1413);
        setField(term1407, term1407.getClass(), "last", term1415);
        setField(term1407, term1407.getClass(), "propListHead", null);
        setIntField(term1407, term1407.getClass(), "sourcePosition", 0);
        setField(term1407, term1407.getClass(), "jsType", null);
        setField(term1407, term1407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1407;
        try {
            callMethod(klass, "tryFoldCtorCall", argTypes, term1405, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


