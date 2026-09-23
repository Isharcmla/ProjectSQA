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

public class TypeCheck_visit_8595247841546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485938;
     Object term486134;

    public TypeCheck_visit_8595247841546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485938 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term486042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term485938, term485938.getClass(), "typeRegistry", term486042);
        term486134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term486226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term486134, term486134.getClass(), "type", 16);
        setField(term486226, term486226.getClass(), "jsType", null);
        setField(term486134, term486134.getClass(), "first", term486226);
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
        args[1] = term486134;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term485938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


