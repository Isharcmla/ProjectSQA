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

public class TypeCheck_visitBinaryOperator_2067533860592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183786;
     Object term183856;

    public TypeCheck_visitBinaryOperator_2067533860592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183786 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term183856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term184102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term183926, term183926.getClass(), "jsType", term184032);
        setField(term183856, term183856.getClass(), "first", term183926);
        setField(term184102, term184102.getClass(), "jsType", term184206);
        setField(term183856, term183856.getClass(), "last", term184102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 66;
        args[1] = null;
        args[2] = term183856;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term183786, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


