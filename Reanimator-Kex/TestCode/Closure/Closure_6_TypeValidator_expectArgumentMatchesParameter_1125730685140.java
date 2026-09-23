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

public class TypeValidator_expectArgumentMatchesParameter_1125730685140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32901;
     Object term32997;

    public TypeValidator_expectArgumentMatchesParameter_1125730685140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32901 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term32997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
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
        args[2] = term32997;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        try {
            callMethod(klass, "expectArgumentMatchesParameter", argTypes, term32901, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


