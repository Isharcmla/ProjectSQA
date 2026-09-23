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

public class ReferenceCollectingCallback_visit_872273174163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39206;
     Object term39298;
     Object term39956;
     Object term39957;

    public ReferenceCollectingCallback_visit_872273174163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39206 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term39298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term39298, term39298.getClass(), "type", -39);
        term39956 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term39956, term39956.getClass(), "referenceMap", null);
        setField(term39956, term39956.getClass(), "blockStack", null);
        setField(term39956, term39956.getClass(), "behavior", null);
        setField(term39956, term39956.getClass(), "compiler", null);
        setField(term39956, term39956.getClass(), "varFilter", null);
        term39957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term39957, term39957.getClass(), "str", null);
        setIntField(term39957, term39957.getClass(), "type", -39);
        setField(term39957, term39957.getClass(), "next", null);
        setField(term39957, term39957.getClass(), "first", null);
        setField(term39957, term39957.getClass(), "last", null);
        setField(term39957, term39957.getClass(), "propListHead", null);
        setIntField(term39957, term39957.getClass(), "sourcePosition", 0);
        setField(term39957, term39957.getClass(), "jsType", null);
        setField(term39957, term39957.getClass(), "parent", null);
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
        args[1] = term39298;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term39206, args);
        assertTrue(recursiveEquals(term39206, term39956));
        assertTrue(recursiveEquals(term39298, null));
    }

};


