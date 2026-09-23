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

public class DisambiguateProperties_process_497264529101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27484;

    public DisambiguateProperties_process_497264529101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34167 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term34166 = ((Class) term34167).getDeclaredField((String) "NORMALIZED");
        ((Field) term34166).setAccessible(true);
        Object enum17 = ((Field) term34166).get((Object) null);
        ArrayList term27870 = new ArrayList();
        term27484 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term27564 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term27818 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term27564, term27564.getClass(), "stage", enum17);
        setField(term27818, term27818.getClass(), "mismatches", term27870);
        setField(term27564, term27564.getClass(), "typeValidator", term27818);
        setField(term27484, term27484.getClass(), "compiler", term27564);
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
            callMethod(klass, "process", argTypes, term27484, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


