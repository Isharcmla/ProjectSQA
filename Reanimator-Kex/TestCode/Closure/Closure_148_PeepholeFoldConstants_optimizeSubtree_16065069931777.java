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

public class PeepholeFoldConstants_optimizeSubtree_16065069931777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462018;
     Object term462110;
     Object term462760;
     Object term462761;
     Object term462714;

    public PeepholeFoldConstants_optimizeSubtree_16065069931777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term462110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term462202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term462294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term462110, term462110.getClass(), "type", 33);
        setField(term462202, term462202.getClass(), "next", term462294);
        setField(term462110, term462110.getClass(), "first", term462202);
        term462760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term462760, term462760.getClass(), "currentTraversal", null);
        term462761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term462762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term462763 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term462761, term462761.getClass(), "str", null);
        setIntField(term462761, term462761.getClass(), "type", 33);
        setField(term462761, term462761.getClass(), "next", null);
        setField(term462762, term462762.getClass(), "str", null);
        setIntField(term462762, term462762.getClass(), "type", 0);
        setField(term462763, term462763.getClass(), "str", null);
        setIntField(term462763, term462763.getClass(), "type", 0);
        setField(term462763, term462763.getClass(), "next", null);
        setField(term462763, term462763.getClass(), "first", null);
        setField(term462763, term462763.getClass(), "last", null);
        setField(term462763, term462763.getClass(), "propListHead", null);
        setIntField(term462763, term462763.getClass(), "sourcePosition", 0);
        setField(term462763, term462763.getClass(), "jsType", null);
        setField(term462763, term462763.getClass(), "parent", null);
        setField(term462762, term462762.getClass(), "next", term462763);
        setField(term462762, term462762.getClass(), "first", null);
        setField(term462762, term462762.getClass(), "last", null);
        setField(term462762, term462762.getClass(), "propListHead", null);
        setIntField(term462762, term462762.getClass(), "sourcePosition", 0);
        setField(term462762, term462762.getClass(), "jsType", null);
        setField(term462762, term462762.getClass(), "parent", null);
        setField(term462761, term462761.getClass(), "first", term462762);
        setField(term462761, term462761.getClass(), "last", null);
        setField(term462761, term462761.getClass(), "propListHead", null);
        setIntField(term462761, term462761.getClass(), "sourcePosition", 0);
        setField(term462761, term462761.getClass(), "jsType", null);
        setField(term462761, term462761.getClass(), "parent", null);
        term462714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term462716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term462718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term462714, term462714.getClass(), "str", null);
        setIntField(term462714, term462714.getClass(), "type", 33);
        setField(term462714, term462714.getClass(), "next", null);
        setField(term462716, term462716.getClass(), "str", null);
        setIntField(term462716, term462716.getClass(), "type", 0);
        setField(term462718, term462718.getClass(), "str", null);
        setIntField(term462718, term462718.getClass(), "type", 0);
        setField(term462718, term462718.getClass(), "next", null);
        setField(term462718, term462718.getClass(), "first", null);
        setField(term462718, term462718.getClass(), "last", null);
        setField(term462718, term462718.getClass(), "propListHead", null);
        setIntField(term462718, term462718.getClass(), "sourcePosition", 0);
        setField(term462718, term462718.getClass(), "jsType", null);
        setField(term462718, term462718.getClass(), "parent", null);
        setField(term462716, term462716.getClass(), "next", term462718);
        setField(term462716, term462716.getClass(), "first", null);
        setField(term462716, term462716.getClass(), "last", null);
        setField(term462716, term462716.getClass(), "propListHead", null);
        setIntField(term462716, term462716.getClass(), "sourcePosition", 0);
        setField(term462716, term462716.getClass(), "jsType", null);
        setField(term462716, term462716.getClass(), "parent", null);
        setField(term462714, term462714.getClass(), "first", term462716);
        setField(term462714, term462714.getClass(), "last", null);
        setField(term462714, term462714.getClass(), "propListHead", null);
        setIntField(term462714, term462714.getClass(), "sourcePosition", 0);
        setField(term462714, term462714.getClass(), "jsType", null);
        setField(term462714, term462714.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term462110;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term462018, args);
        assertTrue(recursiveEquals(term462018, term462760));
        assertTrue(recursiveEquals(term462110, term462761));
        assertTrue(recursiveEquals(retValue, term462714));
    }

};


