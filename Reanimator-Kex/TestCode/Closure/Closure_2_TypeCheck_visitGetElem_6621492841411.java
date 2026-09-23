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

public class TypeCheck_visitGetElem_6621492841411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445371;
     Object term445531;

    public TypeCheck_visitGetElem_6621492841411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445371 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term445461 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term445371, term445371.getClass(), "validator", term445461);
        term445531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term445781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term445601, term445601.getClass(), "jsType", term445711);
        setField(term445531, term445531.getClass(), "first", term445601);
        setField(term445531, term445531.getClass(), "last", term445781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term445531;
        try {
            callMethod(klass, "visitGetElem", argTypes, term445371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


