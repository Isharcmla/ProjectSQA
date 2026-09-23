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

public class NodeUtil_isControlStructureCodeBlock_763580606224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1393;
     Object term1414;

    public NodeUtil_isControlStructureCodeBlock_763580606224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1393, term1393.getClass(), "type", -1518419301);
        setIntField(term1395, term1395.getClass(), "type", -1698809299);
        setIntField(term1397, term1397.getClass(), "type", 0);
        setField(term1397, term1397.getClass(), "next", null);
        setField(term1397, term1397.getClass(), "first", null);
        setField(term1397, term1397.getClass(), "last", null);
        setField(term1397, term1397.getClass(), "propListHead", null);
        setIntField(term1397, term1397.getClass(), "sourcePosition", 0);
        setField(term1397, term1397.getClass(), "jsType", null);
        setField(term1397, term1397.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "next", term1397);
        setIntField(term1400, term1400.getClass(), "type", 0);
        setField(term1400, term1400.getClass(), "next", null);
        setField(term1400, term1400.getClass(), "first", null);
        setField(term1400, term1400.getClass(), "last", null);
        setField(term1400, term1400.getClass(), "propListHead", null);
        setIntField(term1400, term1400.getClass(), "sourcePosition", 0);
        setField(term1400, term1400.getClass(), "jsType", null);
        setField(term1400, term1400.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "first", term1400);
        setIntField(term1403, term1403.getClass(), "type", 0);
        setField(term1403, term1403.getClass(), "next", null);
        setField(term1403, term1403.getClass(), "first", null);
        setField(term1403, term1403.getClass(), "last", null);
        setField(term1403, term1403.getClass(), "propListHead", null);
        setIntField(term1403, term1403.getClass(), "sourcePosition", 0);
        setField(term1403, term1403.getClass(), "jsType", null);
        setField(term1403, term1403.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "last", term1403);
        setField(term1395, term1395.getClass(), "propListHead", null);
        setIntField(term1395, term1395.getClass(), "sourcePosition", 0);
        setField(term1395, term1395.getClass(), "jsType", null);
        setField(term1395, term1395.getClass(), "parent", null);
        setField(term1393, term1393.getClass(), "next", term1395);
        setIntField(term1407, term1407.getClass(), "type", 0);
        setField(term1407, term1407.getClass(), "next", null);
        setField(term1407, term1407.getClass(), "first", null);
        setField(term1407, term1407.getClass(), "last", null);
        setField(term1407, term1407.getClass(), "propListHead", null);
        setIntField(term1407, term1407.getClass(), "sourcePosition", 0);
        setField(term1407, term1407.getClass(), "jsType", null);
        setField(term1407, term1407.getClass(), "parent", null);
        setField(term1393, term1393.getClass(), "first", term1407);
        setIntField(term1410, term1410.getClass(), "type", 0);
        setField(term1410, term1410.getClass(), "next", null);
        setField(term1410, term1410.getClass(), "first", null);
        setField(term1410, term1410.getClass(), "last", null);
        setField(term1410, term1410.getClass(), "propListHead", null);
        setIntField(term1410, term1410.getClass(), "sourcePosition", 0);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1393, term1393.getClass(), "last", term1410);
        setField(term1393, term1393.getClass(), "propListHead", null);
        setIntField(term1393, term1393.getClass(), "sourcePosition", 0);
        setField(term1393, term1393.getClass(), "jsType", null);
        setField(term1393, term1393.getClass(), "parent", null);
        term1414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1414, term1414.getClass(), "type", 178847646);
        setIntField(term1416, term1416.getClass(), "type", -838848221);
        setIntField(term1418, term1418.getClass(), "type", 0);
        setField(term1418, term1418.getClass(), "next", null);
        setField(term1418, term1418.getClass(), "first", null);
        setField(term1418, term1418.getClass(), "last", null);
        setField(term1418, term1418.getClass(), "propListHead", null);
        setIntField(term1418, term1418.getClass(), "sourcePosition", 0);
        setField(term1418, term1418.getClass(), "jsType", null);
        setField(term1418, term1418.getClass(), "parent", null);
        setField(term1416, term1416.getClass(), "next", term1418);
        setIntField(term1421, term1421.getClass(), "type", 0);
        setField(term1421, term1421.getClass(), "next", null);
        setField(term1421, term1421.getClass(), "first", null);
        setField(term1421, term1421.getClass(), "last", null);
        setField(term1421, term1421.getClass(), "propListHead", null);
        setIntField(term1421, term1421.getClass(), "sourcePosition", 0);
        setField(term1421, term1421.getClass(), "jsType", null);
        setField(term1421, term1421.getClass(), "parent", null);
        setField(term1416, term1416.getClass(), "first", term1421);
        setIntField(term1424, term1424.getClass(), "type", 0);
        setField(term1424, term1424.getClass(), "next", null);
        setField(term1424, term1424.getClass(), "first", null);
        setField(term1424, term1424.getClass(), "last", null);
        setField(term1424, term1424.getClass(), "propListHead", null);
        setIntField(term1424, term1424.getClass(), "sourcePosition", 0);
        setField(term1424, term1424.getClass(), "jsType", null);
        setField(term1424, term1424.getClass(), "parent", null);
        setField(term1416, term1416.getClass(), "last", term1424);
        setField(term1416, term1416.getClass(), "propListHead", null);
        setIntField(term1416, term1416.getClass(), "sourcePosition", 0);
        setField(term1416, term1416.getClass(), "jsType", null);
        setField(term1416, term1416.getClass(), "parent", null);
        setField(term1414, term1414.getClass(), "next", term1416);
        setIntField(term1428, term1428.getClass(), "type", 0);
        setField(term1428, term1428.getClass(), "next", null);
        setField(term1428, term1428.getClass(), "first", null);
        setField(term1428, term1428.getClass(), "last", null);
        setField(term1428, term1428.getClass(), "propListHead", null);
        setIntField(term1428, term1428.getClass(), "sourcePosition", 0);
        setField(term1428, term1428.getClass(), "jsType", null);
        setField(term1428, term1428.getClass(), "parent", null);
        setField(term1414, term1414.getClass(), "first", term1428);
        setIntField(term1431, term1431.getClass(), "type", 0);
        setField(term1431, term1431.getClass(), "next", null);
        setField(term1431, term1431.getClass(), "first", null);
        setField(term1431, term1431.getClass(), "last", null);
        setField(term1431, term1431.getClass(), "propListHead", null);
        setIntField(term1431, term1431.getClass(), "sourcePosition", 0);
        setField(term1431, term1431.getClass(), "jsType", null);
        setField(term1431, term1431.getClass(), "parent", null);
        setField(term1414, term1414.getClass(), "last", term1431);
        setField(term1414, term1414.getClass(), "propListHead", null);
        setIntField(term1414, term1414.getClass(), "sourcePosition", 0);
        setField(term1414, term1414.getClass(), "jsType", null);
        setField(term1414, term1414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1393;
        args[1] = term1414;
        try {
            callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


