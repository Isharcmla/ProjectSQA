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

public class InlineVariables_process_209005721525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22407;
     Object term22619;
     Object term22689;

    public InlineVariables_process_209005721525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23578 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term23577 = ((Class) term23578).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term23577).setAccessible(true);
        Object enum41 = ((Field) term23577).get((Object) null);
        term22407 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term22407, term22407.getClass(), "compiler", null);
        setField(term22407, term22407.getClass(), "mode", enum41);
        term22619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term22689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term22619;
        args[1] = term22689;
        try {
            callMethod(klass, "process", argTypes, term22407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


