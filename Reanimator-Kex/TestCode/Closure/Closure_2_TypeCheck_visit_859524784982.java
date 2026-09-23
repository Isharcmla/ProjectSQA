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

public class TypeCheck_visit_859524784982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277316;
     Object term277490;

    public TypeCheck_visit_859524784982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277316 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term277420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term277316, term277316.getClass(), "typeRegistry", term277420);
        term277490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term277490, term277490.getClass(), "type", 25);
        setField(term277560, term277560.getClass(), "jsType", null);
        setField(term277490, term277490.getClass(), "first", term277560);
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
        args[1] = term277490;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term277316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


