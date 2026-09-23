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

public class AnalyzePrototypeProperties_process_194761923617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13230;
     Object term13300;

    public AnalyzePrototypeProperties_process_194761923617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13230 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term13230, term13230.getClass(), "canModifyExterns", false);
        setField(term13230, term13230.getClass(), "compiler", null);
        term13300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13300, term13300.getClass(), "type", 0);
        setField(term13370, term13370.getClass(), "next", term13440);
        setIntField(term13370, term13370.getClass(), "type", 0);
        setField(term13370, term13370.getClass(), "first", null);
        setField(term13300, term13300.getClass(), "first", term13370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term13300;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term13230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


