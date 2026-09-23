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

public class TypedScopeCreator_createInitialScope_762247464123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54079;
     Object term54343;

    public TypedScopeCreator_createInitialScope_762247464123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54079 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term54159 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term54251 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term54159, term54159.getClass(), "phaseOptimizer", term54251);
        setField(term54079, term54079.getClass(), "compiler", term54159);
        setField(term54079, term54079.getClass(), "typeRegistry", null);
        term54343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54343, term54343.getClass(), "type", -133);
        setField(term54343, term54343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54343;
        callMethod(klass, "createInitialScope", argTypes, term54079, args);
    }

};


