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

public class Compiler_toSource_2068291230318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3027379;

    public Compiler_toSource_2068291230318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3028717 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term3028716 = ((Class) term3028717).getDeclaredField((String) "OFF");
        ((Field) term3028716).setAccessible(true);
        Object enum2996 = ((Field) term3028716).get((Object) null);
        term3027379 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term3027473 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term3027473, term3027473.getClass(), "tracer", enum2996);
        setField(term3027379, term3027379.getClass(), "options", term3027473);
        setBooleanField(term3027379, term3027379.getClass(), "useThreads", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toSource", argTypes, term3027379, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


