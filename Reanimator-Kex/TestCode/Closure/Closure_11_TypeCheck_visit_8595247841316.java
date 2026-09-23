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

public class TypeCheck_visit_8595247841316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393873;
     Object term394069;

    public TypeCheck_visit_8595247841316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393873 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term393977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term393873, term393873.getClass(), "typeRegistry", term393977);
        term394069 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term394161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term394069, term394069.getClass(), "type", 93);
        setField(term394161, term394161.getClass(), "jsType", null);
        setField(term394069, term394069.getClass(), "first", term394161);
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
        args[1] = term394069;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term393873, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


