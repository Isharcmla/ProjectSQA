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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13187;
     Object term13337;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13187 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term13267 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13187, term13187.getClass(), "compiler", term13267);
        term13337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13337, term13337.getClass(), "type", 0);
        setIntField(term13407, term13407.getClass(), "type", 0);
        setIntField(term13477, term13477.getClass(), "type", 0);
        setField(term13477, term13477.getClass(), "first", null);
        setField(term13477, term13477.getClass(), "next", null);
        setField(term13407, term13407.getClass(), "first", term13477);
        setField(term13407, term13407.getClass(), "next", null);
        setField(term13337, term13337.getClass(), "first", term13407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13337;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term13187, args);
    }

};
