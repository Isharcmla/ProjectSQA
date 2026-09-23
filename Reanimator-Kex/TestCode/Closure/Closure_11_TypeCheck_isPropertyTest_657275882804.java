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

public class TypeCheck_isPropertyTest_657275882804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207352;
     Object term207422;
     Object term207704;
     Object term207705;

    public TypeCheck_isPropertyTest_657275882804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207352 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term207422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term207422, term207422.getClass(), "parent", term207422);
        setIntField(term207422, term207422.getClass(), "type", 98);
        setField(term207422, term207422.getClass(), "first", term207422);
        term207704 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term207704, term207704.getClass(), "compiler", null);
        setField(term207704, term207704.getClass(), "validator", null);
        setField(term207704, term207704.getClass(), "reverseInterpreter", null);
        setField(term207704, term207704.getClass(), "typeRegistry", null);
        setField(term207704, term207704.getClass(), "topScope", null);
        setField(term207704, term207704.getClass(), "scopeCreator", null);
        setField(term207704, term207704.getClass(), "reportMissingOverride", null);
        setField(term207704, term207704.getClass(), "reportUnknownTypes", null);
        setBooleanField(term207704, term207704.getClass(), "reportMissingProperties", false);
        setField(term207704, term207704.getClass(), "inferJSDocInfo", null);
        setIntField(term207704, term207704.getClass(), "typedCount", 0);
        setIntField(term207704, term207704.getClass(), "nullCount", 0);
        setIntField(term207704, term207704.getClass(), "unknownCount", 0);
        setBooleanField(term207704, term207704.getClass(), "inExterns", false);
        setIntField(term207704, term207704.getClass(), "noTypeCheckSection", 0);
        term207705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term207705, term207705.getClass(), "type", 98);
        setField(term207705, term207705.getClass(), "next", null);
        setField(term207705, term207705.getClass(), "first", term207705);
        setField(term207705, term207705.getClass(), "last", null);
        setField(term207705, term207705.getClass(), "propListHead", null);
        setIntField(term207705, term207705.getClass(), "sourcePosition", 0);
        setField(term207705, term207705.getClass(), "jsType", null);
        setField(term207705, term207705.getClass(), "parent", term207705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term207422;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term207352, args);
        assertTrue(recursiveEquals(term207352, term207704));
        assertTrue(recursiveEquals(term207422, term207705));
        assertTrue(recursiveEquals(retValue, true));
    }

};


