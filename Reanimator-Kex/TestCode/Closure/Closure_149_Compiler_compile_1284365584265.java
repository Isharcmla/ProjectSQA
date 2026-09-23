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

public class Compiler_compile_1284365584265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073655;
     Object term1073813;
     Object term1073491;

    public Compiler_compile_1284365584265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1073655 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1073725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1073655, term1073655.getClass(), "jsRoot", term1073725);
        term1073813 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term1073491 = (Object[]) newArray("com.google.javascript.jscomp.JSSourceFile", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term1073813;
        args[1] = term1073491;
        args[2] = null;
        try {
            callMethod(klass, "compile", argTypes, term1073655, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


