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
     Object term6312;
     Object term6770;
     Object enum17;

    public InlineVariables_getFilterForMode_10729739359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6775 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term6774 = ((Class) term6775).getDeclaredField((String) "ALL");
        ((Field) term6774).setAccessible(true);
        Object enum15 = ((Field) term6774).get((Object) null);
        term6312 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term6312, term6312.getClass(), "mode", enum15);
        Class<? extends Object> term7036 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term7035 = ((Class) term7036).getDeclaredField((String) "ALL");
        ((Field) term7035).setAccessible(true);
        Object enum16 = ((Field) term7035).get((Object) null);
        term6770 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term6770, term6770.getClass(), "compiler", null);
        setField(term6770, term6770.getClass(), "mode", enum16);
        setBooleanField(term6770, term6770.getClass(), "inlineAllStrings", false);
        setField(term6770, term6770.getClass(), "identifyConstants", null);
        Class<? extends Object> term7351 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term7350 = ((Class) term7351).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term7350).setAccessible(true);
        enum17 = ((Field) term7350).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term6312, args);
        assertTrue(recursiveEquals(term6312, term6770));
        assertTrue(recursiveEquals(retValue, enum17));
    }

};


