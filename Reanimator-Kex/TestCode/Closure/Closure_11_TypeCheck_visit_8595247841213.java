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

public class TypeCheck_visit_8595247841213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351626;
     Object term351718;
     Object term351916;

    public TypeCheck_visit_8595247841213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351626 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term351718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term351718, term351718.getClass(), "type", 38);
        setField(term351718, term351718.getClass(), "jsType", term351824);
        term351916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term351916, term351916.getClass(), "type", 38);
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
        args[1] = term351718;
        args[2] = term351916;
        try {
            callMethod(klass, "visit", argTypes, term351626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


