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

public class RenamePrototypes_process_531819914101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103188;
     Object term103518;

    public RenamePrototypes_process_531819914101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104818 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term104817 = ((Class) term104818).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term104817).setAccessible(true);
        Object enum107 = ((Field) term104817).get((Object) null);
        term103188 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term103268 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term103268, term103268.getClass(), "stage", enum107);
        setField(term103188, term103188.getClass(), "compiler", term103268);
        term103518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term103518, term103518.getClass(), "type", 33);
        setField(term103518, term103518.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term103518;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term103188, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


