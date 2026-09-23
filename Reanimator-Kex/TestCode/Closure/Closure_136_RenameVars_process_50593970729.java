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
import java.util.HashSet;
import java.lang.Object;

public class RenameVars_process_50593970729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18236;
     Object term18528;
     Object term18668;

    public RenameVars_process_50593970729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term18284 = new HashSet();
        HashSet term18332 = new HashSet();
        term18236 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term18372 = newInstance(Class.forName("java.util.TreeMap"));
        Object term18458 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term18236, term18236.getClass(), "assignmentLog", null);
        setField(term18236, term18236.getClass(), "compiler", null);
        setField(term18236, term18236.getClass(), "reservedNames", term18284);
        setField(term18236, term18236.getClass(), "externNames", term18332);
        setField(term18236, term18236.getClass(), "assignments", term18372);
        setField(term18236, term18236.getClass(), "prevUsedRenameMap", term18458);
        term18528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18528, term18528.getClass(), "type", 0);
        setField(term18598, term18598.getClass(), "next", null);
        setIntField(term18598, term18598.getClass(), "type", 0);
        setField(term18598, term18598.getClass(), "first", null);
        setField(term18528, term18528.getClass(), "first", term18598);
        term18668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18668, term18668.getClass(), "type", 0);
        setField(term18738, term18738.getClass(), "next", null);
        setIntField(term18738, term18738.getClass(), "type", 0);
        setField(term18738, term18738.getClass(), "first", null);
        setField(term18668, term18668.getClass(), "first", term18738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term18528;
        args[1] = term18668;
        try {
            callMethod(klass, "process", argTypes, term18236, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


