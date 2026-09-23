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

public class ReferenceCollectingCallback_visit_872273174812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207710;
     Object term207802;
     Object term208590;
     Object term208591;

    public ReferenceCollectingCallback_visit_872273174812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207710 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term207802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term208590 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term208590, term208590.getClass(), "referenceMap", null);
        setField(term208590, term208590.getClass(), "blockStack", null);
        setField(term208590, term208590.getClass(), "behavior", null);
        setField(term208590, term208590.getClass(), "compiler", null);
        setField(term208590, term208590.getClass(), "varFilter", null);
        term208591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term208591, term208591.getClass(), "number", 0.0);
        setIntField(term208591, term208591.getClass(), "type", 0);
        setField(term208591, term208591.getClass(), "next", null);
        setField(term208591, term208591.getClass(), "first", null);
        setField(term208591, term208591.getClass(), "last", null);
        setField(term208591, term208591.getClass(), "propListHead", null);
        setIntField(term208591, term208591.getClass(), "sourcePosition", 0);
        setField(term208591, term208591.getClass(), "jsType", null);
        setField(term208591, term208591.getClass(), "parent", null);
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
        args[1] = term207802;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term207710, args);
        assertTrue(recursiveEquals(term207710, term208590));
        assertTrue(recursiveEquals(term207802, null));
    }

};


