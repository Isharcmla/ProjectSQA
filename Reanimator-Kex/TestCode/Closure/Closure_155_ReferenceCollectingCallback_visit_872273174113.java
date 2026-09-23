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

public class ReferenceCollectingCallback_visit_872273174113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23118;
     Object term23210;
     Object term23302;
     Object term23597;
     Object term23598;
     Object term23599;

    public ReferenceCollectingCallback_visit_872273174113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23118 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term23210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term23210, term23210.getClass(), "type", -39);
        term23302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term23597 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term23597, term23597.getClass(), "referenceMap", null);
        setField(term23597, term23597.getClass(), "blockStack", null);
        setField(term23597, term23597.getClass(), "behavior", null);
        setField(term23597, term23597.getClass(), "compiler", null);
        setField(term23597, term23597.getClass(), "varFilter", null);
        term23598 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term23598, term23598.getClass(), "str", null);
        setIntField(term23598, term23598.getClass(), "type", -39);
        setField(term23598, term23598.getClass(), "next", null);
        setField(term23598, term23598.getClass(), "first", null);
        setField(term23598, term23598.getClass(), "last", null);
        setField(term23598, term23598.getClass(), "propListHead", null);
        setIntField(term23598, term23598.getClass(), "sourcePosition", 0);
        setField(term23598, term23598.getClass(), "jsType", null);
        setField(term23598, term23598.getClass(), "parent", null);
        term23599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term23599, term23599.getClass(), "str", null);
        setIntField(term23599, term23599.getClass(), "type", 0);
        setField(term23599, term23599.getClass(), "next", null);
        setField(term23599, term23599.getClass(), "first", null);
        setField(term23599, term23599.getClass(), "last", null);
        setField(term23599, term23599.getClass(), "propListHead", null);
        setIntField(term23599, term23599.getClass(), "sourcePosition", 0);
        setField(term23599, term23599.getClass(), "jsType", null);
        setField(term23599, term23599.getClass(), "parent", null);
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
        args[1] = term23210;
        args[2] = term23302;
        callMethod(klass, "visit", argTypes, term23118, args);
        assertTrue(recursiveEquals(term23118, term23597));
        assertTrue(recursiveEquals(term23210, term23599));
        assertTrue(recursiveEquals(term23302, null));
    }

};


