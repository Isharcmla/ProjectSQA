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

public class TypeCheck_visitBinaryOperator_20675338601591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530755;
     Object term530825;

    public TypeCheck_visitBinaryOperator_20675338601591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530755 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term530825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term531071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term530895, term530895.getClass(), "jsType", term531001);
        setField(term530825, term530825.getClass(), "first", term530895);
        setField(term531071, term531071.getClass(), "jsType", term531163);
        setField(term530825, term530825.getClass(), "last", term531071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 34;
        args[1] = null;
        args[2] = term530825;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term530755, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


