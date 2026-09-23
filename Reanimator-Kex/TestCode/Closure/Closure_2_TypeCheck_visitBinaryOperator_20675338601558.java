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

public class TypeCheck_visitBinaryOperator_20675338601558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517296;
     Object term517366;

    public TypeCheck_visitBinaryOperator_20675338601558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517296 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term517366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term517600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term517436, term517436.getClass(), "jsType", term517530);
        setField(term517366, term517366.getClass(), "first", term517436);
        setField(term517600, term517600.getClass(), "jsType", term517696);
        setField(term517366, term517366.getClass(), "last", term517600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 57;
        args[1] = null;
        args[2] = term517366;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term517296, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


