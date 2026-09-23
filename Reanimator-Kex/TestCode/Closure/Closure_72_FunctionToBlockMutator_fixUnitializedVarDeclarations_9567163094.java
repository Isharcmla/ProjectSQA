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

public class FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40006;
     Object term40076;

    public FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40006 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term40076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40076, term40076.getClass(), "type", 865208305);
        setIntField(term40146, term40146.getClass(), "type", 0);
        setField(term40146, term40146.getClass(), "first", term40146);
        setField(term40076, term40076.getClass(), "first", term40146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40076;
        callMethod(klass, "fixUnitializedVarDeclarations", argTypes, term40006, args);
    }

};


