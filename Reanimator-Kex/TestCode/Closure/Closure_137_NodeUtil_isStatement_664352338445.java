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
import java.lang.Object;

public class NodeUtil_isStatement_664352338445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34353;
     Object term34441;

    public NodeUtil_isStatement_664352338445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34353, term34353.getClass(), "parent", term34423);
        term34441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34441, term34441.getClass(), "type", 0);
        setField(term34441, term34441.getClass(), "next", null);
        setField(term34441, term34441.getClass(), "first", null);
        setField(term34441, term34441.getClass(), "last", null);
        setField(term34441, term34441.getClass(), "propListHead", null);
        setIntField(term34441, term34441.getClass(), "sourcePosition", 0);
        setField(term34441, term34441.getClass(), "jsType", null);
        setIntField(term34442, term34442.getClass(), "type", 0);
        setField(term34442, term34442.getClass(), "next", null);
        setField(term34442, term34442.getClass(), "first", null);
        setField(term34442, term34442.getClass(), "last", null);
        setField(term34442, term34442.getClass(), "propListHead", null);
        setIntField(term34442, term34442.getClass(), "sourcePosition", 0);
        setField(term34442, term34442.getClass(), "jsType", null);
        setField(term34442, term34442.getClass(), "parent", null);
        setField(term34441, term34441.getClass(), "parent", term34442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34353;
        Object retValue = callMethod(klass, "isStatement", argTypes, null, args);
        assertTrue(recursiveEquals(term34353, term34441));
        assertTrue(recursiveEquals(retValue, false));
    }

};


