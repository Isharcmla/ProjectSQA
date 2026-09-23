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

public class NodeUtil_mayEffectMutableState_1910072630614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3863630;
     Object term3863757;

    public NodeUtil_mayEffectMutableState_1910072630614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3863630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3863700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3863630, term3863630.getClass(), "type", 96);
        setField(term3863630, term3863630.getClass(), "first", term3863700);
        term3863757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3863758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3863757, term3863757.getClass(), "type", 96);
        setField(term3863757, term3863757.getClass(), "next", null);
        setIntField(term3863758, term3863758.getClass(), "type", 0);
        setField(term3863758, term3863758.getClass(), "next", null);
        setField(term3863758, term3863758.getClass(), "first", null);
        setField(term3863758, term3863758.getClass(), "last", null);
        setField(term3863758, term3863758.getClass(), "propListHead", null);
        setIntField(term3863758, term3863758.getClass(), "sourcePosition", 0);
        setField(term3863758, term3863758.getClass(), "jsType", null);
        setField(term3863758, term3863758.getClass(), "parent", null);
        setField(term3863757, term3863757.getClass(), "first", term3863758);
        setField(term3863757, term3863757.getClass(), "last", null);
        setField(term3863757, term3863757.getClass(), "propListHead", null);
        setIntField(term3863757, term3863757.getClass(), "sourcePosition", 0);
        setField(term3863757, term3863757.getClass(), "jsType", null);
        setField(term3863757, term3863757.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3863630;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term3863630, term3863757));
    }

};


