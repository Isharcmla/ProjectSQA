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

public class Scope_init_86531323450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6681;
     Object term6771;

    public Scope_init_86531323450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6463 = new HashMap();
        Object term6415 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6537 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6415, term6415.getClass(), "vars", term6463);
        setField(term6415, term6415.getClass(), "parent", term6537);
        setField(term6415, term6415.getClass(), "rootNode", term6607);
        term6681 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6681, term6681.getClass(), "rootNode", null);
        term6771 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6681;
        args[1] = term6771;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


