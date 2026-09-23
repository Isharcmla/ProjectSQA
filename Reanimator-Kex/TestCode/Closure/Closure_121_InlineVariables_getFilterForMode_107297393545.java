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

public class InlineVariables_getFilterForMode_107297393545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43352;
     Object term43810;
     Object enum75;

    public InlineVariables_getFilterForMode_107297393545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43815 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term43814 = ((Class) term43815).getDeclaredField((String) "ALL");
        ((Field) term43814).setAccessible(true);
        Object enum73 = ((Field) term43814).get((Object) null);
        term43352 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term43352, term43352.getClass(), "mode", enum73);
        Class<? extends Object> term44076 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term44075 = ((Class) term44076).getDeclaredField((String) "ALL");
        ((Field) term44075).setAccessible(true);
        Object enum74 = ((Field) term44075).get((Object) null);
        term43810 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term43810, term43810.getClass(), "compiler", null);
        setField(term43810, term43810.getClass(), "mode", enum74);
        setBooleanField(term43810, term43810.getClass(), "inlineAllStrings", false);
        setField(term43810, term43810.getClass(), "identifyConstants", null);
        Class<? extends Object> term44337 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term44336 = ((Class) term44337).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term44336).setAccessible(true);
        enum75 = ((Field) term44336).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term43352, args);
        assertTrue(recursiveEquals(term43352, term43810));
        assertTrue(recursiveEquals(retValue, enum75));
    }

};


