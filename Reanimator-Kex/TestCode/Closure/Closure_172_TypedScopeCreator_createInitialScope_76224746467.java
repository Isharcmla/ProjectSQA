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

public class TypedScopeCreator_createInitialScope_76224746467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28936;
     Object term29190;

    public TypedScopeCreator_createInitialScope_76224746467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28936 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term29016 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term29120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term29016, term29016.getClass(), "phaseOptimizer", null);
        setField(term28936, term28936.getClass(), "compiler", term29016);
        setField(term28936, term28936.getClass(), "typeRegistry", term29120);
        term29190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29190, term29190.getClass(), "type", 0);
        setField(term29190, term29190.getClass(), "parent", null);
        setField(term29190, term29190.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29190;
        callMethod(klass, "createInitialScope", argTypes, term28936, args);
    }

};


