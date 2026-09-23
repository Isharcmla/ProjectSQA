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

public class RenamePrototypes_process_531819914143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163469;
     Object term163783;

    public RenamePrototypes_process_531819914143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term165295 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term165294 = ((Class) term165295).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term165294).setAccessible(true);
        Object enum170 = ((Field) term165294).get((Object) null);
        term163469 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term163549 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term163549, term163549.getClass(), "stage", enum170);
        setField(term163469, term163469.getClass(), "compiler", term163549);
        term163783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term163783, term163783.getClass(), "type", 0);
        setField(term163783, term163783.getClass(), "first", term163853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term163783;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term163469, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


