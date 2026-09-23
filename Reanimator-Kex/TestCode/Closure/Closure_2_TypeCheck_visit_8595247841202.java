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

public class TypeCheck_visit_8595247841202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353654;
     Object term353940;

    public TypeCheck_visit_8595247841202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353654 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term353744 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term353848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term353654, term353654.getClass(), "validator", term353744);
        setField(term353654, term353654.getClass(), "typeRegistry", term353848);
        term353940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term354032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term354128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setIntField(term353940, term353940.getClass(), "type", 29);
        setField(term354032, term354032.getClass(), "jsType", term354128);
        setField(term353940, term353940.getClass(), "first", term354032);
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
        args[1] = term353940;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term353654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


