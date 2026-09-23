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
import java.util.HashSet;

public class RenamePrototypes_process_531819914147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169651;
     Object term170075;
     Object term170167;

    public RenamePrototypes_process_531819914147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term171523 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term171522 = ((Class) term171523).getDeclaredField((String) "NORMALIZED");
        ((Field) term171522).setAccessible(true);
        Object enum176 = ((Field) term171522).get((Object) null);
        HashSet term169983 = new HashSet();
        term169651 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term169731 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term169935 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term169731, term169731.getClass(), "stage", enum176);
        setField(term169651, term169651.getClass(), "compiler", term169731);
        setField(term169651, term169651.getClass(), "properties", term169935);
        setField(term169651, term169651.getClass(), "prevUsedRenameMap", null);
        setField(term169651, term169651.getClass(), "reservedNames", term169983);
        setField(term169651, term169651.getClass(), "reservedCharacters", null);
        term170075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term170075, term170075.getClass(), "type", 0);
        setField(term170075, term170075.getClass(), "first", null);
        term170167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term170167, term170167.getClass(), "type", 0);
        setField(term170167, term170167.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term170075;
        args[1] = term170167;
        try {
            callMethod(klass, "process", argTypes, term169651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


