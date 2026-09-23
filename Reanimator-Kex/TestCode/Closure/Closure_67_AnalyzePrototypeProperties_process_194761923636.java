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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AnalyzePrototypeProperties_process_194761923636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36335;
     Object term36405;

    public AnalyzePrototypeProperties_process_194761923636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36335 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term36335, term36335.getClass(), "canModifyExterns", false);
        setField(term36335, term36335.getClass(), "compiler", null);
        term36405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36405, term36405.getClass(), "type", 0);
        setField(term36545, term36545.getClass(), "next", term36615);
        setIntField(term36545, term36545.getClass(), "type", 0);
        setField(term36545, term36545.getClass(), "first", term36545);
        setField(term36475, term36475.getClass(), "next", term36545);
        setIntField(term36475, term36475.getClass(), "type", 0);
        setField(term36475, term36475.getClass(), "first", null);
        setField(term36405, term36405.getClass(), "first", term36475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36405;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term36335, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


