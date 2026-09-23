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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56337;
     Object term56429;
     Object term57226;
     Object term57227;
     Object term57185;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56337 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term56429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term56521, term56521.getClass(), "next", term56613);
        setField(term56429, term56429.getClass(), "first", term56521);
        setIntField(term56429, term56429.getClass(), "type", 13);
        term57226 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term57226, term57226.getClass(), "currentTraversal", null);
        term57227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57229 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57227, term57227.getClass(), "number", 0.0);
        setIntField(term57227, term57227.getClass(), "type", 13);
        setField(term57227, term57227.getClass(), "next", null);
        setDoubleField(term57228, term57228.getClass(), "number", 0.0);
        setIntField(term57228, term57228.getClass(), "type", 0);
        setDoubleField(term57229, term57229.getClass(), "number", 0.0);
        setIntField(term57229, term57229.getClass(), "type", 0);
        setField(term57229, term57229.getClass(), "next", null);
        setField(term57229, term57229.getClass(), "first", null);
        setField(term57229, term57229.getClass(), "last", null);
        setField(term57229, term57229.getClass(), "propListHead", null);
        setIntField(term57229, term57229.getClass(), "sourcePosition", 0);
        setField(term57229, term57229.getClass(), "jsType", null);
        setField(term57229, term57229.getClass(), "parent", null);
        setField(term57228, term57228.getClass(), "next", term57229);
        setField(term57228, term57228.getClass(), "first", null);
        setField(term57228, term57228.getClass(), "last", null);
        setField(term57228, term57228.getClass(), "propListHead", null);
        setIntField(term57228, term57228.getClass(), "sourcePosition", 0);
        setField(term57228, term57228.getClass(), "jsType", null);
        setField(term57228, term57228.getClass(), "parent", null);
        setField(term57227, term57227.getClass(), "first", term57228);
        setField(term57227, term57227.getClass(), "last", null);
        setField(term57227, term57227.getClass(), "propListHead", null);
        setIntField(term57227, term57227.getClass(), "sourcePosition", 0);
        setField(term57227, term57227.getClass(), "jsType", null);
        setField(term57227, term57227.getClass(), "parent", null);
        term57185 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57185, term57185.getClass(), "number", 0.0);
        setIntField(term57185, term57185.getClass(), "type", 13);
        setField(term57185, term57185.getClass(), "next", null);
        setDoubleField(term57188, term57188.getClass(), "number", 0.0);
        setIntField(term57188, term57188.getClass(), "type", 0);
        setDoubleField(term57191, term57191.getClass(), "number", 0.0);
        setIntField(term57191, term57191.getClass(), "type", 0);
        setField(term57191, term57191.getClass(), "next", null);
        setField(term57191, term57191.getClass(), "first", null);
        setField(term57191, term57191.getClass(), "last", null);
        setField(term57191, term57191.getClass(), "propListHead", null);
        setIntField(term57191, term57191.getClass(), "sourcePosition", 0);
        setField(term57191, term57191.getClass(), "jsType", null);
        setField(term57191, term57191.getClass(), "parent", null);
        setField(term57188, term57188.getClass(), "next", term57191);
        setField(term57188, term57188.getClass(), "first", null);
        setField(term57188, term57188.getClass(), "last", null);
        setField(term57188, term57188.getClass(), "propListHead", null);
        setIntField(term57188, term57188.getClass(), "sourcePosition", 0);
        setField(term57188, term57188.getClass(), "jsType", null);
        setField(term57188, term57188.getClass(), "parent", null);
        setField(term57185, term57185.getClass(), "first", term57188);
        setField(term57185, term57185.getClass(), "last", null);
        setField(term57185, term57185.getClass(), "propListHead", null);
        setIntField(term57185, term57185.getClass(), "sourcePosition", 0);
        setField(term57185, term57185.getClass(), "jsType", null);
        setField(term57185, term57185.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56429;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term56337, args);
        assertTrue(recursiveEquals(term56337, term57226));
        assertTrue(recursiveEquals(term56429, term57227));
        assertTrue(recursiveEquals(retValue, term57185));
    }

};


