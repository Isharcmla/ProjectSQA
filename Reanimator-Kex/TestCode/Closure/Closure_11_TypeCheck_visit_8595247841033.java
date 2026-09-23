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

public class TypeCheck_visit_8595247841033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288369;
     Object term288633;

    public TypeCheck_visit_8595247841033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288369 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term288459 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term288563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term288369, term288369.getClass(), "validator", term288459);
        setField(term288369, term288369.getClass(), "typeRegistry", term288563);
        term288633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term288633, term288633.getClass(), "type", 28);
        setField(term288703, term288703.getClass(), "jsType", null);
        setField(term288633, term288633.getClass(), "first", term288703);
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
        args[1] = term288633;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term288369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


