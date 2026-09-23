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

public class TypeCheck_visit_859524784435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118612;
     Object term118682;

    public TypeCheck_visit_859524784435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118612 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term118682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term118916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term118682, term118682.getClass(), "type", 95);
        setField(term118752, term118752.getClass(), "jsType", term118846);
        setField(term118682, term118682.getClass(), "first", term118752);
        setField(term118682, term118682.getClass(), "last", term118916);
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
        args[1] = term118682;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term118612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


