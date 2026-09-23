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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_has_1673681539284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3890;

    public NodeUtil_has_1673681539284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3903 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3913 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3890, term3890.getClass(), "type", 500127209);
        setIntField(term3892, term3892.getClass(), "type", -1516568587);
        setIntField(term3894, term3894.getClass(), "type", 0);
        setField(term3894, term3894.getClass(), "next", null);
        setField(term3894, term3894.getClass(), "first", null);
        setField(term3894, term3894.getClass(), "last", null);
        setField(term3894, term3894.getClass(), "propListHead", null);
        setIntField(term3894, term3894.getClass(), "sourcePosition", 0);
        setField(term3894, term3894.getClass(), "jsType", null);
        setField(term3894, term3894.getClass(), "parent", null);
        setField(term3892, term3892.getClass(), "next", term3894);
        setIntField(term3897, term3897.getClass(), "type", 0);
        setField(term3897, term3897.getClass(), "next", null);
        setField(term3897, term3897.getClass(), "first", null);
        setField(term3897, term3897.getClass(), "last", null);
        setField(term3897, term3897.getClass(), "propListHead", null);
        setIntField(term3897, term3897.getClass(), "sourcePosition", 0);
        setField(term3897, term3897.getClass(), "jsType", null);
        setField(term3897, term3897.getClass(), "parent", null);
        setField(term3892, term3892.getClass(), "first", term3897);
        setIntField(term3900, term3900.getClass(), "type", 0);
        setField(term3900, term3900.getClass(), "next", null);
        setField(term3900, term3900.getClass(), "first", null);
        setField(term3900, term3900.getClass(), "last", null);
        setField(term3900, term3900.getClass(), "propListHead", null);
        setIntField(term3900, term3900.getClass(), "sourcePosition", 0);
        setField(term3900, term3900.getClass(), "jsType", null);
        setField(term3900, term3900.getClass(), "parent", null);
        setField(term3892, term3892.getClass(), "last", term3900);
        setField(term3903, term3903.getClass(), "next", null);
        setIntField(term3903, term3903.getClass(), "type", 0);
        setIntField(term3903, term3903.getClass(), "intValue", 0);
        setField(term3903, term3903.getClass(), "objectValue", null);
        setField(term3892, term3892.getClass(), "propListHead", term3903);
        setIntField(term3892, term3892.getClass(), "sourcePosition", -1195191239);
        setField(term3892, term3892.getClass(), "jsType", null);
        setField(term3892, term3892.getClass(), "parent", null);
        setField(term3890, term3890.getClass(), "next", term3892);
        setIntField(term3907, term3907.getClass(), "type", 0);
        setField(term3907, term3907.getClass(), "next", null);
        setField(term3907, term3907.getClass(), "first", null);
        setField(term3907, term3907.getClass(), "last", null);
        setField(term3907, term3907.getClass(), "propListHead", null);
        setIntField(term3907, term3907.getClass(), "sourcePosition", 0);
        setField(term3907, term3907.getClass(), "jsType", null);
        setField(term3907, term3907.getClass(), "parent", null);
        setField(term3890, term3890.getClass(), "first", term3907);
        setIntField(term3910, term3910.getClass(), "type", 0);
        setField(term3910, term3910.getClass(), "next", null);
        setField(term3910, term3910.getClass(), "first", null);
        setField(term3910, term3910.getClass(), "last", null);
        setField(term3910, term3910.getClass(), "propListHead", null);
        setIntField(term3910, term3910.getClass(), "sourcePosition", 0);
        setField(term3910, term3910.getClass(), "jsType", null);
        setField(term3910, term3910.getClass(), "parent", null);
        setField(term3890, term3890.getClass(), "last", term3910);
        setField(term3913, term3913.getClass(), "next", null);
        setIntField(term3913, term3913.getClass(), "type", 0);
        setIntField(term3913, term3913.getClass(), "intValue", 0);
        setField(term3913, term3913.getClass(), "objectValue", null);
        setField(term3890, term3890.getClass(), "propListHead", term3913);
        setIntField(term3890, term3890.getClass(), "sourcePosition", -470798982);
        setField(term3890, term3890.getClass(), "jsType", null);
        setField(term3890, term3890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3890;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


