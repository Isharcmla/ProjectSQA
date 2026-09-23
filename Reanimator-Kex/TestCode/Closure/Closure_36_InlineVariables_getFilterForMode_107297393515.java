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

public class InlineVariables_getFilterForMode_107297393515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11962;
     Object term12420;
     Object enum27;

    public InlineVariables_getFilterForMode_107297393515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12425 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term12424 = ((Class) term12425).getDeclaredField((String) "ALL");
        ((Field) term12424).setAccessible(true);
        Object enum25 = ((Field) term12424).get((Object) null);
        term11962 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term11962, term11962.getClass(), "mode", enum25);
        Class<? extends Object> term12686 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term12685 = ((Class) term12686).getDeclaredField((String) "ALL");
        ((Field) term12685).setAccessible(true);
        Object enum26 = ((Field) term12685).get((Object) null);
        term12420 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term12420, term12420.getClass(), "compiler", null);
        setField(term12420, term12420.getClass(), "mode", enum26);
        setBooleanField(term12420, term12420.getClass(), "inlineAllStrings", false);
        setField(term12420, term12420.getClass(), "identifyConstants", null);
        Class<? extends Object> term12947 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term12946 = ((Class) term12947).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term12946).setAccessible(true);
        enum27 = ((Field) term12946).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term11962, args);
        assertTrue(recursiveEquals(term11962, term12420));
        assertTrue(recursiveEquals(retValue, enum27));
    }

};


