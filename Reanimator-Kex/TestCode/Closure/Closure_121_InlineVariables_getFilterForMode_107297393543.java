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

public class InlineVariables_getFilterForMode_107297393543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41676;
     Object term42134;
     Object enum71;

    public InlineVariables_getFilterForMode_107297393543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42139 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term42138 = ((Class) term42139).getDeclaredField((String) "ALL");
        ((Field) term42138).setAccessible(true);
        Object enum69 = ((Field) term42138).get((Object) null);
        term41676 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term41676, term41676.getClass(), "mode", enum69);
        Class<? extends Object> term42400 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term42399 = ((Class) term42400).getDeclaredField((String) "ALL");
        ((Field) term42399).setAccessible(true);
        Object enum70 = ((Field) term42399).get((Object) null);
        term42134 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term42134, term42134.getClass(), "compiler", null);
        setField(term42134, term42134.getClass(), "mode", enum70);
        setBooleanField(term42134, term42134.getClass(), "inlineAllStrings", false);
        setField(term42134, term42134.getClass(), "identifyConstants", null);
        Class<? extends Object> term42661 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term42660 = ((Class) term42661).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term42660).setAccessible(true);
        enum71 = ((Field) term42660).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term41676, args);
        assertTrue(recursiveEquals(term41676, term42134));
        assertTrue(recursiveEquals(retValue, enum71));
    }

};


