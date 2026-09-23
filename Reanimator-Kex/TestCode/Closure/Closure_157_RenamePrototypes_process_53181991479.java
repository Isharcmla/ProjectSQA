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

public class RenamePrototypes_process_53181991479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71634;
     Object term71948;
     Object term72018;

    public RenamePrototypes_process_53181991479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72909 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term72908 = ((Class) term72909).getDeclaredField((String) "NORMALIZED");
        ((Field) term72908).setAccessible(true);
        Object enum75 = ((Field) term72908).get((Object) null);
        term71634 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term71714 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71714, term71714.getClass(), "stage", enum75);
        setField(term71634, term71634.getClass(), "compiler", term71714);
        term71948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71948, term71948.getClass(), "type", 0);
        setField(term71948, term71948.getClass(), "first", null);
        term72018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term71948;
        args[1] = term72018;
        try {
            callMethod(klass, "process", argTypes, term71634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


