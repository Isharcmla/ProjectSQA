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

public class Compiler_parse_1635810858270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076503;

    public Compiler_parse_1635810858270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2984560 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2984559 = ((Class) term2984560).getDeclaredField((String) "OFF");
        ((Field) term2984559).setAccessible(true);
        Object enum2962 = ((Field) term2984559).get((Object) null);
        term1076503 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1076597 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1076815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1076597, term1076597.getClass(), "devMode", enum2962);
        setField(term1076503, term1076503.getClass(), "options", term1076597);
        setField(term1076503, term1076503.getClass(), "externsRoot", null);
        setField(term1076503, term1076503.getClass(), "jsRoot", term1076815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term1076503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


