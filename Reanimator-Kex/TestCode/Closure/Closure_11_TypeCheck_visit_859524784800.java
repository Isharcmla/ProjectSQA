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

public class TypeCheck_visit_859524784800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206512;
     Object term206708;

    public TypeCheck_visit_859524784800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206512 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term206616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term206512, term206512.getClass(), "validator", null);
        setField(term206512, term206512.getClass(), "typeRegistry", term206616);
        term206708 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term206708, term206708.getClass(), "type", 103);
        setField(term206800, term206800.getClass(), "jsType", null);
        setField(term206708, term206708.getClass(), "first", term206800);
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
        args[1] = term206708;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term206512, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


