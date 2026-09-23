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

public class InlineVariables_getFilterForMode_107297393553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52172;
     Object term52630;
     Object enum87;

    public InlineVariables_getFilterForMode_107297393553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52635 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term52634 = ((Class) term52635).getDeclaredField((String) "ALL");
        ((Field) term52634).setAccessible(true);
        Object enum85 = ((Field) term52634).get((Object) null);
        term52172 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term52172, term52172.getClass(), "mode", enum85);
        Class<? extends Object> term52896 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term52895 = ((Class) term52896).getDeclaredField((String) "ALL");
        ((Field) term52895).setAccessible(true);
        Object enum86 = ((Field) term52895).get((Object) null);
        term52630 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term52630, term52630.getClass(), "compiler", null);
        setField(term52630, term52630.getClass(), "mode", enum86);
        setBooleanField(term52630, term52630.getClass(), "inlineAllStrings", false);
        setField(term52630, term52630.getClass(), "identifyConstants", null);
        Class<? extends Object> term53157 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term53156 = ((Class) term53157).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term53156).setAccessible(true);
        enum87 = ((Field) term53156).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term52172, args);
        assertTrue(recursiveEquals(term52172, term52630));
        assertTrue(recursiveEquals(retValue, enum87));
    }

};


