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
import java.lang.Integer;

public class NodeUtil_newQualifiedNameNode_1828868763203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2427;
     Object term2429;
     Object term14047;

    public NodeUtil_newQualifiedNameNode_1828868763203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2427 = new Integer(-382652403);
        term2429 = new Integer(-2126539433);
        term14047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term14047, term14047.getClass(), "str", "LQFpaHEwXR");
        setIntField(term14047, term14047.getClass(), "type", 38);
        setField(term14047, term14047.getClass(), "next", null);
        setField(term14047, term14047.getClass(), "first", null);
        setField(term14047, term14047.getClass(), "last", null);
        setField(term14047, term14047.getClass(), "propListHead", null);
        setIntField(term14047, term14047.getClass(), "sourcePosition", -1);
        setField(term14047, term14047.getClass(), "jsType", null);
        setField(term14047, term14047.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "LQFpaHEwXR";
        args[1] = term2427;
        args[2] = term2429;
        Object retValue = callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term2427, -2126539433));
        assertTrue(recursiveEquals(term2429, "LQFpaHEwXR"));
        assertTrue(recursiveEquals(retValue, term14047));
    }

};


