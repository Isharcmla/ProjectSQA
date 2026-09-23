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

public class FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29767;
     Object term29837;

    public FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29767 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term29837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29837, term29837.getClass(), "type", 865208305);
        setIntField(term29907, term29907.getClass(), "type", 0);
        setIntField(term29977, term29977.getClass(), "type", 0);
        setField(term29977, term29977.getClass(), "first", null);
        setField(term29977, term29977.getClass(), "next", term30047);
        setField(term29907, term29907.getClass(), "first", term29977);
        setField(term29837, term29837.getClass(), "first", term29907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29837;
        callMethod(klass, "fixUnitializedVarDeclarations", argTypes, term29767, args);
    }

};


