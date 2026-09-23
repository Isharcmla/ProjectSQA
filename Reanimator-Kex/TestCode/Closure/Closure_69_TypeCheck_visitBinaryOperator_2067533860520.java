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

public class TypeCheck_visitBinaryOperator_2067533860520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160227;
     Object term160297;

    public TypeCheck_visitBinaryOperator_2067533860520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160227 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term160297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term160535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term160367, term160367.getClass(), "jsType", term160465);
        setField(term160297, term160297.getClass(), "first", term160367);
        setField(term160535, term160535.getClass(), "jsType", term160659);
        setField(term160297, term160297.getClass(), "last", term160535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 91;
        args[1] = null;
        args[2] = term160297;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term160227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


