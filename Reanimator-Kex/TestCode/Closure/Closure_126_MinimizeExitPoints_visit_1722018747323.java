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

public class MinimizeExitPoints_visit_1722018747323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116891;
     Object term116961;
     Object term118521;
     Object term118522;

    public MinimizeExitPoints_visit_1722018747323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116891 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term116961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116961, term116961.getClass(), "type", 115);
        setIntField(term117031, term117031.getClass(), "type", 117);
        setField(term117031, term117031.getClass(), "first", term117101);
        setField(term116961, term116961.getClass(), "last", term117031);
        term118521 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term118521, term118521.getClass(), "compiler", null);
        term118522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term118522, term118522.getClass(), "type", 115);
        setField(term118522, term118522.getClass(), "next", null);
        setField(term118522, term118522.getClass(), "first", null);
        setIntField(term118523, term118523.getClass(), "type", 117);
        setField(term118523, term118523.getClass(), "next", null);
        setIntField(term118524, term118524.getClass(), "type", 0);
        setField(term118524, term118524.getClass(), "next", null);
        setField(term118524, term118524.getClass(), "first", null);
        setField(term118524, term118524.getClass(), "last", null);
        setField(term118524, term118524.getClass(), "propListHead", null);
        setIntField(term118524, term118524.getClass(), "sourcePosition", 0);
        setField(term118524, term118524.getClass(), "jsType", null);
        setField(term118524, term118524.getClass(), "parent", null);
        setField(term118523, term118523.getClass(), "first", term118524);
        setField(term118523, term118523.getClass(), "last", null);
        setField(term118523, term118523.getClass(), "propListHead", null);
        setIntField(term118523, term118523.getClass(), "sourcePosition", 0);
        setField(term118523, term118523.getClass(), "jsType", null);
        setField(term118523, term118523.getClass(), "parent", null);
        setField(term118522, term118522.getClass(), "last", term118523);
        setField(term118522, term118522.getClass(), "propListHead", null);
        setIntField(term118522, term118522.getClass(), "sourcePosition", 0);
        setField(term118522, term118522.getClass(), "jsType", null);
        setField(term118522, term118522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term116961;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term116891, args);
        assertTrue(recursiveEquals(term116891, term118521));
        assertTrue(recursiveEquals(term116961, null));
    }

};


