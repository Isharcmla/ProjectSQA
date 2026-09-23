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
import java.util.ArrayList;

public class DisambiguateProperties_process_497264529153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54185;

    public DisambiguateProperties_process_497264529153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55794 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term55793 = ((Class) term55794).getDeclaredField((String) "NORMALIZED");
        ((Field) term55793).setAccessible(true);
        Object enum26 = ((Field) term55793).get((Object) null);
        ArrayList term54571 = new ArrayList();
        term54185 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term54265 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term54519 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term54265, term54265.getClass(), "stage", enum26);
        setField(term54519, term54519.getClass(), "mismatches", term54571);
        setField(term54265, term54265.getClass(), "typeValidator", term54519);
        setField(term54185, term54185.getClass(), "compiler", term54265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term54185, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


