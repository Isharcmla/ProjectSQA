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

public class TypeCheck_visitGetElem_6621492841162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335045;
     Object term335205;

    public TypeCheck_visitGetElem_6621492841162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335045 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term335135 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term335045, term335045.getClass(), "validator", term335135);
        term335205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term335275, term335275.getClass(), "jsType", term335387);
        setField(term335205, term335205.getClass(), "first", term335275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term335205;
        try {
            callMethod(klass, "visitGetElem", argTypes, term335045, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


