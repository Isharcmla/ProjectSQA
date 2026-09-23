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

public class RenamePrototypes_process_53181991489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84929;
     Object term85305;
     Object term85397;

    public RenamePrototypes_process_53181991489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86691 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term86690 = ((Class) term86691).getDeclaredField((String) "NORMALIZED");
        ((Field) term86690).setAccessible(true);
        Object enum90 = ((Field) term86690).get((Object) null);
        term84929 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term85009 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term85213 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term85009, term85009.getClass(), "stage", enum90);
        setField(term84929, term84929.getClass(), "compiler", term85009);
        setField(term84929, term84929.getClass(), "properties", term85213);
        term85305 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term85305, term85305.getClass(), "type", 0);
        setField(term85305, term85305.getClass(), "first", null);
        term85397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term85397, term85397.getClass(), "type", 0);
        setField(term85397, term85397.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term85305;
        args[1] = term85397;
        try {
            callMethod(klass, "process", argTypes, term84929, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


