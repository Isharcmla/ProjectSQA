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

public class Compiler_parse_1635810858309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1304580;

    public Compiler_parse_1635810858309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2546150 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2546149 = ((Class) term2546150).getDeclaredField((String) "OFF");
        ((Field) term2546149).setAccessible(true);
        Object enum1961 = ((Field) term2546149).get((Object) null);
        term1304580 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1304674 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term1304674, term1304674.getClass(), "devMode", enum1961);
        setField(term1304580, term1304580.getClass(), "options", term1304674);
        setField(term1304580, term1304580.getClass(), "externsRoot", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term1304580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


