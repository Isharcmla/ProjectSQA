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

public class InlineVariables_getFilterForMode_10729739357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4402;
     Object term4860;
     Object enum14;

    public InlineVariables_getFilterForMode_10729739357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4865 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term4864 = ((Class) term4865).getDeclaredField((String) "ALL");
        ((Field) term4864).setAccessible(true);
        Object enum12 = ((Field) term4864).get((Object) null);
        term4402 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term4402, term4402.getClass(), "mode", enum12);
        Class<? extends Object> term5126 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term5125 = ((Class) term5126).getDeclaredField((String) "ALL");
        ((Field) term5125).setAccessible(true);
        Object enum13 = ((Field) term5125).get((Object) null);
        term4860 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term4860, term4860.getClass(), "compiler", null);
        setField(term4860, term4860.getClass(), "mode", enum13);
        setBooleanField(term4860, term4860.getClass(), "inlineAllStrings", false);
        setField(term4860, term4860.getClass(), "identifyConstants", null);
        Class<? extends Object> term5441 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term5440 = ((Class) term5441).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term5440).setAccessible(true);
        enum14 = ((Field) term5440).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term4402, args);
        assertTrue(recursiveEquals(term4402, term4860));
        assertTrue(recursiveEquals(retValue, enum14));
    }

};


