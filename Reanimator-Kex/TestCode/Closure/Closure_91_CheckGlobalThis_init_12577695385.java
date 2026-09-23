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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class CheckGlobalThis_init_12577695385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum5;
     Object term1604;
     Object enum7;

    public CheckGlobalThis_init_12577695385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1612 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term1611 = ((Class) term1612).getDeclaredField((String) "WARNING");
        ((Field) term1611).setAccessible(true);
        enum5 = ((Field) term1611).get((Object) null);
        Class<? extends Object> term1835 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term1834 = ((Class) term1835).getDeclaredField((String) "WARNING");
        ((Field) term1834).setAccessible(true);
        Object enum6 = ((Field) term1834).get((Object) null);
        term1604 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term1604, term1604.getClass(), "compiler", null);
        setField(term1604, term1604.getClass(), "level", enum6);
        setField(term1604, term1604.getClass(), "assignLhsChild", null);
        Class<? extends Object> term2058 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term2057 = ((Class) term2058).getDeclaredField((String) "WARNING");
        ((Field) term2057).setAccessible(true);
        enum7 = ((Field) term2057).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1604));
        assertTrue(recursiveEquals(enum5, enum7));
    }

};


