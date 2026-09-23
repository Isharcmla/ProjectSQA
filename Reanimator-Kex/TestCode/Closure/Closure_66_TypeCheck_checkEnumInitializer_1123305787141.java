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

public class TypeCheck_checkEnumInitializer_1123305787141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36898;
     Object term36968;
     Object term37147;
     Object term37148;

    public TypeCheck_checkEnumInitializer_1123305787141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36898 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term36968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36968, term36968.getClass(), "type", 64);
        term37147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term37147, term37147.getClass(), "compiler", null);
        setField(term37147, term37147.getClass(), "validator", null);
        setField(term37147, term37147.getClass(), "reverseInterpreter", null);
        setField(term37147, term37147.getClass(), "typeRegistry", null);
        setField(term37147, term37147.getClass(), "topScope", null);
        setField(term37147, term37147.getClass(), "scopeCreator", null);
        setField(term37147, term37147.getClass(), "reportMissingOverride", null);
        setField(term37147, term37147.getClass(), "reportUnknownTypes", null);
        setBooleanField(term37147, term37147.getClass(), "reportMissingProperties", false);
        setField(term37147, term37147.getClass(), "inferJSDocInfo", null);
        setIntField(term37147, term37147.getClass(), "typedCount", 0);
        setIntField(term37147, term37147.getClass(), "nullCount", 0);
        setIntField(term37147, term37147.getClass(), "unknownCount", 0);
        setBooleanField(term37147, term37147.getClass(), "inExterns", false);
        setIntField(term37147, term37147.getClass(), "noTypeCheckSection", 0);
        term37148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37148, term37148.getClass(), "type", 64);
        setField(term37148, term37148.getClass(), "next", null);
        setField(term37148, term37148.getClass(), "first", null);
        setField(term37148, term37148.getClass(), "last", null);
        setField(term37148, term37148.getClass(), "propListHead", null);
        setIntField(term37148, term37148.getClass(), "sourcePosition", 0);
        setField(term37148, term37148.getClass(), "jsType", null);
        setField(term37148, term37148.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term36968;
        args[2] = null;
        callMethod(klass, "checkEnumInitializer", argTypes, term36898, args);
        assertTrue(recursiveEquals(term36898, term37147));
        assertTrue(recursiveEquals(term36968, null));
    }

};


