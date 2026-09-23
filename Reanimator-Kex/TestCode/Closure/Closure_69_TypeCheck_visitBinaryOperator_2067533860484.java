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

public class TypeCheck_visitBinaryOperator_2067533860484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146855;
     Object term146925;

    public TypeCheck_visitBinaryOperator_2067533860484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146855 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term146925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term147155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term146995, term146995.getClass(), "jsType", term147085);
        setField(term146925, term146925.getClass(), "first", term146995);
        setField(term147155, term147155.getClass(), "jsType", term147249);
        setField(term146925, term146925.getClass(), "last", term147155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 71;
        args[1] = null;
        args[2] = term146925;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term146855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


