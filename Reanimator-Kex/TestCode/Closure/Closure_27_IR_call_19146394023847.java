package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_call_19146394023847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756399;
     Object term756308;
     Object term756748;
     Object term756750;
     Object term756739;

    public IR_call_19146394023847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term756399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term756399, term756399.getClass(), "parent", null);
        setField(term756399, term756399.getClass(), "next", null);
        term756308 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term756748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term756748, term756748.getClass(), "type", 0);
        setField(term756748, term756748.getClass(), "next", null);
        setField(term756748, term756748.getClass(), "first", null);
        setField(term756748, term756748.getClass(), "last", null);
        setField(term756748, term756748.getClass(), "propListHead", null);
        setIntField(term756748, term756748.getClass(), "sourcePosition", 0);
        setField(term756748, term756748.getClass(), "jsType", null);
        setIntField(term756749, term756749.getClass(), "type", 37);
        setField(term756749, term756749.getClass(), "next", null);
        setField(term756749, term756749.getClass(), "first", term756748);
        setField(term756749, term756749.getClass(), "last", term756748);
        setField(term756749, term756749.getClass(), "propListHead", null);
        setIntField(term756749, term756749.getClass(), "sourcePosition", -1);
        setField(term756749, term756749.getClass(), "jsType", null);
        setField(term756749, term756749.getClass(), "parent", null);
        setField(term756748, term756748.getClass(), "parent", term756749);
        term756750 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term756739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term756739, term756739.getClass(), "type", 37);
        setField(term756739, term756739.getClass(), "next", null);
        setIntField(term756741, term756741.getClass(), "type", 0);
        setField(term756741, term756741.getClass(), "next", null);
        setField(term756741, term756741.getClass(), "first", null);
        setField(term756741, term756741.getClass(), "last", null);
        setField(term756741, term756741.getClass(), "propListHead", null);
        setIntField(term756741, term756741.getClass(), "sourcePosition", 0);
        setField(term756741, term756741.getClass(), "jsType", null);
        setField(term756741, term756741.getClass(), "parent", term756739);
        setField(term756739, term756739.getClass(), "first", term756741);
        setField(term756739, term756739.getClass(), "last", term756741);
        setField(term756739, term756739.getClass(), "propListHead", null);
        setIntField(term756739, term756739.getClass(), "sourcePosition", -1);
        setField(term756739, term756739.getClass(), "jsType", null);
        setField(term756739, term756739.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term756399;
        args[1] = term756308;
        Object retValue = callMethod(klass, "call", argTypes, null, args);
        assertTrue(recursiveEquals(term756399, term756748));
        assertTrue(recursiveEquals(term756308, term756750));
        assertTrue(recursiveEquals(retValue, term756739));
    }

};


