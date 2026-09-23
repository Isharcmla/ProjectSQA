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

public class RenamePrototypes_process_531819914175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213351;
     Object term213735;
     Object term213827;

    public RenamePrototypes_process_531819914175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215135 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term215134 = ((Class) term215135).getDeclaredField((String) "NORMALIZED");
        ((Field) term215134).setAccessible(true);
        Object enum218 = ((Field) term215134).get((Object) null);
        HashMap term213643 = new HashMap();
        term213351 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term213431 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term213431, term213431.getClass(), "stage", enum218);
        setField(term213351, term213351.getClass(), "compiler", term213431);
        setField(term213351, term213351.getClass(), "properties", term213643);
        term213735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term213735, term213735.getClass(), "type", 0);
        setField(term213735, term213735.getClass(), "first", null);
        term213827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term213827, term213827.getClass(), "type", 0);
        setField(term213827, term213827.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term213735;
        args[1] = term213827;
        try {
            callMethod(klass, "process", argTypes, term213351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


