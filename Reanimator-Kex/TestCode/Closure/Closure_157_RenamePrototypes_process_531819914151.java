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

public class RenamePrototypes_process_531819914151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175570;
     Object term175946;
     Object term176038;

    public RenamePrototypes_process_531819914151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177332 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term177331 = ((Class) term177332).getDeclaredField((String) "NORMALIZED");
        ((Field) term177331).setAccessible(true);
        Object enum182 = ((Field) term177331).get((Object) null);
        term175570 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term175650 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term175854 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term175650, term175650.getClass(), "stage", enum182);
        setField(term175570, term175570.getClass(), "compiler", term175650);
        setField(term175570, term175570.getClass(), "properties", term175854);
        term175946 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term175946, term175946.getClass(), "type", 0);
        setField(term175946, term175946.getClass(), "first", null);
        term176038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term176038, term176038.getClass(), "type", 0);
        setField(term176038, term176038.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term175946;
        args[1] = term176038;
        try {
            callMethod(klass, "process", argTypes, term175570, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


