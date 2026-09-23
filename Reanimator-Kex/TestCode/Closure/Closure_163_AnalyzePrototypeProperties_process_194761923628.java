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

public class AnalyzePrototypeProperties_process_194761923628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26377;
     Object term26581;

    public AnalyzePrototypeProperties_process_194761923628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26377 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term26511 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setBooleanField(term26377, term26377.getClass(), "canModifyExterns", true);
        setField(term26377, term26377.getClass(), "compiler", null);
        setField(term26377, term26377.getClass(), "globalNode", term26511);
        term26581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26581, term26581.getClass(), "type", -133);
        setField(term26581, term26581.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26581;
        try {
            callMethod(klass, "process", argTypes, term26377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


