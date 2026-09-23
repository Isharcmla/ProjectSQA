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

public class ReferenceCollectingCallback_shouldTraverse_422855684637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173316;
     Object term173408;
     Object term173804;
     Object term173805;

    public ReferenceCollectingCallback_shouldTraverse_422855684637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173316 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term173408 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term173408, term173408.getClass(), "type", 108);
        term173804 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term173804, term173804.getClass(), "referenceMap", null);
        setField(term173804, term173804.getClass(), "blockStack", null);
        setField(term173804, term173804.getClass(), "behavior", null);
        setField(term173804, term173804.getClass(), "compiler", null);
        setField(term173804, term173804.getClass(), "varFilter", null);
        term173805 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term173805, term173805.getClass(), "number", 0.0);
        setIntField(term173805, term173805.getClass(), "type", 108);
        setField(term173805, term173805.getClass(), "next", null);
        setField(term173805, term173805.getClass(), "first", null);
        setField(term173805, term173805.getClass(), "last", null);
        setField(term173805, term173805.getClass(), "propListHead", null);
        setIntField(term173805, term173805.getClass(), "sourcePosition", 0);
        setField(term173805, term173805.getClass(), "jsType", null);
        setField(term173805, term173805.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term173408;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term173316, args);
        assertTrue(recursiveEquals(term173316, term173804));
        assertTrue(recursiveEquals(term173408, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


