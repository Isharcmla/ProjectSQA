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

public class TypeCheck_visit_8595247841006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277093;
     Object term277275;

    public TypeCheck_visit_8595247841006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277093 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term277183 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term277093, term277093.getClass(), "validator", term277183);
        term277275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term277385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term277275, term277275.getClass(), "type", 103);
        setField(term277275, term277275.getClass(), "first", term277275);
        setField(term277275, term277275.getClass(), "jsType", term277385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term277275;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term277093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


