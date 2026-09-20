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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9216;
     Object term9286;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9216 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term9216, term9216.getClass(), "compiler", null);
        term9286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9286, term9286.getClass(), "type", 0);
        setIntField(term9356, term9356.getClass(), "type", 0);
        setIntField(term9426, term9426.getClass(), "type", 37);
        setField(term9356, term9356.getClass(), "first", term9426);
        setField(term9286, term9286.getClass(), "first", term9356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9286;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term9216, args);
    }

};
