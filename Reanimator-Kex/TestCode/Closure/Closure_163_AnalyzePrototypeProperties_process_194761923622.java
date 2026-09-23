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

public class AnalyzePrototypeProperties_process_194761923622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18269;
     Object term18553;

    public AnalyzePrototypeProperties_process_194761923622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18269 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term18349 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term18483 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setBooleanField(term18269, term18269.getClass(), "canModifyExterns", true);
        setField(term18269, term18269.getClass(), "compiler", term18349);
        setField(term18269, term18269.getClass(), "globalNode", term18483);
        term18553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18553, term18553.getClass(), "type", -133);
        setField(term18553, term18553.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18553;
        try {
            callMethod(klass, "process", argTypes, term18269, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


