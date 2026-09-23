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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeCheck_visitName_1546932345262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115848;
     Object term115918;
     Object term116871;
     Object term116872;

    public TypeCheck_visitName_1546932345262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115848 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term115918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115918, term115918.getClass(), "type", 83);
        term116871 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term116871, term116871.getClass(), "compiler", null);
        setField(term116871, term116871.getClass(), "validator", null);
        setField(term116871, term116871.getClass(), "reverseInterpreter", null);
        setField(term116871, term116871.getClass(), "typeRegistry", null);
        setField(term116871, term116871.getClass(), "topScope", null);
        setField(term116871, term116871.getClass(), "scopeCreator", null);
        setField(term116871, term116871.getClass(), "reportMissingOverride", null);
        setField(term116871, term116871.getClass(), "reportUnknownTypes", null);
        setBooleanField(term116871, term116871.getClass(), "reportMissingProperties", false);
        setField(term116871, term116871.getClass(), "inferJSDocInfo", null);
        setIntField(term116871, term116871.getClass(), "typedCount", 0);
        setIntField(term116871, term116871.getClass(), "nullCount", 0);
        setIntField(term116871, term116871.getClass(), "unknownCount", 0);
        setBooleanField(term116871, term116871.getClass(), "inExterns", false);
        setIntField(term116871, term116871.getClass(), "noTypeCheckSection", 0);
        term116872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116872, term116872.getClass(), "type", 83);
        setField(term116872, term116872.getClass(), "next", null);
        setField(term116872, term116872.getClass(), "first", null);
        setField(term116872, term116872.getClass(), "last", null);
        setField(term116872, term116872.getClass(), "propListHead", null);
        setIntField(term116872, term116872.getClass(), "sourcePosition", 0);
        setField(term116872, term116872.getClass(), "jsType", null);
        setField(term116872, term116872.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term115918;
        Object retValue = callMethod(klass, "visitName", argTypes, term115848, args);
        assertTrue(recursiveEquals(term115848, term116871));
        assertTrue(recursiveEquals(term115918, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


