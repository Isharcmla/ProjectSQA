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

public class InlineVariables_getFilterForMode_10729739359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6270;
     Object term6750;
     Object enum17;

    public InlineVariables_getFilterForMode_10729739359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6755 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term6754 = ((Class) term6755).getDeclaredField((String) "ALL");
        ((Field) term6754).setAccessible(true);
        Object enum15 = ((Field) term6754).get((Object) null);
        term6270 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term6270, term6270.getClass(), "mode", enum15);
        Class<? extends Object> term7016 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term7015 = ((Class) term7016).getDeclaredField((String) "ALL");
        ((Field) term7015).setAccessible(true);
        Object enum16 = ((Field) term7015).get((Object) null);
        term6750 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term6750, term6750.getClass(), "compiler", null);
        setField(term6750, term6750.getClass(), "mode", enum16);
        setBooleanField(term6750, term6750.getClass(), "inlineAllStrings", false);
        setField(term6750, term6750.getClass(), "identifyConstants", null);
        Class<? extends Object> term7331 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term7330 = ((Class) term7331).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term7330).setAccessible(true);
        enum17 = ((Field) term7330).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term6270, args);
        assertTrue(recursiveEquals(term6270, term6750));
        assertTrue(recursiveEquals(retValue, enum17));
    }

};


