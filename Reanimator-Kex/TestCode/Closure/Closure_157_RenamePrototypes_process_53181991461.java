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

public class RenamePrototypes_process_53181991461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47656;
     Object term47970;

    public RenamePrototypes_process_53181991461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49262 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term49261 = ((Class) term49262).getDeclaredField((String) "NORMALIZED");
        ((Field) term49261).setAccessible(true);
        Object enum48 = ((Field) term49261).get((Object) null);
        term47656 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term47736 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47736, term47736.getClass(), "stage", enum48);
        setField(term47656, term47656.getClass(), "compiler", term47736);
        term47970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47970, term47970.getClass(), "type", 0);
        setField(term47970, term47970.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term47970;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term47656, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


