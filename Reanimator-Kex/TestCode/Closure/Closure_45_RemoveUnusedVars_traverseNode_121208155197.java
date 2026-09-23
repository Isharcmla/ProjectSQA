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

public class RemoveUnusedVars_traverseNode_121208155197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26325;
     Object term26417;

    public RemoveUnusedVars_traverseNode_121208155197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26325 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term26417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term26417, term26417.getClass(), "type", -2096520);
        setIntField(term26509, term26509.getClass(), "type", 2096519);
        setIntField(term26601, term26601.getClass(), "type", 64);
        setField(term26601, term26601.getClass(), "first", null);
        setField(term26601, term26601.getClass(), "next", null);
        setField(term26509, term26509.getClass(), "first", term26601);
        setIntField(term26693, term26693.getClass(), "type", 64);
        setField(term26693, term26693.getClass(), "first", null);
        setField(term26693, term26693.getClass(), "next", term26785);
        setField(term26509, term26509.getClass(), "next", term26693);
        setField(term26417, term26417.getClass(), "first", term26509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term26417;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term26325, args);
    }

};


