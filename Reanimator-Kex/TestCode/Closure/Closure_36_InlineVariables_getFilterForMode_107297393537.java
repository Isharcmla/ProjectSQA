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

public class InlineVariables_getFilterForMode_107297393537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35399;
     Object term35857;
     Object enum63;

    public InlineVariables_getFilterForMode_107297393537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35862 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term35861 = ((Class) term35862).getDeclaredField((String) "ALL");
        ((Field) term35861).setAccessible(true);
        Object enum61 = ((Field) term35861).get((Object) null);
        term35399 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term35399, term35399.getClass(), "mode", enum61);
        Class<? extends Object> term36123 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term36122 = ((Class) term36123).getDeclaredField((String) "ALL");
        ((Field) term36122).setAccessible(true);
        Object enum62 = ((Field) term36122).get((Object) null);
        term35857 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term35857, term35857.getClass(), "compiler", null);
        setField(term35857, term35857.getClass(), "mode", enum62);
        setBooleanField(term35857, term35857.getClass(), "inlineAllStrings", false);
        setField(term35857, term35857.getClass(), "identifyConstants", null);
        Class<? extends Object> term36384 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term36383 = ((Class) term36384).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term36383).setAccessible(true);
        enum63 = ((Field) term36383).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term35399, args);
        assertTrue(recursiveEquals(term35399, term35857));
        assertTrue(recursiveEquals(retValue, enum63));
    }

};


