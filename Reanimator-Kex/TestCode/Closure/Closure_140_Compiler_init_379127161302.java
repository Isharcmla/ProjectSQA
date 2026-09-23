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

public class Compiler_init_379127161302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549076;
     Object term549364;

    public Compiler_init_379127161302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549076 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term549170 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term549270 = newInstance(Class.forName("com.google.javascript.jscomp.LoggerErrorManager"));
        setField(term549076, term549076.getClass(), "options", term549170);
        setField(term549076, term549076.getClass(), "errorManager", term549270);
        term549364 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term549364;
        try {
            callMethod(klass, "init", argTypes, term549076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


