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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;
     Object term8650;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term604, term604.getClass(), "type", -1183353915);
        setIntField(term606, term606.getClass(), "type", 49950830);
        setIntField(term608, term608.getClass(), "type", 0);
        setField(term608, term608.getClass(), "next", null);
        setField(term608, term608.getClass(), "first", null);
        setField(term608, term608.getClass(), "last", null);
        setField(term608, term608.getClass(), "propListHead", null);
        setIntField(term608, term608.getClass(), "sourcePosition", 0);
        setField(term608, term608.getClass(), "jsType", null);
        setField(term608, term608.getClass(), "parent", null);
        setField(term606, term606.getClass(), "next", term608);
        setIntField(term611, term611.getClass(), "type", 0);
        setField(term611, term611.getClass(), "next", null);
        setField(term611, term611.getClass(), "first", null);
        setField(term611, term611.getClass(), "last", null);
        setField(term611, term611.getClass(), "propListHead", null);
        setIntField(term611, term611.getClass(), "sourcePosition", 0);
        setField(term611, term611.getClass(), "jsType", null);
        setField(term611, term611.getClass(), "parent", null);
        setField(term606, term606.getClass(), "first", term611);
        setIntField(term614, term614.getClass(), "type", 0);
        setField(term614, term614.getClass(), "next", null);
        setField(term614, term614.getClass(), "first", null);
        setField(term614, term614.getClass(), "last", null);
        setField(term614, term614.getClass(), "propListHead", null);
        setIntField(term614, term614.getClass(), "sourcePosition", 0);
        setField(term614, term614.getClass(), "jsType", null);
        setField(term614, term614.getClass(), "parent", null);
        setField(term606, term606.getClass(), "last", term614);
        setField(term606, term606.getClass(), "propListHead", null);
        setIntField(term606, term606.getClass(), "sourcePosition", 0);
        setField(term606, term606.getClass(), "jsType", null);
        setField(term606, term606.getClass(), "parent", null);
        setField(term604, term604.getClass(), "next", term606);
        setIntField(term618, term618.getClass(), "type", 0);
        setField(term618, term618.getClass(), "next", null);
        setField(term618, term618.getClass(), "first", null);
        setField(term618, term618.getClass(), "last", null);
        setField(term618, term618.getClass(), "propListHead", null);
        setIntField(term618, term618.getClass(), "sourcePosition", 0);
        setField(term618, term618.getClass(), "jsType", null);
        setField(term618, term618.getClass(), "parent", null);
        setField(term604, term604.getClass(), "first", term618);
        setIntField(term621, term621.getClass(), "type", 0);
        setField(term621, term621.getClass(), "next", null);
        setField(term621, term621.getClass(), "first", null);
        setField(term621, term621.getClass(), "last", null);
        setField(term621, term621.getClass(), "propListHead", null);
        setIntField(term621, term621.getClass(), "sourcePosition", 0);
        setField(term621, term621.getClass(), "jsType", null);
        setField(term621, term621.getClass(), "parent", null);
        setField(term604, term604.getClass(), "last", term621);
        setField(term604, term604.getClass(), "propListHead", null);
        setIntField(term604, term604.getClass(), "sourcePosition", 0);
        setField(term604, term604.getClass(), "jsType", null);
        setField(term604, term604.getClass(), "parent", null);
        term8650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8650, term8650.getClass(), "type", -1183353915);
        setIntField(term8651, term8651.getClass(), "type", 49950830);
        setIntField(term8652, term8652.getClass(), "type", 0);
        setField(term8652, term8652.getClass(), "next", null);
        setField(term8652, term8652.getClass(), "first", null);
        setField(term8652, term8652.getClass(), "last", null);
        setField(term8652, term8652.getClass(), "propListHead", null);
        setIntField(term8652, term8652.getClass(), "sourcePosition", 0);
        setField(term8652, term8652.getClass(), "jsType", null);
        setField(term8652, term8652.getClass(), "parent", null);
        setField(term8651, term8651.getClass(), "next", term8652);
        setIntField(term8653, term8653.getClass(), "type", 0);
        setField(term8653, term8653.getClass(), "next", null);
        setField(term8653, term8653.getClass(), "first", null);
        setField(term8653, term8653.getClass(), "last", null);
        setField(term8653, term8653.getClass(), "propListHead", null);
        setIntField(term8653, term8653.getClass(), "sourcePosition", 0);
        setField(term8653, term8653.getClass(), "jsType", null);
        setField(term8653, term8653.getClass(), "parent", null);
        setField(term8651, term8651.getClass(), "first", term8653);
        setIntField(term8654, term8654.getClass(), "type", 0);
        setField(term8654, term8654.getClass(), "next", null);
        setField(term8654, term8654.getClass(), "first", null);
        setField(term8654, term8654.getClass(), "last", null);
        setField(term8654, term8654.getClass(), "propListHead", null);
        setIntField(term8654, term8654.getClass(), "sourcePosition", 0);
        setField(term8654, term8654.getClass(), "jsType", null);
        setField(term8654, term8654.getClass(), "parent", null);
        setField(term8651, term8651.getClass(), "last", term8654);
        setField(term8651, term8651.getClass(), "propListHead", null);
        setIntField(term8651, term8651.getClass(), "sourcePosition", 0);
        setField(term8651, term8651.getClass(), "jsType", null);
        setField(term8651, term8651.getClass(), "parent", null);
        setField(term8650, term8650.getClass(), "next", term8651);
        setIntField(term8655, term8655.getClass(), "type", 0);
        setField(term8655, term8655.getClass(), "next", null);
        setField(term8655, term8655.getClass(), "first", null);
        setField(term8655, term8655.getClass(), "last", null);
        setField(term8655, term8655.getClass(), "propListHead", null);
        setIntField(term8655, term8655.getClass(), "sourcePosition", 0);
        setField(term8655, term8655.getClass(), "jsType", null);
        setField(term8655, term8655.getClass(), "parent", null);
        setField(term8650, term8650.getClass(), "first", term8655);
        setIntField(term8656, term8656.getClass(), "type", 0);
        setField(term8656, term8656.getClass(), "next", null);
        setField(term8656, term8656.getClass(), "first", null);
        setField(term8656, term8656.getClass(), "last", null);
        setField(term8656, term8656.getClass(), "propListHead", null);
        setIntField(term8656, term8656.getClass(), "sourcePosition", 0);
        setField(term8656, term8656.getClass(), "jsType", null);
        setField(term8656, term8656.getClass(), "parent", null);
        setField(term8650, term8650.getClass(), "last", term8656);
        setField(term8650, term8650.getClass(), "propListHead", null);
        setIntField(term8650, term8650.getClass(), "sourcePosition", 0);
        setField(term8650, term8650.getClass(), "jsType", null);
        setField(term8650, term8650.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term604;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term604, term8650));
    }

};


