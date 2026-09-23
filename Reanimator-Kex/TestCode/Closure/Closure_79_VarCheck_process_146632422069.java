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

public class VarCheck_process_146632422069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24028;
     Object term24098;

    public VarCheck_process_146632422069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24028 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term24028, term24028.getClass(), "sanityCheck", false);
        setField(term24028, term24028.getClass(), "compiler", null);
        term24098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term24254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24098, term24098.getClass(), "type", 0);
        setField(term24184, term24184.getClass(), "next", term24254);
        setIntField(term24184, term24184.getClass(), "type", 0);
        setField(term24184, term24184.getClass(), "first", null);
        setField(term24098, term24098.getClass(), "first", term24184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term24098;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term24028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


