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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92724;
     Object term92810;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92724 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term92810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term92896 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term92982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term92896, term92896.getClass(), "type", 33);
        setField(term92896, term92896.getClass(), "last", term92982);
        setField(term92810, term92810.getClass(), "first", term92896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92810;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term92724, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


