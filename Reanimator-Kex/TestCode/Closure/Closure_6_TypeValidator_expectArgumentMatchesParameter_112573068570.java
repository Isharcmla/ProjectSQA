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
import java.lang.Integer;

public class TypeValidator_expectArgumentMatchesParameter_112573068570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2823;
     Object term2825;

    public TypeValidator_expectArgumentMatchesParameter_112573068570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2823 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term2823, term2823.getClass(), "compiler", null);
        setField(term2823, term2823.getClass(), "typeRegistry", null);
        setField(term2823, term2823.getClass(), "allValueTypes", null);
        setBooleanField(term2823, term2823.getClass(), "shouldReport", false);
        setField(term2823, term2823.getClass(), "nullOrUndefined", null);
        setField(term2823, term2823.getClass(), "mismatches", null);
        term2825 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term2825;
        try {
            callMethod(klass, "expectArgumentMatchesParameter", argTypes, term2823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


