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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_process_84065531311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5810;
     Object term5880;
     Object term6675;
     Object term6676;

    public ScopedAliases_process_84065531311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5810 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term5810, term5810.getClass(), "compiler", null);
        term5880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5880, term5880.getClass(), "type", 0);
        setField(term5880, term5880.getClass(), "parent", null);
        setField(term6020, term6020.getClass(), "next", null);
        setIntField(term6020, term6020.getClass(), "type", 0);
        setField(term6020, term6020.getClass(), "first", null);
        setField(term5950, term5950.getClass(), "next", term6020);
        setIntField(term5950, term5950.getClass(), "type", 0);
        setField(term6090, term6090.getClass(), "next", null);
        setIntField(term6090, term6090.getClass(), "type", 0);
        setField(term6090, term6090.getClass(), "first", null);
        setField(term5950, term5950.getClass(), "first", term6090);
        setField(term5880, term5880.getClass(), "first", term5950);
        term6675 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term6675, term6675.getClass(), "compiler", null);
        setField(term6675, term6675.getClass(), "preprocessorSymbolTable", null);
        setField(term6675, term6675.getClass(), "transformationHandler", null);
        term6676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6676, term6676.getClass(), "type", 0);
        setField(term6676, term6676.getClass(), "next", null);
        setIntField(term6677, term6677.getClass(), "type", 0);
        setIntField(term6678, term6678.getClass(), "type", 0);
        setField(term6678, term6678.getClass(), "next", null);
        setField(term6678, term6678.getClass(), "first", null);
        setField(term6678, term6678.getClass(), "last", null);
        setField(term6678, term6678.getClass(), "propListHead", null);
        setIntField(term6678, term6678.getClass(), "sourcePosition", 0);
        setField(term6678, term6678.getClass(), "jsType", null);
        setField(term6678, term6678.getClass(), "parent", null);
        setField(term6677, term6677.getClass(), "next", term6678);
        setIntField(term6679, term6679.getClass(), "type", 0);
        setField(term6679, term6679.getClass(), "next", null);
        setField(term6679, term6679.getClass(), "first", null);
        setField(term6679, term6679.getClass(), "last", null);
        setField(term6679, term6679.getClass(), "propListHead", null);
        setIntField(term6679, term6679.getClass(), "sourcePosition", 0);
        setField(term6679, term6679.getClass(), "jsType", null);
        setField(term6679, term6679.getClass(), "parent", null);
        setField(term6677, term6677.getClass(), "first", term6679);
        setField(term6677, term6677.getClass(), "last", null);
        setField(term6677, term6677.getClass(), "propListHead", null);
        setIntField(term6677, term6677.getClass(), "sourcePosition", 0);
        setField(term6677, term6677.getClass(), "jsType", null);
        setField(term6677, term6677.getClass(), "parent", null);
        setField(term6676, term6676.getClass(), "first", term6677);
        setField(term6676, term6676.getClass(), "last", null);
        setField(term6676, term6676.getClass(), "propListHead", null);
        setIntField(term6676, term6676.getClass(), "sourcePosition", 0);
        setField(term6676, term6676.getClass(), "jsType", null);
        setField(term6676, term6676.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5880;
        callMethod(klass, "process", argTypes, term5810, args);
        assertTrue(recursiveEquals(term5810, term6675));
        assertTrue(recursiveEquals(term5880, null));
    }

};


