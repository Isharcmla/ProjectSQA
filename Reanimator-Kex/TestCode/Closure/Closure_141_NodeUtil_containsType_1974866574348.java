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

public class NodeUtil_containsType_1974866574348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28581;
     Object term28828;

    public NodeUtil_containsType_1974866574348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28581, term28581.getClass(), "type", 0);
        setIntField(term28651, term28651.getClass(), "type", 0);
        setField(term28651, term28651.getClass(), "first", term28721);
        setField(term28581, term28581.getClass(), "first", term28651);
        term28828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28828, term28828.getClass(), "type", 0);
        setField(term28828, term28828.getClass(), "next", null);
        setIntField(term28829, term28829.getClass(), "type", 0);
        setField(term28829, term28829.getClass(), "next", null);
        setIntField(term28830, term28830.getClass(), "type", 0);
        setField(term28830, term28830.getClass(), "next", null);
        setField(term28830, term28830.getClass(), "first", null);
        setField(term28830, term28830.getClass(), "last", null);
        setField(term28830, term28830.getClass(), "propListHead", null);
        setIntField(term28830, term28830.getClass(), "sourcePosition", 0);
        setField(term28830, term28830.getClass(), "jsType", null);
        setField(term28830, term28830.getClass(), "parent", null);
        setField(term28829, term28829.getClass(), "first", term28830);
        setField(term28829, term28829.getClass(), "last", null);
        setField(term28829, term28829.getClass(), "propListHead", null);
        setIntField(term28829, term28829.getClass(), "sourcePosition", 0);
        setField(term28829, term28829.getClass(), "jsType", null);
        setField(term28829, term28829.getClass(), "parent", null);
        setField(term28828, term28828.getClass(), "first", term28829);
        setField(term28828, term28828.getClass(), "last", null);
        setField(term28828, term28828.getClass(), "propListHead", null);
        setIntField(term28828, term28828.getClass(), "sourcePosition", 0);
        setField(term28828, term28828.getClass(), "jsType", null);
        setField(term28828, term28828.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term28581;
        args[1] = 1;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term28581, 1));
    }

};


