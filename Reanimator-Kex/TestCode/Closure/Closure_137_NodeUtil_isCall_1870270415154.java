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

public class NodeUtil_isCall_1870270415154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;
     Object term8920;

    public NodeUtil_isCall_1870270415154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1394 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1404 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1381, term1381.getClass(), "type", -344907703);
        setIntField(term1383, term1383.getClass(), "type", -457396133);
        setIntField(term1385, term1385.getClass(), "type", 0);
        setField(term1385, term1385.getClass(), "next", null);
        setField(term1385, term1385.getClass(), "first", null);
        setField(term1385, term1385.getClass(), "last", null);
        setField(term1385, term1385.getClass(), "propListHead", null);
        setIntField(term1385, term1385.getClass(), "sourcePosition", 0);
        setField(term1385, term1385.getClass(), "jsType", null);
        setField(term1385, term1385.getClass(), "parent", null);
        setField(term1383, term1383.getClass(), "next", term1385);
        setIntField(term1388, term1388.getClass(), "type", 0);
        setField(term1388, term1388.getClass(), "next", null);
        setField(term1388, term1388.getClass(), "first", null);
        setField(term1388, term1388.getClass(), "last", null);
        setField(term1388, term1388.getClass(), "propListHead", null);
        setIntField(term1388, term1388.getClass(), "sourcePosition", 0);
        setField(term1388, term1388.getClass(), "jsType", null);
        setField(term1388, term1388.getClass(), "parent", null);
        setField(term1383, term1383.getClass(), "first", term1388);
        setIntField(term1391, term1391.getClass(), "type", 0);
        setField(term1391, term1391.getClass(), "next", null);
        setField(term1391, term1391.getClass(), "first", null);
        setField(term1391, term1391.getClass(), "last", null);
        setField(term1391, term1391.getClass(), "propListHead", null);
        setIntField(term1391, term1391.getClass(), "sourcePosition", 0);
        setField(term1391, term1391.getClass(), "jsType", null);
        setField(term1391, term1391.getClass(), "parent", null);
        setField(term1383, term1383.getClass(), "last", term1391);
        setField(term1394, term1394.getClass(), "next", null);
        setIntField(term1394, term1394.getClass(), "type", 0);
        setIntField(term1394, term1394.getClass(), "intValue", 0);
        setField(term1394, term1394.getClass(), "objectValue", null);
        setField(term1383, term1383.getClass(), "propListHead", term1394);
        setIntField(term1383, term1383.getClass(), "sourcePosition", 1895143076);
        setField(term1383, term1383.getClass(), "jsType", null);
        setField(term1383, term1383.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "next", term1383);
        setIntField(term1398, term1398.getClass(), "type", 0);
        setField(term1398, term1398.getClass(), "next", null);
        setField(term1398, term1398.getClass(), "first", null);
        setField(term1398, term1398.getClass(), "last", null);
        setField(term1398, term1398.getClass(), "propListHead", null);
        setIntField(term1398, term1398.getClass(), "sourcePosition", 0);
        setField(term1398, term1398.getClass(), "jsType", null);
        setField(term1398, term1398.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "first", term1398);
        setIntField(term1401, term1401.getClass(), "type", 0);
        setField(term1401, term1401.getClass(), "next", null);
        setField(term1401, term1401.getClass(), "first", null);
        setField(term1401, term1401.getClass(), "last", null);
        setField(term1401, term1401.getClass(), "propListHead", null);
        setIntField(term1401, term1401.getClass(), "sourcePosition", 0);
        setField(term1401, term1401.getClass(), "jsType", null);
        setField(term1401, term1401.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "last", term1401);
        setField(term1404, term1404.getClass(), "next", null);
        setIntField(term1404, term1404.getClass(), "type", 0);
        setIntField(term1404, term1404.getClass(), "intValue", 0);
        setField(term1404, term1404.getClass(), "objectValue", null);
        setField(term1381, term1381.getClass(), "propListHead", term1404);
        setIntField(term1381, term1381.getClass(), "sourcePosition", 1981860404);
        setField(term1381, term1381.getClass(), "jsType", null);
        setField(term1381, term1381.getClass(), "parent", null);
        term8920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8925 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8928 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8920, term8920.getClass(), "type", -344907703);
        setIntField(term8921, term8921.getClass(), "type", -457396133);
        setIntField(term8922, term8922.getClass(), "type", 0);
        setField(term8922, term8922.getClass(), "next", null);
        setField(term8922, term8922.getClass(), "first", null);
        setField(term8922, term8922.getClass(), "last", null);
        setField(term8922, term8922.getClass(), "propListHead", null);
        setIntField(term8922, term8922.getClass(), "sourcePosition", 0);
        setField(term8922, term8922.getClass(), "jsType", null);
        setField(term8922, term8922.getClass(), "parent", null);
        setField(term8921, term8921.getClass(), "next", term8922);
        setIntField(term8923, term8923.getClass(), "type", 0);
        setField(term8923, term8923.getClass(), "next", null);
        setField(term8923, term8923.getClass(), "first", null);
        setField(term8923, term8923.getClass(), "last", null);
        setField(term8923, term8923.getClass(), "propListHead", null);
        setIntField(term8923, term8923.getClass(), "sourcePosition", 0);
        setField(term8923, term8923.getClass(), "jsType", null);
        setField(term8923, term8923.getClass(), "parent", null);
        setField(term8921, term8921.getClass(), "first", term8923);
        setIntField(term8924, term8924.getClass(), "type", 0);
        setField(term8924, term8924.getClass(), "next", null);
        setField(term8924, term8924.getClass(), "first", null);
        setField(term8924, term8924.getClass(), "last", null);
        setField(term8924, term8924.getClass(), "propListHead", null);
        setIntField(term8924, term8924.getClass(), "sourcePosition", 0);
        setField(term8924, term8924.getClass(), "jsType", null);
        setField(term8924, term8924.getClass(), "parent", null);
        setField(term8921, term8921.getClass(), "last", term8924);
        setField(term8925, term8925.getClass(), "next", null);
        setIntField(term8925, term8925.getClass(), "type", 0);
        setIntField(term8925, term8925.getClass(), "intValue", 0);
        setField(term8925, term8925.getClass(), "objectValue", null);
        setField(term8921, term8921.getClass(), "propListHead", term8925);
        setIntField(term8921, term8921.getClass(), "sourcePosition", 1895143076);
        setField(term8921, term8921.getClass(), "jsType", null);
        setField(term8921, term8921.getClass(), "parent", null);
        setField(term8920, term8920.getClass(), "next", term8921);
        setIntField(term8926, term8926.getClass(), "type", 0);
        setField(term8926, term8926.getClass(), "next", null);
        setField(term8926, term8926.getClass(), "first", null);
        setField(term8926, term8926.getClass(), "last", null);
        setField(term8926, term8926.getClass(), "propListHead", null);
        setIntField(term8926, term8926.getClass(), "sourcePosition", 0);
        setField(term8926, term8926.getClass(), "jsType", null);
        setField(term8926, term8926.getClass(), "parent", null);
        setField(term8920, term8920.getClass(), "first", term8926);
        setIntField(term8927, term8927.getClass(), "type", 0);
        setField(term8927, term8927.getClass(), "next", null);
        setField(term8927, term8927.getClass(), "first", null);
        setField(term8927, term8927.getClass(), "last", null);
        setField(term8927, term8927.getClass(), "propListHead", null);
        setIntField(term8927, term8927.getClass(), "sourcePosition", 0);
        setField(term8927, term8927.getClass(), "jsType", null);
        setField(term8927, term8927.getClass(), "parent", null);
        setField(term8920, term8920.getClass(), "last", term8927);
        setField(term8928, term8928.getClass(), "next", null);
        setIntField(term8928, term8928.getClass(), "type", 0);
        setIntField(term8928, term8928.getClass(), "intValue", 0);
        setField(term8928, term8928.getClass(), "objectValue", null);
        setField(term8920, term8920.getClass(), "propListHead", term8928);
        setIntField(term8920, term8920.getClass(), "sourcePosition", 1981860404);
        setField(term8920, term8920.getClass(), "jsType", null);
        setField(term8920, term8920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1381;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1381, term8920));
        assertTrue(recursiveEquals(retValue, false));
    }

};


