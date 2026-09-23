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

public class RemoveUnusedVars_traverseNode_1212081551107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29955;
     Object term30047;

    public RemoveUnusedVars_traverseNode_1212081551107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29955 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term30047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term30047, term30047.getClass(), "type", 0);
        setIntField(term30139, term30139.getClass(), "type", 0);
        setIntField(term30231, term30231.getClass(), "type", 64);
        setField(term30231, term30231.getClass(), "first", null);
        setField(term30231, term30231.getClass(), "next", null);
        setField(term30139, term30139.getClass(), "first", term30231);
        setField(term30139, term30139.getClass(), "next", term30323);
        setField(term30047, term30047.getClass(), "first", term30139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term30047;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term29955, args);
    }

};


