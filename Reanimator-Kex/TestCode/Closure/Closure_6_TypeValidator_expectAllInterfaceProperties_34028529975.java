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

public class TypeValidator_expectAllInterfaceProperties_34028529975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4547;

    public TypeValidator_expectAllInterfaceProperties_34028529975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4547 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term4547, term4547.getClass(), "compiler", null);
        setField(term4547, term4547.getClass(), "typeRegistry", null);
        setField(term4547, term4547.getClass(), "allValueTypes", null);
        setBooleanField(term4547, term4547.getClass(), "shouldReport", false);
        setField(term4547, term4547.getClass(), "nullOrUndefined", null);
        setField(term4547, term4547.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "expectAllInterfaceProperties", argTypes, term4547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


