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

public class VarCheck_process_146632422070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24470;
     Object term24540;

    public VarCheck_process_146632422070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24470 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term24470, term24470.getClass(), "sanityCheck", false);
        setField(term24470, term24470.getClass(), "compiler", null);
        term24540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term24696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term24868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term24540, term24540.getClass(), "type", 0);
        setField(term24626, term24626.getClass(), "next", term24696);
        setIntField(term24626, term24626.getClass(), "type", 0);
        setField(term24782, term24782.getClass(), "next", null);
        setIntField(term24782, term24782.getClass(), "type", 0);
        setField(term24782, term24782.getClass(), "first", term24868);
        setField(term24626, term24626.getClass(), "first", term24782);
        setField(term24540, term24540.getClass(), "first", term24626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term24540;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term24470, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


