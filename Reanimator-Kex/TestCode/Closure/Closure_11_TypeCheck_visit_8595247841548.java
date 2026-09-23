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

public class TypeCheck_visit_8595247841548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488171;
     Object term488435;

    public TypeCheck_visit_8595247841548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488171 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term488261 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term488365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term488171, term488171.getClass(), "validator", term488261);
        setField(term488171, term488171.getClass(), "typeRegistry", term488365);
        term488435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term488435, term488435.getClass(), "type", 51);
        setField(term488505, term488505.getClass(), "jsType", null);
        setField(term488435, term488435.getClass(), "last", term488505);
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
        args[1] = term488435;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term488171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


