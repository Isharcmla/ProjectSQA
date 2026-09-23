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

public class Compiler_compileModules_1815939217266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074357;

    public Compiler_compileModules_1815939217266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074357 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1074451 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1074495 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term1074357, term1074357.getClass(), "jsRoot", null);
        setField(term1074357, term1074357.getClass(), "options", term1074451);
        setField(term1074357, term1074357.getClass(), "errorManager", null);
        setField(term1074357, term1074357.getClass(), "outStream", term1074495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "compileModules", argTypes, term1074357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


