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

public class MustBeReachingVariableDef_computeMustDef_1796935056152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42407;
     Object term42499;
     Object term43617;
     Object term43618;

    public MustBeReachingVariableDef_computeMustDef_1796935056152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42407 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term42499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42591 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42775 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term42499, term42499.getClass(), "type", 1265463001);
        setIntField(term42591, term42591.getClass(), "type", -2027534003);
        setIntField(term42683, term42683.getClass(), "type", 1375330971);
        setField(term42683, term42683.getClass(), "first", null);
        setField(term42683, term42683.getClass(), "next", null);
        setField(term42591, term42591.getClass(), "first", term42683);
        setIntField(term42775, term42775.getClass(), "type", 0);
        setField(term42775, term42775.getClass(), "first", null);
        setField(term42775, term42775.getClass(), "next", term42867);
        setField(term42591, term42591.getClass(), "next", term42775);
        setField(term42499, term42499.getClass(), "first", term42591);
        term43617 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term43617, term43617.getClass(), "jsScope", null);
        setField(term43617, term43617.getClass(), "compiler", null);
        setField(term43617, term43617.getClass(), "escaped", null);
        setField(term43617, term43617.getClass(), "cfg", null);
        setField(term43617, term43617.getClass(), "joinOp", null);
        setField(term43617, term43617.getClass(), "orderedWorkSet", null);
        term43618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term43618, term43618.getClass(), "str", null);
        setIntField(term43618, term43618.getClass(), "type", 1265463001);
        setField(term43618, term43618.getClass(), "next", null);
        setField(term43619, term43619.getClass(), "str", null);
        setIntField(term43619, term43619.getClass(), "type", -2027534003);
        setField(term43620, term43620.getClass(), "str", null);
        setIntField(term43620, term43620.getClass(), "type", 0);
        setField(term43621, term43621.getClass(), "str", null);
        setIntField(term43621, term43621.getClass(), "type", 0);
        setField(term43621, term43621.getClass(), "next", null);
        setField(term43621, term43621.getClass(), "first", null);
        setField(term43621, term43621.getClass(), "last", null);
        setField(term43621, term43621.getClass(), "propListHead", null);
        setIntField(term43621, term43621.getClass(), "sourcePosition", 0);
        setField(term43621, term43621.getClass(), "jsType", null);
        setField(term43621, term43621.getClass(), "parent", null);
        setField(term43620, term43620.getClass(), "next", term43621);
        setField(term43620, term43620.getClass(), "first", null);
        setField(term43620, term43620.getClass(), "last", null);
        setField(term43620, term43620.getClass(), "propListHead", null);
        setIntField(term43620, term43620.getClass(), "sourcePosition", 0);
        setField(term43620, term43620.getClass(), "jsType", null);
        setField(term43620, term43620.getClass(), "parent", null);
        setField(term43619, term43619.getClass(), "next", term43620);
        setField(term43622, term43622.getClass(), "str", null);
        setIntField(term43622, term43622.getClass(), "type", 1375330971);
        setField(term43622, term43622.getClass(), "next", null);
        setField(term43622, term43622.getClass(), "first", null);
        setField(term43622, term43622.getClass(), "last", null);
        setField(term43622, term43622.getClass(), "propListHead", null);
        setIntField(term43622, term43622.getClass(), "sourcePosition", 0);
        setField(term43622, term43622.getClass(), "jsType", null);
        setField(term43622, term43622.getClass(), "parent", null);
        setField(term43619, term43619.getClass(), "first", term43622);
        setField(term43619, term43619.getClass(), "last", null);
        setField(term43619, term43619.getClass(), "propListHead", null);
        setIntField(term43619, term43619.getClass(), "sourcePosition", 0);
        setField(term43619, term43619.getClass(), "jsType", null);
        setField(term43619, term43619.getClass(), "parent", null);
        setField(term43618, term43618.getClass(), "first", term43619);
        setField(term43618, term43618.getClass(), "last", null);
        setField(term43618, term43618.getClass(), "propListHead", null);
        setIntField(term43618, term43618.getClass(), "sourcePosition", 0);
        setField(term43618, term43618.getClass(), "jsType", null);
        setField(term43618, term43618.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term42499;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term42407, args);
        assertTrue(recursiveEquals(term42407, term43617));
        assertTrue(recursiveEquals(term42499, term43618));
    }

};


