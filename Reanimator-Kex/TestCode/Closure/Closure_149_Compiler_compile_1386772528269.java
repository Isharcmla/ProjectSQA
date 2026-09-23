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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Compiler_compile_1386772528269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075751;

    public Compiler_compile_1386772528269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2983700 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term2983699 = ((Class) term2983700).getDeclaredField((String) "OFF");
        ((Field) term2983699).setAccessible(true);
        Object enum2960 = ((Field) term2983699).get((Object) null);
        term1075751 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1075845 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term1075845, term1075845.getClass(), "tracer", enum2960);
        setField(term1075751, term1075751.getClass(), "options", term1075845);
        setBooleanField(term1075751, term1075751.getClass(), "useThreads", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "compile", argTypes, term1075751, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


