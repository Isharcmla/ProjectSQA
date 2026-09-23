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

public class TypeCheck_visit_8595247841274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382600;
     Object term382692;

    public TypeCheck_visit_8595247841274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382600 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term382692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term382988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term382692, term382692.getClass(), "type", 97);
        setIntField(term382784, term382784.getClass(), "type", 97);
        setField(term382784, term382784.getClass(), "jsType", term382896);
        setField(term382692, term382692.getClass(), "first", term382784);
        setField(term382692, term382692.getClass(), "last", term382988);
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
        args[1] = term382692;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term382600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


