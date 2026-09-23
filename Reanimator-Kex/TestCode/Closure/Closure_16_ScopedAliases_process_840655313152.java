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

public class ScopedAliases_process_840655313152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92657;
     Object term92727;

    public ScopedAliases_process_840655313152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92657 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term92657, term92657.getClass(), "compiler", null);
        term92727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92727, term92727.getClass(), "type", 37);
        setIntField(term92797, term92797.getClass(), "type", 0);
        setField(term92797, term92797.getClass(), "parent", null);
        setField(term92727, term92727.getClass(), "parent", term92797);
        setField(term92727, term92727.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term92727;
        try {
            callMethod(klass, "process", argTypes, term92657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


