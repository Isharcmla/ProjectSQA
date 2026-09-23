package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class ArrowType_hashCode_152993979019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336;
     Object term1865;

    public ArrowType_hashCode_152993979019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term337, term337.getClass(), "type", -112921587);
        setIntField(term339, term339.getClass(), "type", 933028652);
        setIntField(term341, term341.getClass(), "type", 287287233);
        setIntField(term343, term343.getClass(), "type", 962840079);
        setField(term343, term343.getClass(), "next", null);
        setField(term343, term343.getClass(), "first", null);
        setField(term343, term343.getClass(), "last", null);
        setField(term343, term343.getClass(), "propListHead", null);
        setIntField(term343, term343.getClass(), "sourcePosition", 0);
        setField(term343, term343.getClass(), "jsType", null);
        setField(term343, term343.getClass(), "parent", null);
        setField(term341, term341.getClass(), "next", term343);
        setIntField(term346, term346.getClass(), "type", 1551099402);
        setField(term346, term346.getClass(), "next", null);
        setField(term346, term346.getClass(), "first", term337);
        setField(term346, term346.getClass(), "last", null);
        setField(term346, term346.getClass(), "propListHead", null);
        setIntField(term346, term346.getClass(), "sourcePosition", 0);
        setField(term346, term346.getClass(), "jsType", null);
        setField(term346, term346.getClass(), "parent", null);
        setField(term341, term341.getClass(), "first", term346);
        setIntField(term349, term349.getClass(), "type", 1265463001);
        setField(term349, term349.getClass(), "next", null);
        setField(term349, term349.getClass(), "first", term339);
        setField(term349, term349.getClass(), "last", null);
        setField(term349, term349.getClass(), "propListHead", null);
        setIntField(term349, term349.getClass(), "sourcePosition", 0);
        setField(term349, term349.getClass(), "jsType", null);
        setField(term349, term349.getClass(), "parent", null);
        setField(term341, term341.getClass(), "last", term349);
        setField(term341, term341.getClass(), "propListHead", null);
        setIntField(term341, term341.getClass(), "sourcePosition", 0);
        setField(term341, term341.getClass(), "jsType", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term339, term339.getClass(), "next", term341);
        setField(term339, term339.getClass(), "first", term341);
        setIntField(term353, term353.getClass(), "type", 1540719661);
        setField(term353, term353.getClass(), "next", term349);
        setField(term353, term353.getClass(), "first", term346);
        setField(term353, term353.getClass(), "last", term346);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        setField(term339, term339.getClass(), "last", term353);
        setField(term339, term339.getClass(), "propListHead", null);
        setIntField(term339, term339.getClass(), "sourcePosition", 0);
        setField(term339, term339.getClass(), "jsType", null);
        setField(term339, term339.getClass(), "parent", null);
        setField(term337, term337.getClass(), "next", term339);
        setField(term337, term337.getClass(), "first", term346);
        setIntField(term357, term357.getClass(), "type", 0);
        setField(term357, term357.getClass(), "next", null);
        setField(term357, term357.getClass(), "first", null);
        setField(term357, term357.getClass(), "last", null);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term337, term337.getClass(), "last", term357);
        setField(term337, term337.getClass(), "propListHead", null);
        setIntField(term337, term337.getClass(), "sourcePosition", 0);
        setField(term337, term337.getClass(), "jsType", null);
        setField(term337, term337.getClass(), "parent", null);
        setField(term336, term336.getClass(), "parameters", term337);
        setField(term336, term336.getClass(), "returnType", null);
        setBooleanField(term336, term336.getClass(), "returnTypeInferred", false);
        setBooleanField(term336, term336.getClass(), "resolved", false);
        setField(term336, term336.getClass(), "resolveResult", null);
        setField(term336, term336.getClass(), "registry", null);
        term1865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1866, term1866.getClass(), "type", -112921587);
        setIntField(term1867, term1867.getClass(), "type", 933028652);
        setIntField(term1868, term1868.getClass(), "type", 287287233);
        setIntField(term1869, term1869.getClass(), "type", 962840079);
        setField(term1869, term1869.getClass(), "next", null);
        setField(term1869, term1869.getClass(), "first", null);
        setField(term1869, term1869.getClass(), "last", null);
        setField(term1869, term1869.getClass(), "propListHead", null);
        setIntField(term1869, term1869.getClass(), "sourcePosition", 0);
        setField(term1869, term1869.getClass(), "jsType", null);
        setField(term1869, term1869.getClass(), "parent", null);
        setField(term1868, term1868.getClass(), "next", term1869);
        setIntField(term1870, term1870.getClass(), "type", 1551099402);
        setField(term1870, term1870.getClass(), "next", null);
        setField(term1870, term1870.getClass(), "first", term1866);
        setField(term1870, term1870.getClass(), "last", null);
        setField(term1870, term1870.getClass(), "propListHead", null);
        setIntField(term1870, term1870.getClass(), "sourcePosition", 0);
        setField(term1870, term1870.getClass(), "jsType", null);
        setField(term1870, term1870.getClass(), "parent", null);
        setField(term1868, term1868.getClass(), "first", term1870);
        setIntField(term1871, term1871.getClass(), "type", 1265463001);
        setField(term1871, term1871.getClass(), "next", null);
        setField(term1871, term1871.getClass(), "first", term1867);
        setField(term1871, term1871.getClass(), "last", null);
        setField(term1871, term1871.getClass(), "propListHead", null);
        setIntField(term1871, term1871.getClass(), "sourcePosition", 0);
        setField(term1871, term1871.getClass(), "jsType", null);
        setField(term1871, term1871.getClass(), "parent", null);
        setField(term1868, term1868.getClass(), "last", term1871);
        setField(term1868, term1868.getClass(), "propListHead", null);
        setIntField(term1868, term1868.getClass(), "sourcePosition", 0);
        setField(term1868, term1868.getClass(), "jsType", null);
        setField(term1868, term1868.getClass(), "parent", null);
        setField(term1867, term1867.getClass(), "next", term1868);
        setField(term1867, term1867.getClass(), "first", term1868);
        setIntField(term1872, term1872.getClass(), "type", 1540719661);
        setField(term1872, term1872.getClass(), "next", term1871);
        setField(term1872, term1872.getClass(), "first", term1870);
        setField(term1872, term1872.getClass(), "last", term1870);
        setField(term1872, term1872.getClass(), "propListHead", null);
        setIntField(term1872, term1872.getClass(), "sourcePosition", 0);
        setField(term1872, term1872.getClass(), "jsType", null);
        setField(term1872, term1872.getClass(), "parent", null);
        setField(term1867, term1867.getClass(), "last", term1872);
        setField(term1867, term1867.getClass(), "propListHead", null);
        setIntField(term1867, term1867.getClass(), "sourcePosition", 0);
        setField(term1867, term1867.getClass(), "jsType", null);
        setField(term1867, term1867.getClass(), "parent", null);
        setField(term1866, term1866.getClass(), "next", term1867);
        setField(term1866, term1866.getClass(), "first", term1870);
        setIntField(term1873, term1873.getClass(), "type", 0);
        setField(term1873, term1873.getClass(), "next", null);
        setField(term1873, term1873.getClass(), "first", null);
        setField(term1873, term1873.getClass(), "last", null);
        setField(term1873, term1873.getClass(), "propListHead", null);
        setIntField(term1873, term1873.getClass(), "sourcePosition", 0);
        setField(term1873, term1873.getClass(), "jsType", null);
        setField(term1873, term1873.getClass(), "parent", null);
        setField(term1866, term1866.getClass(), "last", term1873);
        setField(term1866, term1866.getClass(), "propListHead", null);
        setIntField(term1866, term1866.getClass(), "sourcePosition", 0);
        setField(term1866, term1866.getClass(), "jsType", null);
        setField(term1866, term1866.getClass(), "parent", null);
        setField(term1865, term1865.getClass(), "parameters", term1866);
        setField(term1865, term1865.getClass(), "returnType", null);
        setBooleanField(term1865, term1865.getClass(), "returnTypeInferred", false);
        setBooleanField(term1865, term1865.getClass(), "resolved", false);
        setField(term1865, term1865.getClass(), "resolveResult", null);
        setField(term1865, term1865.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term336, args);
        assertTrue(recursiveEquals(term336, term1865));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


