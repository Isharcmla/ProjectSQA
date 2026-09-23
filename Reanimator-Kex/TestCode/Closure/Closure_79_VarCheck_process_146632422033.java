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

public class VarCheck_process_146632422033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8663;
     Object term8733;

    public VarCheck_process_146632422033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8663 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term8663, term8663.getClass(), "sanityCheck", false);
        setField(term8663, term8663.getClass(), "compiler", null);
        term8733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8733, term8733.getClass(), "type", 0);
        setField(term8803, term8803.getClass(), "next", term8873);
        setIntField(term8803, term8803.getClass(), "type", 0);
        setField(term8803, term8803.getClass(), "first", term8943);
        setField(term8733, term8733.getClass(), "first", term8803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term8733;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term8663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


