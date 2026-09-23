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

public class NodeTraversal_init_94824271964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8778;

    public NodeTraversal_init_94824271964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term8779 = new ArrayDeque();
        ArrayDeque term8781 = new ArrayDeque();
        LinkedList term8783 = new LinkedList();
        term8778 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term8778, term8778.getClass(), "compiler", null);
        setField(term8778, term8778.getClass(), "callback", null);
        setField(term8778, term8778.getClass(), "curNode", null);
        setField(term8778, term8778.getClass(), "scopes", term8779);
        setField(term8778, term8778.getClass(), "scopeRoots", term8781);
        setField(term8778, term8778.getClass(), "cfgs", term8783);
        setField(term8778, term8778.getClass(), "sourceName", "");
        setField(term8778, term8778.getClass(), "inputId", null);
        setField(term8778, term8778.getClass(), "scopeCreator", null);
        setField(term8778, term8778.getClass(), "scopeCallback", null);
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
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8778));
    }

};


