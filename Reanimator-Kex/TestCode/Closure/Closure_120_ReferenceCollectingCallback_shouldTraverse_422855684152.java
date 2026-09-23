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

public class ReferenceCollectingCallback_shouldTraverse_422855684152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25431;
     Object term25523;
     Object term25876;
     Object term25877;

    public ReferenceCollectingCallback_shouldTraverse_422855684152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25431 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term25523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term25523, term25523.getClass(), "type", 98);
        term25876 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term25876, term25876.getClass(), "referenceMap", null);
        setField(term25876, term25876.getClass(), "blockStack", null);
        setField(term25876, term25876.getClass(), "behavior", null);
        setField(term25876, term25876.getClass(), "compiler", null);
        setField(term25876, term25876.getClass(), "varFilter", null);
        term25877 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term25877, term25877.getClass(), "number", 0.0);
        setIntField(term25877, term25877.getClass(), "type", 98);
        setField(term25877, term25877.getClass(), "next", null);
        setField(term25877, term25877.getClass(), "first", null);
        setField(term25877, term25877.getClass(), "last", null);
        setField(term25877, term25877.getClass(), "propListHead", null);
        setIntField(term25877, term25877.getClass(), "sourcePosition", 0);
        setField(term25877, term25877.getClass(), "jsType", null);
        setField(term25877, term25877.getClass(), "parent", null);
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
        args[2] = term25523;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term25431, args);
        assertTrue(recursiveEquals(term25431, term25876));
        assertTrue(recursiveEquals(term25523, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


