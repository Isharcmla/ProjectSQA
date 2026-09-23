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

public class AnalyzePrototypeProperties_process_194761923633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35029;
     Object term35099;

    public AnalyzePrototypeProperties_process_194761923633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35029 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term35029, term35029.getClass(), "canModifyExterns", false);
        setField(term35029, term35029.getClass(), "compiler", null);
        term35099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35099, term35099.getClass(), "type", 0);
        setField(term35239, term35239.getClass(), "next", term35309);
        setIntField(term35239, term35239.getClass(), "type", 0);
        setField(term35239, term35239.getClass(), "first", null);
        setField(term35169, term35169.getClass(), "next", term35239);
        setIntField(term35169, term35169.getClass(), "type", 0);
        setField(term35169, term35169.getClass(), "first", null);
        setField(term35099, term35099.getClass(), "first", term35169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term35099;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term35029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


