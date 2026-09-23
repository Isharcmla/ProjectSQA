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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5797;
     Object term5902;
     Object term6191;
     Object term6193;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5797, term5797.getClass(), "parent", term5902);
        term6191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6191, term6191.getClass(), "type", 0);
        setField(term6191, term6191.getClass(), "next", null);
        setField(term6191, term6191.getClass(), "first", null);
        setField(term6191, term6191.getClass(), "last", null);
        setField(term6191, term6191.getClass(), "propListHead", null);
        setIntField(term6191, term6191.getClass(), "sourcePosition", 0);
        setField(term6191, term6191.getClass(), "jsType", null);
        setIntField(term6192, term6192.getClass(), "type", 0);
        setField(term6192, term6192.getClass(), "next", null);
        setField(term6192, term6192.getClass(), "first", null);
        setField(term6192, term6192.getClass(), "last", null);
        setField(term6192, term6192.getClass(), "propListHead", null);
        setIntField(term6192, term6192.getClass(), "sourcePosition", 0);
        setField(term6192, term6192.getClass(), "jsType", null);
        setField(term6192, term6192.getClass(), "parent", null);
        setField(term6191, term6191.getClass(), "parent", term6192);
        term6193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6193, term6193.getClass(), "type", 0);
        setField(term6193, term6193.getClass(), "next", null);
        setField(term6193, term6193.getClass(), "first", null);
        setField(term6193, term6193.getClass(), "last", null);
        setField(term6193, term6193.getClass(), "propListHead", null);
        setIntField(term6193, term6193.getClass(), "sourcePosition", 0);
        setField(term6193, term6193.getClass(), "jsType", null);
        setField(term6193, term6193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term5797;
        args[1] = term5902;
        args[2] = null;
        Object retValue = callMethod(klass, "checkLeftOf", argTypes, null, args);
        assertTrue(recursiveEquals(term5797, term6191));
        assertTrue(recursiveEquals(term5902, term6193));
        assertTrue(recursiveEquals(retValue, false));
    }

};


