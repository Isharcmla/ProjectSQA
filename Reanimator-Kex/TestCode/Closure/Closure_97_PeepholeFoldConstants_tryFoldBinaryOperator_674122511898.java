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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253482;
     Object term253574;
     Object term253798;
     Object term253799;
     Object term253765;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253482 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term253574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253666, term253666.getClass(), "next", term253758);
        setIntField(term253666, term253666.getClass(), "type", 39);
        setField(term253574, term253574.getClass(), "first", term253666);
        setIntField(term253574, term253574.getClass(), "type", 11);
        term253798 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term253798, term253798.getClass(), "currentTraversal", null);
        term253799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253799, term253799.getClass(), "str", null);
        setIntField(term253799, term253799.getClass(), "type", 11);
        setField(term253799, term253799.getClass(), "next", null);
        setField(term253800, term253800.getClass(), "str", null);
        setIntField(term253800, term253800.getClass(), "type", 39);
        setField(term253801, term253801.getClass(), "str", null);
        setIntField(term253801, term253801.getClass(), "type", 0);
        setField(term253801, term253801.getClass(), "next", null);
        setField(term253801, term253801.getClass(), "first", null);
        setField(term253801, term253801.getClass(), "last", null);
        setField(term253801, term253801.getClass(), "propListHead", null);
        setIntField(term253801, term253801.getClass(), "sourcePosition", 0);
        setField(term253801, term253801.getClass(), "jsType", null);
        setField(term253801, term253801.getClass(), "parent", null);
        setField(term253800, term253800.getClass(), "next", term253801);
        setField(term253800, term253800.getClass(), "first", null);
        setField(term253800, term253800.getClass(), "last", null);
        setField(term253800, term253800.getClass(), "propListHead", null);
        setIntField(term253800, term253800.getClass(), "sourcePosition", 0);
        setField(term253800, term253800.getClass(), "jsType", null);
        setField(term253800, term253800.getClass(), "parent", null);
        setField(term253799, term253799.getClass(), "first", term253800);
        setField(term253799, term253799.getClass(), "last", null);
        setField(term253799, term253799.getClass(), "propListHead", null);
        setIntField(term253799, term253799.getClass(), "sourcePosition", 0);
        setField(term253799, term253799.getClass(), "jsType", null);
        setField(term253799, term253799.getClass(), "parent", null);
        term253765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253765, term253765.getClass(), "str", null);
        setIntField(term253765, term253765.getClass(), "type", 11);
        setField(term253765, term253765.getClass(), "next", null);
        setField(term253767, term253767.getClass(), "str", null);
        setIntField(term253767, term253767.getClass(), "type", 39);
        setField(term253769, term253769.getClass(), "str", null);
        setIntField(term253769, term253769.getClass(), "type", 0);
        setField(term253769, term253769.getClass(), "next", null);
        setField(term253769, term253769.getClass(), "first", null);
        setField(term253769, term253769.getClass(), "last", null);
        setField(term253769, term253769.getClass(), "propListHead", null);
        setIntField(term253769, term253769.getClass(), "sourcePosition", 0);
        setField(term253769, term253769.getClass(), "jsType", null);
        setField(term253769, term253769.getClass(), "parent", null);
        setField(term253767, term253767.getClass(), "next", term253769);
        setField(term253767, term253767.getClass(), "first", null);
        setField(term253767, term253767.getClass(), "last", null);
        setField(term253767, term253767.getClass(), "propListHead", null);
        setIntField(term253767, term253767.getClass(), "sourcePosition", 0);
        setField(term253767, term253767.getClass(), "jsType", null);
        setField(term253767, term253767.getClass(), "parent", null);
        setField(term253765, term253765.getClass(), "first", term253767);
        setField(term253765, term253765.getClass(), "last", null);
        setField(term253765, term253765.getClass(), "propListHead", null);
        setIntField(term253765, term253765.getClass(), "sourcePosition", 0);
        setField(term253765, term253765.getClass(), "jsType", null);
        setField(term253765, term253765.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term253574;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term253482, args);
        assertTrue(recursiveEquals(term253482, term253798));
        assertTrue(recursiveEquals(term253574, term253799));
        assertTrue(recursiveEquals(retValue, term253765));
    }

};


