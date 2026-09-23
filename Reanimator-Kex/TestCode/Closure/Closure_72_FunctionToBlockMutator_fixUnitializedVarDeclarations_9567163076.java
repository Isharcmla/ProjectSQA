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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20509;
     Object term20579;
     Object term28954;
     Object term28955;

    public FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20509 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term20579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20579, term20579.getClass(), "type", 865208305);
        setIntField(term20649, term20649.getClass(), "type", 0);
        setField(term20649, term20649.getClass(), "first", term20719);
        setField(term20579, term20579.getClass(), "first", term20649);
        term28954 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term28954, term28954.getClass(), "compiler", null);
        setField(term28954, term28954.getClass(), "safeNameIdSupplier", null);
        term28955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28955, term28955.getClass(), "type", 865208305);
        setField(term28955, term28955.getClass(), "next", null);
        setIntField(term28956, term28956.getClass(), "type", 0);
        setField(term28956, term28956.getClass(), "next", null);
        setIntField(term28957, term28957.getClass(), "type", 0);
        setField(term28957, term28957.getClass(), "next", null);
        setField(term28957, term28957.getClass(), "first", null);
        setField(term28957, term28957.getClass(), "last", null);
        setField(term28957, term28957.getClass(), "propListHead", null);
        setIntField(term28957, term28957.getClass(), "sourcePosition", 0);
        setField(term28957, term28957.getClass(), "jsType", null);
        setField(term28957, term28957.getClass(), "parent", null);
        setField(term28956, term28956.getClass(), "first", term28957);
        setField(term28956, term28956.getClass(), "last", null);
        setField(term28956, term28956.getClass(), "propListHead", null);
        setIntField(term28956, term28956.getClass(), "sourcePosition", 0);
        setField(term28956, term28956.getClass(), "jsType", null);
        setField(term28956, term28956.getClass(), "parent", null);
        setField(term28955, term28955.getClass(), "first", term28956);
        setField(term28955, term28955.getClass(), "last", null);
        setField(term28955, term28955.getClass(), "propListHead", null);
        setIntField(term28955, term28955.getClass(), "sourcePosition", 0);
        setField(term28955, term28955.getClass(), "jsType", null);
        setField(term28955, term28955.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20579;
        callMethod(klass, "fixUnitializedVarDeclarations", argTypes, term20509, args);
        assertTrue(recursiveEquals(term20509, term28954));
        assertTrue(recursiveEquals(term20579, term28955));
    }

};


