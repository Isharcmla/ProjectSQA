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
import java.util.ArrayList;
import java.lang.Object;

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9909;
     Object term10031;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9961 = new ArrayList();
        term9909 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term9909, term9909.getClass(), "compiler", null);
        setBooleanField(term9909, term9909.getClass(), "removeGlobals", true);
        setField(term9909, term9909.getClass(), "maybeUnreferenced", term9961);
        term10031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10031, term10031.getClass(), "type", 0);
        setIntField(term10101, term10101.getClass(), "type", 0);
        setIntField(term10171, term10171.getClass(), "type", 0);
        setField(term10171, term10171.getClass(), "first", null);
        setField(term10171, term10171.getClass(), "next", null);
        setField(term10101, term10101.getClass(), "first", term10171);
        setField(term10101, term10101.getClass(), "next", term10171);
        setField(term10031, term10031.getClass(), "first", term10101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10031;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term9909, args);
    }

};
