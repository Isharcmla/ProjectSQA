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

public class TypeCheck_processForTesting_417475365113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31689;
     Object term31759;

    public TypeCheck_processForTesting_417475365113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31689 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term31689, term31689.getClass(), "scopeCreator", null);
        setField(term31689, term31689.getClass(), "topScope", null);
        term31759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31759, term31759.getClass(), "parent", term31759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31759;
        try {
            callMethod(klass, "processForTesting", argTypes, term31689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


