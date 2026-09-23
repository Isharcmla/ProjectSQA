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

public class Compiler_check_1123875009283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2995919;

    public Compiler_check_1123875009283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2995919 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2996013 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2996155 = newInstance(Class.forName("com.google.common.collect.Synchronized$SynchronizedSortedSetMultimap"));
        setField(term2996013, term2996013.getClass(), "customPasses", term2996155);
        setField(term2995919, term2995919.getClass(), "options", term2996013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "check", argTypes, term2995919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


