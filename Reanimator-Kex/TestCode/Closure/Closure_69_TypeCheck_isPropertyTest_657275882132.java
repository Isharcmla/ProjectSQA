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

public class TypeCheck_isPropertyTest_657275882132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35926;
     Object term35996;
     Object term36268;
     Object term36269;

    public TypeCheck_isPropertyTest_657275882132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35926 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term35996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35996, term35996.getClass(), "parent", term35996);
        term36268 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term36268, term36268.getClass(), "compiler", null);
        setField(term36268, term36268.getClass(), "validator", null);
        setField(term36268, term36268.getClass(), "reverseInterpreter", null);
        setField(term36268, term36268.getClass(), "typeRegistry", null);
        setField(term36268, term36268.getClass(), "topScope", null);
        setField(term36268, term36268.getClass(), "scopeCreator", null);
        setField(term36268, term36268.getClass(), "reportMissingOverride", null);
        setField(term36268, term36268.getClass(), "reportUnknownTypes", null);
        setBooleanField(term36268, term36268.getClass(), "reportMissingProperties", false);
        setField(term36268, term36268.getClass(), "inferJSDocInfo", null);
        setIntField(term36268, term36268.getClass(), "typedCount", 0);
        setIntField(term36268, term36268.getClass(), "nullCount", 0);
        setIntField(term36268, term36268.getClass(), "unknownCount", 0);
        setBooleanField(term36268, term36268.getClass(), "inExterns", false);
        setIntField(term36268, term36268.getClass(), "noTypeCheckSection", 0);
        term36269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36269, term36269.getClass(), "type", 0);
        setField(term36269, term36269.getClass(), "next", null);
        setField(term36269, term36269.getClass(), "first", null);
        setField(term36269, term36269.getClass(), "last", null);
        setField(term36269, term36269.getClass(), "propListHead", null);
        setIntField(term36269, term36269.getClass(), "sourcePosition", 0);
        setField(term36269, term36269.getClass(), "jsType", null);
        setField(term36269, term36269.getClass(), "parent", term36269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35996;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term35926, args);
        assertTrue(recursiveEquals(term35926, term36268));
        assertTrue(recursiveEquals(term35996, term36269));
        assertTrue(recursiveEquals(retValue, false));
    }

};


