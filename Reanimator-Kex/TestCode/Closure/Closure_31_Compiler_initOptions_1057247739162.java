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
import java.lang.String;

public class Compiler_initOptions_1057247739162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883894;
     Object term884082;

    public Compiler_initOptions_1057247739162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term883894 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term883988 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term883894, term883894.getClass(), "options", term883988);
        setField(term883894, term883894.getClass(), "errorManager", null);
        setField(term883894, term883894.getClass(), "outStream", null);
        Class<? extends Object> term884356 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term884355 = ((Class) term884356).getDeclaredField((String) "SINGLELINE");
        ((Field) term884355).setAccessible(true);
        Object enum2023 = ((Field) term884355).get((Object) null);
        term884082 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term884314 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        Object term884354 = newInstance(Class.forName("java.util.TreeSet"));
        setBooleanField(term884082, term884082.getClass(), "colorizeErrorOutput", false);
        setField(term884082, term884082.getClass(), "errorFormat", enum2023);
        setField(term884314, term884314.getClass(), "guards", term884354);
        setField(term884082, term884082.getClass(), "warningsGuard", term884314);
        setField(null, Class.forName("com.google.javascript.jscomp.DiagnosticGroups"), "CHECK_TYPES", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term884082;
        callMethod(klass, "initOptions", argTypes, term883894, args);
    }

};


