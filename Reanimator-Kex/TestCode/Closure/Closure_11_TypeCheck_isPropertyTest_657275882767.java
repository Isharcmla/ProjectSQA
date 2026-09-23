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

public class TypeCheck_isPropertyTest_657275882767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194206;
     Object term194276;
     Object term194484;
     Object term194485;

    public TypeCheck_isPropertyTest_657275882767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194206 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term194276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term194276, term194276.getClass(), "parent", term194276);
        setIntField(term194276, term194276.getClass(), "type", 37);
        setField(term194276, term194276.getClass(), "first", term194276);
        term194484 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term194484, term194484.getClass(), "compiler", null);
        setField(term194484, term194484.getClass(), "validator", null);
        setField(term194484, term194484.getClass(), "reverseInterpreter", null);
        setField(term194484, term194484.getClass(), "typeRegistry", null);
        setField(term194484, term194484.getClass(), "topScope", null);
        setField(term194484, term194484.getClass(), "scopeCreator", null);
        setField(term194484, term194484.getClass(), "reportMissingOverride", null);
        setField(term194484, term194484.getClass(), "reportUnknownTypes", null);
        setBooleanField(term194484, term194484.getClass(), "reportMissingProperties", false);
        setField(term194484, term194484.getClass(), "inferJSDocInfo", null);
        setIntField(term194484, term194484.getClass(), "typedCount", 0);
        setIntField(term194484, term194484.getClass(), "nullCount", 0);
        setIntField(term194484, term194484.getClass(), "unknownCount", 0);
        setBooleanField(term194484, term194484.getClass(), "inExterns", false);
        setIntField(term194484, term194484.getClass(), "noTypeCheckSection", 0);
        term194485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term194485, term194485.getClass(), "type", 37);
        setField(term194485, term194485.getClass(), "next", null);
        setField(term194485, term194485.getClass(), "first", term194485);
        setField(term194485, term194485.getClass(), "last", null);
        setField(term194485, term194485.getClass(), "propListHead", null);
        setIntField(term194485, term194485.getClass(), "sourcePosition", 0);
        setField(term194485, term194485.getClass(), "jsType", null);
        setField(term194485, term194485.getClass(), "parent", term194485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term194276;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term194206, args);
        assertTrue(recursiveEquals(term194206, term194484));
        assertTrue(recursiveEquals(term194276, term194485));
        assertTrue(recursiveEquals(retValue, false));
    }

};


