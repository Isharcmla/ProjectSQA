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

public class ReferenceCollectingCallback_shouldTraverse_422855684857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221867;
     Object term221959;
     Object term221971;
     Object term221972;

    public ReferenceCollectingCallback_shouldTraverse_422855684857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221867 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term221959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term221959, term221959.getClass(), "type", 108);
        term221971 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term221971, term221971.getClass(), "referenceMap", null);
        setField(term221971, term221971.getClass(), "blockStack", null);
        setField(term221971, term221971.getClass(), "behavior", null);
        setField(term221971, term221971.getClass(), "compiler", null);
        setField(term221971, term221971.getClass(), "varFilter", null);
        term221972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term221972, term221972.getClass(), "number", 0.0);
        setIntField(term221972, term221972.getClass(), "type", 108);
        setField(term221972, term221972.getClass(), "next", null);
        setField(term221972, term221972.getClass(), "first", null);
        setField(term221972, term221972.getClass(), "last", null);
        setField(term221972, term221972.getClass(), "propListHead", null);
        setIntField(term221972, term221972.getClass(), "sourcePosition", 0);
        setField(term221972, term221972.getClass(), "jsType", null);
        setField(term221972, term221972.getClass(), "parent", null);
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
        args[2] = term221959;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term221867, args);
        assertTrue(recursiveEquals(term221867, term221971));
        assertTrue(recursiveEquals(term221959, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


