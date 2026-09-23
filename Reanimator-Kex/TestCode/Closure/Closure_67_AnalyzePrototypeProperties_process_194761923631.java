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

public class AnalyzePrototypeProperties_process_194761923631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33710;
     Object term33860;

    public AnalyzePrototypeProperties_process_194761923631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33710 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term33790 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term33710, term33710.getClass(), "canModifyExterns", false);
        setField(term33710, term33710.getClass(), "compiler", term33790);
        term33860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33860, term33860.getClass(), "type", 33);
        setField(term33930, term33930.getClass(), "next", null);
        setIntField(term33930, term33930.getClass(), "type", 0);
        setField(term33930, term33930.getClass(), "first", null);
        setField(term33860, term33860.getClass(), "first", term33930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term33860;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term33710, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


