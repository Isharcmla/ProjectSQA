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

public class TypeCheck_isPropertyTest_657275882592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160135;
     Object term160227;
     Object term160250;
     Object term160251;

    public TypeCheck_isPropertyTest_657275882592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160135 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term160227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term160227, term160227.getClass(), "parent", term160227);
        setIntField(term160227, term160227.getClass(), "type", 101);
        term160250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term160250, term160250.getClass(), "compiler", null);
        setField(term160250, term160250.getClass(), "validator", null);
        setField(term160250, term160250.getClass(), "reverseInterpreter", null);
        setField(term160250, term160250.getClass(), "typeRegistry", null);
        setField(term160250, term160250.getClass(), "topScope", null);
        setField(term160250, term160250.getClass(), "scopeCreator", null);
        setField(term160250, term160250.getClass(), "reportMissingOverride", null);
        setField(term160250, term160250.getClass(), "reportUnknownTypes", null);
        setBooleanField(term160250, term160250.getClass(), "reportMissingProperties", false);
        setField(term160250, term160250.getClass(), "inferJSDocInfo", null);
        setIntField(term160250, term160250.getClass(), "typedCount", 0);
        setIntField(term160250, term160250.getClass(), "nullCount", 0);
        setIntField(term160250, term160250.getClass(), "unknownCount", 0);
        setBooleanField(term160250, term160250.getClass(), "inExterns", false);
        setIntField(term160250, term160250.getClass(), "noTypeCheckSection", 0);
        term160251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term160251, term160251.getClass(), "number", 0.0);
        setIntField(term160251, term160251.getClass(), "type", 101);
        setField(term160251, term160251.getClass(), "next", null);
        setField(term160251, term160251.getClass(), "first", null);
        setField(term160251, term160251.getClass(), "last", null);
        setField(term160251, term160251.getClass(), "propListHead", null);
        setIntField(term160251, term160251.getClass(), "sourcePosition", 0);
        setField(term160251, term160251.getClass(), "jsType", null);
        setField(term160251, term160251.getClass(), "parent", term160251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term160227;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term160135, args);
        assertTrue(recursiveEquals(term160135, term160250));
        assertTrue(recursiveEquals(term160227, term160251));
        assertTrue(recursiveEquals(retValue, false));
    }

};


