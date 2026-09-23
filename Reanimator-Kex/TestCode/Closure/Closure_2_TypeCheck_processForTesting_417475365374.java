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

public class TypeCheck_processForTesting_417475365374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89377;
     Object term89447;

    public TypeCheck_processForTesting_417475365374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89377 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term89377, term89377.getClass(), "scopeCreator", null);
        setField(term89377, term89377.getClass(), "topScope", null);
        term89447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89447, term89447.getClass(), "parent", term89447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term89447;
        try {
            callMethod(klass, "processForTesting", argTypes, term89377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


