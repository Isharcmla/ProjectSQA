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

public class Compiler_init_1176485500350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2572718;
     Object term2573016;

    public Compiler_init_1176485500350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2572718 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2572812 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2572922 = newInstance(Class.forName("com.google.javascript.jscomp.PrintStreamErrorManager"));
        setField(term2572718, term2572718.getClass(), "options", term2572812);
        setField(term2572718, term2572718.getClass(), "errorManager", term2572922);
        term2573016 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term2573016;
        callMethod(klass, "init", argTypes, term2572718, args);
    }

};


