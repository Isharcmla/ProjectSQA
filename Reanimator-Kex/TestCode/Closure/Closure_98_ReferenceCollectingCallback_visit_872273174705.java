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

public class ReferenceCollectingCallback_visit_872273174705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186870;
     Object term186962;
     Object term187266;
     Object term187267;

    public ReferenceCollectingCallback_visit_872273174705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186870 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term186962 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term187266 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term187266, term187266.getClass(), "referenceMap", null);
        setField(term187266, term187266.getClass(), "blockStack", null);
        setField(term187266, term187266.getClass(), "behavior", null);
        setField(term187266, term187266.getClass(), "compiler", null);
        setField(term187266, term187266.getClass(), "varFilter", null);
        term187267 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term187267, term187267.getClass(), "str", null);
        setIntField(term187267, term187267.getClass(), "type", 0);
        setField(term187267, term187267.getClass(), "next", null);
        setField(term187267, term187267.getClass(), "first", null);
        setField(term187267, term187267.getClass(), "last", null);
        setField(term187267, term187267.getClass(), "propListHead", null);
        setIntField(term187267, term187267.getClass(), "sourcePosition", 0);
        setField(term187267, term187267.getClass(), "jsType", null);
        setField(term187267, term187267.getClass(), "parent", null);
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
        args[1] = term186962;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term186870, args);
        assertTrue(recursiveEquals(term186870, term187266));
        assertTrue(recursiveEquals(term186962, null));
    }

};


