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
     Object term3150;
     Object term3149;

    public InlineVariables_getFilterForMode_10729739355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3156 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term3155 = ((Class) term3156).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term3155).setAccessible(true);
        Object enum8 = ((Field) term3155).get((Object) null);
        term668 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term685 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term668, term668.getClass(), "compiler", null);
        setField(term668, term668.getClass(), "mode", enum8);
        setBooleanField(term668, term668.getClass(), "inlineAllStrings", false);
        setField(term685, term685.getClass(), "this$0", null);
        setField(term668, term668.getClass(), "identifyConstants", term685);
        Class<? extends Object> term3441 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term3440 = ((Class) term3441).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term3440).setAccessible(true);
        Object enum9 = ((Field) term3440).get((Object) null);
        term3150 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term3154 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term3150, term3150.getClass(), "compiler", null);
        setField(term3150, term3150.getClass(), "mode", enum9);
        setBooleanField(term3150, term3150.getClass(), "inlineAllStrings", false);
        setField(term3154, term3154.getClass(), "this$0", null);
        setField(term3150, term3150.getClass(), "identifyConstants", term3154);
        Class<? extends Object> term3726 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term3725 = ((Class) term3726).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term3725).setAccessible(true);
        Object enum10 = ((Field) term3725).get((Object) null);
        term3149 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyLocals"));
        Object term3131 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term3148 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
        setField(term3131, term3131.getClass(), "compiler", null);
        setField(term3131, term3131.getClass(), "mode", enum10);
        setBooleanField(term3131, term3131.getClass(), "inlineAllStrings", false);
        setField(term3148, term3148.getClass(), "this$0", null);
        setField(term3131, term3131.getClass(), "identifyConstants", term3148);
        setField(term3149, term3149.getClass(), "this$0", term3131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term668, args);
        assertTrue(recursiveEquals(term668, term3150));
        assertTrue(recursiveEquals(retValue, term3149));
    }

};


