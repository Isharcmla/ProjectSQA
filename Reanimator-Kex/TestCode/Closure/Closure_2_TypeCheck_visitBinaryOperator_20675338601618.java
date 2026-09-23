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

public class TypeCheck_visitBinaryOperator_20675338601618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541780;
     Object term541850;

    public TypeCheck_visitBinaryOperator_20675338601618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541780 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term541850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term541920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term542030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term542100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term542210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term541920, term541920.getClass(), "jsType", term542030);
        setField(term541850, term541850.getClass(), "first", term541920);
        setField(term542100, term542100.getClass(), "jsType", term542210);
        setField(term541850, term541850.getClass(), "last", term542100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 14;
        args[1] = null;
        args[2] = term541850;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term541780, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


