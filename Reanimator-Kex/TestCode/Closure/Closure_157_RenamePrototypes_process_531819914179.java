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

public class RenamePrototypes_process_531819914179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219115;
     Object term219477;
     Object term219547;

    public RenamePrototypes_process_531819914179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220983 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term220982 = ((Class) term220983).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term220982).setAccessible(true);
        Object enum224 = ((Field) term220982).get((Object) null);
        HashMap term219407 = new HashMap();
        term219115 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term219195 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term219195, term219195.getClass(), "stage", enum224);
        setField(term219115, term219115.getClass(), "compiler", term219195);
        setField(term219115, term219115.getClass(), "properties", term219407);
        term219477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term219477, term219477.getClass(), "type", 132);
        setField(term219477, term219477.getClass(), "propListHead", null);
        setField(term219477, term219477.getClass(), "first", null);
        term219547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term219547, term219547.getClass(), "type", 0);
        setField(term219547, term219547.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term219477;
        args[1] = term219547;
        try {
            callMethod(klass, "process", argTypes, term219115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


