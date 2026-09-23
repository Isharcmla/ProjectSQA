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
import java.util.ArrayDeque;
import java.util.LinkedList;

public class NodeTraversal_init_948242719102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18480;
     Object term18985;
     Object term18994;

    public NodeTraversal_init_948242719102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term18198 = new ArrayDeque();
        ArrayDeque term18252 = new ArrayDeque();
        Object term18144 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term18376 = newInstance(Class.forName("com.google.javascript.jscomp.IgnoreCajaProperties$Traversal"));
        setField(term18144, term18144.getClass(), "scopes", null);
        setField(term18144, term18144.getClass(), "scopeRoots", term18198);
        setField(term18144, term18144.getClass(), "cfgs", term18252);
        setField(term18144, term18144.getClass(), "callback", term18376);
        term18480 = newInstance(Class.forName("com.google.javascript.jscomp.CombinedCompilerPass"));
        ArrayDeque term18987 = new ArrayDeque();
        ArrayDeque term18989 = new ArrayDeque();
        LinkedList term18991 = new LinkedList();
        term18985 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term18986 = newInstance(Class.forName("com.google.javascript.jscomp.CombinedCompilerPass"));
        setField(term18985, term18985.getClass(), "compiler", null);
        setField(term18986, term18986.getClass(), "callbacks", null);
        setField(term18986, term18986.getClass(), "compiler", null);
        setField(term18985, term18985.getClass(), "callback", term18986);
        setField(term18985, term18985.getClass(), "curNode", null);
        setField(term18985, term18985.getClass(), "scopes", term18987);
        setField(term18985, term18985.getClass(), "scopeRoots", term18989);
        setField(term18985, term18985.getClass(), "cfgs", term18991);
        setField(term18985, term18985.getClass(), "sourceName", "");
        setField(term18985, term18985.getClass(), "inputId", null);
        setField(term18985, term18985.getClass(), "scopeCreator", null);
        setField(term18985, term18985.getClass(), "scopeCallback", term18986);
        term18994 = newInstance(Class.forName("com.google.javascript.jscomp.CombinedCompilerPass"));
        setField(term18994, term18994.getClass(), "callbacks", null);
        setField(term18994, term18994.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.ScopeCreator");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term18480;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18985));
        assertTrue(recursiveEquals(term18480, term18994));
    }

};


