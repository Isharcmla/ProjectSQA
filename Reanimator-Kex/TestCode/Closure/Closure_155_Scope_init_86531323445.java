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

public class Scope_init_86531323445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5039;
     Object term5131;

    public Scope_init_86531323445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4821 = new HashMap();
        Object term4773 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4895 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4773, term4773.getClass(), "vars", term4821);
        setField(term4773, term4773.getClass(), "parent", term4895);
        setField(term4773, term4773.getClass(), "rootNode", term4965);
        term5039 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5039, term5039.getClass(), "rootNode", null);
        term5131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5039;
        args[1] = term5131;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


