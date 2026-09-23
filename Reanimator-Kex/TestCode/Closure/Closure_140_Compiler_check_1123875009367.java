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

public class Compiler_check_1123875009367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2579822;

    public Compiler_check_1123875009367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2579822 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2579916 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2579998 = newInstance(Class.forName("com.google.common.collect.TreeMultimap"));
        setField(term2579916, term2579916.getClass(), "customPasses", term2579998);
        setField(term2579822, term2579822.getClass(), "options", term2579916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "check", argTypes, term2579822, args);
    }

};


