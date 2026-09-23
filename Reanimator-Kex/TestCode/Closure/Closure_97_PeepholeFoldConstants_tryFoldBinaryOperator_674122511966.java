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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306900;
     Object term306992;
     Object term307216;
     Object term307217;
     Object term307183;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306900 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term306992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term307084 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term307176 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term307084, term307084.getClass(), "next", term307176);
        setField(term306992, term306992.getClass(), "first", term307084);
        setIntField(term306992, term306992.getClass(), "type", 9);
        term307216 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term307216, term307216.getClass(), "currentTraversal", null);
        term307217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term307218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term307219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term307217, term307217.getClass(), "str", null);
        setIntField(term307217, term307217.getClass(), "type", 9);
        setField(term307217, term307217.getClass(), "next", null);
        setField(term307218, term307218.getClass(), "str", null);
        setIntField(term307218, term307218.getClass(), "type", 0);
        setField(term307219, term307219.getClass(), "str", null);
        setIntField(term307219, term307219.getClass(), "type", 0);
        setField(term307219, term307219.getClass(), "next", null);
        setField(term307219, term307219.getClass(), "first", null);
        setField(term307219, term307219.getClass(), "last", null);
        setField(term307219, term307219.getClass(), "propListHead", null);
        setIntField(term307219, term307219.getClass(), "sourcePosition", 0);
        setField(term307219, term307219.getClass(), "jsType", null);
        setField(term307219, term307219.getClass(), "parent", null);
        setField(term307218, term307218.getClass(), "next", term307219);
        setField(term307218, term307218.getClass(), "first", null);
        setField(term307218, term307218.getClass(), "last", null);
        setField(term307218, term307218.getClass(), "propListHead", null);
        setIntField(term307218, term307218.getClass(), "sourcePosition", 0);
        setField(term307218, term307218.getClass(), "jsType", null);
        setField(term307218, term307218.getClass(), "parent", null);
        setField(term307217, term307217.getClass(), "first", term307218);
        setField(term307217, term307217.getClass(), "last", null);
        setField(term307217, term307217.getClass(), "propListHead", null);
        setIntField(term307217, term307217.getClass(), "sourcePosition", 0);
        setField(term307217, term307217.getClass(), "jsType", null);
        setField(term307217, term307217.getClass(), "parent", null);
        term307183 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term307185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term307187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term307183, term307183.getClass(), "str", null);
        setIntField(term307183, term307183.getClass(), "type", 9);
        setField(term307183, term307183.getClass(), "next", null);
        setField(term307185, term307185.getClass(), "str", null);
        setIntField(term307185, term307185.getClass(), "type", 0);
        setField(term307187, term307187.getClass(), "str", null);
        setIntField(term307187, term307187.getClass(), "type", 0);
        setField(term307187, term307187.getClass(), "next", null);
        setField(term307187, term307187.getClass(), "first", null);
        setField(term307187, term307187.getClass(), "last", null);
        setField(term307187, term307187.getClass(), "propListHead", null);
        setIntField(term307187, term307187.getClass(), "sourcePosition", 0);
        setField(term307187, term307187.getClass(), "jsType", null);
        setField(term307187, term307187.getClass(), "parent", null);
        setField(term307185, term307185.getClass(), "next", term307187);
        setField(term307185, term307185.getClass(), "first", null);
        setField(term307185, term307185.getClass(), "last", null);
        setField(term307185, term307185.getClass(), "propListHead", null);
        setIntField(term307185, term307185.getClass(), "sourcePosition", 0);
        setField(term307185, term307185.getClass(), "jsType", null);
        setField(term307185, term307185.getClass(), "parent", null);
        setField(term307183, term307183.getClass(), "first", term307185);
        setField(term307183, term307183.getClass(), "last", null);
        setField(term307183, term307183.getClass(), "propListHead", null);
        setIntField(term307183, term307183.getClass(), "sourcePosition", 0);
        setField(term307183, term307183.getClass(), "jsType", null);
        setField(term307183, term307183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term306992;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term306900, args);
        assertTrue(recursiveEquals(term306900, term307216));
        assertTrue(recursiveEquals(term306992, term307217));
        assertTrue(recursiveEquals(retValue, term307183));
    }

};


