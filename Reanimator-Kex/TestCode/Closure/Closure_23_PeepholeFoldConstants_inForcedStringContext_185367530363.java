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

public class PeepholeFoldConstants_inForcedStringContext_185367530363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;
     Object term1436;

    public PeepholeFoldConstants_inForcedStringContext_185367530363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1434, term1434.getClass(), "late", true);
        setField(term1434, term1434.getClass(), "compiler", null);
        term1436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1436, term1436.getClass(), "type", 1964967720);
        setIntField(term1438, term1438.getClass(), "type", 1351900243);
        setIntField(term1440, term1440.getClass(), "type", -330897705);
        setIntField(term1442, term1442.getClass(), "type", 1065595802);
        setIntField(term1444, term1444.getClass(), "type", 21031843);
        setField(term1444, term1444.getClass(), "next", null);
        setField(term1444, term1444.getClass(), "first", null);
        setField(term1444, term1444.getClass(), "last", null);
        setField(term1444, term1444.getClass(), "propListHead", null);
        setIntField(term1444, term1444.getClass(), "sourcePosition", 0);
        setField(term1444, term1444.getClass(), "jsType", null);
        setField(term1444, term1444.getClass(), "parent", null);
        setField(term1442, term1442.getClass(), "next", term1444);
        setIntField(term1447, term1447.getClass(), "type", -380787857);
        setField(term1447, term1447.getClass(), "next", null);
        setField(term1447, term1447.getClass(), "first", null);
        setField(term1447, term1447.getClass(), "last", term1444);
        setField(term1447, term1447.getClass(), "propListHead", null);
        setIntField(term1447, term1447.getClass(), "sourcePosition", 0);
        setField(term1447, term1447.getClass(), "jsType", null);
        setField(term1447, term1447.getClass(), "parent", null);
        setField(term1442, term1442.getClass(), "first", term1447);
        setField(term1442, term1442.getClass(), "last", term1440);
        setField(term1442, term1442.getClass(), "propListHead", null);
        setIntField(term1442, term1442.getClass(), "sourcePosition", 0);
        setField(term1442, term1442.getClass(), "jsType", null);
        setField(term1442, term1442.getClass(), "parent", null);
        setField(term1440, term1440.getClass(), "next", term1442);
        setField(term1440, term1440.getClass(), "first", term1444);
        setIntField(term1451, term1451.getClass(), "type", -1097563716);
        setIntField(term1453, term1453.getClass(), "type", 1572907769);
        setField(term1453, term1453.getClass(), "next", null);
        setField(term1453, term1453.getClass(), "first", term1447);
        setField(term1453, term1453.getClass(), "last", term1442);
        setField(term1453, term1453.getClass(), "propListHead", null);
        setIntField(term1453, term1453.getClass(), "sourcePosition", 0);
        setField(term1453, term1453.getClass(), "jsType", null);
        setField(term1453, term1453.getClass(), "parent", null);
        setField(term1451, term1451.getClass(), "next", term1453);
        setField(term1451, term1451.getClass(), "first", term1438);
        setField(term1451, term1451.getClass(), "last", term1438);
        setField(term1451, term1451.getClass(), "propListHead", null);
        setIntField(term1451, term1451.getClass(), "sourcePosition", 0);
        setField(term1451, term1451.getClass(), "jsType", null);
        setField(term1451, term1451.getClass(), "parent", null);
        setField(term1440, term1440.getClass(), "last", term1451);
        setField(term1440, term1440.getClass(), "propListHead", null);
        setIntField(term1440, term1440.getClass(), "sourcePosition", 0);
        setField(term1440, term1440.getClass(), "jsType", null);
        setField(term1440, term1440.getClass(), "parent", null);
        setField(term1438, term1438.getClass(), "next", term1440);
        setIntField(term1458, term1458.getClass(), "type", 1608016787);
        setField(term1458, term1458.getClass(), "next", term1451);
        setField(term1458, term1458.getClass(), "first", term1453);
        setField(term1458, term1458.getClass(), "last", term1436);
        setField(term1458, term1458.getClass(), "propListHead", null);
        setIntField(term1458, term1458.getClass(), "sourcePosition", 0);
        setField(term1458, term1458.getClass(), "jsType", null);
        setField(term1458, term1458.getClass(), "parent", null);
        setField(term1438, term1438.getClass(), "first", term1458);
        setField(term1438, term1438.getClass(), "last", term1458);
        setField(term1438, term1438.getClass(), "propListHead", null);
        setIntField(term1438, term1438.getClass(), "sourcePosition", 0);
        setField(term1438, term1438.getClass(), "jsType", null);
        setField(term1438, term1438.getClass(), "parent", null);
        setField(term1436, term1436.getClass(), "next", term1438);
        setField(term1436, term1436.getClass(), "first", term1442);
        setField(term1436, term1436.getClass(), "last", term1444);
        setField(term1436, term1436.getClass(), "propListHead", null);
        setIntField(term1436, term1436.getClass(), "sourcePosition", 0);
        setField(term1436, term1436.getClass(), "jsType", null);
        setField(term1436, term1436.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1436;
        try {
            callMethod(klass, "inForcedStringContext", argTypes, term1434, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


