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

public class ReferenceCollectingCallback_shouldTraverse_422855684613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167658;
     Object term167750;
     Object term168087;
     Object term168088;

    public ReferenceCollectingCallback_shouldTraverse_422855684613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167658 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term167750 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term167750, term167750.getClass(), "type", 101);
        term168087 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term168087, term168087.getClass(), "referenceMap", null);
        setField(term168087, term168087.getClass(), "blockStack", null);
        setField(term168087, term168087.getClass(), "behavior", null);
        setField(term168087, term168087.getClass(), "compiler", null);
        setField(term168087, term168087.getClass(), "varFilter", null);
        term168088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term168088, term168088.getClass(), "number", 0.0);
        setIntField(term168088, term168088.getClass(), "type", 101);
        setField(term168088, term168088.getClass(), "next", null);
        setField(term168088, term168088.getClass(), "first", null);
        setField(term168088, term168088.getClass(), "last", null);
        setField(term168088, term168088.getClass(), "propListHead", null);
        setIntField(term168088, term168088.getClass(), "sourcePosition", 0);
        setField(term168088, term168088.getClass(), "jsType", null);
        setField(term168088, term168088.getClass(), "parent", null);
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
        args[2] = term167750;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term167658, args);
        assertTrue(recursiveEquals(term167658, term168087));
        assertTrue(recursiveEquals(term167750, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


