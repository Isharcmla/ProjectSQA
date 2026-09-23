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

public class RenamePrototypes_process_53181991434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14221;
     Object term14535;

    public RenamePrototypes_process_53181991434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16822 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term16821 = ((Class) term16822).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term16821).setAccessible(true);
        Object enum13 = ((Field) term16821).get((Object) null);
        term14221 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term14301 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14301, term14301.getClass(), "stage", enum13);
        setField(term14221, term14221.getClass(), "compiler", term14301);
        term14535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term14535;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term14221, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


