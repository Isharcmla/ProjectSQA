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

public class InlineVariables_getFilterForMode_107297393535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33379;
     Object term33837;
     Object enum59;

    public InlineVariables_getFilterForMode_107297393535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33842 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term33841 = ((Class) term33842).getDeclaredField((String) "ALL");
        ((Field) term33841).setAccessible(true);
        Object enum57 = ((Field) term33841).get((Object) null);
        term33379 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term33379, term33379.getClass(), "mode", enum57);
        Class<? extends Object> term34103 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term34102 = ((Class) term34103).getDeclaredField((String) "ALL");
        ((Field) term34102).setAccessible(true);
        Object enum58 = ((Field) term34102).get((Object) null);
        term33837 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term33837, term33837.getClass(), "compiler", null);
        setField(term33837, term33837.getClass(), "mode", enum58);
        setBooleanField(term33837, term33837.getClass(), "inlineAllStrings", false);
        setField(term33837, term33837.getClass(), "identifyConstants", null);
        Class<? extends Object> term34364 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term34363 = ((Class) term34364).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term34363).setAccessible(true);
        enum59 = ((Field) term34363).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term33379, args);
        assertTrue(recursiveEquals(term33379, term33837));
        assertTrue(recursiveEquals(retValue, enum59));
    }

};


