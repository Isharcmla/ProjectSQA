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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96648;
     Object term96740;
     Object term97686;
     Object term97687;
     Object term97645;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term96740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term96832, term96832.getClass(), "next", term96924);
        setField(term96740, term96740.getClass(), "first", term96832);
        setIntField(term96740, term96740.getClass(), "type", 45);
        term97686 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term97686, term97686.getClass(), "currentTraversal", null);
        term97687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97687, term97687.getClass(), "number", 0.0);
        setIntField(term97687, term97687.getClass(), "type", 45);
        setField(term97687, term97687.getClass(), "next", null);
        setDoubleField(term97688, term97688.getClass(), "number", 0.0);
        setIntField(term97688, term97688.getClass(), "type", 0);
        setDoubleField(term97689, term97689.getClass(), "number", 0.0);
        setIntField(term97689, term97689.getClass(), "type", 0);
        setField(term97689, term97689.getClass(), "next", null);
        setField(term97689, term97689.getClass(), "first", null);
        setField(term97689, term97689.getClass(), "last", null);
        setField(term97689, term97689.getClass(), "propListHead", null);
        setIntField(term97689, term97689.getClass(), "sourcePosition", 0);
        setField(term97689, term97689.getClass(), "jsType", null);
        setField(term97689, term97689.getClass(), "parent", null);
        setField(term97688, term97688.getClass(), "next", term97689);
        setField(term97688, term97688.getClass(), "first", null);
        setField(term97688, term97688.getClass(), "last", null);
        setField(term97688, term97688.getClass(), "propListHead", null);
        setIntField(term97688, term97688.getClass(), "sourcePosition", 0);
        setField(term97688, term97688.getClass(), "jsType", null);
        setField(term97688, term97688.getClass(), "parent", null);
        setField(term97687, term97687.getClass(), "first", term97688);
        setField(term97687, term97687.getClass(), "last", null);
        setField(term97687, term97687.getClass(), "propListHead", null);
        setIntField(term97687, term97687.getClass(), "sourcePosition", 0);
        setField(term97687, term97687.getClass(), "jsType", null);
        setField(term97687, term97687.getClass(), "parent", null);
        term97645 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97645, term97645.getClass(), "number", 0.0);
        setIntField(term97645, term97645.getClass(), "type", 45);
        setField(term97645, term97645.getClass(), "next", null);
        setDoubleField(term97648, term97648.getClass(), "number", 0.0);
        setIntField(term97648, term97648.getClass(), "type", 0);
        setDoubleField(term97651, term97651.getClass(), "number", 0.0);
        setIntField(term97651, term97651.getClass(), "type", 0);
        setField(term97651, term97651.getClass(), "next", null);
        setField(term97651, term97651.getClass(), "first", null);
        setField(term97651, term97651.getClass(), "last", null);
        setField(term97651, term97651.getClass(), "propListHead", null);
        setIntField(term97651, term97651.getClass(), "sourcePosition", 0);
        setField(term97651, term97651.getClass(), "jsType", null);
        setField(term97651, term97651.getClass(), "parent", null);
        setField(term97648, term97648.getClass(), "next", term97651);
        setField(term97648, term97648.getClass(), "first", null);
        setField(term97648, term97648.getClass(), "last", null);
        setField(term97648, term97648.getClass(), "propListHead", null);
        setIntField(term97648, term97648.getClass(), "sourcePosition", 0);
        setField(term97648, term97648.getClass(), "jsType", null);
        setField(term97648, term97648.getClass(), "parent", null);
        setField(term97645, term97645.getClass(), "first", term97648);
        setField(term97645, term97645.getClass(), "last", null);
        setField(term97645, term97645.getClass(), "propListHead", null);
        setIntField(term97645, term97645.getClass(), "sourcePosition", 0);
        setField(term97645, term97645.getClass(), "jsType", null);
        setField(term97645, term97645.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96740;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term96648, args);
        assertTrue(recursiveEquals(term96648, term97686));
        assertTrue(recursiveEquals(term96740, term97687));
        assertTrue(recursiveEquals(retValue, term97645));
    }

};


