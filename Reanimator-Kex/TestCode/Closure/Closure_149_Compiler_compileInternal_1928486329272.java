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

public class Compiler_compileInternal_1928486329272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1573276;

    public Compiler_compileInternal_1928486329272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2985363 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2985362 = ((Class) term2985363).getDeclaredField((String) "OFF");
        ((Field) term2985362).setAccessible(true);
        Object enum2963 = ((Field) term2985362).get((Object) null);
        term1573276 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1573370 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1573588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1573370, term1573370.getClass(), "devMode", enum2963);
        setField(term1573276, term1573276.getClass(), "options", term1573370);
        setField(term1573276, term1573276.getClass(), "externsRoot", null);
        setField(term1573276, term1573276.getClass(), "jsRoot", term1573588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "compileInternal", argTypes, term1573276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


