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

public class ReferenceCollectingCallback_visit_872273174530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143787;
     Object term143879;
     Object term143892;
     Object term143893;

    public ReferenceCollectingCallback_visit_872273174530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143787 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term143879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term143892 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term143892, term143892.getClass(), "referenceMap", null);
        setField(term143892, term143892.getClass(), "blockStack", null);
        setField(term143892, term143892.getClass(), "behavior", null);
        setField(term143892, term143892.getClass(), "compiler", null);
        setField(term143892, term143892.getClass(), "varFilter", null);
        term143893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term143893, term143893.getClass(), "number", 0.0);
        setIntField(term143893, term143893.getClass(), "type", 0);
        setField(term143893, term143893.getClass(), "next", null);
        setField(term143893, term143893.getClass(), "first", null);
        setField(term143893, term143893.getClass(), "last", null);
        setField(term143893, term143893.getClass(), "propListHead", null);
        setIntField(term143893, term143893.getClass(), "sourcePosition", 0);
        setField(term143893, term143893.getClass(), "jsType", null);
        setField(term143893, term143893.getClass(), "parent", null);
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
        args[1] = term143879;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term143787, args);
        assertTrue(recursiveEquals(term143787, term143892));
        assertTrue(recursiveEquals(term143879, null));
    }

};


