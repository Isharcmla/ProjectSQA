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
     Object term18709;
     Object term19167;
     Object enum37;

    public InlineVariables_getFilterForMode_107297393521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19172 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term19171 = ((Class) term19172).getDeclaredField((String) "ALL");
        ((Field) term19171).setAccessible(true);
        Object enum35 = ((Field) term19171).get((Object) null);
        term18709 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term18709, term18709.getClass(), "mode", enum35);
        Class<? extends Object> term19433 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term19432 = ((Class) term19433).getDeclaredField((String) "ALL");
        ((Field) term19432).setAccessible(true);
        Object enum36 = ((Field) term19432).get((Object) null);
        term19167 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term19167, term19167.getClass(), "compiler", null);
        setField(term19167, term19167.getClass(), "mode", enum36);
        setBooleanField(term19167, term19167.getClass(), "inlineAllStrings", false);
        setField(term19167, term19167.getClass(), "identifyConstants", null);
        Class<? extends Object> term19694 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term19693 = ((Class) term19694).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term19693).setAccessible(true);
        enum37 = ((Field) term19693).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term18709, args);
        assertTrue(recursiveEquals(term18709, term19167));
        assertTrue(recursiveEquals(retValue, enum37));
    }

};


