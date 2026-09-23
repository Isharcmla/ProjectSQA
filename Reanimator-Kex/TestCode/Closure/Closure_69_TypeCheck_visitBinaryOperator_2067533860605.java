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

public class TypeCheck_visitBinaryOperator_2067533860605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188955;
     Object term189045;
     Object term189115;

    public TypeCheck_visitBinaryOperator_2067533860605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188955 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term188955, term188955.getClass(), "noTypeCheckSection", 0);
        term189045 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term189115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term189361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term189185, term189185.getClass(), "jsType", term189291);
        setField(term189115, term189115.getClass(), "first", term189185);
        setField(term189361, term189361.getClass(), "jsType", term189461);
        setField(term189115, term189115.getClass(), "last", term189361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 52;
        args[1] = term189045;
        args[2] = term189115;
        callMethod(klass, "visitBinaryOperator", argTypes, term188955, args);
    }

};


