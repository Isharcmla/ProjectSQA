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

public class PeepholeFoldConstants_tryFoldComparison_8484431793187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945590;
     Object term945682;
     Object term945774;
     Object term945866;
     Object term946454;
     Object term946455;
     Object term946456;
     Object term946457;
     Object term946427;

    public PeepholeFoldConstants_tryFoldComparison_8484431793187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945590 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term945682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term945682, term945682.getClass(), "type", 14);
        term945774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term945774, term945774.getClass(), "type", 42);
        term945866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term945866, term945866.getClass(), "type", 14);
        term946454 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term946454, term946454.getClass(), "currentTraversal", null);
        term946455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term946455, term946455.getClass(), "number", 0.0);
        setIntField(term946455, term946455.getClass(), "type", 42);
        setField(term946455, term946455.getClass(), "next", null);
        setField(term946455, term946455.getClass(), "first", null);
        setField(term946455, term946455.getClass(), "last", null);
        setField(term946455, term946455.getClass(), "propListHead", null);
        setIntField(term946455, term946455.getClass(), "sourcePosition", 0);
        setField(term946455, term946455.getClass(), "jsType", null);
        setField(term946455, term946455.getClass(), "parent", null);
        term946456 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term946456, term946456.getClass(), "number", 0.0);
        setIntField(term946456, term946456.getClass(), "type", 14);
        setField(term946456, term946456.getClass(), "next", null);
        setField(term946456, term946456.getClass(), "first", null);
        setField(term946456, term946456.getClass(), "last", null);
        setField(term946456, term946456.getClass(), "propListHead", null);
        setIntField(term946456, term946456.getClass(), "sourcePosition", 0);
        setField(term946456, term946456.getClass(), "jsType", null);
        setField(term946456, term946456.getClass(), "parent", null);
        term946457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term946457, term946457.getClass(), "number", 0.0);
        setIntField(term946457, term946457.getClass(), "type", 14);
        setField(term946457, term946457.getClass(), "next", null);
        setField(term946457, term946457.getClass(), "first", null);
        setField(term946457, term946457.getClass(), "last", null);
        setField(term946457, term946457.getClass(), "propListHead", null);
        setIntField(term946457, term946457.getClass(), "sourcePosition", 0);
        setField(term946457, term946457.getClass(), "jsType", null);
        setField(term946457, term946457.getClass(), "parent", null);
        term946427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term946427, term946427.getClass(), "number", 0.0);
        setIntField(term946427, term946427.getClass(), "type", 14);
        setField(term946427, term946427.getClass(), "next", null);
        setField(term946427, term946427.getClass(), "first", null);
        setField(term946427, term946427.getClass(), "last", null);
        setField(term946427, term946427.getClass(), "propListHead", null);
        setIntField(term946427, term946427.getClass(), "sourcePosition", 0);
        setField(term946427, term946427.getClass(), "jsType", null);
        setField(term946427, term946427.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term945682;
        args[1] = term945774;
        args[2] = term945866;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term945590, args);
        assertTrue(recursiveEquals(term945590, term946454));
        assertTrue(recursiveEquals(term945682, term946455));
        assertTrue(recursiveEquals(term945774, term946456));
        assertTrue(recursiveEquals(term945866, term946457));
        assertTrue(recursiveEquals(retValue, term946427));
    }

};


