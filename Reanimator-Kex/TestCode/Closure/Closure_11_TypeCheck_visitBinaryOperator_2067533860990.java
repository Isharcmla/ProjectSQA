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

public class TypeCheck_visitBinaryOperator_2067533860990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268941;
     Object term269115;

    public TypeCheck_visitBinaryOperator_2067533860990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268941 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term269045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term268941, term268941.getClass(), "typeRegistry", term269045);
        term269115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term269185, term269185.getClass(), "jsType", null);
        setField(term269115, term269115.getClass(), "first", term269185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = term269115;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term268941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


