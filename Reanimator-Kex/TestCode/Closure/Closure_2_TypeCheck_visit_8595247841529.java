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

public class TypeCheck_visit_8595247841529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502143;
     Object term502317;

    public TypeCheck_visit_8595247841529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term502143 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term502247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term502143, term502143.getClass(), "typeRegistry", term502247);
        term502317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term502549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term502317, term502317.getClass(), "type", 45);
        setIntField(term502387, term502387.getClass(), "type", 0);
        setField(term502387, term502387.getClass(), "jsType", term502479);
        setField(term502317, term502317.getClass(), "first", term502387);
        setIntField(term502549, term502549.getClass(), "type", 0);
        setField(term502549, term502549.getClass(), "jsType", null);
        setField(term502317, term502317.getClass(), "last", term502549);
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
        args[1] = term502317;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term502143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


