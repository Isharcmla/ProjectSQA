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

public class TypedScopeCreator_createInitialScope_762247464125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55486;
     Object term55658;

    public TypedScopeCreator_createInitialScope_762247464125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55486 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term55566 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55566, term55566.getClass(), "phaseOptimizer", null);
        setField(term55486, term55486.getClass(), "compiler", term55566);
        setField(term55486, term55486.getClass(), "typeRegistry", null);
        term55658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55658, term55658.getClass(), "type", 0);
        setField(term55658, term55658.getClass(), "parent", null);
        setField(term55658, term55658.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55658;
        callMethod(klass, "createInitialScope", argTypes, term55486, args);
    }

};


