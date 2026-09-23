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

public class RenamePrototypes_process_53181991497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96837;
     Object term97299;
     Object term97391;

    public RenamePrototypes_process_53181991497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98716 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term98715 = ((Class) term98716).getDeclaredField((String) "NORMALIZED");
        ((Field) term98715).setAccessible(true);
        Object enum101 = ((Field) term98715).get((Object) null);
        term96837 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term96917 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term97121 = newInstance(Class.forName("java.util.TreeMap"));
        Object term97207 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term96917, term96917.getClass(), "stage", enum101);
        setField(term96837, term96837.getClass(), "compiler", term96917);
        setField(term96837, term96837.getClass(), "properties", term97121);
        setField(term96837, term96837.getClass(), "prevUsedRenameMap", term97207);
        setField(term96837, term96837.getClass(), "reservedNames", null);
        setField(term96837, term96837.getClass(), "reservedCharacters", null);
        term97299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97299, term97299.getClass(), "type", 0);
        setField(term97299, term97299.getClass(), "first", null);
        term97391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97391, term97391.getClass(), "type", 0);
        setField(term97391, term97391.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term97299;
        args[1] = term97391;
        try {
            callMethod(klass, "process", argTypes, term96837, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


