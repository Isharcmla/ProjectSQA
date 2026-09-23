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

public class TypeCheck_visitBinaryOperator_2067533860532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164748;
     Object term164818;

    public TypeCheck_visitBinaryOperator_2067533860532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164748 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term164818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term165058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term164888, term164888.getClass(), "jsType", term164988);
        setField(term164818, term164818.getClass(), "first", term164888);
        setField(term165058, term165058.getClass(), "jsType", term165152);
        setField(term164818, term164818.getClass(), "last", term165058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 93;
        args[1] = null;
        args[2] = term164818;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term164748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


