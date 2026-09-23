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

public class FunctionToBlockMutator_replaceReturns_124525402578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29465;

    public FunctionToBlockMutator_replaceReturns_124525402578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29465, term29465.getClass(), "type", 0);
        setField(term29465, term29465.getClass(), "parent", null);
        setIntField(term29535, term29535.getClass(), "type", 0);
        setField(term29535, term29535.getClass(), "parent", null);
        setField(term29535, term29535.getClass(), "first", null);
        setField(term29535, term29535.getClass(), "next", null);
        setField(term29465, term29465.getClass(), "first", term29535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term29465;
        args[1] = "";
        args[2] = "";
        args[3] = true;
        callMethod(klass, "replaceReturns", argTypes, null, args);
    }

};


