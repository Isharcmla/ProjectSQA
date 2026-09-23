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

public class NodeUtil_isLabelName_1609672670231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561;
     Object term12420;

    public NodeUtil_isLabelName_1609672670231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1561, term1561.getClass(), "type", -1630069454);
        setIntField(term1563, term1563.getClass(), "type", 1038029515);
        setIntField(term1565, term1565.getClass(), "type", 0);
        setField(term1565, term1565.getClass(), "next", null);
        setField(term1565, term1565.getClass(), "first", null);
        setField(term1565, term1565.getClass(), "last", null);
        setField(term1565, term1565.getClass(), "propListHead", null);
        setIntField(term1565, term1565.getClass(), "sourcePosition", 0);
        setField(term1565, term1565.getClass(), "jsType", null);
        setField(term1565, term1565.getClass(), "parent", null);
        setField(term1563, term1563.getClass(), "next", term1565);
        setIntField(term1568, term1568.getClass(), "type", 0);
        setField(term1568, term1568.getClass(), "next", null);
        setField(term1568, term1568.getClass(), "first", null);
        setField(term1568, term1568.getClass(), "last", null);
        setField(term1568, term1568.getClass(), "propListHead", null);
        setIntField(term1568, term1568.getClass(), "sourcePosition", 0);
        setField(term1568, term1568.getClass(), "jsType", null);
        setField(term1568, term1568.getClass(), "parent", null);
        setField(term1563, term1563.getClass(), "first", term1568);
        setIntField(term1571, term1571.getClass(), "type", 0);
        setField(term1571, term1571.getClass(), "next", null);
        setField(term1571, term1571.getClass(), "first", null);
        setField(term1571, term1571.getClass(), "last", null);
        setField(term1571, term1571.getClass(), "propListHead", null);
        setIntField(term1571, term1571.getClass(), "sourcePosition", 0);
        setField(term1571, term1571.getClass(), "jsType", null);
        setField(term1571, term1571.getClass(), "parent", null);
        setField(term1563, term1563.getClass(), "last", term1571);
        setField(term1563, term1563.getClass(), "propListHead", null);
        setIntField(term1563, term1563.getClass(), "sourcePosition", 0);
        setField(term1563, term1563.getClass(), "jsType", null);
        setField(term1563, term1563.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "next", term1563);
        setIntField(term1575, term1575.getClass(), "type", 0);
        setField(term1575, term1575.getClass(), "next", null);
        setField(term1575, term1575.getClass(), "first", null);
        setField(term1575, term1575.getClass(), "last", null);
        setField(term1575, term1575.getClass(), "propListHead", null);
        setIntField(term1575, term1575.getClass(), "sourcePosition", 0);
        setField(term1575, term1575.getClass(), "jsType", null);
        setField(term1575, term1575.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "first", term1575);
        setIntField(term1578, term1578.getClass(), "type", 0);
        setField(term1578, term1578.getClass(), "next", null);
        setField(term1578, term1578.getClass(), "first", null);
        setField(term1578, term1578.getClass(), "last", null);
        setField(term1578, term1578.getClass(), "propListHead", null);
        setIntField(term1578, term1578.getClass(), "sourcePosition", 0);
        setField(term1578, term1578.getClass(), "jsType", null);
        setField(term1578, term1578.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "last", term1578);
        setField(term1561, term1561.getClass(), "propListHead", null);
        setIntField(term1561, term1561.getClass(), "sourcePosition", 0);
        setField(term1561, term1561.getClass(), "jsType", null);
        setField(term1561, term1561.getClass(), "parent", null);
        term12420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12420, term12420.getClass(), "type", -1630069454);
        setIntField(term12421, term12421.getClass(), "type", 1038029515);
        setIntField(term12422, term12422.getClass(), "type", 0);
        setField(term12422, term12422.getClass(), "next", null);
        setField(term12422, term12422.getClass(), "first", null);
        setField(term12422, term12422.getClass(), "last", null);
        setField(term12422, term12422.getClass(), "propListHead", null);
        setIntField(term12422, term12422.getClass(), "sourcePosition", 0);
        setField(term12422, term12422.getClass(), "jsType", null);
        setField(term12422, term12422.getClass(), "parent", null);
        setField(term12421, term12421.getClass(), "next", term12422);
        setIntField(term12423, term12423.getClass(), "type", 0);
        setField(term12423, term12423.getClass(), "next", null);
        setField(term12423, term12423.getClass(), "first", null);
        setField(term12423, term12423.getClass(), "last", null);
        setField(term12423, term12423.getClass(), "propListHead", null);
        setIntField(term12423, term12423.getClass(), "sourcePosition", 0);
        setField(term12423, term12423.getClass(), "jsType", null);
        setField(term12423, term12423.getClass(), "parent", null);
        setField(term12421, term12421.getClass(), "first", term12423);
        setIntField(term12424, term12424.getClass(), "type", 0);
        setField(term12424, term12424.getClass(), "next", null);
        setField(term12424, term12424.getClass(), "first", null);
        setField(term12424, term12424.getClass(), "last", null);
        setField(term12424, term12424.getClass(), "propListHead", null);
        setIntField(term12424, term12424.getClass(), "sourcePosition", 0);
        setField(term12424, term12424.getClass(), "jsType", null);
        setField(term12424, term12424.getClass(), "parent", null);
        setField(term12421, term12421.getClass(), "last", term12424);
        setField(term12421, term12421.getClass(), "propListHead", null);
        setIntField(term12421, term12421.getClass(), "sourcePosition", 0);
        setField(term12421, term12421.getClass(), "jsType", null);
        setField(term12421, term12421.getClass(), "parent", null);
        setField(term12420, term12420.getClass(), "next", term12421);
        setIntField(term12425, term12425.getClass(), "type", 0);
        setField(term12425, term12425.getClass(), "next", null);
        setField(term12425, term12425.getClass(), "first", null);
        setField(term12425, term12425.getClass(), "last", null);
        setField(term12425, term12425.getClass(), "propListHead", null);
        setIntField(term12425, term12425.getClass(), "sourcePosition", 0);
        setField(term12425, term12425.getClass(), "jsType", null);
        setField(term12425, term12425.getClass(), "parent", null);
        setField(term12420, term12420.getClass(), "first", term12425);
        setIntField(term12426, term12426.getClass(), "type", 0);
        setField(term12426, term12426.getClass(), "next", null);
        setField(term12426, term12426.getClass(), "first", null);
        setField(term12426, term12426.getClass(), "last", null);
        setField(term12426, term12426.getClass(), "propListHead", null);
        setIntField(term12426, term12426.getClass(), "sourcePosition", 0);
        setField(term12426, term12426.getClass(), "jsType", null);
        setField(term12426, term12426.getClass(), "parent", null);
        setField(term12420, term12420.getClass(), "last", term12426);
        setField(term12420, term12420.getClass(), "propListHead", null);
        setIntField(term12420, term12420.getClass(), "sourcePosition", 0);
        setField(term12420, term12420.getClass(), "jsType", null);
        setField(term12420, term12420.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1561;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1561, term12420));
        assertTrue(recursiveEquals(retValue, false));
    }

};


