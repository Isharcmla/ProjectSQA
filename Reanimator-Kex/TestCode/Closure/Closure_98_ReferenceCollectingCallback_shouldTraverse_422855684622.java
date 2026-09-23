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

public class ReferenceCollectingCallback_shouldTraverse_422855684622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169789;
     Object term169881;
     Object term170152;
     Object term170153;

    public ReferenceCollectingCallback_shouldTraverse_422855684622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169789 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term169881 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169881, term169881.getClass(), "type", 98);
        term170152 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term170152, term170152.getClass(), "referenceMap", null);
        setField(term170152, term170152.getClass(), "blockStack", null);
        setField(term170152, term170152.getClass(), "behavior", null);
        setField(term170152, term170152.getClass(), "compiler", null);
        setField(term170152, term170152.getClass(), "varFilter", null);
        term170153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term170153, term170153.getClass(), "number", 0.0);
        setIntField(term170153, term170153.getClass(), "type", 98);
        setField(term170153, term170153.getClass(), "next", null);
        setField(term170153, term170153.getClass(), "first", null);
        setField(term170153, term170153.getClass(), "last", null);
        setField(term170153, term170153.getClass(), "propListHead", null);
        setIntField(term170153, term170153.getClass(), "sourcePosition", 0);
        setField(term170153, term170153.getClass(), "jsType", null);
        setField(term170153, term170153.getClass(), "parent", null);
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
        args[2] = term169881;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term169789, args);
        assertTrue(recursiveEquals(term169789, term170152));
        assertTrue(recursiveEquals(term169881, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


