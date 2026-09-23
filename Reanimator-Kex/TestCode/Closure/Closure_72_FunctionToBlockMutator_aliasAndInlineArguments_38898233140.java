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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4115;
     Object term4207;
     Object term4255;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4115 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term4207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4207, term4207.getClass(), "type", -39);
        setField(term4207, term4207.getClass(), "first", term4207);
        term4255 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term4207;
        args[1] = null;
        args[2] = term4255;
        try {
            callMethod(klass, "aliasAndInlineArguments", argTypes, term4115, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


