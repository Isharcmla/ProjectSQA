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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class RenamePrototypes_process_531819914187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227632;
     Object term227968;

    public RenamePrototypes_process_531819914187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term260905 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term260904 = ((Class) term260905).getDeclaredField((String) "NORMALIZED");
        ((Field) term260904).setAccessible(true);
        Object enum235 = ((Field) term260904).get((Object) null);
        term227632 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term227712 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term227712, term227712.getClass(), "stage", enum235);
        setField(term227632, term227632.getClass(), "compiler", term227712);
        term227968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term227968, term227968.getClass(), "type", 132);
        setField(term227968, term227968.getClass(), "propListHead", null);
        setField(term228038, term228038.getClass(), "next", null);
        setIntField(term228038, term228038.getClass(), "type", 0);
        setField(term228038, term228038.getClass(), "first", term227968);
        setField(term227968, term227968.getClass(), "first", term228038);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term227968;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term227632, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


