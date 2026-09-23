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
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.lang.Object;

public class NodeTraversal_init_200964309863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8753;

    public NodeTraversal_init_200964309863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term8754 = new ArrayDeque();
        ArrayDeque term8756 = new ArrayDeque();
        LinkedList term8758 = new LinkedList();
        term8753 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term8761 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term8762 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler"));
        setField(term8753, term8753.getClass(), "compiler", null);
        setField(term8753, term8753.getClass(), "callback", null);
        setField(term8753, term8753.getClass(), "curNode", null);
        setField(term8753, term8753.getClass(), "scopes", term8754);
        setField(term8753, term8753.getClass(), "scopeRoots", term8756);
        setField(term8753, term8753.getClass(), "cfgs", term8758);
        setField(term8753, term8753.getClass(), "sourceName", "");
        setField(term8753, term8753.getClass(), "inputId", null);
        setField(term8761, term8761.getClass(), "compiler", null);
        setField(term8761, term8761.getClass(), "scope", null);
        setField(term8761, term8761.getClass(), "inputId", null);
        setField(term8762, term8762.getClass(), "this$0", term8761);
        setField(term8761, term8761.getClass(), "redeclarationHandler", term8762);
        setField(term8753, term8753.getClass(), "scopeCreator", term8761);
        setField(term8753, term8753.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8753));
    }

};


