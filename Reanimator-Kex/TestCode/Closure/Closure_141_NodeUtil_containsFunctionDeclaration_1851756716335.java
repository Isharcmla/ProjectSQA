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

public class NodeUtil_containsFunctionDeclaration_1851756716335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26390;
     Object term26635;

    public NodeUtil_containsFunctionDeclaration_1851756716335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26390, term26390.getClass(), "type", 2);
        setIntField(term26460, term26460.getClass(), "type", 0);
        setField(term26460, term26460.getClass(), "first", term26530);
        setField(term26390, term26390.getClass(), "first", term26460);
        term26635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26635, term26635.getClass(), "type", 2);
        setField(term26635, term26635.getClass(), "next", null);
        setIntField(term26636, term26636.getClass(), "type", 0);
        setField(term26636, term26636.getClass(), "next", null);
        setIntField(term26637, term26637.getClass(), "type", 0);
        setField(term26637, term26637.getClass(), "next", null);
        setField(term26637, term26637.getClass(), "first", null);
        setField(term26637, term26637.getClass(), "last", null);
        setField(term26637, term26637.getClass(), "propListHead", null);
        setIntField(term26637, term26637.getClass(), "sourcePosition", 0);
        setField(term26637, term26637.getClass(), "jsType", null);
        setField(term26637, term26637.getClass(), "parent", null);
        setField(term26636, term26636.getClass(), "first", term26637);
        setField(term26636, term26636.getClass(), "last", null);
        setField(term26636, term26636.getClass(), "propListHead", null);
        setIntField(term26636, term26636.getClass(), "sourcePosition", 0);
        setField(term26636, term26636.getClass(), "jsType", null);
        setField(term26636, term26636.getClass(), "parent", null);
        setField(term26635, term26635.getClass(), "first", term26636);
        setField(term26635, term26635.getClass(), "last", null);
        setField(term26635, term26635.getClass(), "propListHead", null);
        setIntField(term26635, term26635.getClass(), "sourcePosition", 0);
        setField(term26635, term26635.getClass(), "jsType", null);
        setField(term26635, term26635.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26390;
        callMethod(klass, "containsFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term26390, term26635));
    }

};


