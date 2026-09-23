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

public class Compiler_toSource_508833582313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3021419;
     Object term3021747;

    public Compiler_toSource_508833582313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3023005 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term3023004 = ((Class) term3023005).getDeclaredField((String) "OFF");
        ((Field) term3023004).setAccessible(true);
        Object enum2993 = ((Field) term3023004).get((Object) null);
        term3021419 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term3021513 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term3021513, term3021513.getClass(), "tracer", enum2993);
        setField(term3021419, term3021419.getClass(), "options", term3021513);
        setBooleanField(term3021419, term3021419.getClass(), "useThreads", false);
        term3021747 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = term3021747;
        try {
            callMethod(klass, "toSource", argTypes, term3021419, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


