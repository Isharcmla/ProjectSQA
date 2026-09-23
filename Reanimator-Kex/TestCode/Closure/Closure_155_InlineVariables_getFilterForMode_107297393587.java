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

public class InlineVariables_getFilterForMode_107297393587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88453;
     Object term88911;
     Object enum140;

    public InlineVariables_getFilterForMode_107297393587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88916 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term88915 = ((Class) term88916).getDeclaredField((String) "ALL");
        ((Field) term88915).setAccessible(true);
        Object enum138 = ((Field) term88915).get((Object) null);
        term88453 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term88453, term88453.getClass(), "mode", enum138);
        Class<? extends Object> term89177 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term89176 = ((Class) term89177).getDeclaredField((String) "ALL");
        ((Field) term89176).setAccessible(true);
        Object enum139 = ((Field) term89176).get((Object) null);
        term88911 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term88911, term88911.getClass(), "compiler", null);
        setField(term88911, term88911.getClass(), "mode", enum139);
        setBooleanField(term88911, term88911.getClass(), "inlineAllStrings", false);
        setField(term88911, term88911.getClass(), "identifyConstants", null);
        Class<? extends Object> term89438 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term89437 = ((Class) term89438).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term89437).setAccessible(true);
        enum140 = ((Field) term89437).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term88453, args);
        assertTrue(recursiveEquals(term88453, term88911));
        assertTrue(recursiveEquals(retValue, enum140));
    }

};


