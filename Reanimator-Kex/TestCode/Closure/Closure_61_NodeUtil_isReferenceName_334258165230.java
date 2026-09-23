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

public class NodeUtil_isReferenceName_334258165230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1540;
     Object term12387;

    public NodeUtil_isReferenceName_334258165230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1540, term1540.getClass(), "type", -751079123);
        setIntField(term1542, term1542.getClass(), "type", -1632929393);
        setIntField(term1544, term1544.getClass(), "type", 0);
        setField(term1544, term1544.getClass(), "next", null);
        setField(term1544, term1544.getClass(), "first", null);
        setField(term1544, term1544.getClass(), "last", null);
        setField(term1544, term1544.getClass(), "propListHead", null);
        setIntField(term1544, term1544.getClass(), "sourcePosition", 0);
        setField(term1544, term1544.getClass(), "jsType", null);
        setField(term1544, term1544.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "next", term1544);
        setIntField(term1547, term1547.getClass(), "type", 0);
        setField(term1547, term1547.getClass(), "next", null);
        setField(term1547, term1547.getClass(), "first", null);
        setField(term1547, term1547.getClass(), "last", null);
        setField(term1547, term1547.getClass(), "propListHead", null);
        setIntField(term1547, term1547.getClass(), "sourcePosition", 0);
        setField(term1547, term1547.getClass(), "jsType", null);
        setField(term1547, term1547.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "first", term1547);
        setIntField(term1550, term1550.getClass(), "type", 0);
        setField(term1550, term1550.getClass(), "next", null);
        setField(term1550, term1550.getClass(), "first", null);
        setField(term1550, term1550.getClass(), "last", null);
        setField(term1550, term1550.getClass(), "propListHead", null);
        setIntField(term1550, term1550.getClass(), "sourcePosition", 0);
        setField(term1550, term1550.getClass(), "jsType", null);
        setField(term1550, term1550.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "last", term1550);
        setField(term1542, term1542.getClass(), "propListHead", null);
        setIntField(term1542, term1542.getClass(), "sourcePosition", 0);
        setField(term1542, term1542.getClass(), "jsType", null);
        setField(term1542, term1542.getClass(), "parent", null);
        setField(term1540, term1540.getClass(), "next", term1542);
        setIntField(term1554, term1554.getClass(), "type", 0);
        setField(term1554, term1554.getClass(), "next", null);
        setField(term1554, term1554.getClass(), "first", null);
        setField(term1554, term1554.getClass(), "last", null);
        setField(term1554, term1554.getClass(), "propListHead", null);
        setIntField(term1554, term1554.getClass(), "sourcePosition", 0);
        setField(term1554, term1554.getClass(), "jsType", null);
        setField(term1554, term1554.getClass(), "parent", null);
        setField(term1540, term1540.getClass(), "first", term1554);
        setIntField(term1557, term1557.getClass(), "type", 0);
        setField(term1557, term1557.getClass(), "next", null);
        setField(term1557, term1557.getClass(), "first", null);
        setField(term1557, term1557.getClass(), "last", null);
        setField(term1557, term1557.getClass(), "propListHead", null);
        setIntField(term1557, term1557.getClass(), "sourcePosition", 0);
        setField(term1557, term1557.getClass(), "jsType", null);
        setField(term1557, term1557.getClass(), "parent", null);
        setField(term1540, term1540.getClass(), "last", term1557);
        setField(term1540, term1540.getClass(), "propListHead", null);
        setIntField(term1540, term1540.getClass(), "sourcePosition", 0);
        setField(term1540, term1540.getClass(), "jsType", null);
        setField(term1540, term1540.getClass(), "parent", null);
        term12387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12387, term12387.getClass(), "type", -751079123);
        setIntField(term12388, term12388.getClass(), "type", -1632929393);
        setIntField(term12389, term12389.getClass(), "type", 0);
        setField(term12389, term12389.getClass(), "next", null);
        setField(term12389, term12389.getClass(), "first", null);
        setField(term12389, term12389.getClass(), "last", null);
        setField(term12389, term12389.getClass(), "propListHead", null);
        setIntField(term12389, term12389.getClass(), "sourcePosition", 0);
        setField(term12389, term12389.getClass(), "jsType", null);
        setField(term12389, term12389.getClass(), "parent", null);
        setField(term12388, term12388.getClass(), "next", term12389);
        setIntField(term12390, term12390.getClass(), "type", 0);
        setField(term12390, term12390.getClass(), "next", null);
        setField(term12390, term12390.getClass(), "first", null);
        setField(term12390, term12390.getClass(), "last", null);
        setField(term12390, term12390.getClass(), "propListHead", null);
        setIntField(term12390, term12390.getClass(), "sourcePosition", 0);
        setField(term12390, term12390.getClass(), "jsType", null);
        setField(term12390, term12390.getClass(), "parent", null);
        setField(term12388, term12388.getClass(), "first", term12390);
        setIntField(term12391, term12391.getClass(), "type", 0);
        setField(term12391, term12391.getClass(), "next", null);
        setField(term12391, term12391.getClass(), "first", null);
        setField(term12391, term12391.getClass(), "last", null);
        setField(term12391, term12391.getClass(), "propListHead", null);
        setIntField(term12391, term12391.getClass(), "sourcePosition", 0);
        setField(term12391, term12391.getClass(), "jsType", null);
        setField(term12391, term12391.getClass(), "parent", null);
        setField(term12388, term12388.getClass(), "last", term12391);
        setField(term12388, term12388.getClass(), "propListHead", null);
        setIntField(term12388, term12388.getClass(), "sourcePosition", 0);
        setField(term12388, term12388.getClass(), "jsType", null);
        setField(term12388, term12388.getClass(), "parent", null);
        setField(term12387, term12387.getClass(), "next", term12388);
        setIntField(term12392, term12392.getClass(), "type", 0);
        setField(term12392, term12392.getClass(), "next", null);
        setField(term12392, term12392.getClass(), "first", null);
        setField(term12392, term12392.getClass(), "last", null);
        setField(term12392, term12392.getClass(), "propListHead", null);
        setIntField(term12392, term12392.getClass(), "sourcePosition", 0);
        setField(term12392, term12392.getClass(), "jsType", null);
        setField(term12392, term12392.getClass(), "parent", null);
        setField(term12387, term12387.getClass(), "first", term12392);
        setIntField(term12393, term12393.getClass(), "type", 0);
        setField(term12393, term12393.getClass(), "next", null);
        setField(term12393, term12393.getClass(), "first", null);
        setField(term12393, term12393.getClass(), "last", null);
        setField(term12393, term12393.getClass(), "propListHead", null);
        setIntField(term12393, term12393.getClass(), "sourcePosition", 0);
        setField(term12393, term12393.getClass(), "jsType", null);
        setField(term12393, term12393.getClass(), "parent", null);
        setField(term12387, term12387.getClass(), "last", term12393);
        setField(term12387, term12387.getClass(), "propListHead", null);
        setIntField(term12387, term12387.getClass(), "sourcePosition", 0);
        setField(term12387, term12387.getClass(), "jsType", null);
        setField(term12387, term12387.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1540;
        Object retValue = callMethod(klass, "isReferenceName", argTypes, null, args);
        assertTrue(recursiveEquals(term1540, term12387));
        assertTrue(recursiveEquals(retValue, false));
    }

};


