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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29530;
     Object term29620;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term29620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term29620, term29620.getClass(), "str", null);
        setIntField(term29620, term29620.getClass(), "type", 0);
        setField(term29620, term29620.getClass(), "next", null);
        setField(term29620, term29620.getClass(), "first", null);
        setField(term29620, term29620.getClass(), "last", null);
        setField(term29620, term29620.getClass(), "propListHead", null);
        setIntField(term29620, term29620.getClass(), "sourcePosition", 0);
        setField(term29620, term29620.getClass(), "jsType", null);
        setField(term29620, term29620.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29530;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term29530, term29620));
    }

};


