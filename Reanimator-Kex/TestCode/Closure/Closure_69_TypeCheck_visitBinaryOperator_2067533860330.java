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

public class TypeCheck_visitBinaryOperator_2067533860330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92593;
     Object term92663;

    public TypeCheck_visitBinaryOperator_2067533860330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92593 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term92663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term92911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term92733, term92733.getClass(), "jsType", term92841);
        setField(term92663, term92663.getClass(), "first", term92733);
        setField(term92911, term92911.getClass(), "jsType", term93001);
        setField(term92663, term92663.getClass(), "last", term92911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 36;
        args[1] = null;
        args[2] = term92663;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term92593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


