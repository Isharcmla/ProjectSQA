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

public class TypeCheck_visitAnnotatedAssignGetprop_1999267336478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145611;
     Object term145771;

    public TypeCheck_visitAnnotatedAssignGetprop_1999267336478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145611 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term145701 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term145611, term145611.getClass(), "validator", term145701);
        term145771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term145771, term145771.getClass(), "jsType", term145863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term145771;
        try {
            callMethod(klass, "visitAnnotatedAssignGetprop", argTypes, term145611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


