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

public class TypeCheck_visitBinaryOperator_2067533860490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148937;
     Object term149007;

    public TypeCheck_visitBinaryOperator_2067533860490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148937 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term149007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term149257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term149077, term149077.getClass(), "jsType", term149187);
        setField(term149007, term149007.getClass(), "first", term149077);
        setField(term149257, term149257.getClass(), "jsType", term149355);
        setField(term149007, term149007.getClass(), "last", term149257);
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
        args[2] = term149007;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term148937, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


