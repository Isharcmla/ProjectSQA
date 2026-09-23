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
import java.lang.StringBuilder;

public class RenamePrototypes_process_531819914188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233043;
     Object term233565;
     Object term233657;

    public RenamePrototypes_process_531819914188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term262928 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term262927 = ((Class) term262928).getDeclaredField((String) "NORMALIZED");
        ((Field) term262927).setAccessible(true);
        Object enum237 = ((Field) term262927).get((Object) null);
        StringBuilder term233347 = new StringBuilder();
        term233043 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term233123 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term233387 = newInstance(Class.forName("java.util.TreeMap"));
        Object term233473 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term233123, term233123.getClass(), "stage", enum237);
        setField(term233123, term233123.getClass(), "debugLog", term233347);
        setField(term233043, term233043.getClass(), "compiler", term233123);
        setField(term233043, term233043.getClass(), "properties", term233387);
        setField(term233043, term233043.getClass(), "prevUsedRenameMap", term233473);
        setField(term233043, term233043.getClass(), "reservedNames", null);
        setField(term233043, term233043.getClass(), "reservedCharacters", null);
        term233565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term233565, term233565.getClass(), "type", 0);
        setField(term233565, term233565.getClass(), "first", null);
        term233657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term233657, term233657.getClass(), "type", 0);
        setField(term233657, term233657.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term233565;
        args[1] = term233657;
        try {
            callMethod(klass, "process", argTypes, term233043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


