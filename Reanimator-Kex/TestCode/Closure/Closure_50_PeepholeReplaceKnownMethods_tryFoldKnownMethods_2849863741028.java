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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4453007;
     Object term4453099;
     Object term4454056;
     Object term4454057;
     Object term4453789;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4453007 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4453099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4453191, term4453191.getClass(), "type", 35);
        setIntField(term4453375, term4453375.getClass(), "type", 40);
        setField(term4453375, term4453375.getClass(), "str", "charAt");
        setField(term4453283, term4453283.getClass(), "next", term4453375);
        setIntField(term4453283, term4453283.getClass(), "type", 40);
        setField(term4453191, term4453191.getClass(), "first", term4453283);
        setIntField(term4453505, term4453505.getClass(), "type", 44);
        setField(term4453191, term4453191.getClass(), "next", term4453505);
        setField(term4453099, term4453099.getClass(), "first", term4453191);
        setIntField(term4453099, term4453099.getClass(), "type", 37);
        term4454056 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4454056, term4454056.getClass(), "currentTraversal", null);
        term4454057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4454058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4454059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4454060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4454061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4454057, term4454057.getClass(), "str", null);
        setIntField(term4454057, term4454057.getClass(), "type", 37);
        setField(term4454057, term4454057.getClass(), "next", null);
        setField(term4454058, term4454058.getClass(), "str", null);
        setIntField(term4454058, term4454058.getClass(), "type", 35);
        setDoubleField(term4454059, term4454059.getClass(), "number", 0.0);
        setIntField(term4454059, term4454059.getClass(), "type", 44);
        setField(term4454059, term4454059.getClass(), "next", null);
        setField(term4454059, term4454059.getClass(), "first", null);
        setField(term4454059, term4454059.getClass(), "last", null);
        setField(term4454059, term4454059.getClass(), "propListHead", null);
        setIntField(term4454059, term4454059.getClass(), "sourcePosition", 0);
        setField(term4454059, term4454059.getClass(), "jsType", null);
        setField(term4454059, term4454059.getClass(), "parent", null);
        setField(term4454058, term4454058.getClass(), "next", term4454059);
        setField(term4454060, term4454060.getClass(), "str", null);
        setIntField(term4454060, term4454060.getClass(), "type", 40);
        setField(term4454061, term4454061.getClass(), "str", "");
        setIntField(term4454061, term4454061.getClass(), "type", 40);
        setField(term4454061, term4454061.getClass(), "next", null);
        setField(term4454061, term4454061.getClass(), "first", null);
        setField(term4454061, term4454061.getClass(), "last", null);
        setField(term4454061, term4454061.getClass(), "propListHead", null);
        setIntField(term4454061, term4454061.getClass(), "sourcePosition", 0);
        setField(term4454061, term4454061.getClass(), "jsType", null);
        setField(term4454061, term4454061.getClass(), "parent", null);
        setField(term4454060, term4454060.getClass(), "next", term4454061);
        setField(term4454060, term4454060.getClass(), "first", null);
        setField(term4454060, term4454060.getClass(), "last", null);
        setField(term4454060, term4454060.getClass(), "propListHead", null);
        setIntField(term4454060, term4454060.getClass(), "sourcePosition", 0);
        setField(term4454060, term4454060.getClass(), "jsType", null);
        setField(term4454060, term4454060.getClass(), "parent", null);
        setField(term4454058, term4454058.getClass(), "first", term4454060);
        setField(term4454058, term4454058.getClass(), "last", null);
        setField(term4454058, term4454058.getClass(), "propListHead", null);
        setIntField(term4454058, term4454058.getClass(), "sourcePosition", 0);
        setField(term4454058, term4454058.getClass(), "jsType", null);
        setField(term4454058, term4454058.getClass(), "parent", null);
        setField(term4454057, term4454057.getClass(), "first", term4454058);
        setField(term4454057, term4454057.getClass(), "last", null);
        setField(term4454057, term4454057.getClass(), "propListHead", null);
        setIntField(term4454057, term4454057.getClass(), "sourcePosition", 0);
        setField(term4454057, term4454057.getClass(), "jsType", null);
        setField(term4454057, term4454057.getClass(), "parent", null);
        term4453789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453791 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4453797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4453799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4453789, term4453789.getClass(), "str", null);
        setIntField(term4453789, term4453789.getClass(), "type", 37);
        setField(term4453789, term4453789.getClass(), "next", null);
        setField(term4453791, term4453791.getClass(), "str", null);
        setIntField(term4453791, term4453791.getClass(), "type", 35);
        setDoubleField(term4453793, term4453793.getClass(), "number", 0.0);
        setIntField(term4453793, term4453793.getClass(), "type", 44);
        setField(term4453793, term4453793.getClass(), "next", null);
        setField(term4453793, term4453793.getClass(), "first", null);
        setField(term4453793, term4453793.getClass(), "last", null);
        setField(term4453793, term4453793.getClass(), "propListHead", null);
        setIntField(term4453793, term4453793.getClass(), "sourcePosition", 0);
        setField(term4453793, term4453793.getClass(), "jsType", null);
        setField(term4453793, term4453793.getClass(), "parent", null);
        setField(term4453791, term4453791.getClass(), "next", term4453793);
        setField(term4453797, term4453797.getClass(), "str", null);
        setIntField(term4453797, term4453797.getClass(), "type", 40);
        setField(term4453799, term4453799.getClass(), "str", "");
        setIntField(term4453799, term4453799.getClass(), "type", 40);
        setField(term4453799, term4453799.getClass(), "next", null);
        setField(term4453799, term4453799.getClass(), "first", null);
        setField(term4453799, term4453799.getClass(), "last", null);
        setField(term4453799, term4453799.getClass(), "propListHead", null);
        setIntField(term4453799, term4453799.getClass(), "sourcePosition", 0);
        setField(term4453799, term4453799.getClass(), "jsType", null);
        setField(term4453799, term4453799.getClass(), "parent", null);
        setField(term4453797, term4453797.getClass(), "next", term4453799);
        setField(term4453797, term4453797.getClass(), "first", null);
        setField(term4453797, term4453797.getClass(), "last", null);
        setField(term4453797, term4453797.getClass(), "propListHead", null);
        setIntField(term4453797, term4453797.getClass(), "sourcePosition", 0);
        setField(term4453797, term4453797.getClass(), "jsType", null);
        setField(term4453797, term4453797.getClass(), "parent", null);
        setField(term4453791, term4453791.getClass(), "first", term4453797);
        setField(term4453791, term4453791.getClass(), "last", null);
        setField(term4453791, term4453791.getClass(), "propListHead", null);
        setIntField(term4453791, term4453791.getClass(), "sourcePosition", 0);
        setField(term4453791, term4453791.getClass(), "jsType", null);
        setField(term4453791, term4453791.getClass(), "parent", null);
        setField(term4453789, term4453789.getClass(), "first", term4453791);
        setField(term4453789, term4453789.getClass(), "last", null);
        setField(term4453789, term4453789.getClass(), "propListHead", null);
        setIntField(term4453789, term4453789.getClass(), "sourcePosition", 0);
        setField(term4453789, term4453789.getClass(), "jsType", null);
        setField(term4453789, term4453789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4453099;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4453007, args);
        assertTrue(recursiveEquals(term4453007, term4454056));
        assertTrue(recursiveEquals(term4453099, term4454057));
        assertTrue(recursiveEquals(retValue, term4453789));
    }

};


