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

public class NodeUtil_checkForStateChangeHelper_59481725483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40242;
     Object term40254;

    public NodeUtil_checkForStateChangeHelper_59481725483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40242, term40242.getClass(), "type", 45);
        term40254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40254, term40254.getClass(), "type", 45);
        setField(term40254, term40254.getClass(), "next", null);
        setField(term40254, term40254.getClass(), "first", null);
        setField(term40254, term40254.getClass(), "last", null);
        setField(term40254, term40254.getClass(), "propListHead", null);
        setIntField(term40254, term40254.getClass(), "sourcePosition", 0);
        setField(term40254, term40254.getClass(), "jsType", null);
        setField(term40254, term40254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term40242;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term40242, term40254));
        assertTrue(recursiveEquals(retValue, false));
    }

};


