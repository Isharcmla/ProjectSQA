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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_422855684608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191602;
     Object term191726;
     Object term191796;
     Object term192147;
     Object term192151;
     Object term192152;

    public ReferenceCollectingCallback_shouldTraverse_422855684608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term191656 = new ArrayDeque();
        term191602 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term191602, term191602.getClass(), "blockStack", term191656);
        term191726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191726, term191726.getClass(), "type", 111);
        term191796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191796, term191796.getClass(), "type", 111);
        ArrayDeque term192148 = new ArrayDeque();
        term192147 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term192147, term192147.getClass(), "referenceMap", null);
        setField(term192147, term192147.getClass(), "blockStack", term192148);
        setField(term192147, term192147.getClass(), "behavior", null);
        setField(term192147, term192147.getClass(), "compiler", null);
        setField(term192147, term192147.getClass(), "varFilter", null);
        term192151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192151, term192151.getClass(), "type", 111);
        setField(term192151, term192151.getClass(), "next", null);
        setField(term192151, term192151.getClass(), "first", null);
        setField(term192151, term192151.getClass(), "last", null);
        setField(term192151, term192151.getClass(), "propListHead", null);
        setIntField(term192151, term192151.getClass(), "sourcePosition", 0);
        setField(term192151, term192151.getClass(), "jsType", null);
        setField(term192151, term192151.getClass(), "parent", null);
        term192152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192152, term192152.getClass(), "type", 111);
        setField(term192152, term192152.getClass(), "next", null);
        setField(term192152, term192152.getClass(), "first", null);
        setField(term192152, term192152.getClass(), "last", null);
        setField(term192152, term192152.getClass(), "propListHead", null);
        setIntField(term192152, term192152.getClass(), "sourcePosition", 0);
        setField(term192152, term192152.getClass(), "jsType", null);
        setField(term192152, term192152.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term191726;
        args[2] = term191796;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term191602, args);
        assertTrue(recursiveEquals(term191602, term192147));
        assertTrue(recursiveEquals(term191726, term192152));
        assertTrue(recursiveEquals(term191796, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


