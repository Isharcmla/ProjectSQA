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

public class Compiler_compile_1284365584298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547326;
     Object term547552;
     Object term547640;
     Object term547734;

    public Compiler_compile_1284365584298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547326 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term547420 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term547464 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term547326, term547326.getClass(), "jsRoot", null);
        setField(term547326, term547326.getClass(), "options", term547420);
        setField(term547326, term547326.getClass(), "errorManager", null);
        setField(term547326, term547326.getClass(), "outStream", term547464);
        term547552 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term547640 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term547734 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term547552;
        args[1] = term547640;
        args[2] = term547734;
        try {
            callMethod(klass, "compile", argTypes, term547326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


