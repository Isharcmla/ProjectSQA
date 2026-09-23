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

public class InlineVariables_process_209005721574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73701;
     Object term73913;

    public InlineVariables_process_209005721574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75721 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term75720 = ((Class) term75721).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term75720).setAccessible(true);
        Object enum117 = ((Field) term75720).get((Object) null);
        term73701 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term73701, term73701.getClass(), "compiler", null);
        setField(term73701, term73701.getClass(), "mode", enum117);
        term73913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73913;
        try {
            callMethod(klass, "process", argTypes, term73701, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


