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

public class VarCheck_process_146632422067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22954;
     Object term23024;

    public VarCheck_process_146632422067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22954 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term22954, term22954.getClass(), "sanityCheck", false);
        setField(term22954, term22954.getClass(), "compiler", null);
        term23024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term23180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23272 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term23024, term23024.getClass(), "type", 0);
        setField(term23110, term23110.getClass(), "next", term23180);
        setIntField(term23110, term23110.getClass(), "type", 0);
        setField(term23110, term23110.getClass(), "first", term23272);
        setField(term23024, term23024.getClass(), "first", term23110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term23024;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term22954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


