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

public class TypeCheck_isPropertyTest_657275882565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143165;
     Object term143257;
     Object term143469;
     Object term143470;

    public TypeCheck_isPropertyTest_657275882565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143165 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term143257 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term143257, term143257.getClass(), "parent", term143257);
        setIntField(term143257, term143257.getClass(), "type", 114);
        term143469 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term143469, term143469.getClass(), "compiler", null);
        setField(term143469, term143469.getClass(), "validator", null);
        setField(term143469, term143469.getClass(), "reverseInterpreter", null);
        setField(term143469, term143469.getClass(), "typeRegistry", null);
        setField(term143469, term143469.getClass(), "topScope", null);
        setField(term143469, term143469.getClass(), "scopeCreator", null);
        setField(term143469, term143469.getClass(), "reportMissingOverride", null);
        setField(term143469, term143469.getClass(), "reportUnknownTypes", null);
        setBooleanField(term143469, term143469.getClass(), "reportMissingProperties", false);
        setField(term143469, term143469.getClass(), "inferJSDocInfo", null);
        setIntField(term143469, term143469.getClass(), "typedCount", 0);
        setIntField(term143469, term143469.getClass(), "nullCount", 0);
        setIntField(term143469, term143469.getClass(), "unknownCount", 0);
        setBooleanField(term143469, term143469.getClass(), "inExterns", false);
        setIntField(term143469, term143469.getClass(), "noTypeCheckSection", 0);
        term143470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term143470, term143470.getClass(), "number", 0.0);
        setIntField(term143470, term143470.getClass(), "type", 114);
        setField(term143470, term143470.getClass(), "next", null);
        setField(term143470, term143470.getClass(), "first", null);
        setField(term143470, term143470.getClass(), "last", null);
        setField(term143470, term143470.getClass(), "propListHead", null);
        setIntField(term143470, term143470.getClass(), "sourcePosition", 0);
        setField(term143470, term143470.getClass(), "jsType", null);
        setField(term143470, term143470.getClass(), "parent", term143470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143257;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term143165, args);
        assertTrue(recursiveEquals(term143165, term143469));
        assertTrue(recursiveEquals(term143257, term143470));
        assertTrue(recursiveEquals(retValue, false));
    }

};


