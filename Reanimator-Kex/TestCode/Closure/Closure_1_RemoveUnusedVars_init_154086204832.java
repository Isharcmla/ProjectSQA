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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveUnusedVars_init_154086204832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5596;

    public RemoveUnusedVars_init_154086204832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term4974 = new HashSet();
        ArrayList term5026 = new ArrayList();
        ArrayList term5078 = new ArrayList();
        HashMap term5218 = new HashMap();
        Object term4926 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term5170 = newInstance(Class.forName("com.google.common.collect.ArrayListMultimap"));
        Object term5312 = newInstance(Class.forName("com.google.common.collect.LinkedListMultimap"));
        Object term5436 = newInstance(Class.forName("com.google.common.collect.ImmutableMultimap$BuilderMultimap"));
        Object term5516 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4926, term4926.getClass(), "referenced", term4974);
        setField(term4926, term4926.getClass(), "maybeUnreferenced", term5026);
        setField(term4926, term4926.getClass(), "allFunctionScopes", term5078);
        setField(term4926, term4926.getClass(), "assignsByVar", term5170);
        setField(term4926, term4926.getClass(), "assignsByNode", term5218);
        setField(term4926, term4926.getClass(), "classDefiningCalls", term5312);
        setField(term4926, term4926.getClass(), "continuations", term5436);
        setField(term4926, term4926.getClass(), "compiler", term5516);
        term5596 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term5596;
        args[1] = false;
        args[2] = false;
        args[3] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
