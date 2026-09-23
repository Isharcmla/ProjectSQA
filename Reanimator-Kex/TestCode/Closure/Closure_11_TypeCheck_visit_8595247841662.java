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

public class TypeCheck_visit_8595247841662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536470;
     Object term536756;

    public TypeCheck_visit_8595247841662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536470 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term536560 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term536664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term536470, term536470.getClass(), "validator", term536560);
        setField(term536470, term536470.getClass(), "typeRegistry", term536664);
        term536756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term536848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term536936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term536756, term536756.getClass(), "type", 28);
        setField(term536848, term536848.getClass(), "jsType", term536936);
        setField(term536756, term536756.getClass(), "first", term536848);
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
        args[1] = term536756;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term536470, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


