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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439825;
     Object term439917;
     Object term440230;
     Object term440231;
     Object term440161;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439825 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term439917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term440009 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term440101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term440101, term440101.getClass(), "type", 40);
        setField(term440101, term440101.getClass(), "str", "length");
        setField(term440009, term440009.getClass(), "next", term440101);
        setField(term439917, term439917.getClass(), "first", term440009);
        setIntField(term439917, term439917.getClass(), "type", 33);
        term440230 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term440230, term440230.getClass(), "currentTraversal", null);
        term440231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term440232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term440233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term440231, term440231.getClass(), "number", 0.0);
        setIntField(term440231, term440231.getClass(), "type", 33);
        setField(term440231, term440231.getClass(), "next", null);
        setDoubleField(term440232, term440232.getClass(), "number", 0.0);
        setIntField(term440232, term440232.getClass(), "type", 0);
        setField(term440233, term440233.getClass(), "str", "length");
        setIntField(term440233, term440233.getClass(), "type", 40);
        setField(term440233, term440233.getClass(), "next", null);
        setField(term440233, term440233.getClass(), "first", null);
        setField(term440233, term440233.getClass(), "last", null);
        setField(term440233, term440233.getClass(), "propListHead", null);
        setIntField(term440233, term440233.getClass(), "sourcePosition", 0);
        setField(term440233, term440233.getClass(), "jsType", null);
        setField(term440233, term440233.getClass(), "parent", null);
        setField(term440232, term440232.getClass(), "next", term440233);
        setField(term440232, term440232.getClass(), "first", null);
        setField(term440232, term440232.getClass(), "last", null);
        setField(term440232, term440232.getClass(), "propListHead", null);
        setIntField(term440232, term440232.getClass(), "sourcePosition", 0);
        setField(term440232, term440232.getClass(), "jsType", null);
        setField(term440232, term440232.getClass(), "parent", null);
        setField(term440231, term440231.getClass(), "first", term440232);
        setField(term440231, term440231.getClass(), "last", null);
        setField(term440231, term440231.getClass(), "propListHead", null);
        setIntField(term440231, term440231.getClass(), "sourcePosition", 0);
        setField(term440231, term440231.getClass(), "jsType", null);
        setField(term440231, term440231.getClass(), "parent", null);
        term440161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term440164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term440167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term440161, term440161.getClass(), "number", 0.0);
        setIntField(term440161, term440161.getClass(), "type", 33);
        setField(term440161, term440161.getClass(), "next", null);
        setDoubleField(term440164, term440164.getClass(), "number", 0.0);
        setIntField(term440164, term440164.getClass(), "type", 0);
        setField(term440167, term440167.getClass(), "str", "length");
        setIntField(term440167, term440167.getClass(), "type", 40);
        setField(term440167, term440167.getClass(), "next", null);
        setField(term440167, term440167.getClass(), "first", null);
        setField(term440167, term440167.getClass(), "last", null);
        setField(term440167, term440167.getClass(), "propListHead", null);
        setIntField(term440167, term440167.getClass(), "sourcePosition", 0);
        setField(term440167, term440167.getClass(), "jsType", null);
        setField(term440167, term440167.getClass(), "parent", null);
        setField(term440164, term440164.getClass(), "next", term440167);
        setField(term440164, term440164.getClass(), "first", null);
        setField(term440164, term440164.getClass(), "last", null);
        setField(term440164, term440164.getClass(), "propListHead", null);
        setIntField(term440164, term440164.getClass(), "sourcePosition", 0);
        setField(term440164, term440164.getClass(), "jsType", null);
        setField(term440164, term440164.getClass(), "parent", null);
        setField(term440161, term440161.getClass(), "first", term440164);
        setField(term440161, term440161.getClass(), "last", null);
        setField(term440161, term440161.getClass(), "propListHead", null);
        setIntField(term440161, term440161.getClass(), "sourcePosition", 0);
        setField(term440161, term440161.getClass(), "jsType", null);
        setField(term440161, term440161.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term439917;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term439825, args);
        assertTrue(recursiveEquals(term439825, term440230));
        assertTrue(recursiveEquals(term439917, term440231));
        assertTrue(recursiveEquals(retValue, term440161));
    }

};


