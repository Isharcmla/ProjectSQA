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

public class Compiler_initOptions_1057247739264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072911;

    public Compiler_initOptions_1057247739264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1072911 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1073005 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1073049 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term1072911, term1072911.getClass(), "options", term1073005);
        setField(term1072911, term1072911.getClass(), "errorManager", null);
        setField(term1072911, term1072911.getClass(), "outStream", term1073049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "initOptions", argTypes, term1072911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


