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

public class RuntimeTypeCheck_process_167558251365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32628;
     Object term32718;

    public RuntimeTypeCheck_process_167558251365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32628 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term32628, term32628.getClass(), "compiler", null);
        term32718 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term32808 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term32900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32990 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term32718, term32718.getClass(), "type", 0);
        setField(term32900, term32900.getClass(), "next", term32990);
        setIntField(term32900, term32900.getClass(), "type", 0);
        setField(term32900, term32900.getClass(), "first", null);
        setField(term32808, term32808.getClass(), "next", term32900);
        setIntField(term32808, term32808.getClass(), "type", 0);
        setField(term32808, term32808.getClass(), "first", null);
        setField(term32718, term32718.getClass(), "first", term32808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32718;
        try {
            callMethod(klass, "process", argTypes, term32628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


