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

public class FoldConstants_tryFoldBlock_1167048042211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53953;
     Object term54023;
     Object term54681;
     Object term54682;

    public FoldConstants_tryFoldBlock_1167048042211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53953 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term54023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54233, term54233.getClass(), "next", term54303);
        setIntField(term54233, term54233.getClass(), "type", 81);
        setField(term54163, term54163.getClass(), "next", term54233);
        setIntField(term54163, term54163.getClass(), "type", 87);
        setIntField(term54373, term54373.getClass(), "type", 75);
        setField(term54163, term54163.getClass(), "first", term54373);
        setField(term54093, term54093.getClass(), "next", term54163);
        setIntField(term54093, term54093.getClass(), "type", 75);
        setField(term54023, term54023.getClass(), "first", term54093);
        term54681 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term54681, term54681.getClass(), "compiler", null);
        term54682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54682, term54682.getClass(), "type", 0);
        setField(term54682, term54682.getClass(), "next", null);
        setIntField(term54683, term54683.getClass(), "type", 75);
        setIntField(term54684, term54684.getClass(), "type", 87);
        setIntField(term54685, term54685.getClass(), "type", 81);
        setIntField(term54686, term54686.getClass(), "type", 0);
        setField(term54686, term54686.getClass(), "next", null);
        setField(term54686, term54686.getClass(), "first", null);
        setField(term54686, term54686.getClass(), "last", null);
        setField(term54686, term54686.getClass(), "propListHead", null);
        setIntField(term54686, term54686.getClass(), "sourcePosition", 0);
        setField(term54686, term54686.getClass(), "jsType", null);
        setField(term54686, term54686.getClass(), "parent", null);
        setField(term54685, term54685.getClass(), "next", term54686);
        setField(term54685, term54685.getClass(), "first", null);
        setField(term54685, term54685.getClass(), "last", null);
        setField(term54685, term54685.getClass(), "propListHead", null);
        setIntField(term54685, term54685.getClass(), "sourcePosition", 0);
        setField(term54685, term54685.getClass(), "jsType", null);
        setField(term54685, term54685.getClass(), "parent", null);
        setField(term54684, term54684.getClass(), "next", term54685);
        setIntField(term54687, term54687.getClass(), "type", 75);
        setField(term54687, term54687.getClass(), "next", null);
        setField(term54687, term54687.getClass(), "first", null);
        setField(term54687, term54687.getClass(), "last", null);
        setField(term54687, term54687.getClass(), "propListHead", null);
        setIntField(term54687, term54687.getClass(), "sourcePosition", 0);
        setField(term54687, term54687.getClass(), "jsType", null);
        setField(term54687, term54687.getClass(), "parent", null);
        setField(term54684, term54684.getClass(), "first", term54687);
        setField(term54684, term54684.getClass(), "last", null);
        setField(term54684, term54684.getClass(), "propListHead", null);
        setIntField(term54684, term54684.getClass(), "sourcePosition", 0);
        setField(term54684, term54684.getClass(), "jsType", null);
        setField(term54684, term54684.getClass(), "parent", null);
        setField(term54683, term54683.getClass(), "next", term54684);
        setField(term54683, term54683.getClass(), "first", null);
        setField(term54683, term54683.getClass(), "last", null);
        setField(term54683, term54683.getClass(), "propListHead", null);
        setIntField(term54683, term54683.getClass(), "sourcePosition", 0);
        setField(term54683, term54683.getClass(), "jsType", null);
        setField(term54683, term54683.getClass(), "parent", null);
        setField(term54682, term54682.getClass(), "first", term54683);
        setField(term54682, term54682.getClass(), "last", null);
        setField(term54682, term54682.getClass(), "propListHead", null);
        setIntField(term54682, term54682.getClass(), "sourcePosition", 0);
        setField(term54682, term54682.getClass(), "jsType", null);
        setField(term54682, term54682.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term54023;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term53953, args);
        assertTrue(recursiveEquals(term53953, term54681));
        assertTrue(recursiveEquals(term54023, null));
    }

};


