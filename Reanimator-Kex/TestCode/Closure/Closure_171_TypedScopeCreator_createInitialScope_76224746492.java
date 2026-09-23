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

public class TypedScopeCreator_createInitialScope_76224746492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38870;
     Object term38940;

    public TypedScopeCreator_createInitialScope_76224746492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38870 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term38870, term38870.getClass(), "compiler", null);
        setField(term38870, term38870.getClass(), "typeRegistry", null);
        term38940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38940, term38940.getClass(), "type", 0);
        setIntField(term39010, term39010.getClass(), "type", 0);
        setField(term39010, term39010.getClass(), "parent", null);
        setField(term38940, term38940.getClass(), "parent", term39010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38940;
        callMethod(klass, "createInitialScope", argTypes, term38870, args);
    }

};


