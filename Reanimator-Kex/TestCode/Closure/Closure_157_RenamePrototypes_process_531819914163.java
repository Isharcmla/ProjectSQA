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

public class RenamePrototypes_process_531819914163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192396;
     Object term192818;

    public RenamePrototypes_process_531819914163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term194112 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term194111 = ((Class) term194112).getDeclaredField((String) "NORMALIZED");
        ((Field) term194111).setAccessible(true);
        Object enum200 = ((Field) term194111).get((Object) null);
        term192396 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term192476 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term192680 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term192476, term192476.getClass(), "stage", enum200);
        setField(term192396, term192396.getClass(), "compiler", term192476);
        setField(term192396, term192396.getClass(), "properties", term192680);
        term192818 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term192818, term192818.getClass(), "type", 0);
        setField(term192818, term192818.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term192818;
        args[1] = term192818;
        try {
            callMethod(klass, "process", argTypes, term192396, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


