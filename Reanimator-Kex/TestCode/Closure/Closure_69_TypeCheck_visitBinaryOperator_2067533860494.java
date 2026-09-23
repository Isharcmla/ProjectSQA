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

public class TypeCheck_visitBinaryOperator_2067533860494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151592;
     Object term151662;

    public TypeCheck_visitBinaryOperator_2067533860494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151592 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term151662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term151910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term151732, term151732.getClass(), "jsType", term151840);
        setField(term151662, term151662.getClass(), "first", term151732);
        setField(term151910, term151910.getClass(), "jsType", term152002);
        setField(term151662, term151662.getClass(), "last", term151910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 97;
        args[1] = null;
        args[2] = term151662;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term151592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


