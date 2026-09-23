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

public class CheckSideEffects_process_152266774632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12921;
     Object term13089;

    public CheckSideEffects_process_152266774632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12921 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term13019 = newInstance(Class.forName("com.google.common.collect.LinkedListMultimap$3"));
        setField(term12921, term12921.getClass(), "compiler", null);
        setBooleanField(term12921, term12921.getClass(), "protectSideEffectFreeCode", true);
        setField(term12921, term12921.getClass(), "problemNodes", term13019);
        term13089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13089, term13089.getClass(), "type", 0);
        setField(term13089, term13089.getClass(), "parent", null);
        setField(term13089, term13089.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13089;
        try {
            callMethod(klass, "process", argTypes, term12921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


