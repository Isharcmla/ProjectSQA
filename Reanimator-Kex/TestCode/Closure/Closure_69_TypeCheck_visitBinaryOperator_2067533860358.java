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

public class TypeCheck_visitBinaryOperator_2067533860358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103674;
     Object term103744;

    public TypeCheck_visitBinaryOperator_2067533860358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103674 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term103744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term103980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term103814, term103814.getClass(), "jsType", term103910);
        setField(term103744, term103744.getClass(), "first", term103814);
        setField(term103980, term103980.getClass(), "jsType", term104076);
        setField(term103744, term103744.getClass(), "last", term103980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 70;
        args[1] = null;
        args[2] = term103744;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term103674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


