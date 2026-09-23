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

public class InlineVariables_getFilterForMode_107297393521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18363;
     Object term18821;
     Object enum36;

    public InlineVariables_getFilterForMode_107297393521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18826 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term18825 = ((Class) term18826).getDeclaredField((String) "ALL");
        ((Field) term18825).setAccessible(true);
        Object enum34 = ((Field) term18825).get((Object) null);
        term18363 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term18363, term18363.getClass(), "mode", enum34);
        Class<? extends Object> term19087 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term19086 = ((Class) term19087).getDeclaredField((String) "ALL");
        ((Field) term19086).setAccessible(true);
        Object enum35 = ((Field) term19086).get((Object) null);
        term18821 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term18821, term18821.getClass(), "compiler", null);
        setField(term18821, term18821.getClass(), "mode", enum35);
        setBooleanField(term18821, term18821.getClass(), "inlineAllStrings", false);
        setField(term18821, term18821.getClass(), "identifyConstants", null);
        Class<? extends Object> term19348 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term19347 = ((Class) term19348).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term19347).setAccessible(true);
        enum36 = ((Field) term19347).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term18363, args);
        assertTrue(recursiveEquals(term18363, term18821));
        assertTrue(recursiveEquals(retValue, enum36));
    }

};


