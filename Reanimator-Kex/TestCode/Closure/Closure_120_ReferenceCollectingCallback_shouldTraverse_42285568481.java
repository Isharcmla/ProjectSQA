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

public class ReferenceCollectingCallback_shouldTraverse_42285568481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9871;
     Object term9941;
     Object term10356;
     Object term10357;

    public ReferenceCollectingCallback_shouldTraverse_42285568481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9871 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term9941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9941, term9941.getClass(), "type", 101);
        term10356 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term10356, term10356.getClass(), "referenceMap", null);
        setField(term10356, term10356.getClass(), "blockStack", null);
        setField(term10356, term10356.getClass(), "behavior", null);
        setField(term10356, term10356.getClass(), "compiler", null);
        setField(term10356, term10356.getClass(), "varFilter", null);
        term10357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10357, term10357.getClass(), "type", 101);
        setField(term10357, term10357.getClass(), "next", null);
        setField(term10357, term10357.getClass(), "first", null);
        setField(term10357, term10357.getClass(), "last", null);
        setField(term10357, term10357.getClass(), "propListHead", null);
        setIntField(term10357, term10357.getClass(), "sourcePosition", 0);
        setField(term10357, term10357.getClass(), "jsType", null);
        setField(term10357, term10357.getClass(), "parent", null);
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
        args[2] = term9941;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term9871, args);
        assertTrue(recursiveEquals(term9871, term10356));
        assertTrue(recursiveEquals(term9941, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


