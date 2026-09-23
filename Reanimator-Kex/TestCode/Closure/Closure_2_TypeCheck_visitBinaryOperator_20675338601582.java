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

public class TypeCheck_visitBinaryOperator_20675338601582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526692;
     Object term526762;

    public TypeCheck_visitBinaryOperator_20675338601582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term526692 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term526762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term527006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term526832, term526832.getClass(), "jsType", term526936);
        setField(term526762, term526762.getClass(), "first", term526832);
        setField(term527006, term527006.getClass(), "jsType", term527098);
        setField(term526762, term526762.getClass(), "last", term527006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 49;
        args[1] = null;
        args[2] = term526762;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term526692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


