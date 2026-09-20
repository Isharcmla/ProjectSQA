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

public class RemoveUnusedVars_traverseNode_121208155137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8664;
     Object term8756;

    public RemoveUnusedVars_traverseNode_121208155137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8664 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term8756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term9032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term8756, term8756.getClass(), "type", 0);
        setIntField(term8848, term8848.getClass(), "type", 0);
        setIntField(term8940, term8940.getClass(), "type", 64);
        setField(term8940, term8940.getClass(), "first", null);
        setField(term8940, term8940.getClass(), "next", null);
        setField(term8848, term8848.getClass(), "first", term8940);
        setField(term8848, term8848.getClass(), "next", term9032);
        setField(term8756, term8756.getClass(), "first", term8848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term8756;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term8664, args);
    }

};
