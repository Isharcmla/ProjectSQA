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

public class TypeCheck_visit_8595247841600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506050;
     Object term506232;

    public TypeCheck_visit_8595247841600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506050 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term506140 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term506050, term506050.getClass(), "validator", term506140);
        term506232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term506324 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term506412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term506232, term506232.getClass(), "type", 28);
        setField(term506324, term506324.getClass(), "jsType", term506412);
        setField(term506232, term506232.getClass(), "first", term506324);
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
        args[1] = term506232;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term506050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


