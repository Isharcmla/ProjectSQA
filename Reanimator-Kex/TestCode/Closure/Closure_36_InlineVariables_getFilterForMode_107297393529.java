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

public class InlineVariables_getFilterForMode_107297393529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27202;
     Object term27660;
     Object enum49;

    public InlineVariables_getFilterForMode_107297393529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27665 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term27664 = ((Class) term27665).getDeclaredField((String) "ALL");
        ((Field) term27664).setAccessible(true);
        Object enum47 = ((Field) term27664).get((Object) null);
        term27202 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term27202, term27202.getClass(), "mode", enum47);
        Class<? extends Object> term27926 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term27925 = ((Class) term27926).getDeclaredField((String) "ALL");
        ((Field) term27925).setAccessible(true);
        Object enum48 = ((Field) term27925).get((Object) null);
        term27660 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term27660, term27660.getClass(), "compiler", null);
        setField(term27660, term27660.getClass(), "mode", enum48);
        setBooleanField(term27660, term27660.getClass(), "inlineAllStrings", false);
        setField(term27660, term27660.getClass(), "identifyConstants", null);
        Class<? extends Object> term28187 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term28186 = ((Class) term28187).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term28186).setAccessible(true);
        enum49 = ((Field) term28186).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term27202, args);
        assertTrue(recursiveEquals(term27202, term27660));
        assertTrue(recursiveEquals(retValue, enum49));
    }

};


