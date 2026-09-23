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

public class InlineVariables_getFilterForMode_107297393561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58380;
     Object term58859;
     Object term58858;

    public InlineVariables_getFilterForMode_107297393561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58864 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term58863 = ((Class) term58864).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term58863).setAccessible(true);
        Object enum99 = ((Field) term58863).get((Object) null);
        term58380 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term58380, term58380.getClass(), "mode", enum99);
        Class<? extends Object> term59158 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term59157 = ((Class) term59158).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term59157).setAccessible(true);
        Object enum100 = ((Field) term59157).get((Object) null);
        term58859 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term58859, term58859.getClass(), "compiler", null);
        setField(term58859, term58859.getClass(), "mode", enum100);
        setBooleanField(term58859, term58859.getClass(), "inlineAllStrings", false);
        setField(term58859, term58859.getClass(), "identifyConstants", null);
        Class<? extends Object> term59452 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term59451 = ((Class) term59452).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term59451).setAccessible(true);
        Object enum101 = ((Field) term59451).get((Object) null);
        term58858 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        Object term58838 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term58838, term58838.getClass(), "compiler", null);
        setField(term58838, term58838.getClass(), "mode", enum101);
        setBooleanField(term58838, term58838.getClass(), "inlineAllStrings", false);
        setField(term58838, term58838.getClass(), "identifyConstants", null);
        setField(term58858, term58858.getClass(), "this$0", term58838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term58380, args);
        assertTrue(recursiveEquals(term58380, term58859));
        assertTrue(recursiveEquals(retValue, term58858));
    }

};


