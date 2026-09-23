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

public class InlineVariables_getFilterForMode_10729739355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;
     Object term3126;
     Object term3125;

    public InlineVariables_getFilterForMode_10729739355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3132 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term3131 = ((Class) term3132).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term3131).setAccessible(true);
        Object enum8 = ((Field) term3131).get((Object) null);
        term668 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term685 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term668, term668.getClass(), "compiler", null);
        setField(term668, term668.getClass(), "mode", enum8);
        setBooleanField(term668, term668.getClass(), "inlineAllStrings", false);
        setField(term685, term685.getClass(), "this$0", null);
        setField(term668, term668.getClass(), "identifyConstants", term685);
        Class<? extends Object> term3417 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term3416 = ((Class) term3417).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term3416).setAccessible(true);
        Object enum9 = ((Field) term3416).get((Object) null);
        term3126 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term3130 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term3126, term3126.getClass(), "compiler", null);
        setField(term3126, term3126.getClass(), "mode", enum9);
        setBooleanField(term3126, term3126.getClass(), "inlineAllStrings", false);
        setField(term3130, term3130.getClass(), "this$0", null);
        setField(term3126, term3126.getClass(), "identifyConstants", term3130);
        Class<? extends Object> term3702 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term3701 = ((Class) term3702).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term3701).setAccessible(true);
        Object enum10 = ((Field) term3701).get((Object) null);
        term3125 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyLocals"));
        Object term3107 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term3124 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term3107, term3107.getClass(), "compiler", null);
        setField(term3107, term3107.getClass(), "mode", enum10);
        setBooleanField(term3107, term3107.getClass(), "inlineAllStrings", false);
        setField(term3124, term3124.getClass(), "this$0", null);
        setField(term3107, term3107.getClass(), "identifyConstants", term3124);
        setField(term3125, term3125.getClass(), "this$0", term3107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term668, args);
        assertTrue(recursiveEquals(term668, term3126));
        assertTrue(recursiveEquals(retValue, term3125));
    }

};


