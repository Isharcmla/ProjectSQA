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

public class InlineVariables_getFilterForMode_107297393531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28967;
     Object term29425;
     Object enum53;

    public InlineVariables_getFilterForMode_107297393531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29430 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term29429 = ((Class) term29430).getDeclaredField((String) "ALL");
        ((Field) term29429).setAccessible(true);
        Object enum51 = ((Field) term29429).get((Object) null);
        term28967 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term28967, term28967.getClass(), "mode", enum51);
        Class<? extends Object> term29691 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term29690 = ((Class) term29691).getDeclaredField((String) "ALL");
        ((Field) term29690).setAccessible(true);
        Object enum52 = ((Field) term29690).get((Object) null);
        term29425 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term29425, term29425.getClass(), "compiler", null);
        setField(term29425, term29425.getClass(), "mode", enum52);
        setBooleanField(term29425, term29425.getClass(), "inlineAllStrings", false);
        setField(term29425, term29425.getClass(), "identifyConstants", null);
        Class<? extends Object> term29952 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term29951 = ((Class) term29952).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term29951).setAccessible(true);
        enum53 = ((Field) term29951).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term28967, args);
        assertTrue(recursiveEquals(term28967, term29425));
        assertTrue(recursiveEquals(retValue, enum53));
    }

};


