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

public class RenamePrototypes_process_53181991447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28896;
     Object term29210;

    public RenamePrototypes_process_53181991447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30469 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term30468 = ((Class) term30469).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term30468).setAccessible(true);
        Object enum27 = ((Field) term30468).get((Object) null);
        term28896 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term28976 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28976, term28976.getClass(), "stage", enum27);
        setField(term28896, term28896.getClass(), "compiler", term28976);
        term29210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29210, term29210.getClass(), "type", 35);
        setField(term29210, term29210.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term29210;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term28896, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


