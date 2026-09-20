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

public class RemoveUnusedVars_traverseFunction_28788501859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16460;
     Object term16530;

    public RemoveUnusedVars_traverseFunction_28788501859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16460 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term16530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16600, term16600.getClass(), "next", term16530);
        setField(term16530, term16530.getClass(), "first", term16600);
        setField(term16530, term16530.getClass(), "next", term16530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term16530;
        args[1] = null;
        callMethod(klass, "traverseFunction", argTypes, term16460, args);
    }

};
