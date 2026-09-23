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

public class NodeUtil_getInfoForNameNode_2009241699439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34616;
     Object term34626;

    public NodeUtil_getInfoForNameNode_2009241699439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34616, term34616.getClass(), "propListHead", null);
        term34626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34626, term34626.getClass(), "type", 0);
        setField(term34626, term34626.getClass(), "next", null);
        setField(term34626, term34626.getClass(), "first", null);
        setField(term34626, term34626.getClass(), "last", null);
        setField(term34626, term34626.getClass(), "propListHead", null);
        setIntField(term34626, term34626.getClass(), "sourcePosition", 0);
        setField(term34626, term34626.getClass(), "jsType", null);
        setField(term34626, term34626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34616;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term34616, term34626));
        assertTrue(recursiveEquals(retValue, null));
    }

};


