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

public class NodeUtil_isPrototypeProperty_1449633110275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3557;
     Object term20800;

    public NodeUtil_isPrototypeProperty_1449633110275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3570 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3580 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3557, term3557.getClass(), "type", 1432187207);
        setIntField(term3559, term3559.getClass(), "type", -134092543);
        setIntField(term3561, term3561.getClass(), "type", 0);
        setField(term3561, term3561.getClass(), "next", null);
        setField(term3561, term3561.getClass(), "first", null);
        setField(term3561, term3561.getClass(), "last", null);
        setField(term3561, term3561.getClass(), "propListHead", null);
        setIntField(term3561, term3561.getClass(), "sourcePosition", 0);
        setField(term3561, term3561.getClass(), "jsType", null);
        setField(term3561, term3561.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "next", term3561);
        setIntField(term3564, term3564.getClass(), "type", 0);
        setField(term3564, term3564.getClass(), "next", null);
        setField(term3564, term3564.getClass(), "first", null);
        setField(term3564, term3564.getClass(), "last", null);
        setField(term3564, term3564.getClass(), "propListHead", null);
        setIntField(term3564, term3564.getClass(), "sourcePosition", 0);
        setField(term3564, term3564.getClass(), "jsType", null);
        setField(term3564, term3564.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "first", term3564);
        setIntField(term3567, term3567.getClass(), "type", 0);
        setField(term3567, term3567.getClass(), "next", null);
        setField(term3567, term3567.getClass(), "first", null);
        setField(term3567, term3567.getClass(), "last", null);
        setField(term3567, term3567.getClass(), "propListHead", null);
        setIntField(term3567, term3567.getClass(), "sourcePosition", 0);
        setField(term3567, term3567.getClass(), "jsType", null);
        setField(term3567, term3567.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "last", term3567);
        setField(term3570, term3570.getClass(), "next", null);
        setIntField(term3570, term3570.getClass(), "type", 0);
        setIntField(term3570, term3570.getClass(), "intValue", 0);
        setField(term3570, term3570.getClass(), "objectValue", null);
        setField(term3559, term3559.getClass(), "propListHead", term3570);
        setIntField(term3559, term3559.getClass(), "sourcePosition", 2092881418);
        setField(term3559, term3559.getClass(), "jsType", null);
        setField(term3559, term3559.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "next", term3559);
        setIntField(term3574, term3574.getClass(), "type", 0);
        setField(term3574, term3574.getClass(), "next", null);
        setField(term3574, term3574.getClass(), "first", null);
        setField(term3574, term3574.getClass(), "last", null);
        setField(term3574, term3574.getClass(), "propListHead", null);
        setIntField(term3574, term3574.getClass(), "sourcePosition", 0);
        setField(term3574, term3574.getClass(), "jsType", null);
        setField(term3574, term3574.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "first", term3574);
        setIntField(term3577, term3577.getClass(), "type", 0);
        setField(term3577, term3577.getClass(), "next", null);
        setField(term3577, term3577.getClass(), "first", null);
        setField(term3577, term3577.getClass(), "last", null);
        setField(term3577, term3577.getClass(), "propListHead", null);
        setIntField(term3577, term3577.getClass(), "sourcePosition", 0);
        setField(term3577, term3577.getClass(), "jsType", null);
        setField(term3577, term3577.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "last", term3577);
        setField(term3580, term3580.getClass(), "next", null);
        setIntField(term3580, term3580.getClass(), "type", 0);
        setIntField(term3580, term3580.getClass(), "intValue", 0);
        setField(term3580, term3580.getClass(), "objectValue", null);
        setField(term3557, term3557.getClass(), "propListHead", term3580);
        setIntField(term3557, term3557.getClass(), "sourcePosition", 1732410866);
        setField(term3557, term3557.getClass(), "jsType", null);
        setField(term3557, term3557.getClass(), "parent", null);
        term20800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20805 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20808 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20800, term20800.getClass(), "type", 1432187207);
        setIntField(term20801, term20801.getClass(), "type", -134092543);
        setIntField(term20802, term20802.getClass(), "type", 0);
        setField(term20802, term20802.getClass(), "next", null);
        setField(term20802, term20802.getClass(), "first", null);
        setField(term20802, term20802.getClass(), "last", null);
        setField(term20802, term20802.getClass(), "propListHead", null);
        setIntField(term20802, term20802.getClass(), "sourcePosition", 0);
        setField(term20802, term20802.getClass(), "jsType", null);
        setField(term20802, term20802.getClass(), "parent", null);
        setField(term20801, term20801.getClass(), "next", term20802);
        setIntField(term20803, term20803.getClass(), "type", 0);
        setField(term20803, term20803.getClass(), "next", null);
        setField(term20803, term20803.getClass(), "first", null);
        setField(term20803, term20803.getClass(), "last", null);
        setField(term20803, term20803.getClass(), "propListHead", null);
        setIntField(term20803, term20803.getClass(), "sourcePosition", 0);
        setField(term20803, term20803.getClass(), "jsType", null);
        setField(term20803, term20803.getClass(), "parent", null);
        setField(term20801, term20801.getClass(), "first", term20803);
        setIntField(term20804, term20804.getClass(), "type", 0);
        setField(term20804, term20804.getClass(), "next", null);
        setField(term20804, term20804.getClass(), "first", null);
        setField(term20804, term20804.getClass(), "last", null);
        setField(term20804, term20804.getClass(), "propListHead", null);
        setIntField(term20804, term20804.getClass(), "sourcePosition", 0);
        setField(term20804, term20804.getClass(), "jsType", null);
        setField(term20804, term20804.getClass(), "parent", null);
        setField(term20801, term20801.getClass(), "last", term20804);
        setField(term20805, term20805.getClass(), "next", null);
        setIntField(term20805, term20805.getClass(), "type", 0);
        setIntField(term20805, term20805.getClass(), "intValue", 0);
        setField(term20805, term20805.getClass(), "objectValue", null);
        setField(term20801, term20801.getClass(), "propListHead", term20805);
        setIntField(term20801, term20801.getClass(), "sourcePosition", 2092881418);
        setField(term20801, term20801.getClass(), "jsType", null);
        setField(term20801, term20801.getClass(), "parent", null);
        setField(term20800, term20800.getClass(), "next", term20801);
        setIntField(term20806, term20806.getClass(), "type", 0);
        setField(term20806, term20806.getClass(), "next", null);
        setField(term20806, term20806.getClass(), "first", null);
        setField(term20806, term20806.getClass(), "last", null);
        setField(term20806, term20806.getClass(), "propListHead", null);
        setIntField(term20806, term20806.getClass(), "sourcePosition", 0);
        setField(term20806, term20806.getClass(), "jsType", null);
        setField(term20806, term20806.getClass(), "parent", null);
        setField(term20800, term20800.getClass(), "first", term20806);
        setIntField(term20807, term20807.getClass(), "type", 0);
        setField(term20807, term20807.getClass(), "next", null);
        setField(term20807, term20807.getClass(), "first", null);
        setField(term20807, term20807.getClass(), "last", null);
        setField(term20807, term20807.getClass(), "propListHead", null);
        setIntField(term20807, term20807.getClass(), "sourcePosition", 0);
        setField(term20807, term20807.getClass(), "jsType", null);
        setField(term20807, term20807.getClass(), "parent", null);
        setField(term20800, term20800.getClass(), "last", term20807);
        setField(term20808, term20808.getClass(), "next", null);
        setIntField(term20808, term20808.getClass(), "type", 0);
        setIntField(term20808, term20808.getClass(), "intValue", 0);
        setField(term20808, term20808.getClass(), "objectValue", null);
        setField(term20800, term20800.getClass(), "propListHead", term20808);
        setIntField(term20800, term20800.getClass(), "sourcePosition", 1732410866);
        setField(term20800, term20800.getClass(), "jsType", null);
        setField(term20800, term20800.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3557;
        Object retValue = callMethod(klass, "isPrototypeProperty", argTypes, null, args);
        assertTrue(recursiveEquals(term3557, term20800));
        assertTrue(recursiveEquals(retValue, false));
    }

};


