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

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21143;
     Object term21235;
     Object term21283;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21143 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term21235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21235, term21235.getClass(), "type", -39);
        setField(term21235, term21235.getClass(), "first", term21235);
        term21283 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term21235;
        args[1] = null;
        args[2] = term21283;
        try {
            callMethod(klass, "aliasAndInlineArguments", argTypes, term21143, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


