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
import java.lang.Integer;

public class TypeCheck_visitBinaryOperator_206753386099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10064;
     Object term10071;

    public TypeCheck_visitBinaryOperator_206753386099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10064 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term10064, term10064.getClass(), "compiler", null);
        setField(term10064, term10064.getClass(), "validator", null);
        setField(term10064, term10064.getClass(), "reverseInterpreter", null);
        setField(term10064, term10064.getClass(), "typeRegistry", null);
        setField(term10064, term10064.getClass(), "topScope", null);
        setField(term10064, term10064.getClass(), "scopeCreator", null);
        setField(term10064, term10064.getClass(), "reportMissingOverride", null);
        setField(term10064, term10064.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10064, term10064.getClass(), "reportMissingProperties", false);
        setField(term10064, term10064.getClass(), "inferJSDocInfo", null);
        setIntField(term10064, term10064.getClass(), "typedCount", 0);
        setIntField(term10064, term10064.getClass(), "nullCount", 0);
        setIntField(term10064, term10064.getClass(), "unknownCount", 0);
        setBooleanField(term10064, term10064.getClass(), "inExterns", false);
        setIntField(term10064, term10064.getClass(), "noTypeCheckSection", 0);
        term10071 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term10071;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term10064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


