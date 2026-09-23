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

public class ReferenceCollectingCallback_visit_872273174595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186378;
     Object term186470;
     Object term186486;
     Object term186487;

    public ReferenceCollectingCallback_visit_872273174595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186378 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term186470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term186486 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term186486, term186486.getClass(), "referenceMap", null);
        setField(term186486, term186486.getClass(), "blockStack", null);
        setField(term186486, term186486.getClass(), "behavior", null);
        setField(term186486, term186486.getClass(), "compiler", null);
        setField(term186486, term186486.getClass(), "varFilter", null);
        term186487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term186487, term186487.getClass(), "number", 0.0);
        setIntField(term186487, term186487.getClass(), "type", 0);
        setField(term186487, term186487.getClass(), "next", null);
        setField(term186487, term186487.getClass(), "first", null);
        setField(term186487, term186487.getClass(), "last", null);
        setField(term186487, term186487.getClass(), "propListHead", null);
        setIntField(term186487, term186487.getClass(), "sourcePosition", 0);
        setField(term186487, term186487.getClass(), "jsType", null);
        setField(term186487, term186487.getClass(), "parent", null);
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
        args[1] = term186470;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term186378, args);
        assertTrue(recursiveEquals(term186378, term186486));
        assertTrue(recursiveEquals(term186470, null));
    }

};


