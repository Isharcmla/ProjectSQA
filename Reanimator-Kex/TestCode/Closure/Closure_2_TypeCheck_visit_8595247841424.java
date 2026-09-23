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

public class TypeCheck_visit_8595247841424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451412;
     Object term451608;

    public TypeCheck_visit_8595247841424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451412 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term451516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term451412, term451412.getClass(), "typeRegistry", term451516);
        term451608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term451700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term451608, term451608.getClass(), "type", 27);
        setField(term451700, term451700.getClass(), "jsType", null);
        setField(term451608, term451608.getClass(), "first", term451700);
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
        args[1] = term451608;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term451412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


