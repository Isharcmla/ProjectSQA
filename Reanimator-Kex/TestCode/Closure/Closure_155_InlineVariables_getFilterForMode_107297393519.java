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

public class InlineVariables_getFilterForMode_107297393519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16930;
     Object term17388;
     Object enum33;

    public InlineVariables_getFilterForMode_107297393519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17393 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term17392 = ((Class) term17393).getDeclaredField((String) "ALL");
        ((Field) term17392).setAccessible(true);
        Object enum31 = ((Field) term17392).get((Object) null);
        term16930 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term16930, term16930.getClass(), "mode", enum31);
        Class<? extends Object> term17654 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term17653 = ((Class) term17654).getDeclaredField((String) "ALL");
        ((Field) term17653).setAccessible(true);
        Object enum32 = ((Field) term17653).get((Object) null);
        term17388 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term17388, term17388.getClass(), "compiler", null);
        setField(term17388, term17388.getClass(), "mode", enum32);
        setBooleanField(term17388, term17388.getClass(), "inlineAllStrings", false);
        setField(term17388, term17388.getClass(), "identifyConstants", null);
        Class<? extends Object> term17915 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term17914 = ((Class) term17915).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term17914).setAccessible(true);
        enum33 = ((Field) term17914).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term16930, args);
        assertTrue(recursiveEquals(term16930, term17388));
        assertTrue(recursiveEquals(retValue, enum33));
    }

};


