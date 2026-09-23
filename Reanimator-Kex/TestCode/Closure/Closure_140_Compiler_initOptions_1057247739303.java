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

public class Compiler_initOptions_1057247739303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660019;

    public Compiler_initOptions_1057247739303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660019 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term660113 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term660157 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term660019, term660019.getClass(), "options", term660113);
        setField(term660019, term660019.getClass(), "errorManager", null);
        setField(term660019, term660019.getClass(), "outStream", term660157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "initOptions", argTypes, term660019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


