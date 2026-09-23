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

public class RuntimeTypeCheck_process_167558251354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26364;
     Object term26514;

    public RuntimeTypeCheck_process_167558251354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26364 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term26444 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26364, term26364.getClass(), "compiler", term26444);
        term26514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term26514, term26514.getClass(), "type", 0);
        setField(term26768, term26768.getClass(), "next", null);
        setIntField(term26768, term26768.getClass(), "type", 0);
        setField(term26768, term26768.getClass(), "first", null);
        setField(term26676, term26676.getClass(), "next", term26768);
        setIntField(term26676, term26676.getClass(), "type", 0);
        setField(term26676, term26676.getClass(), "first", null);
        setField(term26584, term26584.getClass(), "next", term26676);
        setIntField(term26584, term26584.getClass(), "type", 0);
        setField(term26584, term26584.getClass(), "first", null);
        setField(term26514, term26514.getClass(), "first", term26584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26514;
        try {
            callMethod(klass, "process", argTypes, term26364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


