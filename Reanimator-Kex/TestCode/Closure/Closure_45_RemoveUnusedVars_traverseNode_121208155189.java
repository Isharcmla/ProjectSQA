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
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21988;
     Object term22080;

    public RemoveUnusedVars_traverseNode_121208155189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21988 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term22080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term22080, term22080.getClass(), "type", -302120961);
        setIntField(term22172, term22172.getClass(), "type", 0);
        setIntField(term22264, term22264.getClass(), "type", 64);
        setField(term22264, term22264.getClass(), "first", null);
        setField(term22264, term22264.getClass(), "next", null);
        setField(term22172, term22172.getClass(), "first", term22264);
        setIntField(term22356, term22356.getClass(), "type", 0);
        setField(term22356, term22356.getClass(), "first", term22448);
        setField(term22172, term22172.getClass(), "next", term22356);
        setField(term22080, term22080.getClass(), "first", term22172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term22080;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term21988, args);
    }

};


