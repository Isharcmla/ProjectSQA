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
import java.lang.String;

public class Compiler_compileInternal_1928486329287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2997896;

    public Compiler_compileInternal_1928486329287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2998761 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2998760 = ((Class) term2998761).getDeclaredField((String) "OFF");
        ((Field) term2998760).setAccessible(true);
        Object enum2972 = ((Field) term2998760).get((Object) null);
        term2997896 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2997990 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2998208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2997990, term2997990.getClass(), "devMode", enum2972);
        setField(term2997896, term2997896.getClass(), "options", term2997990);
        setField(term2997896, term2997896.getClass(), "externsRoot", term2998208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "compileInternal", argTypes, term2997896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


