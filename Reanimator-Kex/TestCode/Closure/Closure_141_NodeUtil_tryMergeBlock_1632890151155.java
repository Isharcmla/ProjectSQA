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

public class NodeUtil_tryMergeBlock_1632890151155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;

    public NodeUtil_tryMergeBlock_1632890151155() {
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1381;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


