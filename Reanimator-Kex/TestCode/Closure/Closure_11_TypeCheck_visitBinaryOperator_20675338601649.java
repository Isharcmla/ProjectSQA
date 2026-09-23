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

public class TypeCheck_visitBinaryOperator_20675338601649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530779;
     Object term530849;

    public TypeCheck_visitBinaryOperator_20675338601649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530779 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term530849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term531097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term530919, term530919.getClass(), "jsType", term531027);
        setField(term530849, term530849.getClass(), "first", term530919);
        setField(term531097, term531097.getClass(), "jsType", term531191);
        setField(term530849, term530849.getClass(), "last", term531097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 37;
        args[1] = null;
        args[2] = term530849;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term530779, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


