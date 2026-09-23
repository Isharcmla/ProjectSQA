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

public class TypeCheck_isPropertyTest_6572758821668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566443;
     Object term566535;
     Object term566561;
     Object term566562;

    public TypeCheck_isPropertyTest_6572758821668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566443 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term566535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term566535, term566535.getClass(), "parent", term566535);
        setIntField(term566535, term566535.getClass(), "type", 26);
        term566561 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term566561, term566561.getClass(), "compiler", null);
        setField(term566561, term566561.getClass(), "validator", null);
        setField(term566561, term566561.getClass(), "reverseInterpreter", null);
        setField(term566561, term566561.getClass(), "typeRegistry", null);
        setField(term566561, term566561.getClass(), "topScope", null);
        setField(term566561, term566561.getClass(), "scopeCreator", null);
        setField(term566561, term566561.getClass(), "reportMissingOverride", null);
        setField(term566561, term566561.getClass(), "reportUnknownTypes", null);
        setBooleanField(term566561, term566561.getClass(), "reportMissingProperties", false);
        setField(term566561, term566561.getClass(), "inferJSDocInfo", null);
        setIntField(term566561, term566561.getClass(), "typedCount", 0);
        setIntField(term566561, term566561.getClass(), "nullCount", 0);
        setIntField(term566561, term566561.getClass(), "unknownCount", 0);
        setBooleanField(term566561, term566561.getClass(), "inExterns", false);
        setIntField(term566561, term566561.getClass(), "noTypeCheckSection", 0);
        term566562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term566562, term566562.getClass(), "str", null);
        setIntField(term566562, term566562.getClass(), "type", 26);
        setField(term566562, term566562.getClass(), "next", null);
        setField(term566562, term566562.getClass(), "first", null);
        setField(term566562, term566562.getClass(), "last", null);
        setField(term566562, term566562.getClass(), "propListHead", null);
        setIntField(term566562, term566562.getClass(), "sourcePosition", 0);
        setField(term566562, term566562.getClass(), "jsType", null);
        setField(term566562, term566562.getClass(), "parent", term566562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term566535;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term566443, args);
        assertTrue(recursiveEquals(term566443, term566561));
        assertTrue(recursiveEquals(term566535, term566562));
        assertTrue(recursiveEquals(retValue, false));
    }

};


