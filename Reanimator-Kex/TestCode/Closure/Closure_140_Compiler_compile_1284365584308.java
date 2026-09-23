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

public class Compiler_compile_1284365584308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1303972;
     Object term1304278;
     Object term1304366;

    public Compiler_compile_1284365584308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1303972 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1304066 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1304190 = newInstance(Class.forName("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(term1303972, term1303972.getClass(), "jsRoot", null);
        setField(term1303972, term1303972.getClass(), "options", term1304066);
        setField(term1303972, term1303972.getClass(), "errorManager", null);
        setField(term1303972, term1303972.getClass(), "outStream", null);
        setField(term1303972, term1303972.getClass(), "recentChange", term1304190);
        term1304278 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term1304366 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSSourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = term1304278;
        args[1] = term1304366;
        args[2] = null;
        try {
            callMethod(klass, "compile", argTypes, term1303972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


