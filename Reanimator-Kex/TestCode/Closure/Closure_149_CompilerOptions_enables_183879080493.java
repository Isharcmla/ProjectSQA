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

public class CompilerOptions_enables_183879080493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276166;

    public CompilerOptions_enables_183879080493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276166 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term276270 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(term276270, term276270.getClass(), "guards", null);
        setField(term276166, term276166.getClass(), "warningsGuard", term276270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "enables", argTypes, term276166, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


