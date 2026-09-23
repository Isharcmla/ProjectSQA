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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class InlineVariables_process_209005721517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13917;
     Object term14129;
     Object term14199;

    public InlineVariables_process_209005721517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15086 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term15085 = ((Class) term15086).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term15085).setAccessible(true);
        Object enum28 = ((Field) term15085).get((Object) null);
        term13917 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term13917, term13917.getClass(), "compiler", null);
        setField(term13917, term13917.getClass(), "mode", enum28);
        term14129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term14199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term14129;
        args[1] = term14199;
        try {
            callMethod(klass, "process", argTypes, term13917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


