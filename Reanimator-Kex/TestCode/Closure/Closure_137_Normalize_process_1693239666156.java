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

public class Normalize_process_1693239666156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2235826;
     Object term2235992;

    public Normalize_process_1693239666156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2235826 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2235906 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2235826, term2235826.getClass(), "compiler", term2235906);
        setBooleanField(term2235826, term2235826.getClass(), "assertOnChange", false);
        term2235992 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2236078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2236148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2235992, term2235992.getClass(), "type", 126);
        setIntField(term2236078, term2236078.getClass(), "type", 121);
        setField(term2236078, term2236078.getClass(), "propListHead", null);
        setIntField(term2236078, term2236078.getClass(), "sourcePosition", 0);
        setField(term2236078, term2236078.getClass(), "next", term2236148);
        setField(term2235992, term2235992.getClass(), "last", term2236078);
        setField(term2235992, term2235992.getClass(), "first", term2236078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2235992;
        try {
            callMethod(klass, "process", argTypes, term2235826, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


