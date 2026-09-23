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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RuntimeTypeCheck_process_167558251362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30487;
     Object term30657;

    public RuntimeTypeCheck_process_167558251362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30487 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term30567 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30487, term30487.getClass(), "compiler", term30567);
        term30657 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term30727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30657, term30657.getClass(), "type", 0);
        setField(term30797, term30797.getClass(), "next", term30657);
        setIntField(term30797, term30797.getClass(), "type", 0);
        setField(term30797, term30797.getClass(), "first", null);
        setField(term30727, term30727.getClass(), "next", term30797);
        setIntField(term30727, term30727.getClass(), "type", 0);
        setField(term30727, term30727.getClass(), "first", null);
        setField(term30657, term30657.getClass(), "first", term30727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30657;
        try {
            callMethod(klass, "process", argTypes, term30487, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


