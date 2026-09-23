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

public class InlineVariables_getFilterForMode_107297393531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29081;
     Object term29539;
     Object enum52;

    public InlineVariables_getFilterForMode_107297393531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29544 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term29543 = ((Class) term29544).getDeclaredField((String) "ALL");
        ((Field) term29543).setAccessible(true);
        Object enum50 = ((Field) term29543).get((Object) null);
        term29081 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term29081, term29081.getClass(), "mode", enum50);
        Class<? extends Object> term29805 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term29804 = ((Class) term29805).getDeclaredField((String) "ALL");
        ((Field) term29804).setAccessible(true);
        Object enum51 = ((Field) term29804).get((Object) null);
        term29539 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term29539, term29539.getClass(), "compiler", null);
        setField(term29539, term29539.getClass(), "mode", enum51);
        setBooleanField(term29539, term29539.getClass(), "inlineAllStrings", false);
        setField(term29539, term29539.getClass(), "identifyConstants", null);
        Class<? extends Object> term30066 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term30065 = ((Class) term30066).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term30065).setAccessible(true);
        enum52 = ((Field) term30065).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term29081, args);
        assertTrue(recursiveEquals(term29081, term29539));
        assertTrue(recursiveEquals(retValue, enum52));
    }

};


