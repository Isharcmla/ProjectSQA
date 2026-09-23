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

public class DisambiguateProperties_process_49726452958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14198;

    public DisambiguateProperties_process_49726452958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15938 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term15937 = ((Class) term15938).getDeclaredField((String) "NORMALIZED");
        ((Field) term15937).setAccessible(true);
        Object enum11 = ((Field) term15937).get((Object) null);
        term14198 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term14278 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14278, term14278.getClass(), "stage", enum11);
        setField(term14198, term14198.getClass(), "compiler", term14278);
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
            callMethod(klass, "process", argTypes, term14198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


