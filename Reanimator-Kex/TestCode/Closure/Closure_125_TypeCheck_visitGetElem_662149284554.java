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

public class TypeCheck_visitGetElem_662149284554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147081;
     Object term147345;

    public TypeCheck_visitGetElem_662149284554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147081 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term147171 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term147275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term147081, term147081.getClass(), "validator", term147171);
        setField(term147081, term147081.getClass(), "typeRegistry", term147275);
        term147345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term147415, term147415.getClass(), "jsType", null);
        setField(term147345, term147345.getClass(), "first", term147415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term147345;
        try {
            callMethod(klass, "visitGetElem", argTypes, term147081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


