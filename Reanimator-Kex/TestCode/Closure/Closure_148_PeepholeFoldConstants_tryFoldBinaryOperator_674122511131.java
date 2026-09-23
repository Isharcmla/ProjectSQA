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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22793;
     Object term22863;
     Object term23714;
     Object term23715;
     Object term23681;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term22863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22933, term22933.getClass(), "next", term23003);
        setIntField(term22933, term22933.getClass(), "type", 63);
        setField(term22863, term22863.getClass(), "first", term22933);
        setIntField(term22863, term22863.getClass(), "type", 35);
        term23714 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23714, term23714.getClass(), "currentTraversal", null);
        term23715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23715, term23715.getClass(), "type", 35);
        setField(term23715, term23715.getClass(), "next", null);
        setIntField(term23716, term23716.getClass(), "type", 63);
        setIntField(term23717, term23717.getClass(), "type", 0);
        setField(term23717, term23717.getClass(), "next", null);
        setField(term23717, term23717.getClass(), "first", null);
        setField(term23717, term23717.getClass(), "last", null);
        setField(term23717, term23717.getClass(), "propListHead", null);
        setIntField(term23717, term23717.getClass(), "sourcePosition", 0);
        setField(term23717, term23717.getClass(), "jsType", null);
        setField(term23717, term23717.getClass(), "parent", null);
        setField(term23716, term23716.getClass(), "next", term23717);
        setField(term23716, term23716.getClass(), "first", null);
        setField(term23716, term23716.getClass(), "last", null);
        setField(term23716, term23716.getClass(), "propListHead", null);
        setIntField(term23716, term23716.getClass(), "sourcePosition", 0);
        setField(term23716, term23716.getClass(), "jsType", null);
        setField(term23716, term23716.getClass(), "parent", null);
        setField(term23715, term23715.getClass(), "first", term23716);
        setField(term23715, term23715.getClass(), "last", null);
        setField(term23715, term23715.getClass(), "propListHead", null);
        setIntField(term23715, term23715.getClass(), "sourcePosition", 0);
        setField(term23715, term23715.getClass(), "jsType", null);
        setField(term23715, term23715.getClass(), "parent", null);
        term23681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23681, term23681.getClass(), "type", 35);
        setField(term23681, term23681.getClass(), "next", null);
        setIntField(term23683, term23683.getClass(), "type", 63);
        setIntField(term23685, term23685.getClass(), "type", 0);
        setField(term23685, term23685.getClass(), "next", null);
        setField(term23685, term23685.getClass(), "first", null);
        setField(term23685, term23685.getClass(), "last", null);
        setField(term23685, term23685.getClass(), "propListHead", null);
        setIntField(term23685, term23685.getClass(), "sourcePosition", 0);
        setField(term23685, term23685.getClass(), "jsType", null);
        setField(term23685, term23685.getClass(), "parent", null);
        setField(term23683, term23683.getClass(), "next", term23685);
        setField(term23683, term23683.getClass(), "first", null);
        setField(term23683, term23683.getClass(), "last", null);
        setField(term23683, term23683.getClass(), "propListHead", null);
        setIntField(term23683, term23683.getClass(), "sourcePosition", 0);
        setField(term23683, term23683.getClass(), "jsType", null);
        setField(term23683, term23683.getClass(), "parent", null);
        setField(term23681, term23681.getClass(), "first", term23683);
        setField(term23681, term23681.getClass(), "last", null);
        setField(term23681, term23681.getClass(), "propListHead", null);
        setIntField(term23681, term23681.getClass(), "sourcePosition", 0);
        setField(term23681, term23681.getClass(), "jsType", null);
        setField(term23681, term23681.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22863;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term22793, args);
        assertTrue(recursiveEquals(term22793, term23714));
        assertTrue(recursiveEquals(term22863, term23715));
        assertTrue(recursiveEquals(retValue, term23681));
    }

};


