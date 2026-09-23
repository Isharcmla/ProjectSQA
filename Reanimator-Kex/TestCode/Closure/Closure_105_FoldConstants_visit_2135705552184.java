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

public class FoldConstants_visit_2135705552184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38617;
     Object term38687;
     Object term47623;
     Object term47624;

    public FoldConstants_visit_2135705552184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38617 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term38687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38687, term38687.getClass(), "type", 4);
        setField(term38687, term38687.getClass(), "first", term38687);
        term47623 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47623, term47623.getClass(), "compiler", null);
        term47624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47624, term47624.getClass(), "type", 4);
        setField(term47624, term47624.getClass(), "next", null);
        setField(term47624, term47624.getClass(), "first", term47624);
        setField(term47624, term47624.getClass(), "last", null);
        setField(term47624, term47624.getClass(), "propListHead", null);
        setIntField(term47624, term47624.getClass(), "sourcePosition", 0);
        setField(term47624, term47624.getClass(), "jsType", null);
        setField(term47624, term47624.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term38687;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term38617, args);
        assertTrue(recursiveEquals(term38617, term47623));
        assertTrue(recursiveEquals(term38687, null));
    }

};


