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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265;
     Object term2370;
     Object term2608;
     Object term2610;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term2370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2265, term2265.getClass(), "parent", term2370);
        term2608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2608, term2608.getClass(), "type", 0);
        setField(term2608, term2608.getClass(), "next", null);
        setField(term2608, term2608.getClass(), "first", null);
        setField(term2608, term2608.getClass(), "last", null);
        setField(term2608, term2608.getClass(), "propListHead", null);
        setIntField(term2608, term2608.getClass(), "sourcePosition", 0);
        setField(term2608, term2608.getClass(), "jsType", null);
        setIntField(term2609, term2609.getClass(), "type", 0);
        setField(term2609, term2609.getClass(), "next", null);
        setField(term2609, term2609.getClass(), "first", null);
        setField(term2609, term2609.getClass(), "last", null);
        setField(term2609, term2609.getClass(), "propListHead", null);
        setIntField(term2609, term2609.getClass(), "sourcePosition", 0);
        setField(term2609, term2609.getClass(), "jsType", null);
        setField(term2609, term2609.getClass(), "parent", null);
        setField(term2608, term2608.getClass(), "parent", term2609);
        term2610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2610, term2610.getClass(), "type", 0);
        setField(term2610, term2610.getClass(), "next", null);
        setField(term2610, term2610.getClass(), "first", null);
        setField(term2610, term2610.getClass(), "last", null);
        setField(term2610, term2610.getClass(), "propListHead", null);
        setIntField(term2610, term2610.getClass(), "sourcePosition", 0);
        setField(term2610, term2610.getClass(), "jsType", null);
        setField(term2610, term2610.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2265;
        args[1] = term2370;
        args[2] = null;
        Object retValue = callMethod(klass, "checkLeftOf", argTypes, null, args);
        assertTrue(recursiveEquals(term2265, term2608));
        assertTrue(recursiveEquals(term2370, term2610));
        assertTrue(recursiveEquals(retValue, false));
    }

};


