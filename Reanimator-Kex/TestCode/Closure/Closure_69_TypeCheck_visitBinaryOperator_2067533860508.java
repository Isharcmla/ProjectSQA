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

public class TypeCheck_visitBinaryOperator_2067533860508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156746;
     Object term156836;
     Object term156906;

    public TypeCheck_visitBinaryOperator_2067533860508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156746 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term156746, term156746.getClass(), "noTypeCheckSection", 0);
        term156836 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term156906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term157200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term156976, term156976.getClass(), "jsType", term157086);
        setField(term156906, term156906.getClass(), "first", term156976);
        setField(term156906, term156906.getClass(), "last", term156906);
        setField(term156906, term156906.getClass(), "jsType", term157200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 28;
        args[1] = term156836;
        args[2] = term156906;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term156746, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


