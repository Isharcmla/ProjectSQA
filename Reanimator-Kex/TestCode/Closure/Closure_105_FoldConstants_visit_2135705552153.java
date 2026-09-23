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

public class FoldConstants_visit_2135705552153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34078;
     Object term34148;
     Object term34237;
     Object term34238;

    public FoldConstants_visit_2135705552153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34078 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term34148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34148, term34148.getClass(), "type", 130);
        setField(term34148, term34148.getClass(), "first", term34148);
        term34237 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term34237, term34237.getClass(), "compiler", null);
        term34238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34238, term34238.getClass(), "type", 130);
        setField(term34238, term34238.getClass(), "next", null);
        setField(term34238, term34238.getClass(), "first", term34238);
        setField(term34238, term34238.getClass(), "last", null);
        setField(term34238, term34238.getClass(), "propListHead", null);
        setIntField(term34238, term34238.getClass(), "sourcePosition", 0);
        setField(term34238, term34238.getClass(), "jsType", null);
        setField(term34238, term34238.getClass(), "parent", null);
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
        args[1] = term34148;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term34078, args);
        assertTrue(recursiveEquals(term34078, term34237));
        assertTrue(recursiveEquals(term34148, null));
    }

};


