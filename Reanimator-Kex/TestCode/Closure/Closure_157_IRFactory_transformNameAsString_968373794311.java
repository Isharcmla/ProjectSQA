package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNameAsString_968373794311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52987;
     Object term53233;

    public IRFactory_transformNameAsString_968373794311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52987 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term53125 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term52987, term52987.getClass(), "transformDispatcher", term53125);
        term53233 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        setField(term53233, term53233.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
        Object[] args = new Object[1];
        args[0] = term53233;
        try {
            callMethod(klass, "transformNameAsString", argTypes, term52987, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


