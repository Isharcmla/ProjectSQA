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

public class TypedScopeCreator_createScope_265732215128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57168;
     Object term57340;
     Object term57690;

    public TypedScopeCreator_createScope_265732215128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57168 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term57248 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57248, term57248.getClass(), "phaseOptimizer", null);
        setField(term57168, term57168.getClass(), "compiler", term57248);
        term57340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57340, term57340.getClass(), "type", 0);
        setIntField(term57432, term57432.getClass(), "type", 0);
        setField(term57432, term57432.getClass(), "parent", null);
        setField(term57340, term57340.getClass(), "parent", term57432);
        setField(term57524, term57524.getClass(), "next", term57616);
        setIntField(term57524, term57524.getClass(), "type", 120);
        setField(term57524, term57524.getClass(), "first", null);
        setField(term57340, term57340.getClass(), "first", term57524);
        term57690 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term57760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57690, term57690.getClass(), "rootNode", term57760);
        setIntField(term57690, term57690.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term57340;
        args[1] = term57690;
        callMethod(klass, "createScope", argTypes, term57168, args);
    }

};


