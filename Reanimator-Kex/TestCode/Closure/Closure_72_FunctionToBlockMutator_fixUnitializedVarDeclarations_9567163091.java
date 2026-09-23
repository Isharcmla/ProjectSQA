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

public class FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38958;
     Object term39028;

    public FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38958 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term39028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39028, term39028.getClass(), "type", 865208305);
        setIntField(term39098, term39098.getClass(), "type", 0);
        setIntField(term39168, term39168.getClass(), "type", 0);
        setField(term39168, term39168.getClass(), "first", null);
        setField(term39168, term39168.getClass(), "next", null);
        setField(term39098, term39098.getClass(), "first", term39168);
        setField(term39098, term39098.getClass(), "next", term39238);
        setField(term39028, term39028.getClass(), "first", term39098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39028;
        callMethod(klass, "fixUnitializedVarDeclarations", argTypes, term38958, args);
    }

};


