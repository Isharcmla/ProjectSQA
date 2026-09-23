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

public class TypeCheck_visitBinaryOperator_20675338601601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534303;
     Object term534373;

    public TypeCheck_visitBinaryOperator_20675338601601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534303 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term534373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term534443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term534539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term534609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term534717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term534443, term534443.getClass(), "jsType", term534539);
        setField(term534373, term534373.getClass(), "first", term534443);
        setField(term534609, term534609.getClass(), "jsType", term534717);
        setField(term534373, term534373.getClass(), "last", term534609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 40;
        args[1] = null;
        args[2] = term534373;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term534303, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


