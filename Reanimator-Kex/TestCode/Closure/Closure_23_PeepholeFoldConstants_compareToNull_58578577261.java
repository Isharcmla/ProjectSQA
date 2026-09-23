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
import java.lang.Integer;

public class PeepholeFoldConstants_compareToNull_58578577261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1374;
     Object term1376;
     Object term1403;

    public PeepholeFoldConstants_compareToNull_58578577261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1374 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1374, term1374.getClass(), "late", false);
        setField(term1374, term1374.getClass(), "compiler", null);
        term1376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1376, term1376.getClass(), "type", 243280944);
        setIntField(term1378, term1378.getClass(), "type", -726681073);
        setIntField(term1380, term1380.getClass(), "type", -1724487863);
        setIntField(term1382, term1382.getClass(), "type", -128490829);
        setIntField(term1384, term1384.getClass(), "type", 202214133);
        setField(term1384, term1384.getClass(), "next", null);
        setField(term1384, term1384.getClass(), "first", null);
        setField(term1384, term1384.getClass(), "last", null);
        setField(term1384, term1384.getClass(), "propListHead", null);
        setIntField(term1384, term1384.getClass(), "sourcePosition", 0);
        setField(term1384, term1384.getClass(), "jsType", null);
        setField(term1384, term1384.getClass(), "parent", null);
        setField(term1382, term1382.getClass(), "next", term1384);
        setIntField(term1387, term1387.getClass(), "type", 1543091617);
        setField(term1387, term1387.getClass(), "next", null);
        setField(term1387, term1387.getClass(), "first", null);
        setField(term1387, term1387.getClass(), "last", term1384);
        setField(term1387, term1387.getClass(), "propListHead", null);
        setIntField(term1387, term1387.getClass(), "sourcePosition", 0);
        setField(term1387, term1387.getClass(), "jsType", null);
        setField(term1387, term1387.getClass(), "parent", null);
        setField(term1382, term1382.getClass(), "first", term1387);
        setField(term1382, term1382.getClass(), "last", term1380);
        setField(term1382, term1382.getClass(), "propListHead", null);
        setIntField(term1382, term1382.getClass(), "sourcePosition", 0);
        setField(term1382, term1382.getClass(), "jsType", null);
        setField(term1382, term1382.getClass(), "parent", null);
        setField(term1380, term1380.getClass(), "next", term1382);
        setField(term1380, term1380.getClass(), "first", term1384);
        setIntField(term1391, term1391.getClass(), "type", -222941705);
        setIntField(term1393, term1393.getClass(), "type", 291864719);
        setField(term1393, term1393.getClass(), "next", null);
        setField(term1393, term1393.getClass(), "first", term1387);
        setField(term1393, term1393.getClass(), "last", term1382);
        setField(term1393, term1393.getClass(), "propListHead", null);
        setIntField(term1393, term1393.getClass(), "sourcePosition", 0);
        setField(term1393, term1393.getClass(), "jsType", null);
        setField(term1393, term1393.getClass(), "parent", null);
        setField(term1391, term1391.getClass(), "next", term1393);
        setField(term1391, term1391.getClass(), "first", term1378);
        setField(term1391, term1391.getClass(), "last", term1378);
        setField(term1391, term1391.getClass(), "propListHead", null);
        setIntField(term1391, term1391.getClass(), "sourcePosition", 0);
        setField(term1391, term1391.getClass(), "jsType", null);
        setField(term1391, term1391.getClass(), "parent", null);
        setField(term1380, term1380.getClass(), "last", term1391);
        setField(term1380, term1380.getClass(), "propListHead", null);
        setIntField(term1380, term1380.getClass(), "sourcePosition", 0);
        setField(term1380, term1380.getClass(), "jsType", null);
        setField(term1380, term1380.getClass(), "parent", null);
        setField(term1378, term1378.getClass(), "next", term1380);
        setIntField(term1398, term1398.getClass(), "type", -1549607466);
        setField(term1398, term1398.getClass(), "next", term1391);
        setField(term1398, term1398.getClass(), "first", term1393);
        setField(term1398, term1398.getClass(), "last", term1376);
        setField(term1398, term1398.getClass(), "propListHead", null);
        setIntField(term1398, term1398.getClass(), "sourcePosition", 0);
        setField(term1398, term1398.getClass(), "jsType", null);
        setField(term1398, term1398.getClass(), "parent", null);
        setField(term1378, term1378.getClass(), "first", term1398);
        setField(term1378, term1378.getClass(), "last", term1398);
        setField(term1378, term1378.getClass(), "propListHead", null);
        setIntField(term1378, term1378.getClass(), "sourcePosition", 0);
        setField(term1378, term1378.getClass(), "jsType", null);
        setField(term1378, term1378.getClass(), "parent", null);
        setField(term1376, term1376.getClass(), "next", term1378);
        setField(term1376, term1376.getClass(), "first", term1382);
        setField(term1376, term1376.getClass(), "last", term1384);
        setField(term1376, term1376.getClass(), "propListHead", null);
        setIntField(term1376, term1376.getClass(), "sourcePosition", 0);
        setField(term1376, term1376.getClass(), "jsType", null);
        setField(term1376, term1376.getClass(), "parent", null);
        term1403 = new Integer(853609788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1376;
        args[1] = term1403;
        try {
            callMethod(klass, "compareToNull", argTypes, term1374, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


