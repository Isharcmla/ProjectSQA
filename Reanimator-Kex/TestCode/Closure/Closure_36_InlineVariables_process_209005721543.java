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

public class InlineVariables_process_209005721543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41892;

    public InlineVariables_process_209005721543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42923 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term42922 = ((Class) term42923).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term42922).setAccessible(true);
        Object enum71 = ((Field) term42922).get((Object) null);
        term41892 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term41892, term41892.getClass(), "compiler", null);
        setField(term41892, term41892.getClass(), "mode", enum71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term41892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


