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

public class ReferenceCollectingCallback_visit_872273174426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103648;
     Object term103823;
     Object term103788;
     Object term104494;
     Object term104495;
     Object term104496;

    public ReferenceCollectingCallback_visit_872273174426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103648 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term103823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103823, term103823.getClass(), "type", 100);
        term103788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103788, term103788.getClass(), "type", 100);
        setField(term103788, term103788.getClass(), "first", term103823);
        term104494 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term104494, term104494.getClass(), "referenceMap", null);
        setField(term104494, term104494.getClass(), "blockStack", null);
        setField(term104494, term104494.getClass(), "behavior", null);
        setField(term104494, term104494.getClass(), "compiler", null);
        setField(term104494, term104494.getClass(), "varFilter", null);
        term104495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104495, term104495.getClass(), "type", 100);
        setField(term104495, term104495.getClass(), "next", null);
        setField(term104495, term104495.getClass(), "first", null);
        setField(term104495, term104495.getClass(), "last", null);
        setField(term104495, term104495.getClass(), "propListHead", null);
        setIntField(term104495, term104495.getClass(), "sourcePosition", 0);
        setField(term104495, term104495.getClass(), "jsType", null);
        setField(term104495, term104495.getClass(), "parent", null);
        term104496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104496, term104496.getClass(), "type", 100);
        setField(term104496, term104496.getClass(), "next", null);
        setIntField(term104497, term104497.getClass(), "type", 100);
        setField(term104497, term104497.getClass(), "next", null);
        setField(term104497, term104497.getClass(), "first", null);
        setField(term104497, term104497.getClass(), "last", null);
        setField(term104497, term104497.getClass(), "propListHead", null);
        setIntField(term104497, term104497.getClass(), "sourcePosition", 0);
        setField(term104497, term104497.getClass(), "jsType", null);
        setField(term104497, term104497.getClass(), "parent", null);
        setField(term104496, term104496.getClass(), "first", term104497);
        setField(term104496, term104496.getClass(), "last", null);
        setField(term104496, term104496.getClass(), "propListHead", null);
        setIntField(term104496, term104496.getClass(), "sourcePosition", 0);
        setField(term104496, term104496.getClass(), "jsType", null);
        setField(term104496, term104496.getClass(), "parent", null);
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
        args[1] = term103823;
        args[2] = term103788;
        callMethod(klass, "visit", argTypes, term103648, args);
        assertTrue(recursiveEquals(term103648, term104494));
        assertTrue(recursiveEquals(term103823, term104496));
        assertTrue(recursiveEquals(term103788, null));
    }

};


