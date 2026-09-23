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

public class TypeCheck_visitBinaryOperator_20675338601665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537404;
     Object term537474;

    public TypeCheck_visitBinaryOperator_20675338601665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537404 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term537404, term537404.getClass(), "noTypeCheckSection", -1);
        term537474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term537708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term537544, term537544.getClass(), "jsType", term537638);
        setField(term537474, term537474.getClass(), "first", term537544);
        setField(term537708, term537708.getClass(), "jsType", term537804);
        setField(term537474, term537474.getClass(), "last", term537708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 39;
        args[1] = null;
        args[2] = term537474;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term537404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


