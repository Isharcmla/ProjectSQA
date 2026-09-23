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

public class TypeCheck_isPropertyTest_657275882324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79779;
     Object term79849;
     Object term80124;
     Object term80125;

    public TypeCheck_isPropertyTest_657275882324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79779 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term79849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79849, term79849.getClass(), "parent", term79849);
        setIntField(term79849, term79849.getClass(), "type", 101);
        term80124 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term80124, term80124.getClass(), "compiler", null);
        setField(term80124, term80124.getClass(), "validator", null);
        setField(term80124, term80124.getClass(), "reverseInterpreter", null);
        setField(term80124, term80124.getClass(), "typeRegistry", null);
        setField(term80124, term80124.getClass(), "topScope", null);
        setField(term80124, term80124.getClass(), "scopeCreator", null);
        setField(term80124, term80124.getClass(), "reportMissingOverride", null);
        setField(term80124, term80124.getClass(), "reportUnknownTypes", null);
        setBooleanField(term80124, term80124.getClass(), "reportMissingProperties", false);
        setField(term80124, term80124.getClass(), "inferJSDocInfo", null);
        setIntField(term80124, term80124.getClass(), "typedCount", 0);
        setIntField(term80124, term80124.getClass(), "nullCount", 0);
        setIntField(term80124, term80124.getClass(), "unknownCount", 0);
        setBooleanField(term80124, term80124.getClass(), "inExterns", false);
        setIntField(term80124, term80124.getClass(), "noTypeCheckSection", 0);
        term80125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80125, term80125.getClass(), "type", 101);
        setField(term80125, term80125.getClass(), "next", null);
        setField(term80125, term80125.getClass(), "first", null);
        setField(term80125, term80125.getClass(), "last", null);
        setField(term80125, term80125.getClass(), "propListHead", null);
        setIntField(term80125, term80125.getClass(), "sourcePosition", 0);
        setField(term80125, term80125.getClass(), "jsType", null);
        setField(term80125, term80125.getClass(), "parent", term80125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79849;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term79779, args);
        assertTrue(recursiveEquals(term79779, term80124));
        assertTrue(recursiveEquals(term79849, term80125));
        assertTrue(recursiveEquals(retValue, false));
    }

};


