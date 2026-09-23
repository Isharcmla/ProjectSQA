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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179687;
     Object term179779;
     Object term180418;
     Object term180419;
     Object term180380;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179687 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term179779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term179871, term179871.getClass(), "next", term179963);
        setIntField(term179871, term179871.getClass(), "type", 39);
        setField(term179779, term179779.getClass(), "first", term179871);
        setIntField(term179779, term179779.getClass(), "type", 9);
        term180418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term180418, term180418.getClass(), "currentTraversal", null);
        term180419 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term180419, term180419.getClass(), "str", null);
        setIntField(term180419, term180419.getClass(), "type", 9);
        setField(term180419, term180419.getClass(), "next", null);
        setField(term180420, term180420.getClass(), "str", null);
        setIntField(term180420, term180420.getClass(), "type", 39);
        setDoubleField(term180421, term180421.getClass(), "number", 0.0);
        setIntField(term180421, term180421.getClass(), "type", 0);
        setField(term180421, term180421.getClass(), "next", null);
        setField(term180421, term180421.getClass(), "first", null);
        setField(term180421, term180421.getClass(), "last", null);
        setField(term180421, term180421.getClass(), "propListHead", null);
        setIntField(term180421, term180421.getClass(), "sourcePosition", 0);
        setField(term180421, term180421.getClass(), "jsType", null);
        setField(term180421, term180421.getClass(), "parent", null);
        setField(term180420, term180420.getClass(), "next", term180421);
        setField(term180420, term180420.getClass(), "first", null);
        setField(term180420, term180420.getClass(), "last", null);
        setField(term180420, term180420.getClass(), "propListHead", null);
        setIntField(term180420, term180420.getClass(), "sourcePosition", 0);
        setField(term180420, term180420.getClass(), "jsType", null);
        setField(term180420, term180420.getClass(), "parent", null);
        setField(term180419, term180419.getClass(), "first", term180420);
        setField(term180419, term180419.getClass(), "last", null);
        setField(term180419, term180419.getClass(), "propListHead", null);
        setIntField(term180419, term180419.getClass(), "sourcePosition", 0);
        setField(term180419, term180419.getClass(), "jsType", null);
        setField(term180419, term180419.getClass(), "parent", null);
        term180380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term180380, term180380.getClass(), "str", null);
        setIntField(term180380, term180380.getClass(), "type", 9);
        setField(term180380, term180380.getClass(), "next", null);
        setField(term180382, term180382.getClass(), "str", null);
        setIntField(term180382, term180382.getClass(), "type", 39);
        setDoubleField(term180384, term180384.getClass(), "number", 0.0);
        setIntField(term180384, term180384.getClass(), "type", 0);
        setField(term180384, term180384.getClass(), "next", null);
        setField(term180384, term180384.getClass(), "first", null);
        setField(term180384, term180384.getClass(), "last", null);
        setField(term180384, term180384.getClass(), "propListHead", null);
        setIntField(term180384, term180384.getClass(), "sourcePosition", 0);
        setField(term180384, term180384.getClass(), "jsType", null);
        setField(term180384, term180384.getClass(), "parent", null);
        setField(term180382, term180382.getClass(), "next", term180384);
        setField(term180382, term180382.getClass(), "first", null);
        setField(term180382, term180382.getClass(), "last", null);
        setField(term180382, term180382.getClass(), "propListHead", null);
        setIntField(term180382, term180382.getClass(), "sourcePosition", 0);
        setField(term180382, term180382.getClass(), "jsType", null);
        setField(term180382, term180382.getClass(), "parent", null);
        setField(term180380, term180380.getClass(), "first", term180382);
        setField(term180380, term180380.getClass(), "last", null);
        setField(term180380, term180380.getClass(), "propListHead", null);
        setIntField(term180380, term180380.getClass(), "sourcePosition", 0);
        setField(term180380, term180380.getClass(), "jsType", null);
        setField(term180380, term180380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term179779;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term179687, args);
        assertTrue(recursiveEquals(term179687, term180418));
        assertTrue(recursiveEquals(term179779, term180419));
        assertTrue(recursiveEquals(retValue, term180380));
    }

};


