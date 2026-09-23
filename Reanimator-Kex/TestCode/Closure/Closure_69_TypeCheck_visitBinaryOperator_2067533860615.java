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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_2067533860615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195759;
     Object term195829;

    public TypeCheck_visitBinaryOperator_2067533860615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195759 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term195829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term196087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term195899, term195899.getClass(), "jsType", term196017);
        setField(term195829, term195829.getClass(), "first", term195899);
        setField(term196087, term196087.getClass(), "jsType", term196193);
        setField(term195829, term195829.getClass(), "last", term196087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 29;
        args[1] = null;
        args[2] = term195829;
        callMethod(klass, "visitBinaryOperator", argTypes, term195759, args);
    }

};


