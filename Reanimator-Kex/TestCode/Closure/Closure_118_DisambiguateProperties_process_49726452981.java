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
import java.lang.Object;
import java.lang.String;

public class DisambiguateProperties_process_49726452981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22108;

    public DisambiguateProperties_process_49726452981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23688 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term23687 = ((Class) term23688).getDeclaredField((String) "NORMALIZED");
        ((Field) term23687).setAccessible(true);
        Object enum13 = ((Field) term23687).get((Object) null);
        term22108 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term22188 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term22442 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term22188, term22188.getClass(), "stage", enum13);
        setField(term22188, term22188.getClass(), "typeValidator", term22442);
        setField(term22108, term22108.getClass(), "compiler", term22188);
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
            callMethod(klass, "process", argTypes, term22108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


