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

public class TypeCheck_visit_8595247841618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516382;
     Object term516556;

    public TypeCheck_visit_8595247841618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516382 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term516486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term516382, term516382.getClass(), "typeRegistry", term516486);
        term516556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term516556, term516556.getClass(), "type", 85);
        setField(term516626, term516626.getClass(), "jsType", null);
        setField(term516556, term516556.getClass(), "last", term516626);
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
        args[1] = term516556;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term516382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


