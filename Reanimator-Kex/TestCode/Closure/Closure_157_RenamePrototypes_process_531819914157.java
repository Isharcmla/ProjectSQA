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

public class RenamePrototypes_process_531819914157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183666;
     Object term183996;

    public RenamePrototypes_process_531819914157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term185415 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term185414 = ((Class) term185415).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term185414).setAccessible(true);
        Object enum191 = ((Field) term185414).get((Object) null);
        term183666 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term183746 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term183746, term183746.getClass(), "stage", enum191);
        setField(term183666, term183666.getClass(), "compiler", term183746);
        term183996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term183996, term183996.getClass(), "type", 0);
        setField(term183996, term183996.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term183996;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term183666, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


