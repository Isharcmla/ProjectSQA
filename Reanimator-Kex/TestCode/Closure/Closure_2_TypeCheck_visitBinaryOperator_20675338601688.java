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

public class TypeCheck_visitBinaryOperator_20675338601688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573169;
     Object term573239;

    public TypeCheck_visitBinaryOperator_20675338601688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573169 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term573239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term573309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term573413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term573483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term573573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term573309, term573309.getClass(), "jsType", term573413);
        setField(term573239, term573239.getClass(), "first", term573309);
        setField(term573483, term573483.getClass(), "jsType", term573573);
        setField(term573239, term573239.getClass(), "last", term573483);
        setIntField(term573239, term573239.getClass(), "type", 43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 92;
        args[1] = null;
        args[2] = term573239;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term573169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


