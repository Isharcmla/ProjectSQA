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

public class ReferenceCollectingCallback_shouldTraverse_422855684694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183749;
     Object term183841;
     Object term183933;
     Object term183950;
     Object term183951;
     Object term183952;

    public ReferenceCollectingCallback_shouldTraverse_422855684694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183749 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term183841 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term183933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term183933, term183933.getClass(), "type", 4);
        term183950 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term183950, term183950.getClass(), "referenceMap", null);
        setField(term183950, term183950.getClass(), "blockStack", null);
        setField(term183950, term183950.getClass(), "behavior", null);
        setField(term183950, term183950.getClass(), "compiler", null);
        setField(term183950, term183950.getClass(), "varFilter", null);
        term183951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term183951, term183951.getClass(), "number", 0.0);
        setIntField(term183951, term183951.getClass(), "type", 4);
        setField(term183951, term183951.getClass(), "next", null);
        setField(term183951, term183951.getClass(), "first", null);
        setField(term183951, term183951.getClass(), "last", null);
        setField(term183951, term183951.getClass(), "propListHead", null);
        setIntField(term183951, term183951.getClass(), "sourcePosition", 0);
        setField(term183951, term183951.getClass(), "jsType", null);
        setField(term183951, term183951.getClass(), "parent", null);
        term183952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term183952, term183952.getClass(), "number", 0.0);
        setIntField(term183952, term183952.getClass(), "type", 0);
        setField(term183952, term183952.getClass(), "next", null);
        setField(term183952, term183952.getClass(), "first", null);
        setField(term183952, term183952.getClass(), "last", null);
        setField(term183952, term183952.getClass(), "propListHead", null);
        setIntField(term183952, term183952.getClass(), "sourcePosition", 0);
        setField(term183952, term183952.getClass(), "jsType", null);
        setField(term183952, term183952.getClass(), "parent", null);
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
        args[1] = term183841;
        args[2] = term183933;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term183749, args);
        assertTrue(recursiveEquals(term183749, term183950));
        assertTrue(recursiveEquals(term183841, term183952));
        assertTrue(recursiveEquals(term183933, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


