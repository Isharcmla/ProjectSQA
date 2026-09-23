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

public class TypeCheck_visitBinaryOperator_2067533860502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154105;
     Object term154175;

    public TypeCheck_visitBinaryOperator_2067533860502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154105 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term154175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term154409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term154245, term154245.getClass(), "jsType", term154339);
        setField(term154175, term154175.getClass(), "first", term154245);
        setField(term154409, term154409.getClass(), "jsType", term154519);
        setField(term154175, term154175.getClass(), "last", term154409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 63;
        args[1] = null;
        args[2] = term154175;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term154105, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


