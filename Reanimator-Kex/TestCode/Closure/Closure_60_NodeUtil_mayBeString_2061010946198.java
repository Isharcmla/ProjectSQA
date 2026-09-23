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

public class NodeUtil_mayBeString_2061010946198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883;
     Object term9794;

    public NodeUtil_mayBeString_2061010946198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term883, term883.getClass(), "type", -1938881385);
        setIntField(term885, term885.getClass(), "type", -350454594);
        setIntField(term887, term887.getClass(), "type", 0);
        setField(term887, term887.getClass(), "next", null);
        setField(term887, term887.getClass(), "first", null);
        setField(term887, term887.getClass(), "last", null);
        setField(term887, term887.getClass(), "propListHead", null);
        setIntField(term887, term887.getClass(), "sourcePosition", 0);
        setField(term887, term887.getClass(), "jsType", null);
        setField(term887, term887.getClass(), "parent", null);
        setField(term885, term885.getClass(), "next", term887);
        setIntField(term890, term890.getClass(), "type", 0);
        setField(term890, term890.getClass(), "next", null);
        setField(term890, term890.getClass(), "first", null);
        setField(term890, term890.getClass(), "last", null);
        setField(term890, term890.getClass(), "propListHead", null);
        setIntField(term890, term890.getClass(), "sourcePosition", 0);
        setField(term890, term890.getClass(), "jsType", null);
        setField(term890, term890.getClass(), "parent", null);
        setField(term885, term885.getClass(), "first", term890);
        setIntField(term893, term893.getClass(), "type", 0);
        setField(term893, term893.getClass(), "next", null);
        setField(term893, term893.getClass(), "first", null);
        setField(term893, term893.getClass(), "last", null);
        setField(term893, term893.getClass(), "propListHead", null);
        setIntField(term893, term893.getClass(), "sourcePosition", 0);
        setField(term893, term893.getClass(), "jsType", null);
        setField(term893, term893.getClass(), "parent", null);
        setField(term885, term885.getClass(), "last", term893);
        setField(term885, term885.getClass(), "propListHead", null);
        setIntField(term885, term885.getClass(), "sourcePosition", 0);
        setField(term885, term885.getClass(), "jsType", null);
        setField(term885, term885.getClass(), "parent", null);
        setField(term883, term883.getClass(), "next", term885);
        setIntField(term897, term897.getClass(), "type", 0);
        setField(term897, term897.getClass(), "next", null);
        setField(term897, term897.getClass(), "first", null);
        setField(term897, term897.getClass(), "last", null);
        setField(term897, term897.getClass(), "propListHead", null);
        setIntField(term897, term897.getClass(), "sourcePosition", 0);
        setField(term897, term897.getClass(), "jsType", null);
        setField(term897, term897.getClass(), "parent", null);
        setField(term883, term883.getClass(), "first", term897);
        setIntField(term900, term900.getClass(), "type", 0);
        setField(term900, term900.getClass(), "next", null);
        setField(term900, term900.getClass(), "first", null);
        setField(term900, term900.getClass(), "last", null);
        setField(term900, term900.getClass(), "propListHead", null);
        setIntField(term900, term900.getClass(), "sourcePosition", 0);
        setField(term900, term900.getClass(), "jsType", null);
        setField(term900, term900.getClass(), "parent", null);
        setField(term883, term883.getClass(), "last", term900);
        setField(term883, term883.getClass(), "propListHead", null);
        setIntField(term883, term883.getClass(), "sourcePosition", 0);
        setField(term883, term883.getClass(), "jsType", null);
        setField(term883, term883.getClass(), "parent", null);
        term9794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9794, term9794.getClass(), "type", -1938881385);
        setIntField(term9795, term9795.getClass(), "type", -350454594);
        setIntField(term9796, term9796.getClass(), "type", 0);
        setField(term9796, term9796.getClass(), "next", null);
        setField(term9796, term9796.getClass(), "first", null);
        setField(term9796, term9796.getClass(), "last", null);
        setField(term9796, term9796.getClass(), "propListHead", null);
        setIntField(term9796, term9796.getClass(), "sourcePosition", 0);
        setField(term9796, term9796.getClass(), "jsType", null);
        setField(term9796, term9796.getClass(), "parent", null);
        setField(term9795, term9795.getClass(), "next", term9796);
        setIntField(term9797, term9797.getClass(), "type", 0);
        setField(term9797, term9797.getClass(), "next", null);
        setField(term9797, term9797.getClass(), "first", null);
        setField(term9797, term9797.getClass(), "last", null);
        setField(term9797, term9797.getClass(), "propListHead", null);
        setIntField(term9797, term9797.getClass(), "sourcePosition", 0);
        setField(term9797, term9797.getClass(), "jsType", null);
        setField(term9797, term9797.getClass(), "parent", null);
        setField(term9795, term9795.getClass(), "first", term9797);
        setIntField(term9798, term9798.getClass(), "type", 0);
        setField(term9798, term9798.getClass(), "next", null);
        setField(term9798, term9798.getClass(), "first", null);
        setField(term9798, term9798.getClass(), "last", null);
        setField(term9798, term9798.getClass(), "propListHead", null);
        setIntField(term9798, term9798.getClass(), "sourcePosition", 0);
        setField(term9798, term9798.getClass(), "jsType", null);
        setField(term9798, term9798.getClass(), "parent", null);
        setField(term9795, term9795.getClass(), "last", term9798);
        setField(term9795, term9795.getClass(), "propListHead", null);
        setIntField(term9795, term9795.getClass(), "sourcePosition", 0);
        setField(term9795, term9795.getClass(), "jsType", null);
        setField(term9795, term9795.getClass(), "parent", null);
        setField(term9794, term9794.getClass(), "next", term9795);
        setIntField(term9799, term9799.getClass(), "type", 0);
        setField(term9799, term9799.getClass(), "next", null);
        setField(term9799, term9799.getClass(), "first", null);
        setField(term9799, term9799.getClass(), "last", null);
        setField(term9799, term9799.getClass(), "propListHead", null);
        setIntField(term9799, term9799.getClass(), "sourcePosition", 0);
        setField(term9799, term9799.getClass(), "jsType", null);
        setField(term9799, term9799.getClass(), "parent", null);
        setField(term9794, term9794.getClass(), "first", term9799);
        setIntField(term9800, term9800.getClass(), "type", 0);
        setField(term9800, term9800.getClass(), "next", null);
        setField(term9800, term9800.getClass(), "first", null);
        setField(term9800, term9800.getClass(), "last", null);
        setField(term9800, term9800.getClass(), "propListHead", null);
        setIntField(term9800, term9800.getClass(), "sourcePosition", 0);
        setField(term9800, term9800.getClass(), "jsType", null);
        setField(term9800, term9800.getClass(), "parent", null);
        setField(term9794, term9794.getClass(), "last", term9800);
        setField(term9794, term9794.getClass(), "propListHead", null);
        setIntField(term9794, term9794.getClass(), "sourcePosition", 0);
        setField(term9794, term9794.getClass(), "jsType", null);
        setField(term9794, term9794.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term883;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term883, term9794));
    }

};


