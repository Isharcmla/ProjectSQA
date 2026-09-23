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

public class RuntimeTypeCheck_process_167558251315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4169;
     Object term4335;

    public RuntimeTypeCheck_process_167558251315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4169 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        Object term4249 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term4169, term4169.getClass(), "compiler", term4249);
        term4335 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4335, term4335.getClass(), "type", 0);
        setField(term4335, term4335.getClass(), "first", term4421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4335;
        try {
            callMethod(klass, "process", argTypes, term4169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


