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

public class RenamePrototypes_process_531819914155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181230;
     Object term181566;
     Object term181658;

    public RenamePrototypes_process_531819914155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182549 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term182548 = ((Class) term182549).getDeclaredField((String) "NORMALIZED");
        ((Field) term182548).setAccessible(true);
        Object enum188 = ((Field) term182548).get((Object) null);
        term181230 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term181310 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term181310, term181310.getClass(), "stage", enum188);
        setField(term181230, term181230.getClass(), "compiler", term181310);
        term181566 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term181566, term181566.getClass(), "type", 0);
        setField(term181566, term181566.getClass(), "first", null);
        term181658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term181566;
        args[1] = term181658;
        try {
            callMethod(klass, "process", argTypes, term181230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


