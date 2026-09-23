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

public class FunctionToBlockMutator_getReplacementReturnStatement_158795101485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37087;

    public FunctionToBlockMutator_getReplacementReturnStatement_158795101485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term37249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37179, term37179.getClass(), "first", term37249);
        setField(term37087, term37087.getClass(), "first", term37179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term37087;
        args[1] = null;
        callMethod(klass, "getReplacementReturnStatement", argTypes, null, args);
    }

};


