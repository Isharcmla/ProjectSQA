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

public class TypeCheck_visit_8595247841394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439174;
     Object term439266;

    public TypeCheck_visit_8595247841394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439174 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term439266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term439358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term439450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term439542 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term439266, term439266.getClass(), "type", 97);
        setIntField(term439358, term439358.getClass(), "type", 97);
        setField(term439358, term439358.getClass(), "jsType", term439450);
        setField(term439266, term439266.getClass(), "first", term439358);
        setField(term439266, term439266.getClass(), "last", term439542);
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
        args[1] = term439266;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term439174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


