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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class InlineVariables_process_209005721539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37153;
     Object term37445;
     Object term37515;

    public InlineVariables_process_209005721539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38709 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term38708 = ((Class) term38709).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term38708).setAccessible(true);
        Object enum65 = ((Field) term38708).get((Object) null);
        term37153 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term37233 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37153, term37153.getClass(), "compiler", term37233);
        setField(term37153, term37153.getClass(), "mode", enum65);
        term37445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term37515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term37445;
        args[1] = term37515;
        try {
            callMethod(klass, "process", argTypes, term37153, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


