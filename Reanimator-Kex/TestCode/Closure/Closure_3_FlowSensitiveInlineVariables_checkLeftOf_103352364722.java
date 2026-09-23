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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2579;
     Object term2684;
     Object term3206;
     Object term3208;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term2684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2579, term2579.getClass(), "parent", term2684);
        term3206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3206, term3206.getClass(), "type", 0);
        setField(term3206, term3206.getClass(), "next", null);
        setField(term3206, term3206.getClass(), "first", null);
        setField(term3206, term3206.getClass(), "last", null);
        setField(term3206, term3206.getClass(), "propListHead", null);
        setIntField(term3206, term3206.getClass(), "sourcePosition", 0);
        setField(term3206, term3206.getClass(), "jsType", null);
        setIntField(term3207, term3207.getClass(), "type", 0);
        setField(term3207, term3207.getClass(), "next", null);
        setField(term3207, term3207.getClass(), "first", null);
        setField(term3207, term3207.getClass(), "last", null);
        setField(term3207, term3207.getClass(), "propListHead", null);
        setIntField(term3207, term3207.getClass(), "sourcePosition", 0);
        setField(term3207, term3207.getClass(), "jsType", null);
        setField(term3207, term3207.getClass(), "parent", null);
        setField(term3206, term3206.getClass(), "parent", term3207);
        term3208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3208, term3208.getClass(), "type", 0);
        setField(term3208, term3208.getClass(), "next", null);
        setField(term3208, term3208.getClass(), "first", null);
        setField(term3208, term3208.getClass(), "last", null);
        setField(term3208, term3208.getClass(), "propListHead", null);
        setIntField(term3208, term3208.getClass(), "sourcePosition", 0);
        setField(term3208, term3208.getClass(), "jsType", null);
        setField(term3208, term3208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2579;
        args[1] = term2684;
        args[2] = null;
        Object retValue = callMethod(klass, "checkLeftOf", argTypes, null, args);
        assertTrue(recursiveEquals(term2579, term3206));
        assertTrue(recursiveEquals(term2684, term3208));
        assertTrue(recursiveEquals(retValue, false));
    }

};


