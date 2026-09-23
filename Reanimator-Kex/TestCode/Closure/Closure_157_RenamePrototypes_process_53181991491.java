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
import java.util.HashMap;

public class RenamePrototypes_process_53181991491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87866;
     Object term88332;
     Object term88402;

    public RenamePrototypes_process_53181991491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89380 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term89379 = ((Class) term89380).getDeclaredField((String) "NORMALIZED");
        ((Field) term89379).setAccessible(true);
        Object enum93 =  ((Field) term89379).get((Object) null);
        HashMap term88158 = new HashMap();
        ((HashMap) term88158).put((Object)null, (Object)null);
        ((HashMap) term88158).put(enum93, enum93);
        ((HashMap) term88158).put(enum93, enum93);
        ((HashMap) term88158).put(enum93, enum93);
        term87866 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term87946 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term87946, term87946.getClass(), "stage", enum93);
        setField(term87866, term87866.getClass(), "compiler", term87946);
        setField(term87866, term87866.getClass(), "properties", term88158);
        term88332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88332, term88332.getClass(), "type", 0);
        setField(term88332, term88332.getClass(), "first", null);
        term88402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88402, term88402.getClass(), "type", 0);
        setField(term88402, term88402.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term88332;
        args[1] = term88402;
        try {
            callMethod(klass, "process", argTypes, term87866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


