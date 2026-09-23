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

public class Compiler_compile_1386772528289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2999599;

    public Compiler_compile_1386772528289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3001070 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term3001069 = ((Class) term3001070).getDeclaredField((String) "OFF");
        ((Field) term3001069).setAccessible(true);
        Object enum2974 = ((Field) term3001069).get((Object) null);
        term2999599 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2999693 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term2999693, term2999693.getClass(), "tracer", enum2974);
        setField(term2999599, term2999599.getClass(), "options", term2999693);
        setBooleanField(term2999599, term2999599.getClass(), "useThreads", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "compile", argTypes, term2999599, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


