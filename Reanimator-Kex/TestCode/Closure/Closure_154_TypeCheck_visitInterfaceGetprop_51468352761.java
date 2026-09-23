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

public class TypeCheck_visitInterfaceGetprop_51468352761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5301;

    public TypeCheck_visitInterfaceGetprop_51468352761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5301 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term5301, term5301.getClass(), "compiler", null);
        setField(term5301, term5301.getClass(), "validator", null);
        setField(term5301, term5301.getClass(), "reverseInterpreter", null);
        setField(term5301, term5301.getClass(), "typeRegistry", null);
        setField(term5301, term5301.getClass(), "topScope", null);
        setField(term5301, term5301.getClass(), "scopeCreator", null);
        setField(term5301, term5301.getClass(), "reportMissingOverride", null);
        setField(term5301, term5301.getClass(), "reportUnknownTypes", null);
        setBooleanField(term5301, term5301.getClass(), "reportMissingProperties", false);
        setField(term5301, term5301.getClass(), "inferJSDocInfo", null);
        setIntField(term5301, term5301.getClass(), "typedCount", 0);
        setIntField(term5301, term5301.getClass(), "nullCount", 0);
        setIntField(term5301, term5301.getClass(), "unknownCount", 0);
        setBooleanField(term5301, term5301.getClass(), "inExterns", false);
        setIntField(term5301, term5301.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "visitInterfaceGetprop", argTypes, term5301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


