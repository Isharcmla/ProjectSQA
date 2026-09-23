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

public class ReferenceCollectingCallback_visit_872273174119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24323;
     Object term24415;
     Object term24919;
     Object term24920;

    public ReferenceCollectingCallback_visit_872273174119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24323 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term24415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24415, term24415.getClass(), "type", -39);
        term24919 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term24919, term24919.getClass(), "referenceMap", null);
        setField(term24919, term24919.getClass(), "blockStack", null);
        setField(term24919, term24919.getClass(), "behavior", null);
        setField(term24919, term24919.getClass(), "compiler", null);
        setField(term24919, term24919.getClass(), "varFilter", null);
        term24920 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term24920, term24920.getClass(), "number", 0.0);
        setIntField(term24920, term24920.getClass(), "type", -39);
        setField(term24920, term24920.getClass(), "next", null);
        setField(term24920, term24920.getClass(), "first", null);
        setField(term24920, term24920.getClass(), "last", null);
        setField(term24920, term24920.getClass(), "propListHead", null);
        setIntField(term24920, term24920.getClass(), "sourcePosition", 0);
        setField(term24920, term24920.getClass(), "jsType", null);
        setField(term24920, term24920.getClass(), "parent", null);
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
        args[1] = term24415;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term24323, args);
        assertTrue(recursiveEquals(term24323, term24919));
        assertTrue(recursiveEquals(term24415, null));
    }

};


