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

public class NodeUtil_checkForStateChangeHelper_856076007491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42233;
     Object term42241;

    public NodeUtil_checkForStateChangeHelper_856076007491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42233, term42233.getClass(), "type", 125);
        term42241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42241, term42241.getClass(), "type", 125);
        setField(term42241, term42241.getClass(), "next", null);
        setField(term42241, term42241.getClass(), "first", null);
        setField(term42241, term42241.getClass(), "last", null);
        setField(term42241, term42241.getClass(), "propListHead", null);
        setIntField(term42241, term42241.getClass(), "sourcePosition", 0);
        setField(term42241, term42241.getClass(), "jsType", null);
        setField(term42241, term42241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term42233;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term42233, term42241));
        assertTrue(recursiveEquals(retValue, false));
    }

};


