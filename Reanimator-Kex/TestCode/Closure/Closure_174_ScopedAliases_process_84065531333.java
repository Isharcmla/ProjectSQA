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

public class ScopedAliases_process_84065531333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19151;
     Object term19393;

    public ScopedAliases_process_84065531333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19151 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term19231 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term19323 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term19323, term19323.getClass(), "inLoop", false);
        setField(term19231, term19231.getClass(), "phaseOptimizer", term19323);
        setField(term19151, term19151.getClass(), "compiler", term19231);
        term19393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19393, term19393.getClass(), "type", 37);
        setField(term19393, term19393.getClass(), "parent", null);
        setField(term19393, term19393.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19393;
        try {
            callMethod(klass, "process", argTypes, term19151, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


