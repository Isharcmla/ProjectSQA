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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254790;
     Object term254882;
     Object term255249;
     Object term255250;
     Object term255196;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254790 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term254882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term254974, term254974.getClass(), "next", term255066);
        setIntField(term254974, term254974.getClass(), "type", 0);
        setField(term254882, term254882.getClass(), "first", term254974);
        setIntField(term254882, term254882.getClass(), "type", 101);
        setField(term254882, term254882.getClass(), "parent", null);
        term255249 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term255249, term255249.getClass(), "currentTraversal", null);
        term255250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255250, term255250.getClass(), "str", null);
        setIntField(term255250, term255250.getClass(), "type", 101);
        setField(term255250, term255250.getClass(), "next", null);
        setField(term255251, term255251.getClass(), "str", null);
        setIntField(term255251, term255251.getClass(), "type", 0);
        setField(term255252, term255252.getClass(), "str", null);
        setIntField(term255252, term255252.getClass(), "type", 0);
        setField(term255252, term255252.getClass(), "next", null);
        setField(term255252, term255252.getClass(), "first", null);
        setField(term255252, term255252.getClass(), "last", null);
        setField(term255252, term255252.getClass(), "propListHead", null);
        setIntField(term255252, term255252.getClass(), "sourcePosition", 0);
        setField(term255252, term255252.getClass(), "jsType", null);
        setField(term255252, term255252.getClass(), "parent", null);
        setField(term255251, term255251.getClass(), "next", term255252);
        setField(term255251, term255251.getClass(), "first", null);
        setField(term255251, term255251.getClass(), "last", null);
        setField(term255251, term255251.getClass(), "propListHead", null);
        setIntField(term255251, term255251.getClass(), "sourcePosition", 0);
        setField(term255251, term255251.getClass(), "jsType", null);
        setField(term255251, term255251.getClass(), "parent", null);
        setField(term255250, term255250.getClass(), "first", term255251);
        setField(term255250, term255250.getClass(), "last", null);
        setField(term255250, term255250.getClass(), "propListHead", null);
        setIntField(term255250, term255250.getClass(), "sourcePosition", 0);
        setField(term255250, term255250.getClass(), "jsType", null);
        setField(term255250, term255250.getClass(), "parent", null);
        term255196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255196, term255196.getClass(), "str", null);
        setIntField(term255196, term255196.getClass(), "type", 101);
        setField(term255196, term255196.getClass(), "next", null);
        setField(term255198, term255198.getClass(), "str", null);
        setIntField(term255198, term255198.getClass(), "type", 0);
        setField(term255200, term255200.getClass(), "str", null);
        setIntField(term255200, term255200.getClass(), "type", 0);
        setField(term255200, term255200.getClass(), "next", null);
        setField(term255200, term255200.getClass(), "first", null);
        setField(term255200, term255200.getClass(), "last", null);
        setField(term255200, term255200.getClass(), "propListHead", null);
        setIntField(term255200, term255200.getClass(), "sourcePosition", 0);
        setField(term255200, term255200.getClass(), "jsType", null);
        setField(term255200, term255200.getClass(), "parent", null);
        setField(term255198, term255198.getClass(), "next", term255200);
        setField(term255198, term255198.getClass(), "first", null);
        setField(term255198, term255198.getClass(), "last", null);
        setField(term255198, term255198.getClass(), "propListHead", null);
        setIntField(term255198, term255198.getClass(), "sourcePosition", 0);
        setField(term255198, term255198.getClass(), "jsType", null);
        setField(term255198, term255198.getClass(), "parent", null);
        setField(term255196, term255196.getClass(), "first", term255198);
        setField(term255196, term255196.getClass(), "last", null);
        setField(term255196, term255196.getClass(), "propListHead", null);
        setIntField(term255196, term255196.getClass(), "sourcePosition", 0);
        setField(term255196, term255196.getClass(), "jsType", null);
        setField(term255196, term255196.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term254882;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term254790, args);
        assertTrue(recursiveEquals(term254790, term255249));
        assertTrue(recursiveEquals(term254882, term255250));
        assertTrue(recursiveEquals(retValue, term255196));
    }

};


