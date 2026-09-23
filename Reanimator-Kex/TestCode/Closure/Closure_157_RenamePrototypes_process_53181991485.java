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

public class RenamePrototypes_process_53181991485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79187;
     Object term79549;
     Object term79619;

    public RenamePrototypes_process_53181991485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80927 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term80926 = ((Class) term80927).getDeclaredField((String) "NORMALIZED");
        ((Field) term80926).setAccessible(true);
        Object enum84 = ((Field) term80926).get((Object) null);
        HashMap term79479 = new HashMap();
        term79187 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term79267 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term79267, term79267.getClass(), "stage", enum84);
        setField(term79187, term79187.getClass(), "compiler", term79267);
        setField(term79187, term79187.getClass(), "properties", term79479);
        term79549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79549, term79549.getClass(), "type", 0);
        setField(term79549, term79549.getClass(), "first", null);
        term79619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79619, term79619.getClass(), "type", 0);
        setField(term79619, term79619.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term79549;
        args[1] = term79619;
        try {
            callMethod(klass, "process", argTypes, term79187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


