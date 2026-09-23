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

public class TypeCheck_visit_8595247841612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540105;
     Object term540175;
     Object term540315;

    public TypeCheck_visit_8595247841612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540105 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term540175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term540175, term540175.getClass(), "type", 64);
        setField(term540175, term540175.getClass(), "jsType", null);
        setField(term540175, term540175.getClass(), "propListHead", null);
        setField(term540175, term540175.getClass(), "first", term540245);
        term540315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term540315, term540315.getClass(), "jsType", term540407);
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
        args[1] = term540175;
        args[2] = term540315;
        try {
            callMethod(klass, "visit", argTypes, term540105, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


