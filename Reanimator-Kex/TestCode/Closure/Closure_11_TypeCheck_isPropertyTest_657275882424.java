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

public class TypeCheck_isPropertyTest_657275882424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101617;
     Object term101687;
     Object term101708;
     Object term101709;

    public TypeCheck_isPropertyTest_657275882424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101617 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term101687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101687, term101687.getClass(), "parent", term101687);
        setIntField(term101687, term101687.getClass(), "type", 108);
        term101708 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term101708, term101708.getClass(), "compiler", null);
        setField(term101708, term101708.getClass(), "validator", null);
        setField(term101708, term101708.getClass(), "reverseInterpreter", null);
        setField(term101708, term101708.getClass(), "typeRegistry", null);
        setField(term101708, term101708.getClass(), "topScope", null);
        setField(term101708, term101708.getClass(), "scopeCreator", null);
        setField(term101708, term101708.getClass(), "reportMissingOverride", null);
        setField(term101708, term101708.getClass(), "reportUnknownTypes", null);
        setBooleanField(term101708, term101708.getClass(), "reportMissingProperties", false);
        setField(term101708, term101708.getClass(), "inferJSDocInfo", null);
        setIntField(term101708, term101708.getClass(), "typedCount", 0);
        setIntField(term101708, term101708.getClass(), "nullCount", 0);
        setIntField(term101708, term101708.getClass(), "unknownCount", 0);
        setBooleanField(term101708, term101708.getClass(), "inExterns", false);
        setIntField(term101708, term101708.getClass(), "noTypeCheckSection", 0);
        term101709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101709, term101709.getClass(), "type", 108);
        setField(term101709, term101709.getClass(), "next", null);
        setField(term101709, term101709.getClass(), "first", null);
        setField(term101709, term101709.getClass(), "last", null);
        setField(term101709, term101709.getClass(), "propListHead", null);
        setIntField(term101709, term101709.getClass(), "sourcePosition", 0);
        setField(term101709, term101709.getClass(), "jsType", null);
        setField(term101709, term101709.getClass(), "parent", term101709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term101687;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term101617, args);
        assertTrue(recursiveEquals(term101617, term101708));
        assertTrue(recursiveEquals(term101687, term101709));
        assertTrue(recursiveEquals(retValue, false));
    }

};


