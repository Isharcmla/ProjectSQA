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
import java.util.ArrayList;

public class CheckSideEffects_init_11106328027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;
     Object term12;
     Object term1772;
     Object enum8;

    public CheckSideEffects_init_11106328027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1782 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term1781 = ((Class) term1782).getDeclaredField((String) "WARNING");
        ((Field) term1781).setAccessible(true);
        enum6 = ((Field) term1781).get((Object) null);
        term12 = new Boolean(false);
        Class<? extends Object> term2005 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term2004 = ((Class) term2005).getDeclaredField((String) "WARNING");
        ((Field) term2004).setAccessible(true);
        Object enum7 = ((Field) term2004).get((Object) null);
        ArrayList term1776 = new ArrayList();
        term1772 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term1772, term1772.getClass(), "level", enum7);
        setField(term1772, term1772.getClass(), "problemNodes", term1776);
        setField(term1772, term1772.getClass(), "compiler", null);
        setBooleanField(term1772, term1772.getClass(), "protectSideEffectFreeCode", false);
        Class<? extends Object> term2228 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term2227 = ((Class) term2228).getDeclaredField((String) "WARNING");
        ((Field) term2227).setAccessible(true);
        enum8 = ((Field) term2227).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum6;
        args[2] = term12;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1772));
        assertTrue(recursiveEquals(enum6, enum8));
        assertTrue(recursiveEquals(term12, false));
    }

};


