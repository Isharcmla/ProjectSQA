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

public class TypeCheck_isPropertyTest_657275882202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49457;
     Object term49527;
     Object term49547;
     Object term49548;

    public TypeCheck_isPropertyTest_657275882202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49457 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term49527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49527, term49527.getClass(), "parent", term49527);
        setIntField(term49527, term49527.getClass(), "type", 101);
        term49547 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term49547, term49547.getClass(), "compiler", null);
        setField(term49547, term49547.getClass(), "validator", null);
        setField(term49547, term49547.getClass(), "reverseInterpreter", null);
        setField(term49547, term49547.getClass(), "typeRegistry", null);
        setField(term49547, term49547.getClass(), "topScope", null);
        setField(term49547, term49547.getClass(), "scopeCreator", null);
        setField(term49547, term49547.getClass(), "reportMissingOverride", null);
        setField(term49547, term49547.getClass(), "reportUnknownTypes", null);
        setBooleanField(term49547, term49547.getClass(), "reportMissingProperties", false);
        setField(term49547, term49547.getClass(), "inferJSDocInfo", null);
        setIntField(term49547, term49547.getClass(), "typedCount", 0);
        setIntField(term49547, term49547.getClass(), "nullCount", 0);
        setIntField(term49547, term49547.getClass(), "unknownCount", 0);
        setBooleanField(term49547, term49547.getClass(), "inExterns", false);
        setIntField(term49547, term49547.getClass(), "noTypeCheckSection", 0);
        term49548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49548, term49548.getClass(), "type", 101);
        setField(term49548, term49548.getClass(), "next", null);
        setField(term49548, term49548.getClass(), "first", null);
        setField(term49548, term49548.getClass(), "last", null);
        setField(term49548, term49548.getClass(), "propListHead", null);
        setIntField(term49548, term49548.getClass(), "sourcePosition", 0);
        setField(term49548, term49548.getClass(), "jsType", null);
        setField(term49548, term49548.getClass(), "parent", term49548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49527;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term49457, args);
        assertTrue(recursiveEquals(term49457, term49547));
        assertTrue(recursiveEquals(term49527, term49548));
        assertTrue(recursiveEquals(retValue, false));
    }

};


