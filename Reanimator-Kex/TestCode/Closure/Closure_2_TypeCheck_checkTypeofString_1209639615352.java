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

public class TypeCheck_checkTypeofString_1209639615352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85202;
     Object term85534;

    public TypeCheck_checkTypeofString_1209639615352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85202 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term85534 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term85534, term85534.getClass(), "compiler", null);
        setField(term85534, term85534.getClass(), "validator", null);
        setField(term85534, term85534.getClass(), "reverseInterpreter", null);
        setField(term85534, term85534.getClass(), "typeRegistry", null);
        setField(term85534, term85534.getClass(), "topScope", null);
        setField(term85534, term85534.getClass(), "scopeCreator", null);
        setField(term85534, term85534.getClass(), "reportMissingOverride", null);
        setField(term85534, term85534.getClass(), "reportUnknownTypes", null);
        setBooleanField(term85534, term85534.getClass(), "reportMissingProperties", false);
        setField(term85534, term85534.getClass(), "inferJSDocInfo", null);
        setIntField(term85534, term85534.getClass(), "typedCount", 0);
        setIntField(term85534, term85534.getClass(), "nullCount", 0);
        setIntField(term85534, term85534.getClass(), "unknownCount", 0);
        setBooleanField(term85534, term85534.getClass(), "inExterns", false);
        setIntField(term85534, term85534.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = "unknown";
        callMethod(klass, "checkTypeofString", argTypes, term85202, args);
        assertTrue(recursiveEquals(term85202, term85534));
    }

};


