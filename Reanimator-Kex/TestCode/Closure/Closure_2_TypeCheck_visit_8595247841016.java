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

public class TypeCheck_visit_8595247841016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286899;
     Object term287081;

    public TypeCheck_visit_8595247841016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286899 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term286989 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term286899, term286899.getClass(), "validator", term286989);
        term287081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term287177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setIntField(term287081, term287081.getClass(), "type", 29);
        setField(term287081, term287081.getClass(), "first", term287081);
        setField(term287081, term287081.getClass(), "jsType", term287177);
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
        args[1] = term287081;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term286899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


