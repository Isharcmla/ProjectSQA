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

public class TypeCheck_visitBinaryOperator_20675338601409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429784;
     Object term429854;

    public TypeCheck_visitBinaryOperator_20675338601409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429784 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term429854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term430090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term429924, term429924.getClass(), "jsType", term430020);
        setField(term429854, term429854.getClass(), "first", term429924);
        setField(term430090, term430090.getClass(), "jsType", term430184);
        setField(term429854, term429854.getClass(), "last", term430090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 33;
        args[1] = null;
        args[2] = term429854;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term429784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


