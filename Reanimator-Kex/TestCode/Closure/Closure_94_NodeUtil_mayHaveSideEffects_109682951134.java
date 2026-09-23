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

public class NodeUtil_mayHaveSideEffects_109682951134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;
     Object term5770;

    public NodeUtil_mayHaveSideEffects_109682951134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term392 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term379, term379.getClass(), "type", 1283079251);
        setIntField(term381, term381.getClass(), "type", -461771056);
        setIntField(term383, term383.getClass(), "type", 0);
        setField(term383, term383.getClass(), "next", null);
        setField(term383, term383.getClass(), "first", null);
        setField(term383, term383.getClass(), "last", null);
        setField(term383, term383.getClass(), "propListHead", null);
        setIntField(term383, term383.getClass(), "sourcePosition", 0);
        setField(term383, term383.getClass(), "jsType", null);
        setField(term383, term383.getClass(), "parent", null);
        setField(term381, term381.getClass(), "next", term383);
        setIntField(term386, term386.getClass(), "type", 0);
        setField(term386, term386.getClass(), "next", null);
        setField(term386, term386.getClass(), "first", null);
        setField(term386, term386.getClass(), "last", null);
        setField(term386, term386.getClass(), "propListHead", null);
        setIntField(term386, term386.getClass(), "sourcePosition", 0);
        setField(term386, term386.getClass(), "jsType", null);
        setField(term386, term386.getClass(), "parent", null);
        setField(term381, term381.getClass(), "first", term386);
        setIntField(term389, term389.getClass(), "type", 0);
        setField(term389, term389.getClass(), "next", null);
        setField(term389, term389.getClass(), "first", null);
        setField(term389, term389.getClass(), "last", null);
        setField(term389, term389.getClass(), "propListHead", null);
        setIntField(term389, term389.getClass(), "sourcePosition", 0);
        setField(term389, term389.getClass(), "jsType", null);
        setField(term389, term389.getClass(), "parent", null);
        setField(term381, term381.getClass(), "last", term389);
        setField(term392, term392.getClass(), "next", null);
        setIntField(term392, term392.getClass(), "type", 0);
        setIntField(term392, term392.getClass(), "intValue", 0);
        setField(term392, term392.getClass(), "objectValue", null);
        setField(term381, term381.getClass(), "propListHead", term392);
        setIntField(term381, term381.getClass(), "sourcePosition", -1002370457);
        setField(term381, term381.getClass(), "jsType", null);
        setField(term381, term381.getClass(), "parent", null);
        setField(term379, term379.getClass(), "next", term381);
        setIntField(term396, term396.getClass(), "type", 0);
        setField(term396, term396.getClass(), "next", null);
        setField(term396, term396.getClass(), "first", null);
        setField(term396, term396.getClass(), "last", null);
        setField(term396, term396.getClass(), "propListHead", null);
        setIntField(term396, term396.getClass(), "sourcePosition", 0);
        setField(term396, term396.getClass(), "jsType", null);
        setField(term396, term396.getClass(), "parent", null);
        setField(term379, term379.getClass(), "first", term396);
        setIntField(term399, term399.getClass(), "type", 0);
        setField(term399, term399.getClass(), "next", null);
        setField(term399, term399.getClass(), "first", null);
        setField(term399, term399.getClass(), "last", null);
        setField(term399, term399.getClass(), "propListHead", null);
        setIntField(term399, term399.getClass(), "sourcePosition", 0);
        setField(term399, term399.getClass(), "jsType", null);
        setField(term399, term399.getClass(), "parent", null);
        setField(term379, term379.getClass(), "last", term399);
        setField(term402, term402.getClass(), "next", null);
        setIntField(term402, term402.getClass(), "type", 0);
        setIntField(term402, term402.getClass(), "intValue", 0);
        setField(term402, term402.getClass(), "objectValue", null);
        setField(term379, term379.getClass(), "propListHead", term402);
        setIntField(term379, term379.getClass(), "sourcePosition", -2014576105);
        setField(term379, term379.getClass(), "jsType", null);
        setField(term379, term379.getClass(), "parent", null);
        term5770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5775 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5778 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5770, term5770.getClass(), "type", 1283079251);
        setIntField(term5771, term5771.getClass(), "type", -461771056);
        setIntField(term5772, term5772.getClass(), "type", 0);
        setField(term5772, term5772.getClass(), "next", null);
        setField(term5772, term5772.getClass(), "first", null);
        setField(term5772, term5772.getClass(), "last", null);
        setField(term5772, term5772.getClass(), "propListHead", null);
        setIntField(term5772, term5772.getClass(), "sourcePosition", 0);
        setField(term5772, term5772.getClass(), "jsType", null);
        setField(term5772, term5772.getClass(), "parent", null);
        setField(term5771, term5771.getClass(), "next", term5772);
        setIntField(term5773, term5773.getClass(), "type", 0);
        setField(term5773, term5773.getClass(), "next", null);
        setField(term5773, term5773.getClass(), "first", null);
        setField(term5773, term5773.getClass(), "last", null);
        setField(term5773, term5773.getClass(), "propListHead", null);
        setIntField(term5773, term5773.getClass(), "sourcePosition", 0);
        setField(term5773, term5773.getClass(), "jsType", null);
        setField(term5773, term5773.getClass(), "parent", null);
        setField(term5771, term5771.getClass(), "first", term5773);
        setIntField(term5774, term5774.getClass(), "type", 0);
        setField(term5774, term5774.getClass(), "next", null);
        setField(term5774, term5774.getClass(), "first", null);
        setField(term5774, term5774.getClass(), "last", null);
        setField(term5774, term5774.getClass(), "propListHead", null);
        setIntField(term5774, term5774.getClass(), "sourcePosition", 0);
        setField(term5774, term5774.getClass(), "jsType", null);
        setField(term5774, term5774.getClass(), "parent", null);
        setField(term5771, term5771.getClass(), "last", term5774);
        setField(term5775, term5775.getClass(), "next", null);
        setIntField(term5775, term5775.getClass(), "type", 0);
        setIntField(term5775, term5775.getClass(), "intValue", 0);
        setField(term5775, term5775.getClass(), "objectValue", null);
        setField(term5771, term5771.getClass(), "propListHead", term5775);
        setIntField(term5771, term5771.getClass(), "sourcePosition", -1002370457);
        setField(term5771, term5771.getClass(), "jsType", null);
        setField(term5771, term5771.getClass(), "parent", null);
        setField(term5770, term5770.getClass(), "next", term5771);
        setIntField(term5776, term5776.getClass(), "type", 0);
        setField(term5776, term5776.getClass(), "next", null);
        setField(term5776, term5776.getClass(), "first", null);
        setField(term5776, term5776.getClass(), "last", null);
        setField(term5776, term5776.getClass(), "propListHead", null);
        setIntField(term5776, term5776.getClass(), "sourcePosition", 0);
        setField(term5776, term5776.getClass(), "jsType", null);
        setField(term5776, term5776.getClass(), "parent", null);
        setField(term5770, term5770.getClass(), "first", term5776);
        setIntField(term5777, term5777.getClass(), "type", 0);
        setField(term5777, term5777.getClass(), "next", null);
        setField(term5777, term5777.getClass(), "first", null);
        setField(term5777, term5777.getClass(), "last", null);
        setField(term5777, term5777.getClass(), "propListHead", null);
        setIntField(term5777, term5777.getClass(), "sourcePosition", 0);
        setField(term5777, term5777.getClass(), "jsType", null);
        setField(term5777, term5777.getClass(), "parent", null);
        setField(term5770, term5770.getClass(), "last", term5777);
        setField(term5778, term5778.getClass(), "next", null);
        setIntField(term5778, term5778.getClass(), "type", 0);
        setIntField(term5778, term5778.getClass(), "intValue", 0);
        setField(term5778, term5778.getClass(), "objectValue", null);
        setField(term5770, term5770.getClass(), "propListHead", term5778);
        setIntField(term5770, term5770.getClass(), "sourcePosition", -2014576105);
        setField(term5770, term5770.getClass(), "jsType", null);
        setField(term5770, term5770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term379;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term379, term5770));
    }

};


