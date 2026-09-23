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

public class NodeUtil_newQualifiedNameNode_1828868763181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;
     Object term2213;
     Object term12203;

    public NodeUtil_newQualifiedNameNode_1828868763181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2211 = new Integer(-1510932472);
        term2213 = new Integer(1970654816);
        term12203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term12203, term12203.getClass(), "str", "LQFpaHEwXR");
        setIntField(term12203, term12203.getClass(), "type", 38);
        setField(term12203, term12203.getClass(), "next", null);
        setField(term12203, term12203.getClass(), "first", null);
        setField(term12203, term12203.getClass(), "last", null);
        setField(term12203, term12203.getClass(), "propListHead", null);
        setIntField(term12203, term12203.getClass(), "sourcePosition", -1);
        setField(term12203, term12203.getClass(), "jsType", null);
        setField(term12203, term12203.getClass(), "parent", null);
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
        args[1] = term2211;
        args[2] = term2213;
        Object retValue = callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term2211, 1970654816));
        assertTrue(recursiveEquals(term2213, "LQFpaHEwXR"));
        assertTrue(recursiveEquals(retValue, term12203));
    }

};


