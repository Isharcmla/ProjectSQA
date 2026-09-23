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

public class TypeCheck_visit_8595247841464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452629;
     Object term452825;
     Object term452917;

    public TypeCheck_visit_8595247841464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452629 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term452733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term452629, term452629.getClass(), "typeRegistry", term452733);
        term452825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term452825, term452825.getClass(), "type", 38);
        setField(term452825, term452825.getClass(), "jsType", null);
        term452917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term452917, term452917.getClass(), "type", 0);
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
        args[1] = term452825;
        args[2] = term452917;
        try {
            callMethod(klass, "visit", argTypes, term452629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


