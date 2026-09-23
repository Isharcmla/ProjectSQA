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

public class NodeTraversal_traverse_846591159141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29130;
     Object term29278;
     Object term29538;
     Object term29539;

    public NodeTraversal_traverse_846591159141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29130, term29130.getClass(), "type", -133);
        setField(term29130, term29130.getClass(), "parent", null);
        term29278 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
        term29538 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
        setField(term29538, term29538.getClass(), "this$0", null);
        term29539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29539, term29539.getClass(), "type", -133);
        setField(term29539, term29539.getClass(), "next", null);
        setField(term29539, term29539.getClass(), "first", null);
        setField(term29539, term29539.getClass(), "last", null);
        setField(term29539, term29539.getClass(), "propListHead", null);
        setIntField(term29539, term29539.getClass(), "sourcePosition", 0);
        setField(term29539, term29539.getClass(), "jsType", null);
        setField(term29539, term29539.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term29130;
        args[2] = term29278;
        callMethod(klass, "traverse", argTypes, null, args);
        assertTrue(recursiveEquals(term29130, term29538));
        assertTrue(recursiveEquals(term29278, term29539));
    }

};


