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

public class InlineVariables_getFilterForMode_107297393555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54576;
     Object term55034;
     Object enum91;

    public InlineVariables_getFilterForMode_107297393555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55039 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term55038 = ((Class) term55039).getDeclaredField((String) "ALL");
        ((Field) term55038).setAccessible(true);
        Object enum89 = ((Field) term55038).get((Object) null);
        term54576 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term54576, term54576.getClass(), "mode", enum89);
        Class<? extends Object> term55300 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term55299 = ((Class) term55300).getDeclaredField((String) "ALL");
        ((Field) term55299).setAccessible(true);
        Object enum90 = ((Field) term55299).get((Object) null);
        term55034 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term55034, term55034.getClass(), "compiler", null);
        setField(term55034, term55034.getClass(), "mode", enum90);
        setBooleanField(term55034, term55034.getClass(), "inlineAllStrings", false);
        setField(term55034, term55034.getClass(), "identifyConstants", null);
        Class<? extends Object> term55561 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term55560 = ((Class) term55561).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term55560).setAccessible(true);
        enum91 = ((Field) term55560).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term54576, args);
        assertTrue(recursiveEquals(term54576, term55034));
        assertTrue(recursiveEquals(retValue, enum91));
    }

};


