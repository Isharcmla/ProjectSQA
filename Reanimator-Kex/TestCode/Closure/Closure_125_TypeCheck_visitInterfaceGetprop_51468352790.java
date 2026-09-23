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

public class TypeCheck_visitInterfaceGetprop_51468352790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6990;

    public TypeCheck_visitInterfaceGetprop_51468352790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6990 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term6990, term6990.getClass(), "compiler", null);
        setField(term6990, term6990.getClass(), "validator", null);
        setField(term6990, term6990.getClass(), "reverseInterpreter", null);
        setField(term6990, term6990.getClass(), "typeRegistry", null);
        setField(term6990, term6990.getClass(), "topScope", null);
        setField(term6990, term6990.getClass(), "scopeCreator", null);
        setField(term6990, term6990.getClass(), "reportMissingOverride", null);
        setBooleanField(term6990, term6990.getClass(), "reportUnknownTypes", false);
        setBooleanField(term6990, term6990.getClass(), "reportMissingProperties", false);
        setField(term6990, term6990.getClass(), "inferJSDocInfo", null);
        setIntField(term6990, term6990.getClass(), "typedCount", 0);
        setIntField(term6990, term6990.getClass(), "nullCount", 0);
        setIntField(term6990, term6990.getClass(), "unknownCount", 0);
        setBooleanField(term6990, term6990.getClass(), "inExterns", false);
        setIntField(term6990, term6990.getClass(), "noTypeCheckSection", 0);
        setField(term6990, term6990.getClass(), "editDistance", null);
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
            callMethod(klass, "visitInterfaceGetprop", argTypes, term6990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


