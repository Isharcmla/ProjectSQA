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
import java.util.HashSet;

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39402;
     Object term39488;
     Object term39622;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39402 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term39488 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term39574 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term39488, term39488.getClass(), "type", 0);
        setIntField(term39574, term39574.getClass(), "type", 0);
        setField(term39574, term39574.getClass(), "first", null);
        setField(term39574, term39574.getClass(), "next", term39574);
        setField(term39488, term39488.getClass(), "first", term39574);
        term39622 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term39488;
        args[1] = null;
        args[2] = term39622;
        callMethod(klass, "aliasAndInlineArguments", argTypes, term39402, args);
    }

};


