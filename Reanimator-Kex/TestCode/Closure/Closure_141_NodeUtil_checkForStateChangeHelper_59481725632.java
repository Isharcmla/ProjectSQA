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

public class NodeUtil_checkForStateChangeHelper_59481725632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58627;
     Object term58971;

    public NodeUtil_checkForStateChangeHelper_59481725632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58627, term58627.getClass(), "type", 82);
        term58971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58971, term58971.getClass(), "type", 82);
        setField(term58971, term58971.getClass(), "next", null);
        setField(term58971, term58971.getClass(), "first", null);
        setField(term58971, term58971.getClass(), "last", null);
        setField(term58971, term58971.getClass(), "propListHead", null);
        setIntField(term58971, term58971.getClass(), "sourcePosition", 0);
        setField(term58971, term58971.getClass(), "jsType", null);
        setField(term58971, term58971.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term58627;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term58627, term58971));
        assertTrue(recursiveEquals(retValue, true));
    }

};


