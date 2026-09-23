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

public class Compiler_init_1176485500268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075034;
     Object term1074858;
     Object term1074859;
     Object term1075266;

    public Compiler_init_1176485500268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075034 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1075128 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1075172 = newInstance(Class.forName("java.io.PrintStream"));
        setField(term1075034, term1075034.getClass(), "options", term1075128);
        setField(term1075034, term1075034.getClass(), "errorManager", null);
        setField(term1075034, term1075034.getClass(), "outStream", term1075172);
        term1074858 = (Object[]) newArray("com.google.javascript.jscomp.JSSourceFile", 101);
        term1074859 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 0);
        term1075266 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term1074858;
        args[1] = term1074859;
        args[2] = term1075266;
        try {
            callMethod(klass, "init", argTypes, term1075034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


