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

public class FoldConstants_consumesDanglingElse_15388795750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835;
     Object term836;
     Object term6387;
     Object term6388;

    public FoldConstants_consumesDanglingElse_15388795750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term835 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term835, term835.getClass(), "compiler", null);
        term836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term849 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term836, term836.getClass(), "type", -1034506028);
        setIntField(term838, term838.getClass(), "type", -1347665717);
        setIntField(term840, term840.getClass(), "type", 0);
        setField(term840, term840.getClass(), "next", null);
        setField(term840, term840.getClass(), "first", null);
        setField(term840, term840.getClass(), "last", null);
        setField(term840, term840.getClass(), "propListHead", null);
        setIntField(term840, term840.getClass(), "sourcePosition", 0);
        setField(term840, term840.getClass(), "jsType", null);
        setField(term840, term840.getClass(), "parent", null);
        setField(term838, term838.getClass(), "next", term840);
        setIntField(term843, term843.getClass(), "type", 0);
        setField(term843, term843.getClass(), "next", null);
        setField(term843, term843.getClass(), "first", null);
        setField(term843, term843.getClass(), "last", null);
        setField(term843, term843.getClass(), "propListHead", null);
        setIntField(term843, term843.getClass(), "sourcePosition", 0);
        setField(term843, term843.getClass(), "jsType", null);
        setField(term843, term843.getClass(), "parent", null);
        setField(term838, term838.getClass(), "first", term843);
        setIntField(term846, term846.getClass(), "type", 0);
        setField(term846, term846.getClass(), "next", null);
        setField(term846, term846.getClass(), "first", null);
        setField(term846, term846.getClass(), "last", null);
        setField(term846, term846.getClass(), "propListHead", null);
        setIntField(term846, term846.getClass(), "sourcePosition", 0);
        setField(term846, term846.getClass(), "jsType", null);
        setField(term846, term846.getClass(), "parent", null);
        setField(term838, term838.getClass(), "last", term846);
        setField(term849, term849.getClass(), "next", null);
        setIntField(term849, term849.getClass(), "type", 0);
        setIntField(term849, term849.getClass(), "intValue", 0);
        setField(term849, term849.getClass(), "objectValue", null);
        setField(term838, term838.getClass(), "propListHead", term849);
        setIntField(term838, term838.getClass(), "sourcePosition", 1596213415);
        setField(term838, term838.getClass(), "jsType", null);
        setField(term838, term838.getClass(), "parent", null);
        setField(term836, term836.getClass(), "next", term838);
        setIntField(term853, term853.getClass(), "type", 0);
        setField(term853, term853.getClass(), "next", null);
        setField(term853, term853.getClass(), "first", null);
        setField(term853, term853.getClass(), "last", null);
        setField(term853, term853.getClass(), "propListHead", null);
        setIntField(term853, term853.getClass(), "sourcePosition", 0);
        setField(term853, term853.getClass(), "jsType", null);
        setField(term853, term853.getClass(), "parent", null);
        setField(term836, term836.getClass(), "first", term853);
        setIntField(term856, term856.getClass(), "type", 0);
        setField(term856, term856.getClass(), "next", null);
        setField(term856, term856.getClass(), "first", null);
        setField(term856, term856.getClass(), "last", null);
        setField(term856, term856.getClass(), "propListHead", null);
        setIntField(term856, term856.getClass(), "sourcePosition", 0);
        setField(term856, term856.getClass(), "jsType", null);
        setField(term856, term856.getClass(), "parent", null);
        setField(term836, term836.getClass(), "last", term856);
        setField(term859, term859.getClass(), "next", null);
        setIntField(term859, term859.getClass(), "type", 0);
        setIntField(term859, term859.getClass(), "intValue", 0);
        setField(term859, term859.getClass(), "objectValue", null);
        setField(term836, term836.getClass(), "propListHead", term859);
        setIntField(term836, term836.getClass(), "sourcePosition", -268815336);
        setField(term836, term836.getClass(), "jsType", null);
        setField(term836, term836.getClass(), "parent", null);
        term6387 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term6387, term6387.getClass(), "compiler", null);
        term6388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6393 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6396 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6388, term6388.getClass(), "type", -1034506028);
        setIntField(term6389, term6389.getClass(), "type", -1347665717);
        setIntField(term6390, term6390.getClass(), "type", 0);
        setField(term6390, term6390.getClass(), "next", null);
        setField(term6390, term6390.getClass(), "first", null);
        setField(term6390, term6390.getClass(), "last", null);
        setField(term6390, term6390.getClass(), "propListHead", null);
        setIntField(term6390, term6390.getClass(), "sourcePosition", 0);
        setField(term6390, term6390.getClass(), "jsType", null);
        setField(term6390, term6390.getClass(), "parent", null);
        setField(term6389, term6389.getClass(), "next", term6390);
        setIntField(term6391, term6391.getClass(), "type", 0);
        setField(term6391, term6391.getClass(), "next", null);
        setField(term6391, term6391.getClass(), "first", null);
        setField(term6391, term6391.getClass(), "last", null);
        setField(term6391, term6391.getClass(), "propListHead", null);
        setIntField(term6391, term6391.getClass(), "sourcePosition", 0);
        setField(term6391, term6391.getClass(), "jsType", null);
        setField(term6391, term6391.getClass(), "parent", null);
        setField(term6389, term6389.getClass(), "first", term6391);
        setIntField(term6392, term6392.getClass(), "type", 0);
        setField(term6392, term6392.getClass(), "next", null);
        setField(term6392, term6392.getClass(), "first", null);
        setField(term6392, term6392.getClass(), "last", null);
        setField(term6392, term6392.getClass(), "propListHead", null);
        setIntField(term6392, term6392.getClass(), "sourcePosition", 0);
        setField(term6392, term6392.getClass(), "jsType", null);
        setField(term6392, term6392.getClass(), "parent", null);
        setField(term6389, term6389.getClass(), "last", term6392);
        setField(term6393, term6393.getClass(), "next", null);
        setIntField(term6393, term6393.getClass(), "type", 0);
        setIntField(term6393, term6393.getClass(), "intValue", 0);
        setField(term6393, term6393.getClass(), "objectValue", null);
        setField(term6389, term6389.getClass(), "propListHead", term6393);
        setIntField(term6389, term6389.getClass(), "sourcePosition", 1596213415);
        setField(term6389, term6389.getClass(), "jsType", null);
        setField(term6389, term6389.getClass(), "parent", null);
        setField(term6388, term6388.getClass(), "next", term6389);
        setIntField(term6394, term6394.getClass(), "type", 0);
        setField(term6394, term6394.getClass(), "next", null);
        setField(term6394, term6394.getClass(), "first", null);
        setField(term6394, term6394.getClass(), "last", null);
        setField(term6394, term6394.getClass(), "propListHead", null);
        setIntField(term6394, term6394.getClass(), "sourcePosition", 0);
        setField(term6394, term6394.getClass(), "jsType", null);
        setField(term6394, term6394.getClass(), "parent", null);
        setField(term6388, term6388.getClass(), "first", term6394);
        setIntField(term6395, term6395.getClass(), "type", 0);
        setField(term6395, term6395.getClass(), "next", null);
        setField(term6395, term6395.getClass(), "first", null);
        setField(term6395, term6395.getClass(), "last", null);
        setField(term6395, term6395.getClass(), "propListHead", null);
        setIntField(term6395, term6395.getClass(), "sourcePosition", 0);
        setField(term6395, term6395.getClass(), "jsType", null);
        setField(term6395, term6395.getClass(), "parent", null);
        setField(term6388, term6388.getClass(), "last", term6395);
        setField(term6396, term6396.getClass(), "next", null);
        setIntField(term6396, term6396.getClass(), "type", 0);
        setIntField(term6396, term6396.getClass(), "intValue", 0);
        setField(term6396, term6396.getClass(), "objectValue", null);
        setField(term6388, term6388.getClass(), "propListHead", term6396);
        setIntField(term6388, term6388.getClass(), "sourcePosition", -268815336);
        setField(term6388, term6388.getClass(), "jsType", null);
        setField(term6388, term6388.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term836;
        Object retValue = callMethod(klass, "consumesDanglingElse", argTypes, term835, args);
        assertTrue(recursiveEquals(term835, term6387));
        assertTrue(recursiveEquals(term836, term6388));
        assertTrue(recursiveEquals(retValue, false));
    }

};


