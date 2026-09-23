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

public class NodeUtil_checkForStateChangeHelper_59481725366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29378;
     Object term29475;

    public NodeUtil_checkForStateChangeHelper_59481725366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29378, term29378.getClass(), "type", 66);
        term29475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29475, term29475.getClass(), "type", 66);
        setField(term29475, term29475.getClass(), "next", null);
        setField(term29475, term29475.getClass(), "first", null);
        setField(term29475, term29475.getClass(), "last", null);
        setField(term29475, term29475.getClass(), "propListHead", null);
        setIntField(term29475, term29475.getClass(), "sourcePosition", 0);
        setField(term29475, term29475.getClass(), "jsType", null);
        setField(term29475, term29475.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29378;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term29378, term29475));
        assertTrue(recursiveEquals(retValue, true));
    }

};


