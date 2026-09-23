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

public class RenamePrototypes_process_53181991467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55556;
     Object term55886;

    public RenamePrototypes_process_53181991467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57200 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term57199 = ((Class) term57200).getDeclaredField((String) "NORMALIZED");
        ((Field) term57199).setAccessible(true);
        Object enum57 = ((Field) term57199).get((Object) null);
        term55556 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term55636 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55636, term55636.getClass(), "stage", enum57);
        setField(term55556, term55556.getClass(), "compiler", term55636);
        term55886 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term55886, term55886.getClass(), "type", 132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55886;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term55556, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


