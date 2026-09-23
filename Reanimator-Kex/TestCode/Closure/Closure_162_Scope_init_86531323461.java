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
import java.util.HashMap;

public class Scope_init_86531323461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6740;
     Object term6810;

    public Scope_init_86531323461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6596 = new HashMap();
        Object term6548 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6548, term6548.getClass(), "vars", term6596);
        setField(term6548, term6548.getClass(), "parent", null);
        setField(term6548, term6548.getClass(), "rootNode", term6666);
        term6740 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6740, term6740.getClass(), "rootNode", null);
        term6810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term6810, term6810.getClass(), "jsType", term6908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6740;
        args[1] = term6810;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


