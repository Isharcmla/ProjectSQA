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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185760;
     Object term185852;
     Object term186082;
     Object term186083;
     Object term186050;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term185852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term185944, term185944.getClass(), "next", term186036);
        setIntField(term185944, term185944.getClass(), "type", 39);
        setField(term185852, term185852.getClass(), "first", term185944);
        setIntField(term185852, term185852.getClass(), "type", 24);
        term186082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term186082, term186082.getClass(), "currentTraversal", null);
        term186083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186084 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term186083, term186083.getClass(), "str", null);
        setIntField(term186083, term186083.getClass(), "type", 24);
        setField(term186083, term186083.getClass(), "next", null);
        setField(term186084, term186084.getClass(), "str", null);
        setIntField(term186084, term186084.getClass(), "type", 39);
        setDoubleField(term186085, term186085.getClass(), "number", 0.0);
        setIntField(term186085, term186085.getClass(), "type", 0);
        setField(term186085, term186085.getClass(), "next", null);
        setField(term186085, term186085.getClass(), "first", null);
        setField(term186085, term186085.getClass(), "last", null);
        setField(term186085, term186085.getClass(), "propListHead", null);
        setIntField(term186085, term186085.getClass(), "sourcePosition", 0);
        setField(term186085, term186085.getClass(), "jsType", null);
        setField(term186085, term186085.getClass(), "parent", null);
        setField(term186084, term186084.getClass(), "next", term186085);
        setField(term186084, term186084.getClass(), "first", null);
        setField(term186084, term186084.getClass(), "last", null);
        setField(term186084, term186084.getClass(), "propListHead", null);
        setIntField(term186084, term186084.getClass(), "sourcePosition", 0);
        setField(term186084, term186084.getClass(), "jsType", null);
        setField(term186084, term186084.getClass(), "parent", null);
        setField(term186083, term186083.getClass(), "first", term186084);
        setField(term186083, term186083.getClass(), "last", null);
        setField(term186083, term186083.getClass(), "propListHead", null);
        setIntField(term186083, term186083.getClass(), "sourcePosition", 0);
        setField(term186083, term186083.getClass(), "jsType", null);
        setField(term186083, term186083.getClass(), "parent", null);
        term186050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term186050, term186050.getClass(), "str", null);
        setIntField(term186050, term186050.getClass(), "type", 24);
        setField(term186050, term186050.getClass(), "next", null);
        setField(term186052, term186052.getClass(), "str", null);
        setIntField(term186052, term186052.getClass(), "type", 39);
        setDoubleField(term186054, term186054.getClass(), "number", 0.0);
        setIntField(term186054, term186054.getClass(), "type", 0);
        setField(term186054, term186054.getClass(), "next", null);
        setField(term186054, term186054.getClass(), "first", null);
        setField(term186054, term186054.getClass(), "last", null);
        setField(term186054, term186054.getClass(), "propListHead", null);
        setIntField(term186054, term186054.getClass(), "sourcePosition", 0);
        setField(term186054, term186054.getClass(), "jsType", null);
        setField(term186054, term186054.getClass(), "parent", null);
        setField(term186052, term186052.getClass(), "next", term186054);
        setField(term186052, term186052.getClass(), "first", null);
        setField(term186052, term186052.getClass(), "last", null);
        setField(term186052, term186052.getClass(), "propListHead", null);
        setIntField(term186052, term186052.getClass(), "sourcePosition", 0);
        setField(term186052, term186052.getClass(), "jsType", null);
        setField(term186052, term186052.getClass(), "parent", null);
        setField(term186050, term186050.getClass(), "first", term186052);
        setField(term186050, term186050.getClass(), "last", null);
        setField(term186050, term186050.getClass(), "propListHead", null);
        setIntField(term186050, term186050.getClass(), "sourcePosition", 0);
        setField(term186050, term186050.getClass(), "jsType", null);
        setField(term186050, term186050.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185852;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term185760, args);
        assertTrue(recursiveEquals(term185760, term186082));
        assertTrue(recursiveEquals(term185852, term186083));
        assertTrue(recursiveEquals(retValue, term186050));
    }

};


