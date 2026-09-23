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

public class Scope_init_86531323486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17186;
     Object term17276;

    public Scope_init_86531323486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16968 = new HashMap();
        Object term16920 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term17042 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term17112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16920, term16920.getClass(), "vars", term16968);
        setField(term16920, term16920.getClass(), "parent", term17042);
        setField(term16920, term16920.getClass(), "rootNode", term17112);
        term17186 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term17186, term17186.getClass(), "rootNode", null);
        term17276 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term17186;
        args[1] = term17276;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


