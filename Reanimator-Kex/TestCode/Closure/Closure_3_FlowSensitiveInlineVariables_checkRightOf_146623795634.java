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

public class FlowSensitiveInlineVariables_checkRightOf_146623795634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5528;
     Object term5668;
     Object term5760;
     Object term5793;
     Object term5794;
     Object term5796;

    public FlowSensitiveInlineVariables_checkRightOf_146623795634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5528, term5528.getClass(), "next", term5598);
        term5668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5760 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer$1"));
        term5793 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer$1"));
        term5794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5794, term5794.getClass(), "type", 0);
        setIntField(term5795, term5795.getClass(), "type", 0);
        setField(term5795, term5795.getClass(), "next", null);
        setField(term5795, term5795.getClass(), "first", null);
        setField(term5795, term5795.getClass(), "last", null);
        setField(term5795, term5795.getClass(), "propListHead", null);
        setIntField(term5795, term5795.getClass(), "sourcePosition", 0);
        setField(term5795, term5795.getClass(), "jsType", null);
        setField(term5795, term5795.getClass(), "parent", null);
        setField(term5794, term5794.getClass(), "next", term5795);
        setField(term5794, term5794.getClass(), "first", null);
        setField(term5794, term5794.getClass(), "last", null);
        setField(term5794, term5794.getClass(), "propListHead", null);
        setIntField(term5794, term5794.getClass(), "sourcePosition", 0);
        setField(term5794, term5794.getClass(), "jsType", null);
        setField(term5794, term5794.getClass(), "parent", null);
        term5796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5796, term5796.getClass(), "type", 0);
        setField(term5796, term5796.getClass(), "next", null);
        setField(term5796, term5796.getClass(), "first", null);
        setField(term5796, term5796.getClass(), "last", null);
        setField(term5796, term5796.getClass(), "propListHead", null);
        setIntField(term5796, term5796.getClass(), "sourcePosition", 0);
        setField(term5796, term5796.getClass(), "jsType", null);
        setField(term5796, term5796.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term5528;
        args[1] = term5668;
        args[2] = term5760;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term5528, term5793));
        assertTrue(recursiveEquals(term5668, term5794));
        assertTrue(recursiveEquals(term5760, term5796));
        assertTrue(recursiveEquals(retValue, true));
    }

};


