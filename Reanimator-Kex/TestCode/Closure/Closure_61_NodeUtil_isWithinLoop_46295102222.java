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

public class NodeUtil_isWithinLoop_46295102222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1351;
     Object term11361;

    public NodeUtil_isWithinLoop_46295102222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1351, term1351.getClass(), "type", -457396133);
        setIntField(term1353, term1353.getClass(), "type", 1981860404);
        setIntField(term1355, term1355.getClass(), "type", 0);
        setField(term1355, term1355.getClass(), "next", null);
        setField(term1355, term1355.getClass(), "first", null);
        setField(term1355, term1355.getClass(), "last", null);
        setField(term1355, term1355.getClass(), "propListHead", null);
        setIntField(term1355, term1355.getClass(), "sourcePosition", 0);
        setField(term1355, term1355.getClass(), "jsType", null);
        setField(term1355, term1355.getClass(), "parent", null);
        setField(term1353, term1353.getClass(), "next", term1355);
        setIntField(term1358, term1358.getClass(), "type", 0);
        setField(term1358, term1358.getClass(), "next", null);
        setField(term1358, term1358.getClass(), "first", null);
        setField(term1358, term1358.getClass(), "last", null);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 0);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1353, term1353.getClass(), "first", term1358);
        setIntField(term1361, term1361.getClass(), "type", 0);
        setField(term1361, term1361.getClass(), "next", null);
        setField(term1361, term1361.getClass(), "first", null);
        setField(term1361, term1361.getClass(), "last", null);
        setField(term1361, term1361.getClass(), "propListHead", null);
        setIntField(term1361, term1361.getClass(), "sourcePosition", 0);
        setField(term1361, term1361.getClass(), "jsType", null);
        setField(term1361, term1361.getClass(), "parent", null);
        setField(term1353, term1353.getClass(), "last", term1361);
        setField(term1353, term1353.getClass(), "propListHead", null);
        setIntField(term1353, term1353.getClass(), "sourcePosition", 0);
        setField(term1353, term1353.getClass(), "jsType", null);
        setField(term1353, term1353.getClass(), "parent", null);
        setField(term1351, term1351.getClass(), "next", term1353);
        setIntField(term1365, term1365.getClass(), "type", 0);
        setField(term1365, term1365.getClass(), "next", null);
        setField(term1365, term1365.getClass(), "first", null);
        setField(term1365, term1365.getClass(), "last", null);
        setField(term1365, term1365.getClass(), "propListHead", null);
        setIntField(term1365, term1365.getClass(), "sourcePosition", 0);
        setField(term1365, term1365.getClass(), "jsType", null);
        setField(term1365, term1365.getClass(), "parent", null);
        setField(term1351, term1351.getClass(), "first", term1365);
        setIntField(term1368, term1368.getClass(), "type", 0);
        setField(term1368, term1368.getClass(), "next", null);
        setField(term1368, term1368.getClass(), "first", null);
        setField(term1368, term1368.getClass(), "last", null);
        setField(term1368, term1368.getClass(), "propListHead", null);
        setIntField(term1368, term1368.getClass(), "sourcePosition", 0);
        setField(term1368, term1368.getClass(), "jsType", null);
        setField(term1368, term1368.getClass(), "parent", null);
        setField(term1351, term1351.getClass(), "last", term1368);
        setField(term1351, term1351.getClass(), "propListHead", null);
        setIntField(term1351, term1351.getClass(), "sourcePosition", 0);
        setField(term1351, term1351.getClass(), "jsType", null);
        setField(term1351, term1351.getClass(), "parent", null);
        term11361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11361, term11361.getClass(), "type", -457396133);
        setIntField(term11362, term11362.getClass(), "type", 1981860404);
        setIntField(term11363, term11363.getClass(), "type", 0);
        setField(term11363, term11363.getClass(), "next", null);
        setField(term11363, term11363.getClass(), "first", null);
        setField(term11363, term11363.getClass(), "last", null);
        setField(term11363, term11363.getClass(), "propListHead", null);
        setIntField(term11363, term11363.getClass(), "sourcePosition", 0);
        setField(term11363, term11363.getClass(), "jsType", null);
        setField(term11363, term11363.getClass(), "parent", null);
        setField(term11362, term11362.getClass(), "next", term11363);
        setIntField(term11364, term11364.getClass(), "type", 0);
        setField(term11364, term11364.getClass(), "next", null);
        setField(term11364, term11364.getClass(), "first", null);
        setField(term11364, term11364.getClass(), "last", null);
        setField(term11364, term11364.getClass(), "propListHead", null);
        setIntField(term11364, term11364.getClass(), "sourcePosition", 0);
        setField(term11364, term11364.getClass(), "jsType", null);
        setField(term11364, term11364.getClass(), "parent", null);
        setField(term11362, term11362.getClass(), "first", term11364);
        setIntField(term11365, term11365.getClass(), "type", 0);
        setField(term11365, term11365.getClass(), "next", null);
        setField(term11365, term11365.getClass(), "first", null);
        setField(term11365, term11365.getClass(), "last", null);
        setField(term11365, term11365.getClass(), "propListHead", null);
        setIntField(term11365, term11365.getClass(), "sourcePosition", 0);
        setField(term11365, term11365.getClass(), "jsType", null);
        setField(term11365, term11365.getClass(), "parent", null);
        setField(term11362, term11362.getClass(), "last", term11365);
        setField(term11362, term11362.getClass(), "propListHead", null);
        setIntField(term11362, term11362.getClass(), "sourcePosition", 0);
        setField(term11362, term11362.getClass(), "jsType", null);
        setField(term11362, term11362.getClass(), "parent", null);
        setField(term11361, term11361.getClass(), "next", term11362);
        setIntField(term11366, term11366.getClass(), "type", 0);
        setField(term11366, term11366.getClass(), "next", null);
        setField(term11366, term11366.getClass(), "first", null);
        setField(term11366, term11366.getClass(), "last", null);
        setField(term11366, term11366.getClass(), "propListHead", null);
        setIntField(term11366, term11366.getClass(), "sourcePosition", 0);
        setField(term11366, term11366.getClass(), "jsType", null);
        setField(term11366, term11366.getClass(), "parent", null);
        setField(term11361, term11361.getClass(), "first", term11366);
        setIntField(term11367, term11367.getClass(), "type", 0);
        setField(term11367, term11367.getClass(), "next", null);
        setField(term11367, term11367.getClass(), "first", null);
        setField(term11367, term11367.getClass(), "last", null);
        setField(term11367, term11367.getClass(), "propListHead", null);
        setIntField(term11367, term11367.getClass(), "sourcePosition", 0);
        setField(term11367, term11367.getClass(), "jsType", null);
        setField(term11367, term11367.getClass(), "parent", null);
        setField(term11361, term11361.getClass(), "last", term11367);
        setField(term11361, term11361.getClass(), "propListHead", null);
        setIntField(term11361, term11361.getClass(), "sourcePosition", 0);
        setField(term11361, term11361.getClass(), "jsType", null);
        setField(term11361, term11361.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1351;
        Object retValue = callMethod(klass, "isWithinLoop", argTypes, null, args);
        assertTrue(recursiveEquals(term1351, term11361));
        assertTrue(recursiveEquals(retValue, false));
    }

};


