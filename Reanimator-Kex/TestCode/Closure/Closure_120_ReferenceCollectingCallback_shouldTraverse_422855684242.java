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

public class ReferenceCollectingCallback_shouldTraverse_422855684242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47207;
     Object term47299;
     Object term47311;
     Object term47312;

    public ReferenceCollectingCallback_shouldTraverse_422855684242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47207 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term47299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term47299, term47299.getClass(), "type", 100);
        term47311 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term47311, term47311.getClass(), "referenceMap", null);
        setField(term47311, term47311.getClass(), "blockStack", null);
        setField(term47311, term47311.getClass(), "behavior", null);
        setField(term47311, term47311.getClass(), "compiler", null);
        setField(term47311, term47311.getClass(), "varFilter", null);
        term47312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term47312, term47312.getClass(), "number", 0.0);
        setIntField(term47312, term47312.getClass(), "type", 100);
        setField(term47312, term47312.getClass(), "next", null);
        setField(term47312, term47312.getClass(), "first", null);
        setField(term47312, term47312.getClass(), "last", null);
        setField(term47312, term47312.getClass(), "propListHead", null);
        setIntField(term47312, term47312.getClass(), "sourcePosition", 0);
        setField(term47312, term47312.getClass(), "jsType", null);
        setField(term47312, term47312.getClass(), "parent", null);
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
        args[2] = term47299;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term47207, args);
        assertTrue(recursiveEquals(term47207, term47311));
        assertTrue(recursiveEquals(term47299, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


