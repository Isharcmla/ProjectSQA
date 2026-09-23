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

public class ReferenceCollectingCallback_shouldTraverse_422855684591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184476;
     Object term184568;
     Object term184579;
     Object term184580;

    public ReferenceCollectingCallback_shouldTraverse_422855684591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184476 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term184568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term184568, term184568.getClass(), "type", 98);
        term184579 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term184579, term184579.getClass(), "referenceMap", null);
        setField(term184579, term184579.getClass(), "blockStack", null);
        setField(term184579, term184579.getClass(), "behavior", null);
        setField(term184579, term184579.getClass(), "compiler", null);
        setField(term184579, term184579.getClass(), "varFilter", null);
        term184580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term184580, term184580.getClass(), "str", null);
        setIntField(term184580, term184580.getClass(), "type", 98);
        setField(term184580, term184580.getClass(), "next", null);
        setField(term184580, term184580.getClass(), "first", null);
        setField(term184580, term184580.getClass(), "last", null);
        setField(term184580, term184580.getClass(), "propListHead", null);
        setIntField(term184580, term184580.getClass(), "sourcePosition", 0);
        setField(term184580, term184580.getClass(), "jsType", null);
        setField(term184580, term184580.getClass(), "parent", null);
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
        args[2] = term184568;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term184476, args);
        assertTrue(recursiveEquals(term184476, term184579));
        assertTrue(recursiveEquals(term184568, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


