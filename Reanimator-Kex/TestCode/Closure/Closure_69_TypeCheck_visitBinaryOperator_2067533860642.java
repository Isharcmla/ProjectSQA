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

public class TypeCheck_visitBinaryOperator_2067533860642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207408;
     Object term207478;

    public TypeCheck_visitBinaryOperator_2067533860642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207408 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term207478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term207710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term207548, term207548.getClass(), "jsType", term207640);
        setField(term207478, term207478.getClass(), "first", term207548);
        setField(term207710, term207710.getClass(), "jsType", term207810);
        setField(term207478, term207478.getClass(), "last", term207710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 75;
        args[1] = null;
        args[2] = term207478;
        callMethod(klass, "visitBinaryOperator", argTypes, term207408, args);
    }

};


