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

public class ReferenceCollectingCallback_shouldTraverse_422855684678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181039;
     Object term181131;
     Object term181487;
     Object term181488;

    public ReferenceCollectingCallback_shouldTraverse_422855684678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181039 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term181131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term181131, term181131.getClass(), "type", 100);
        term181487 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term181487, term181487.getClass(), "referenceMap", null);
        setField(term181487, term181487.getClass(), "blockStack", null);
        setField(term181487, term181487.getClass(), "behavior", null);
        setField(term181487, term181487.getClass(), "compiler", null);
        setField(term181487, term181487.getClass(), "varFilter", null);
        term181488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term181488, term181488.getClass(), "number", 0.0);
        setIntField(term181488, term181488.getClass(), "type", 100);
        setField(term181488, term181488.getClass(), "next", null);
        setField(term181488, term181488.getClass(), "first", null);
        setField(term181488, term181488.getClass(), "last", null);
        setField(term181488, term181488.getClass(), "propListHead", null);
        setIntField(term181488, term181488.getClass(), "sourcePosition", 0);
        setField(term181488, term181488.getClass(), "jsType", null);
        setField(term181488, term181488.getClass(), "parent", null);
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
        args[2] = term181131;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term181039, args);
        assertTrue(recursiveEquals(term181039, term181487));
        assertTrue(recursiveEquals(term181131, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


