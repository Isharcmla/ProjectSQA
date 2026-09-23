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

public class RenamePrototypes_process_531819914125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137904;
     Object term138218;
     Object term138288;

    public RenamePrototypes_process_531819914125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term139307 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term139306 = ((Class) term139307).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term139306).setAccessible(true);
        Object enum143 = ((Field) term139306).get((Object) null);
        term137904 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term137984 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term137984, term137984.getClass(), "stage", enum143);
        setField(term137904, term137904.getClass(), "compiler", term137984);
        term138218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138218, term138218.getClass(), "type", 132);
        setField(term138218, term138218.getClass(), "propListHead", null);
        setField(term138218, term138218.getClass(), "first", null);
        term138288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term138218;
        args[1] = term138288;
        try {
            callMethod(klass, "process", argTypes, term137904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


