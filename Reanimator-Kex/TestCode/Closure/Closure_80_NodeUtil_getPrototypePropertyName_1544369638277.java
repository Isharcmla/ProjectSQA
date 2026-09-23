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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getPrototypePropertyName_1544369638277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3611;

    public NodeUtil_getPrototypePropertyName_1544369638277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3624 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3634 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3611, term3611.getClass(), "type", -44720365);
        setIntField(term3613, term3613.getClass(), "type", -815471632);
        setIntField(term3615, term3615.getClass(), "type", 0);
        setField(term3615, term3615.getClass(), "next", null);
        setField(term3615, term3615.getClass(), "first", null);
        setField(term3615, term3615.getClass(), "last", null);
        setField(term3615, term3615.getClass(), "propListHead", null);
        setIntField(term3615, term3615.getClass(), "sourcePosition", 0);
        setField(term3615, term3615.getClass(), "jsType", null);
        setField(term3615, term3615.getClass(), "parent", null);
        setField(term3613, term3613.getClass(), "next", term3615);
        setIntField(term3618, term3618.getClass(), "type", 0);
        setField(term3618, term3618.getClass(), "next", null);
        setField(term3618, term3618.getClass(), "first", null);
        setField(term3618, term3618.getClass(), "last", null);
        setField(term3618, term3618.getClass(), "propListHead", null);
        setIntField(term3618, term3618.getClass(), "sourcePosition", 0);
        setField(term3618, term3618.getClass(), "jsType", null);
        setField(term3618, term3618.getClass(), "parent", null);
        setField(term3613, term3613.getClass(), "first", term3618);
        setIntField(term3621, term3621.getClass(), "type", 0);
        setField(term3621, term3621.getClass(), "next", null);
        setField(term3621, term3621.getClass(), "first", null);
        setField(term3621, term3621.getClass(), "last", null);
        setField(term3621, term3621.getClass(), "propListHead", null);
        setIntField(term3621, term3621.getClass(), "sourcePosition", 0);
        setField(term3621, term3621.getClass(), "jsType", null);
        setField(term3621, term3621.getClass(), "parent", null);
        setField(term3613, term3613.getClass(), "last", term3621);
        setField(term3624, term3624.getClass(), "next", null);
        setIntField(term3624, term3624.getClass(), "type", 0);
        setIntField(term3624, term3624.getClass(), "intValue", 0);
        setField(term3624, term3624.getClass(), "objectValue", null);
        setField(term3613, term3613.getClass(), "propListHead", term3624);
        setIntField(term3613, term3613.getClass(), "sourcePosition", -945759470);
        setField(term3613, term3613.getClass(), "jsType", null);
        setField(term3613, term3613.getClass(), "parent", null);
        setField(term3611, term3611.getClass(), "next", term3613);
        setIntField(term3628, term3628.getClass(), "type", 0);
        setField(term3628, term3628.getClass(), "next", null);
        setField(term3628, term3628.getClass(), "first", null);
        setField(term3628, term3628.getClass(), "last", null);
        setField(term3628, term3628.getClass(), "propListHead", null);
        setIntField(term3628, term3628.getClass(), "sourcePosition", 0);
        setField(term3628, term3628.getClass(), "jsType", null);
        setField(term3628, term3628.getClass(), "parent", null);
        setField(term3611, term3611.getClass(), "first", term3628);
        setIntField(term3631, term3631.getClass(), "type", 0);
        setField(term3631, term3631.getClass(), "next", null);
        setField(term3631, term3631.getClass(), "first", null);
        setField(term3631, term3631.getClass(), "last", null);
        setField(term3631, term3631.getClass(), "propListHead", null);
        setIntField(term3631, term3631.getClass(), "sourcePosition", 0);
        setField(term3631, term3631.getClass(), "jsType", null);
        setField(term3631, term3631.getClass(), "parent", null);
        setField(term3611, term3611.getClass(), "last", term3631);
        setField(term3634, term3634.getClass(), "next", null);
        setIntField(term3634, term3634.getClass(), "type", 0);
        setIntField(term3634, term3634.getClass(), "intValue", 0);
        setField(term3634, term3634.getClass(), "objectValue", null);
        setField(term3611, term3611.getClass(), "propListHead", term3634);
        setIntField(term3611, term3611.getClass(), "sourcePosition", 657342039);
        setField(term3611, term3611.getClass(), "jsType", null);
        setField(term3611, term3611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3611;
        try {
            callMethod(klass, "getPrototypePropertyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


