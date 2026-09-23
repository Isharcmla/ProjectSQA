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

public class TypeCheck_visit_8595247841456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448318;
     Object term448514;

    public TypeCheck_visit_8595247841456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448318 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term448422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term448318, term448318.getClass(), "validator", null);
        setField(term448318, term448318.getClass(), "typeRegistry", term448422);
        term448514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term448606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term448514, term448514.getClass(), "type", 51);
        setField(term448606, term448606.getClass(), "jsType", null);
        setField(term448514, term448514.getClass(), "last", term448606);
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
        args[1] = term448514;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term448318, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


