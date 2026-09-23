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

public class Compiler_compile_1386772528279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2701988;

    public Compiler_compile_1386772528279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2991954 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term2991953 = ((Class) term2991954).getDeclaredField((String) "OFF");
        ((Field) term2991953).setAccessible(true);
        Object enum2968 = ((Field) term2991953).get((Object) null);
        term2701988 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2702082 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term2702082, term2702082.getClass(), "tracer", enum2968);
        setField(term2701988, term2701988.getClass(), "options", term2702082);
        setBooleanField(term2701988, term2701988.getClass(), "useThreads", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "compile", argTypes, term2701988, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


