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

public class Scope_init_86531323460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6333;
     Object term6425;

    public Scope_init_86531323460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6115 = new HashMap();
        Object term6067 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6189 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6067, term6067.getClass(), "vars", term6115);
        setField(term6067, term6067.getClass(), "parent", term6189);
        setField(term6067, term6067.getClass(), "rootNode", term6259);
        term6333 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6333, term6333.getClass(), "rootNode", null);
        term6425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6333;
        args[1] = term6425;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


