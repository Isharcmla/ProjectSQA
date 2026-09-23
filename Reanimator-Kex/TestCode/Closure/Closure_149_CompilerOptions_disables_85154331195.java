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

public class CompilerOptions_disables_85154331195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276503;

    public CompilerOptions_disables_85154331195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276503 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term276607 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(term276503, term276503.getClass(), "warningsGuard", term276607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "disables", argTypes, term276503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


