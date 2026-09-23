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

public class TypeCheck_visit_8595247841265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373328;
     Object term373524;

    public TypeCheck_visit_8595247841265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373328 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term373432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term373328, term373328.getClass(), "typeRegistry", term373432);
        term373524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term373616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term373524, term373524.getClass(), "type", 27);
        setField(term373616, term373616.getClass(), "jsType", null);
        setField(term373524, term373524.getClass(), "first", term373616);
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
        args[1] = term373524;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term373328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


