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

public class VarCheck_process_146632422080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56219;
     Object term56289;

    public VarCheck_process_146632422080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56219 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term56219, term56219.getClass(), "sanityCheck", false);
        setField(term56219, term56219.getClass(), "compiler", null);
        term56289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term56461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term56531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term56289, term56289.getClass(), "type", 0);
        setField(term56461, term56461.getClass(), "next", term56531);
        setIntField(term56461, term56461.getClass(), "type", 0);
        setField(term56461, term56461.getClass(), "first", null);
        setField(term56375, term56375.getClass(), "next", term56461);
        setIntField(term56375, term56375.getClass(), "type", 0);
        setField(term56617, term56617.getClass(), "next", null);
        setIntField(term56617, term56617.getClass(), "type", 0);
        setField(term56617, term56617.getClass(), "first", null);
        setField(term56375, term56375.getClass(), "first", term56617);
        setField(term56289, term56289.getClass(), "first", term56375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term56289;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term56219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


