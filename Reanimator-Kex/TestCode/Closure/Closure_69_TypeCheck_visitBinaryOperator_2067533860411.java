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

public class TypeCheck_visitBinaryOperator_2067533860411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121409;
     Object term121479;

    public TypeCheck_visitBinaryOperator_2067533860411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121409 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term121479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term121711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term121549, term121549.getClass(), "jsType", term121641);
        setField(term121479, term121479.getClass(), "first", term121549);
        setField(term121711, term121711.getClass(), "jsType", term121807);
        setField(term121479, term121479.getClass(), "last", term121711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 85;
        args[1] = null;
        args[2] = term121479;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term121409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


