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

public class NodeUtil_nodeTypeMayHaveSideEffects_1759651727289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25401;
     Object term25413;

    public NodeUtil_nodeTypeMayHaveSideEffects_1759651727289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term25413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term25413, term25413.getClass(), "str", null);
        setIntField(term25413, term25413.getClass(), "type", 0);
        setField(term25413, term25413.getClass(), "next", null);
        setField(term25413, term25413.getClass(), "first", null);
        setField(term25413, term25413.getClass(), "last", null);
        setField(term25413, term25413.getClass(), "propListHead", null);
        setIntField(term25413, term25413.getClass(), "sourcePosition", 0);
        setField(term25413, term25413.getClass(), "jsType", null);
        setField(term25413, term25413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term25401;
        args[1] = null;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term25401, term25413));
        assertTrue(recursiveEquals(retValue, false));
    }

};


