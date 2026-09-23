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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692422;
     Object term692514;
     Object term692822;
     Object term692823;
     Object term692757;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692422 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term692514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term692606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term692698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term692698, term692698.getClass(), "type", 40);
        setField(term692698, term692698.getClass(), "str", "length");
        setField(term692606, term692606.getClass(), "next", term692698);
        setField(term692514, term692514.getClass(), "first", term692606);
        setIntField(term692514, term692514.getClass(), "type", 33);
        term692822 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term692822, term692822.getClass(), "currentTraversal", null);
        term692823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term692824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term692825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term692823, term692823.getClass(), "str", null);
        setIntField(term692823, term692823.getClass(), "type", 33);
        setField(term692823, term692823.getClass(), "next", null);
        setField(term692824, term692824.getClass(), "str", null);
        setIntField(term692824, term692824.getClass(), "type", 0);
        setField(term692825, term692825.getClass(), "str", "length");
        setIntField(term692825, term692825.getClass(), "type", 40);
        setField(term692825, term692825.getClass(), "next", null);
        setField(term692825, term692825.getClass(), "first", null);
        setField(term692825, term692825.getClass(), "last", null);
        setField(term692825, term692825.getClass(), "propListHead", null);
        setIntField(term692825, term692825.getClass(), "sourcePosition", 0);
        setField(term692825, term692825.getClass(), "jsType", null);
        setField(term692825, term692825.getClass(), "parent", null);
        setField(term692824, term692824.getClass(), "next", term692825);
        setField(term692824, term692824.getClass(), "first", null);
        setField(term692824, term692824.getClass(), "last", null);
        setField(term692824, term692824.getClass(), "propListHead", null);
        setIntField(term692824, term692824.getClass(), "sourcePosition", 0);
        setField(term692824, term692824.getClass(), "jsType", null);
        setField(term692824, term692824.getClass(), "parent", null);
        setField(term692823, term692823.getClass(), "first", term692824);
        setField(term692823, term692823.getClass(), "last", null);
        setField(term692823, term692823.getClass(), "propListHead", null);
        setIntField(term692823, term692823.getClass(), "sourcePosition", 0);
        setField(term692823, term692823.getClass(), "jsType", null);
        setField(term692823, term692823.getClass(), "parent", null);
        term692757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term692759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term692761 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term692757, term692757.getClass(), "str", null);
        setIntField(term692757, term692757.getClass(), "type", 33);
        setField(term692757, term692757.getClass(), "next", null);
        setField(term692759, term692759.getClass(), "str", null);
        setIntField(term692759, term692759.getClass(), "type", 0);
        setField(term692761, term692761.getClass(), "str", "length");
        setIntField(term692761, term692761.getClass(), "type", 40);
        setField(term692761, term692761.getClass(), "next", null);
        setField(term692761, term692761.getClass(), "first", null);
        setField(term692761, term692761.getClass(), "last", null);
        setField(term692761, term692761.getClass(), "propListHead", null);
        setIntField(term692761, term692761.getClass(), "sourcePosition", 0);
        setField(term692761, term692761.getClass(), "jsType", null);
        setField(term692761, term692761.getClass(), "parent", null);
        setField(term692759, term692759.getClass(), "next", term692761);
        setField(term692759, term692759.getClass(), "first", null);
        setField(term692759, term692759.getClass(), "last", null);
        setField(term692759, term692759.getClass(), "propListHead", null);
        setIntField(term692759, term692759.getClass(), "sourcePosition", 0);
        setField(term692759, term692759.getClass(), "jsType", null);
        setField(term692759, term692759.getClass(), "parent", null);
        setField(term692757, term692757.getClass(), "first", term692759);
        setField(term692757, term692757.getClass(), "last", null);
        setField(term692757, term692757.getClass(), "propListHead", null);
        setIntField(term692757, term692757.getClass(), "sourcePosition", 0);
        setField(term692757, term692757.getClass(), "jsType", null);
        setField(term692757, term692757.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term692514;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term692422, args);
        assertTrue(recursiveEquals(term692422, term692822));
        assertTrue(recursiveEquals(term692514, term692823));
        assertTrue(recursiveEquals(retValue, term692757));
    }

};


