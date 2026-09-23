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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406228;
     Object term406320;
     Object term421587;
     Object term421588;
     Object term421531;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406228 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term406320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term406412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term406504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term406504, term406504.getClass(), "type", 14);
        setField(term406412, term406412.getClass(), "next", term406504);
        setIntField(term406412, term406412.getClass(), "type", 42);
        setField(term406320, term406320.getClass(), "first", term406412);
        setIntField(term406320, term406320.getClass(), "type", 14);
        term421587 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421587, term421587.getClass(), "currentTraversal", null);
        term421588 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term421589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term421590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term421588, term421588.getClass(), "number", 0.0);
        setIntField(term421588, term421588.getClass(), "type", 14);
        setField(term421588, term421588.getClass(), "next", null);
        setDoubleField(term421589, term421589.getClass(), "number", 0.0);
        setIntField(term421589, term421589.getClass(), "type", 42);
        setDoubleField(term421590, term421590.getClass(), "number", 0.0);
        setIntField(term421590, term421590.getClass(), "type", 14);
        setField(term421590, term421590.getClass(), "next", null);
        setField(term421590, term421590.getClass(), "first", null);
        setField(term421590, term421590.getClass(), "last", null);
        setField(term421590, term421590.getClass(), "propListHead", null);
        setIntField(term421590, term421590.getClass(), "sourcePosition", 0);
        setField(term421590, term421590.getClass(), "jsType", null);
        setField(term421590, term421590.getClass(), "parent", null);
        setField(term421589, term421589.getClass(), "next", term421590);
        setField(term421589, term421589.getClass(), "first", null);
        setField(term421589, term421589.getClass(), "last", null);
        setField(term421589, term421589.getClass(), "propListHead", null);
        setIntField(term421589, term421589.getClass(), "sourcePosition", 0);
        setField(term421589, term421589.getClass(), "jsType", null);
        setField(term421589, term421589.getClass(), "parent", null);
        setField(term421588, term421588.getClass(), "first", term421589);
        setField(term421588, term421588.getClass(), "last", null);
        setField(term421588, term421588.getClass(), "propListHead", null);
        setIntField(term421588, term421588.getClass(), "sourcePosition", 0);
        setField(term421588, term421588.getClass(), "jsType", null);
        setField(term421588, term421588.getClass(), "parent", null);
        term421531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term421534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term421537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term421531, term421531.getClass(), "number", 0.0);
        setIntField(term421531, term421531.getClass(), "type", 14);
        setField(term421531, term421531.getClass(), "next", null);
        setDoubleField(term421534, term421534.getClass(), "number", 0.0);
        setIntField(term421534, term421534.getClass(), "type", 42);
        setDoubleField(term421537, term421537.getClass(), "number", 0.0);
        setIntField(term421537, term421537.getClass(), "type", 14);
        setField(term421537, term421537.getClass(), "next", null);
        setField(term421537, term421537.getClass(), "first", null);
        setField(term421537, term421537.getClass(), "last", null);
        setField(term421537, term421537.getClass(), "propListHead", null);
        setIntField(term421537, term421537.getClass(), "sourcePosition", 0);
        setField(term421537, term421537.getClass(), "jsType", null);
        setField(term421537, term421537.getClass(), "parent", null);
        setField(term421534, term421534.getClass(), "next", term421537);
        setField(term421534, term421534.getClass(), "first", null);
        setField(term421534, term421534.getClass(), "last", null);
        setField(term421534, term421534.getClass(), "propListHead", null);
        setIntField(term421534, term421534.getClass(), "sourcePosition", 0);
        setField(term421534, term421534.getClass(), "jsType", null);
        setField(term421534, term421534.getClass(), "parent", null);
        setField(term421531, term421531.getClass(), "first", term421534);
        setField(term421531, term421531.getClass(), "last", null);
        setField(term421531, term421531.getClass(), "propListHead", null);
        setIntField(term421531, term421531.getClass(), "sourcePosition", 0);
        setField(term421531, term421531.getClass(), "jsType", null);
        setField(term421531, term421531.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term406320;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term406228, args);
        assertTrue(recursiveEquals(term406228, term421587));
        assertTrue(recursiveEquals(term406320, term421588));
        assertTrue(recursiveEquals(retValue, term421531));
    }

};


