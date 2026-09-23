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

public class NodeUtil_checkForStateChangeHelper_856076007433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37515;
     Object term37527;

    public NodeUtil_checkForStateChangeHelper_856076007433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37515, term37515.getClass(), "type", 33);
        term37527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37527, term37527.getClass(), "type", 33);
        setField(term37527, term37527.getClass(), "next", null);
        setField(term37527, term37527.getClass(), "first", null);
        setField(term37527, term37527.getClass(), "last", null);
        setField(term37527, term37527.getClass(), "propListHead", null);
        setIntField(term37527, term37527.getClass(), "sourcePosition", 0);
        setField(term37527, term37527.getClass(), "jsType", null);
        setField(term37527, term37527.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term37515;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term37515, term37527));
        assertTrue(recursiveEquals(retValue, false));
    }

};


