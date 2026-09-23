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

public class AnalyzePrototypeProperties_process_194761923637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36872;
     Object term36942;

    public AnalyzePrototypeProperties_process_194761923637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36872 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term36872, term36872.getClass(), "canModifyExterns", false);
        setField(term36872, term36872.getClass(), "compiler", null);
        term36942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36942, term36942.getClass(), "type", 0);
        setField(term37012, term37012.getClass(), "next", term37082);
        setIntField(term37012, term37012.getClass(), "type", 105);
        setField(term36942, term36942.getClass(), "first", term37012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36942;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term36872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


