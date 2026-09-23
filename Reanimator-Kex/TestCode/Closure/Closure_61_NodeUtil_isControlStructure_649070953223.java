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

public class NodeUtil_isControlStructure_649070953223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;
     Object term11392;

    public NodeUtil_isControlStructure_649070953223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1372, term1372.getClass(), "type", -706253892);
        setIntField(term1374, term1374.getClass(), "type", -1244386281);
        setIntField(term1376, term1376.getClass(), "type", 0);
        setField(term1376, term1376.getClass(), "next", null);
        setField(term1376, term1376.getClass(), "first", null);
        setField(term1376, term1376.getClass(), "last", null);
        setField(term1376, term1376.getClass(), "propListHead", null);
        setIntField(term1376, term1376.getClass(), "sourcePosition", 0);
        setField(term1376, term1376.getClass(), "jsType", null);
        setField(term1376, term1376.getClass(), "parent", null);
        setField(term1374, term1374.getClass(), "next", term1376);
        setIntField(term1379, term1379.getClass(), "type", 0);
        setField(term1379, term1379.getClass(), "next", null);
        setField(term1379, term1379.getClass(), "first", null);
        setField(term1379, term1379.getClass(), "last", null);
        setField(term1379, term1379.getClass(), "propListHead", null);
        setIntField(term1379, term1379.getClass(), "sourcePosition", 0);
        setField(term1379, term1379.getClass(), "jsType", null);
        setField(term1379, term1379.getClass(), "parent", null);
        setField(term1374, term1374.getClass(), "first", term1379);
        setIntField(term1382, term1382.getClass(), "type", 0);
        setField(term1382, term1382.getClass(), "next", null);
        setField(term1382, term1382.getClass(), "first", null);
        setField(term1382, term1382.getClass(), "last", null);
        setField(term1382, term1382.getClass(), "propListHead", null);
        setIntField(term1382, term1382.getClass(), "sourcePosition", 0);
        setField(term1382, term1382.getClass(), "jsType", null);
        setField(term1382, term1382.getClass(), "parent", null);
        setField(term1374, term1374.getClass(), "last", term1382);
        setField(term1374, term1374.getClass(), "propListHead", null);
        setIntField(term1374, term1374.getClass(), "sourcePosition", 0);
        setField(term1374, term1374.getClass(), "jsType", null);
        setField(term1374, term1374.getClass(), "parent", null);
        setField(term1372, term1372.getClass(), "next", term1374);
        setIntField(term1386, term1386.getClass(), "type", 0);
        setField(term1386, term1386.getClass(), "next", null);
        setField(term1386, term1386.getClass(), "first", null);
        setField(term1386, term1386.getClass(), "last", null);
        setField(term1386, term1386.getClass(), "propListHead", null);
        setIntField(term1386, term1386.getClass(), "sourcePosition", 0);
        setField(term1386, term1386.getClass(), "jsType", null);
        setField(term1386, term1386.getClass(), "parent", null);
        setField(term1372, term1372.getClass(), "first", term1386);
        setIntField(term1389, term1389.getClass(), "type", 0);
        setField(term1389, term1389.getClass(), "next", null);
        setField(term1389, term1389.getClass(), "first", null);
        setField(term1389, term1389.getClass(), "last", null);
        setField(term1389, term1389.getClass(), "propListHead", null);
        setIntField(term1389, term1389.getClass(), "sourcePosition", 0);
        setField(term1389, term1389.getClass(), "jsType", null);
        setField(term1389, term1389.getClass(), "parent", null);
        setField(term1372, term1372.getClass(), "last", term1389);
        setField(term1372, term1372.getClass(), "propListHead", null);
        setIntField(term1372, term1372.getClass(), "sourcePosition", 0);
        setField(term1372, term1372.getClass(), "jsType", null);
        setField(term1372, term1372.getClass(), "parent", null);
        term11392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11392, term11392.getClass(), "type", -706253892);
        setIntField(term11393, term11393.getClass(), "type", -1244386281);
        setIntField(term11394, term11394.getClass(), "type", 0);
        setField(term11394, term11394.getClass(), "next", null);
        setField(term11394, term11394.getClass(), "first", null);
        setField(term11394, term11394.getClass(), "last", null);
        setField(term11394, term11394.getClass(), "propListHead", null);
        setIntField(term11394, term11394.getClass(), "sourcePosition", 0);
        setField(term11394, term11394.getClass(), "jsType", null);
        setField(term11394, term11394.getClass(), "parent", null);
        setField(term11393, term11393.getClass(), "next", term11394);
        setIntField(term11395, term11395.getClass(), "type", 0);
        setField(term11395, term11395.getClass(), "next", null);
        setField(term11395, term11395.getClass(), "first", null);
        setField(term11395, term11395.getClass(), "last", null);
        setField(term11395, term11395.getClass(), "propListHead", null);
        setIntField(term11395, term11395.getClass(), "sourcePosition", 0);
        setField(term11395, term11395.getClass(), "jsType", null);
        setField(term11395, term11395.getClass(), "parent", null);
        setField(term11393, term11393.getClass(), "first", term11395);
        setIntField(term11396, term11396.getClass(), "type", 0);
        setField(term11396, term11396.getClass(), "next", null);
        setField(term11396, term11396.getClass(), "first", null);
        setField(term11396, term11396.getClass(), "last", null);
        setField(term11396, term11396.getClass(), "propListHead", null);
        setIntField(term11396, term11396.getClass(), "sourcePosition", 0);
        setField(term11396, term11396.getClass(), "jsType", null);
        setField(term11396, term11396.getClass(), "parent", null);
        setField(term11393, term11393.getClass(), "last", term11396);
        setField(term11393, term11393.getClass(), "propListHead", null);
        setIntField(term11393, term11393.getClass(), "sourcePosition", 0);
        setField(term11393, term11393.getClass(), "jsType", null);
        setField(term11393, term11393.getClass(), "parent", null);
        setField(term11392, term11392.getClass(), "next", term11393);
        setIntField(term11397, term11397.getClass(), "type", 0);
        setField(term11397, term11397.getClass(), "next", null);
        setField(term11397, term11397.getClass(), "first", null);
        setField(term11397, term11397.getClass(), "last", null);
        setField(term11397, term11397.getClass(), "propListHead", null);
        setIntField(term11397, term11397.getClass(), "sourcePosition", 0);
        setField(term11397, term11397.getClass(), "jsType", null);
        setField(term11397, term11397.getClass(), "parent", null);
        setField(term11392, term11392.getClass(), "first", term11397);
        setIntField(term11398, term11398.getClass(), "type", 0);
        setField(term11398, term11398.getClass(), "next", null);
        setField(term11398, term11398.getClass(), "first", null);
        setField(term11398, term11398.getClass(), "last", null);
        setField(term11398, term11398.getClass(), "propListHead", null);
        setIntField(term11398, term11398.getClass(), "sourcePosition", 0);
        setField(term11398, term11398.getClass(), "jsType", null);
        setField(term11398, term11398.getClass(), "parent", null);
        setField(term11392, term11392.getClass(), "last", term11398);
        setField(term11392, term11392.getClass(), "propListHead", null);
        setIntField(term11392, term11392.getClass(), "sourcePosition", 0);
        setField(term11392, term11392.getClass(), "jsType", null);
        setField(term11392, term11392.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1372;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1372, term11392));
        assertTrue(recursiveEquals(retValue, false));
    }

};


