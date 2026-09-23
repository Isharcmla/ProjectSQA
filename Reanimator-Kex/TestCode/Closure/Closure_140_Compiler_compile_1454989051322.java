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

public class Compiler_compile_1454989051322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1853689;
     Object term1853915;

    public Compiler_compile_1454989051322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1853689 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1853783 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1853827 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term1853689, term1853689.getClass(), "jsRoot", null);
        setField(term1853689, term1853689.getClass(), "options", term1853783);
        setField(term1853689, term1853689.getClass(), "errorManager", null);
        setField(term1853689, term1853689.getClass(), "outStream", term1853827);
        term1853915 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term1853915;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "compile", argTypes, term1853689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


