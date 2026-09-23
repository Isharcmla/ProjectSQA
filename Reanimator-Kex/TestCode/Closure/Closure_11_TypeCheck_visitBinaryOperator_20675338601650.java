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

public class TypeCheck_visitBinaryOperator_20675338601650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531299;
     Object term531369;

    public TypeCheck_visitBinaryOperator_20675338601650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531299 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term531369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term531603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term531439, term531439.getClass(), "jsType", term531533);
        setField(term531369, term531369.getClass(), "first", term531439);
        setField(term531603, term531603.getClass(), "jsType", term531717);
        setField(term531369, term531369.getClass(), "last", term531603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 76;
        args[1] = null;
        args[2] = term531369;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term531299, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


