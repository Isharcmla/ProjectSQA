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

public class NodeUtil_isPrototypePropertyDeclaration_1578262922278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2857;
     Object term19381;

    public NodeUtil_isPrototypePropertyDeclaration_1578262922278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2857, term2857.getClass(), "type", 114915275);
        setIntField(term2859, term2859.getClass(), "type", 1923558221);
        setIntField(term2861, term2861.getClass(), "type", 0);
        setField(term2861, term2861.getClass(), "next", null);
        setField(term2861, term2861.getClass(), "first", null);
        setField(term2861, term2861.getClass(), "last", null);
        setField(term2861, term2861.getClass(), "propListHead", null);
        setIntField(term2861, term2861.getClass(), "sourcePosition", 0);
        setField(term2861, term2861.getClass(), "jsType", null);
        setField(term2861, term2861.getClass(), "parent", null);
        setField(term2859, term2859.getClass(), "next", term2861);
        setIntField(term2864, term2864.getClass(), "type", 0);
        setField(term2864, term2864.getClass(), "next", null);
        setField(term2864, term2864.getClass(), "first", null);
        setField(term2864, term2864.getClass(), "last", null);
        setField(term2864, term2864.getClass(), "propListHead", null);
        setIntField(term2864, term2864.getClass(), "sourcePosition", 0);
        setField(term2864, term2864.getClass(), "jsType", null);
        setField(term2864, term2864.getClass(), "parent", null);
        setField(term2859, term2859.getClass(), "first", term2864);
        setIntField(term2867, term2867.getClass(), "type", 0);
        setField(term2867, term2867.getClass(), "next", null);
        setField(term2867, term2867.getClass(), "first", null);
        setField(term2867, term2867.getClass(), "last", null);
        setField(term2867, term2867.getClass(), "propListHead", null);
        setIntField(term2867, term2867.getClass(), "sourcePosition", 0);
        setField(term2867, term2867.getClass(), "jsType", null);
        setField(term2867, term2867.getClass(), "parent", null);
        setField(term2859, term2859.getClass(), "last", term2867);
        setField(term2859, term2859.getClass(), "propListHead", null);
        setIntField(term2859, term2859.getClass(), "sourcePosition", 0);
        setField(term2859, term2859.getClass(), "jsType", null);
        setField(term2859, term2859.getClass(), "parent", null);
        setField(term2857, term2857.getClass(), "next", term2859);
        setIntField(term2871, term2871.getClass(), "type", 0);
        setField(term2871, term2871.getClass(), "next", null);
        setField(term2871, term2871.getClass(), "first", null);
        setField(term2871, term2871.getClass(), "last", null);
        setField(term2871, term2871.getClass(), "propListHead", null);
        setIntField(term2871, term2871.getClass(), "sourcePosition", 0);
        setField(term2871, term2871.getClass(), "jsType", null);
        setField(term2871, term2871.getClass(), "parent", null);
        setField(term2857, term2857.getClass(), "first", term2871);
        setIntField(term2874, term2874.getClass(), "type", 0);
        setField(term2874, term2874.getClass(), "next", null);
        setField(term2874, term2874.getClass(), "first", null);
        setField(term2874, term2874.getClass(), "last", null);
        setField(term2874, term2874.getClass(), "propListHead", null);
        setIntField(term2874, term2874.getClass(), "sourcePosition", 0);
        setField(term2874, term2874.getClass(), "jsType", null);
        setField(term2874, term2874.getClass(), "parent", null);
        setField(term2857, term2857.getClass(), "last", term2874);
        setField(term2857, term2857.getClass(), "propListHead", null);
        setIntField(term2857, term2857.getClass(), "sourcePosition", 0);
        setField(term2857, term2857.getClass(), "jsType", null);
        setField(term2857, term2857.getClass(), "parent", null);
        term19381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19381, term19381.getClass(), "type", 114915275);
        setIntField(term19382, term19382.getClass(), "type", 1923558221);
        setIntField(term19383, term19383.getClass(), "type", 0);
        setField(term19383, term19383.getClass(), "next", null);
        setField(term19383, term19383.getClass(), "first", null);
        setField(term19383, term19383.getClass(), "last", null);
        setField(term19383, term19383.getClass(), "propListHead", null);
        setIntField(term19383, term19383.getClass(), "sourcePosition", 0);
        setField(term19383, term19383.getClass(), "jsType", null);
        setField(term19383, term19383.getClass(), "parent", null);
        setField(term19382, term19382.getClass(), "next", term19383);
        setIntField(term19384, term19384.getClass(), "type", 0);
        setField(term19384, term19384.getClass(), "next", null);
        setField(term19384, term19384.getClass(), "first", null);
        setField(term19384, term19384.getClass(), "last", null);
        setField(term19384, term19384.getClass(), "propListHead", null);
        setIntField(term19384, term19384.getClass(), "sourcePosition", 0);
        setField(term19384, term19384.getClass(), "jsType", null);
        setField(term19384, term19384.getClass(), "parent", null);
        setField(term19382, term19382.getClass(), "first", term19384);
        setIntField(term19385, term19385.getClass(), "type", 0);
        setField(term19385, term19385.getClass(), "next", null);
        setField(term19385, term19385.getClass(), "first", null);
        setField(term19385, term19385.getClass(), "last", null);
        setField(term19385, term19385.getClass(), "propListHead", null);
        setIntField(term19385, term19385.getClass(), "sourcePosition", 0);
        setField(term19385, term19385.getClass(), "jsType", null);
        setField(term19385, term19385.getClass(), "parent", null);
        setField(term19382, term19382.getClass(), "last", term19385);
        setField(term19382, term19382.getClass(), "propListHead", null);
        setIntField(term19382, term19382.getClass(), "sourcePosition", 0);
        setField(term19382, term19382.getClass(), "jsType", null);
        setField(term19382, term19382.getClass(), "parent", null);
        setField(term19381, term19381.getClass(), "next", term19382);
        setIntField(term19386, term19386.getClass(), "type", 0);
        setField(term19386, term19386.getClass(), "next", null);
        setField(term19386, term19386.getClass(), "first", null);
        setField(term19386, term19386.getClass(), "last", null);
        setField(term19386, term19386.getClass(), "propListHead", null);
        setIntField(term19386, term19386.getClass(), "sourcePosition", 0);
        setField(term19386, term19386.getClass(), "jsType", null);
        setField(term19386, term19386.getClass(), "parent", null);
        setField(term19381, term19381.getClass(), "first", term19386);
        setIntField(term19387, term19387.getClass(), "type", 0);
        setField(term19387, term19387.getClass(), "next", null);
        setField(term19387, term19387.getClass(), "first", null);
        setField(term19387, term19387.getClass(), "last", null);
        setField(term19387, term19387.getClass(), "propListHead", null);
        setIntField(term19387, term19387.getClass(), "sourcePosition", 0);
        setField(term19387, term19387.getClass(), "jsType", null);
        setField(term19387, term19387.getClass(), "parent", null);
        setField(term19381, term19381.getClass(), "last", term19387);
        setField(term19381, term19381.getClass(), "propListHead", null);
        setIntField(term19381, term19381.getClass(), "sourcePosition", 0);
        setField(term19381, term19381.getClass(), "jsType", null);
        setField(term19381, term19381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2857;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2857, term19381));
        assertTrue(recursiveEquals(retValue, false));
    }

};


