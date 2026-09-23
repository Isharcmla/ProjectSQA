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

public class TypeCheck_visitBinaryOperator_2067533860424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125762;
     Object term125832;

    public TypeCheck_visitBinaryOperator_2067533860424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125762 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term125832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term126072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term125902, term125902.getClass(), "jsType", term126002);
        setField(term125832, term125832.getClass(), "first", term125902);
        setField(term126072, term126072.getClass(), "jsType", term126176);
        setField(term125832, term125832.getClass(), "last", term126072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 40;
        args[1] = null;
        args[2] = term125832;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term125762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


