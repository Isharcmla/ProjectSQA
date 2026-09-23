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

public class NodeUtil_checkForStateChangeHelper_59481725281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22462;
     Object term22476;

    public NodeUtil_checkForStateChangeHelper_59481725281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22462, term22462.getClass(), "type", 43);
        term22476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22476, term22476.getClass(), "type", 43);
        setField(term22476, term22476.getClass(), "next", null);
        setField(term22476, term22476.getClass(), "first", null);
        setField(term22476, term22476.getClass(), "last", null);
        setField(term22476, term22476.getClass(), "propListHead", null);
        setIntField(term22476, term22476.getClass(), "sourcePosition", 0);
        setField(term22476, term22476.getClass(), "jsType", null);
        setField(term22476, term22476.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term22462;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term22462, term22476));
        assertTrue(recursiveEquals(retValue, false));
    }

};


