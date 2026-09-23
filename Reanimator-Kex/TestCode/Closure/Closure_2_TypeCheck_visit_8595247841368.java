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

public class TypeCheck_visit_8595247841368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421133;
     Object term421307;

    public TypeCheck_visit_8595247841368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421133 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term421237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term421133, term421133.getClass(), "typeRegistry", term421237);
        term421307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term421377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term421487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term421307, term421307.getClass(), "type", 89);
        setIntField(term421377, term421377.getClass(), "type", 0);
        setField(term421377, term421377.getClass(), "jsType", term421487);
        setField(term421307, term421307.getClass(), "first", term421377);
        setField(term421307, term421307.getClass(), "last", term421307);
        setField(term421307, term421307.getClass(), "jsType", null);
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
        args[1] = term421307;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term421133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


