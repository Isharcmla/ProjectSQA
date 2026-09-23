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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474418;
     Object term474510;
     Object term474856;
     Object term474857;
     Object term474778;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term474510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term474672, term474672.getClass(), "type", 64);
        setField(term474580, term474580.getClass(), "next", term474672);
        setIntField(term474580, term474580.getClass(), "type", 0);
        setField(term474510, term474510.getClass(), "first", term474580);
        setIntField(term474510, term474510.getClass(), "type", 101);
        setIntField(term474764, term474764.getClass(), "type", 98);
        setField(term474510, term474510.getClass(), "parent", term474764);
        term474856 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term474856, term474856.getClass(), "currentTraversal", null);
        term474857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term474857, term474857.getClass(), "number", 0.0);
        setIntField(term474857, term474857.getClass(), "type", 101);
        setField(term474857, term474857.getClass(), "next", null);
        setIntField(term474858, term474858.getClass(), "type", 0);
        setDoubleField(term474859, term474859.getClass(), "number", 0.0);
        setIntField(term474859, term474859.getClass(), "type", 64);
        setField(term474859, term474859.getClass(), "next", null);
        setField(term474859, term474859.getClass(), "first", null);
        setField(term474859, term474859.getClass(), "last", null);
        setField(term474859, term474859.getClass(), "propListHead", null);
        setIntField(term474859, term474859.getClass(), "sourcePosition", 0);
        setField(term474859, term474859.getClass(), "jsType", null);
        setField(term474859, term474859.getClass(), "parent", null);
        setField(term474858, term474858.getClass(), "next", term474859);
        setField(term474858, term474858.getClass(), "first", null);
        setField(term474858, term474858.getClass(), "last", null);
        setField(term474858, term474858.getClass(), "propListHead", null);
        setIntField(term474858, term474858.getClass(), "sourcePosition", 0);
        setField(term474858, term474858.getClass(), "jsType", null);
        setField(term474858, term474858.getClass(), "parent", null);
        setField(term474857, term474857.getClass(), "first", term474858);
        setField(term474857, term474857.getClass(), "last", null);
        setField(term474857, term474857.getClass(), "propListHead", null);
        setIntField(term474857, term474857.getClass(), "sourcePosition", 0);
        setField(term474857, term474857.getClass(), "jsType", null);
        setDoubleField(term474860, term474860.getClass(), "number", 0.0);
        setIntField(term474860, term474860.getClass(), "type", 98);
        setField(term474860, term474860.getClass(), "next", null);
        setField(term474860, term474860.getClass(), "first", null);
        setField(term474860, term474860.getClass(), "last", null);
        setField(term474860, term474860.getClass(), "propListHead", null);
        setIntField(term474860, term474860.getClass(), "sourcePosition", 0);
        setField(term474860, term474860.getClass(), "jsType", null);
        setField(term474860, term474860.getClass(), "parent", null);
        setField(term474857, term474857.getClass(), "parent", term474860);
        term474778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474789 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term474778, term474778.getClass(), "number", 0.0);
        setIntField(term474778, term474778.getClass(), "type", 101);
        setField(term474778, term474778.getClass(), "next", null);
        setIntField(term474781, term474781.getClass(), "type", 0);
        setDoubleField(term474783, term474783.getClass(), "number", 0.0);
        setIntField(term474783, term474783.getClass(), "type", 64);
        setField(term474783, term474783.getClass(), "next", null);
        setField(term474783, term474783.getClass(), "first", null);
        setField(term474783, term474783.getClass(), "last", null);
        setField(term474783, term474783.getClass(), "propListHead", null);
        setIntField(term474783, term474783.getClass(), "sourcePosition", 0);
        setField(term474783, term474783.getClass(), "jsType", null);
        setField(term474783, term474783.getClass(), "parent", null);
        setField(term474781, term474781.getClass(), "next", term474783);
        setField(term474781, term474781.getClass(), "first", null);
        setField(term474781, term474781.getClass(), "last", null);
        setField(term474781, term474781.getClass(), "propListHead", null);
        setIntField(term474781, term474781.getClass(), "sourcePosition", 0);
        setField(term474781, term474781.getClass(), "jsType", null);
        setField(term474781, term474781.getClass(), "parent", null);
        setField(term474778, term474778.getClass(), "first", term474781);
        setField(term474778, term474778.getClass(), "last", null);
        setField(term474778, term474778.getClass(), "propListHead", null);
        setIntField(term474778, term474778.getClass(), "sourcePosition", 0);
        setField(term474778, term474778.getClass(), "jsType", null);
        setDoubleField(term474789, term474789.getClass(), "number", 0.0);
        setIntField(term474789, term474789.getClass(), "type", 98);
        setField(term474789, term474789.getClass(), "next", null);
        setField(term474789, term474789.getClass(), "first", null);
        setField(term474789, term474789.getClass(), "last", null);
        setField(term474789, term474789.getClass(), "propListHead", null);
        setIntField(term474789, term474789.getClass(), "sourcePosition", 0);
        setField(term474789, term474789.getClass(), "jsType", null);
        setField(term474789, term474789.getClass(), "parent", null);
        setField(term474778, term474778.getClass(), "parent", term474789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term474510;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term474418, args);
        assertTrue(recursiveEquals(term474418, term474856));
        assertTrue(recursiveEquals(term474510, term474857));
        assertTrue(recursiveEquals(retValue, term474778));
    }

};


