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

public class TypeCheck_visit_8595247841548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512270;
     Object term512466;

    public TypeCheck_visit_8595247841548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512270 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term512374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term512270, term512270.getClass(), "typeRegistry", term512374);
        term512466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term512558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term512466, term512466.getClass(), "type", 16);
        setField(term512558, term512558.getClass(), "jsType", null);
        setField(term512466, term512466.getClass(), "first", term512558);
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
        args[1] = term512466;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term512270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


