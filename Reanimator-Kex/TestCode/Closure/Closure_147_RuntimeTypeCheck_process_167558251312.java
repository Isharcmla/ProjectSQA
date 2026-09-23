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

public class RuntimeTypeCheck_process_167558251312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2001;
     Object term2151;

    public RuntimeTypeCheck_process_167558251312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2001 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term2081 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2001, term2001.getClass(), "compiler", term2081);
        term2151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2151, term2151.getClass(), "type", 0);
        setField(term2221, term2221.getClass(), "next", term2151);
        setIntField(term2221, term2221.getClass(), "type", 120);
        setField(term2151, term2151.getClass(), "first", term2221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2151;
        try {
            callMethod(klass, "process", argTypes, term2001, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


