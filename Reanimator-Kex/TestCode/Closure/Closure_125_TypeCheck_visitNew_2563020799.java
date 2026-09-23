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

public class TypeCheck_visitNew_2563020799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8168;

    public TypeCheck_visitNew_2563020799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8168 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term8168, term8168.getClass(), "compiler", null);
        setField(term8168, term8168.getClass(), "validator", null);
        setField(term8168, term8168.getClass(), "reverseInterpreter", null);
        setField(term8168, term8168.getClass(), "typeRegistry", null);
        setField(term8168, term8168.getClass(), "topScope", null);
        setField(term8168, term8168.getClass(), "scopeCreator", null);
        setField(term8168, term8168.getClass(), "reportMissingOverride", null);
        setBooleanField(term8168, term8168.getClass(), "reportUnknownTypes", false);
        setBooleanField(term8168, term8168.getClass(), "reportMissingProperties", false);
        setField(term8168, term8168.getClass(), "inferJSDocInfo", null);
        setIntField(term8168, term8168.getClass(), "typedCount", 0);
        setIntField(term8168, term8168.getClass(), "nullCount", 0);
        setIntField(term8168, term8168.getClass(), "unknownCount", 0);
        setBooleanField(term8168, term8168.getClass(), "inExterns", false);
        setIntField(term8168, term8168.getClass(), "noTypeCheckSection", 0);
        setField(term8168, term8168.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "visitNew", argTypes, term8168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


