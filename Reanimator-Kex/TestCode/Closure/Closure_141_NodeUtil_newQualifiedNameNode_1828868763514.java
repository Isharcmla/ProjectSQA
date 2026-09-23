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

public class NodeUtil_newQualifiedNameNode_1828868763514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42732;

    public NodeUtil_newQualifiedNameNode_1828868763514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42732, term42732.getClass(), "str", "");
        setIntField(term42732, term42732.getClass(), "type", 38);
        setField(term42732, term42732.getClass(), "next", null);
        setField(term42732, term42732.getClass(), "first", null);
        setField(term42732, term42732.getClass(), "last", null);
        setField(term42732, term42732.getClass(), "propListHead", null);
        setIntField(term42732, term42732.getClass(), "sourcePosition", 0);
        setField(term42732, term42732.getClass(), "jsType", null);
        setField(term42732, term42732.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term42732));
    }

};


