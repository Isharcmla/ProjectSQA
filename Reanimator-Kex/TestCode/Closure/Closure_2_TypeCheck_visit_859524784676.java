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

public class TypeCheck_visit_859524784676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181875;
     Object term181945;

    public TypeCheck_visit_859524784676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181875 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term181945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setIntField(term181945, term181945.getClass(), "type", 97);
        setIntField(term182015, term182015.getClass(), "type", 97);
        setField(term182015, term182015.getClass(), "jsType", term182125);
        setField(term181945, term181945.getClass(), "first", term182015);
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
        args[1] = term181945;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term181875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


