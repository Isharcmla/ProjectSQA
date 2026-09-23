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

public class ScopedAliases_process_84065531325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14904;
     Object term14974;
     Object term15726;
     Object term15727;

    public ScopedAliases_process_84065531325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14904 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term14904, term14904.getClass(), "compiler", null);
        term14974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14974, term14974.getClass(), "type", 0);
        setIntField(term15044, term15044.getClass(), "type", 0);
        setField(term15044, term15044.getClass(), "parent", null);
        setField(term14974, term14974.getClass(), "parent", term15044);
        setField(term14974, term14974.getClass(), "first", null);
        term15726 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term15726, term15726.getClass(), "compiler", null);
        setField(term15726, term15726.getClass(), "preprocessorSymbolTable", null);
        setField(term15726, term15726.getClass(), "transformationHandler", null);
        term15727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15727, term15727.getClass(), "type", 0);
        setField(term15727, term15727.getClass(), "next", null);
        setField(term15727, term15727.getClass(), "first", null);
        setField(term15727, term15727.getClass(), "last", null);
        setField(term15727, term15727.getClass(), "propListHead", null);
        setIntField(term15727, term15727.getClass(), "sourcePosition", 0);
        setField(term15727, term15727.getClass(), "jsType", null);
        setIntField(term15728, term15728.getClass(), "type", 0);
        setField(term15728, term15728.getClass(), "next", null);
        setField(term15728, term15728.getClass(), "first", null);
        setField(term15728, term15728.getClass(), "last", null);
        setField(term15728, term15728.getClass(), "propListHead", null);
        setIntField(term15728, term15728.getClass(), "sourcePosition", 0);
        setField(term15728, term15728.getClass(), "jsType", null);
        setField(term15728, term15728.getClass(), "parent", null);
        setField(term15727, term15727.getClass(), "parent", term15728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14974;
        callMethod(klass, "process", argTypes, term14904, args);
        assertTrue(recursiveEquals(term14904, term15726));
        assertTrue(recursiveEquals(term14974, null));
    }

};


