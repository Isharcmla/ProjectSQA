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

public class RuntimeTypeCheck_process_167558251349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23738;
     Object term23824;

    public RuntimeTypeCheck_process_167558251349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23738 = newInstance(Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck"));
        setField(term23738, term23738.getClass(), "compiler", null);
        term23824 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term23894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term23824, term23824.getClass(), "type", 0);
        setField(term23980, term23980.getClass(), "next", null);
        setIntField(term23980, term23980.getClass(), "type", 105);
        setField(term23894, term23894.getClass(), "next", term23980);
        setIntField(term23894, term23894.getClass(), "type", 0);
        setField(term23894, term23894.getClass(), "first", null);
        setField(term23824, term23824.getClass(), "first", term23894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RuntimeTypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23824;
        try {
            callMethod(klass, "process", argTypes, term23738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


