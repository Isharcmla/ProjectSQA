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

public class NodeUtil_newQualifiedNameNode_1828868763179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2184;
     Object term2186;
     Object term12137;

    public NodeUtil_newQualifiedNameNode_1828868763179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2184 = new Integer(1124282188);
        term2186 = new Integer(-489441521);
        term12137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term12137, term12137.getClass(), "str", "LQFpaHEwXR");
        setIntField(term12137, term12137.getClass(), "type", 38);
        setField(term12137, term12137.getClass(), "next", null);
        setField(term12137, term12137.getClass(), "first", null);
        setField(term12137, term12137.getClass(), "last", null);
        setField(term12137, term12137.getClass(), "propListHead", null);
        setIntField(term12137, term12137.getClass(), "sourcePosition", -1);
        setField(term12137, term12137.getClass(), "jsType", null);
        setField(term12137, term12137.getClass(), "parent", null);
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
        args[1] = term2184;
        args[2] = term2186;
        Object retValue = callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term2184, -489441521));
        assertTrue(recursiveEquals(term2186, "LQFpaHEwXR"));
        assertTrue(recursiveEquals(retValue, term12137));
    }

};


