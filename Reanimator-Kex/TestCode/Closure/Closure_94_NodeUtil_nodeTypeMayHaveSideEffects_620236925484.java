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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41699;
     Object term41789;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41699 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term41789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term41789, term41789.getClass(), "str", null);
        setIntField(term41789, term41789.getClass(), "type", 0);
        setField(term41789, term41789.getClass(), "next", null);
        setField(term41789, term41789.getClass(), "first", null);
        setField(term41789, term41789.getClass(), "last", null);
        setField(term41789, term41789.getClass(), "propListHead", null);
        setIntField(term41789, term41789.getClass(), "sourcePosition", 0);
        setField(term41789, term41789.getClass(), "jsType", null);
        setField(term41789, term41789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41699;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term41699, term41789));
    }

};


