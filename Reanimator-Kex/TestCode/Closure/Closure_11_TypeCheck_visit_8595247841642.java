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

public class TypeCheck_visit_8595247841642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528546;
     Object term528742;

    public TypeCheck_visit_8595247841642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528546 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term528650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term528546, term528546.getClass(), "typeRegistry", term528650);
        term528742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term528834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term528742, term528742.getClass(), "type", 87);
        setField(term528834, term528834.getClass(), "jsType", null);
        setField(term528742, term528742.getClass(), "first", term528834);
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
        args[1] = term528742;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term528546, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


