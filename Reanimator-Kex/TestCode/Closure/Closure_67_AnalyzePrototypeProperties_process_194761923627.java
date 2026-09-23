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

public class AnalyzePrototypeProperties_process_194761923627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30153;
     Object term30303;

    public AnalyzePrototypeProperties_process_194761923627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30153 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term30233 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term30153, term30153.getClass(), "canModifyExterns", false);
        setField(term30153, term30153.getClass(), "compiler", term30233);
        term30303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30303, term30303.getClass(), "type", 0);
        setField(term30443, term30443.getClass(), "next", term30513);
        setIntField(term30443, term30443.getClass(), "type", 33);
        setField(term30443, term30443.getClass(), "first", null);
        setField(term30373, term30373.getClass(), "next", term30443);
        setIntField(term30373, term30373.getClass(), "type", 0);
        setField(term30373, term30373.getClass(), "first", null);
        setField(term30303, term30303.getClass(), "first", term30373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term30303;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term30153, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


