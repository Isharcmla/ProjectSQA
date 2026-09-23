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

public class TypeCheck_report_563874199350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84230;
     Object term84320;

    public TypeCheck_report_563874199350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84230 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term84230, term84230.getClass(), "noTypeCheckSection", 0);
        term84320 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term84320;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "report", argTypes, term84230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


