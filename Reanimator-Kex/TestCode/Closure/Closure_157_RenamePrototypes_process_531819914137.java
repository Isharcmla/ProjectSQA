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

public class RenamePrototypes_process_531819914137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154747;
     Object term155083;

    public RenamePrototypes_process_531819914137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156383 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term156382 = ((Class) term156383).getDeclaredField((String) "NORMALIZED");
        ((Field) term156382).setAccessible(true);
        Object enum161 = ((Field) term156382).get((Object) null);
        term154747 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term154827 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term154827, term154827.getClass(), "stage", enum161);
        setField(term154747, term154747.getClass(), "compiler", term154827);
        term155083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term155083, term155083.getClass(), "type", 132);
        setField(term155083, term155083.getClass(), "propListHead", null);
        setField(term155083, term155083.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term155083;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term154747, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


