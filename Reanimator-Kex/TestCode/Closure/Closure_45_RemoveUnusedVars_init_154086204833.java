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

public class RemoveUnusedVars_init_154086204833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5215;

    public RemoveUnusedVars_init_154086204833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term4525 = new HashSet();
        ArrayList term4577 = new ArrayList();
        ArrayList term4629 = new ArrayList();
        HashMap term4795 = new HashMap();
        Object term4477 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term4747 = newInstance(Class.forName("com.google.common.collect.Multimaps$UnmodifiableMultimap"));
        Object term4925 = newInstance(Class.forName("com.google.common.collect.ImmutableSetMultimap$BuilderMultimap"));
        Object term5055 = newInstance(Class.forName("com.google.common.collect.ImmutableSetMultimap$BuilderMultimap"));
        Object term5135 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4477, term4477.getClass(), "referenced", term4525);
        setField(term4477, term4477.getClass(), "maybeUnreferenced", term4577);
        setField(term4477, term4477.getClass(), "allFunctionScopes", term4629);
        setField(term4477, term4477.getClass(), "assignsByVar", term4747);
        setField(term4477, term4477.getClass(), "assignsByNode", term4795);
        setField(term4477, term4477.getClass(), "inheritsCalls", term4925);
        setField(term4477, term4477.getClass(), "continuations", term5055);
        setField(term4477, term4477.getClass(), "compiler", term5135);
        term5215 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
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
        args[0] = term5215;
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


