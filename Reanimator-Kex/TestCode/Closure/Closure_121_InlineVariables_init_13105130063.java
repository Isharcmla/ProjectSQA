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
import java.lang.Boolean;

public class InlineVariables_init_13105130063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;
     Object term16;
     Object term993;
     Object enum5;

    public InlineVariables_init_13105130063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1002 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term1001 = ((Class) term1002).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term1001).setAccessible(true);
        enum3 = ((Field) term1001).get((Object) null);
        term16 = new Boolean(false);
        Class<? extends Object> term1287 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term1286 = ((Class) term1287).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term1286).setAccessible(true);
        Object enum4 = ((Field) term1286).get((Object) null);
        term993 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term997 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term993, term993.getClass(), "compiler", null);
        setField(term993, term993.getClass(), "mode", enum4);
        setBooleanField(term993, term993.getClass(), "inlineAllStrings", false);
        setField(term997, term997.getClass(), "this$0", term993);
        setField(term993, term993.getClass(), "identifyConstants", term997);
        Class<? extends Object> term1572 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term1571 = ((Class) term1572).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term1571).setAccessible(true);
        enum5 = ((Field) term1571).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.InlineVariables$Mode");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum3;
        args[2] = term16;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term993));
        assertTrue(recursiveEquals(enum3, enum5));
        assertTrue(recursiveEquals(term16, false));
    }

};


