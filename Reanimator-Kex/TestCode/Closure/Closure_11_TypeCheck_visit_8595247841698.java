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

public class TypeCheck_visit_8595247841698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550084;
     Object term550266;

    public TypeCheck_visit_8595247841698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550084 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term550174 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term550084, term550084.getClass(), "validator", term550174);
        term550266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term550358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term550450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term550554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term550266, term550266.getClass(), "type", 52);
        setField(term550358, term550358.getClass(), "jsType", null);
        setField(term550266, term550266.getClass(), "first", term550358);
        setField(term550450, term550450.getClass(), "jsType", term550554);
        setField(term550266, term550266.getClass(), "last", term550450);
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
        args[1] = term550266;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term550084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


