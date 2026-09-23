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

public class TypeCheck_visit_8595247841428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452536;
     Object term452606;

    public TypeCheck_visit_8595247841428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452536 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term452606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term452854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term452606, term452606.getClass(), "type", 12);
        setIntField(term452676, term452676.getClass(), "type", 134217740);
        setField(term452676, term452676.getClass(), "jsType", term452784);
        setField(term452606, term452606.getClass(), "first", term452676);
        setIntField(term452854, term452854.getClass(), "type", -135584781);
        setField(term452854, term452854.getClass(), "jsType", term452784);
        setField(term452606, term452606.getClass(), "last", term452854);
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
        args[1] = term452606;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term452536, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


