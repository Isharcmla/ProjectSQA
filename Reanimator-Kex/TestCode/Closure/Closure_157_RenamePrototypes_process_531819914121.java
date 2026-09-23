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

public class RenamePrototypes_process_531819914121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132256;
     Object term132722;
     Object term132792;

    public RenamePrototypes_process_531819914121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134100 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term134099 = ((Class) term134100).getDeclaredField((String) "NORMALIZED");
        ((Field) term134099).setAccessible(true);
        Object enum137 = ((Field) term134099).get((Object) null);
        HashMap term132548 = new HashMap();
        term132256 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term132336 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term132336, term132336.getClass(), "stage", enum137);
        setField(term132256, term132256.getClass(), "compiler", term132336);
        setField(term132256, term132256.getClass(), "properties", term132548);
        setField(term132256, term132256.getClass(), "prevUsedRenameMap", null);
        setField(term132256, term132256.getClass(), "reservedNames", null);
        setField(term132256, term132256.getClass(), "reservedCharacters", null);
        term132722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132722, term132722.getClass(), "type", 0);
        setField(term132722, term132722.getClass(), "first", null);
        term132792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132792, term132792.getClass(), "type", 0);
        setField(term132792, term132792.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term132722;
        args[1] = term132792;
        try {
            callMethod(klass, "process", argTypes, term132256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


