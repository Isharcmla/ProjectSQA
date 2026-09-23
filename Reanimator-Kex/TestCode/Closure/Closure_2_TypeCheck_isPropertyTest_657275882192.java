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

public class TypeCheck_isPropertyTest_657275882192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47920;
     Object term47990;
     Object term48011;
     Object term48012;

    public TypeCheck_isPropertyTest_657275882192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47920 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47990, term47990.getClass(), "parent", term47990);
        setIntField(term47990, term47990.getClass(), "type", 108);
        term48011 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term48011, term48011.getClass(), "compiler", null);
        setField(term48011, term48011.getClass(), "validator", null);
        setField(term48011, term48011.getClass(), "reverseInterpreter", null);
        setField(term48011, term48011.getClass(), "typeRegistry", null);
        setField(term48011, term48011.getClass(), "topScope", null);
        setField(term48011, term48011.getClass(), "scopeCreator", null);
        setField(term48011, term48011.getClass(), "reportMissingOverride", null);
        setField(term48011, term48011.getClass(), "reportUnknownTypes", null);
        setBooleanField(term48011, term48011.getClass(), "reportMissingProperties", false);
        setField(term48011, term48011.getClass(), "inferJSDocInfo", null);
        setIntField(term48011, term48011.getClass(), "typedCount", 0);
        setIntField(term48011, term48011.getClass(), "nullCount", 0);
        setIntField(term48011, term48011.getClass(), "unknownCount", 0);
        setBooleanField(term48011, term48011.getClass(), "inExterns", false);
        setIntField(term48011, term48011.getClass(), "noTypeCheckSection", 0);
        term48012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48012, term48012.getClass(), "type", 108);
        setField(term48012, term48012.getClass(), "next", null);
        setField(term48012, term48012.getClass(), "first", null);
        setField(term48012, term48012.getClass(), "last", null);
        setField(term48012, term48012.getClass(), "propListHead", null);
        setIntField(term48012, term48012.getClass(), "sourcePosition", 0);
        setField(term48012, term48012.getClass(), "jsType", null);
        setField(term48012, term48012.getClass(), "parent", term48012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47990;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term47920, args);
        assertTrue(recursiveEquals(term47920, term48011));
        assertTrue(recursiveEquals(term47990, term48012));
        assertTrue(recursiveEquals(retValue, false));
    }

};


