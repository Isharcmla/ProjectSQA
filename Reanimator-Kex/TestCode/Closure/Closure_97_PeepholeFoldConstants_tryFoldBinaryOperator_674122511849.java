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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242232;
     Object term242324;
     Object term242834;
     Object term242835;
     Object term242811;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term242324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term242324, term242324.getClass(), "first", term242324);
        setField(term242324, term242324.getClass(), "next", term242394);
        setIntField(term242324, term242324.getClass(), "type", 19);
        term242834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term242834, term242834.getClass(), "currentTraversal", null);
        term242835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term242835, term242835.getClass(), "number", 0.0);
        setIntField(term242835, term242835.getClass(), "type", 19);
        setIntField(term242836, term242836.getClass(), "type", 0);
        setField(term242836, term242836.getClass(), "next", null);
        setField(term242836, term242836.getClass(), "first", null);
        setField(term242836, term242836.getClass(), "last", null);
        setField(term242836, term242836.getClass(), "propListHead", null);
        setIntField(term242836, term242836.getClass(), "sourcePosition", 0);
        setField(term242836, term242836.getClass(), "jsType", null);
        setField(term242836, term242836.getClass(), "parent", null);
        setField(term242835, term242835.getClass(), "next", term242836);
        setField(term242835, term242835.getClass(), "first", term242835);
        setField(term242835, term242835.getClass(), "last", null);
        setField(term242835, term242835.getClass(), "propListHead", null);
        setIntField(term242835, term242835.getClass(), "sourcePosition", 0);
        setField(term242835, term242835.getClass(), "jsType", null);
        setField(term242835, term242835.getClass(), "parent", null);
        term242811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term242811, term242811.getClass(), "number", 0.0);
        setIntField(term242811, term242811.getClass(), "type", 19);
        setIntField(term242814, term242814.getClass(), "type", 0);
        setField(term242814, term242814.getClass(), "next", null);
        setField(term242814, term242814.getClass(), "first", null);
        setField(term242814, term242814.getClass(), "last", null);
        setField(term242814, term242814.getClass(), "propListHead", null);
        setIntField(term242814, term242814.getClass(), "sourcePosition", 0);
        setField(term242814, term242814.getClass(), "jsType", null);
        setField(term242814, term242814.getClass(), "parent", null);
        setField(term242811, term242811.getClass(), "next", term242814);
        setField(term242811, term242811.getClass(), "first", term242811);
        setField(term242811, term242811.getClass(), "last", null);
        setField(term242811, term242811.getClass(), "propListHead", null);
        setIntField(term242811, term242811.getClass(), "sourcePosition", 0);
        setField(term242811, term242811.getClass(), "jsType", null);
        setField(term242811, term242811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term242324;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term242232, args);
        assertTrue(recursiveEquals(term242232, term242834));
        assertTrue(recursiveEquals(term242324, term242835));
        assertTrue(recursiveEquals(retValue, term242811));
    }

};


