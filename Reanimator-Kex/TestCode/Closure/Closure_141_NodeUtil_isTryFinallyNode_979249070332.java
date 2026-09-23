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

public class NodeUtil_isTryFinallyNode_979249070332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25873;
     Object term26244;

    public NodeUtil_isTryFinallyNode_979249070332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25873, term25873.getClass(), "type", 77);
        term26244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26244, term26244.getClass(), "type", 77);
        setField(term26244, term26244.getClass(), "next", null);
        setField(term26244, term26244.getClass(), "first", null);
        setField(term26244, term26244.getClass(), "last", null);
        setField(term26244, term26244.getClass(), "propListHead", null);
        setIntField(term26244, term26244.getClass(), "sourcePosition", 0);
        setField(term26244, term26244.getClass(), "jsType", null);
        setField(term26244, term26244.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term25873;
        args[1] = null;
        Object retValue = callMethod(klass, "isTryFinallyNode", argTypes, null, args);
        assertTrue(recursiveEquals(term25873, term26244));
        assertTrue(recursiveEquals(retValue, false));
    }

};


