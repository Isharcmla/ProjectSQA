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

public class TypeCheck_isPropertyTest_657275882274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67396;
     Object term67466;
     Object term67485;
     Object term67486;

    public TypeCheck_isPropertyTest_657275882274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67396 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term67466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67466, term67466.getClass(), "parent", term67466);
        setIntField(term67466, term67466.getClass(), "type", 52);
        term67485 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term67485, term67485.getClass(), "compiler", null);
        setField(term67485, term67485.getClass(), "validator", null);
        setField(term67485, term67485.getClass(), "reverseInterpreter", null);
        setField(term67485, term67485.getClass(), "typeRegistry", null);
        setField(term67485, term67485.getClass(), "topScope", null);
        setField(term67485, term67485.getClass(), "scopeCreator", null);
        setField(term67485, term67485.getClass(), "reportMissingOverride", null);
        setField(term67485, term67485.getClass(), "reportUnknownTypes", null);
        setBooleanField(term67485, term67485.getClass(), "reportMissingProperties", false);
        setField(term67485, term67485.getClass(), "inferJSDocInfo", null);
        setIntField(term67485, term67485.getClass(), "typedCount", 0);
        setIntField(term67485, term67485.getClass(), "nullCount", 0);
        setIntField(term67485, term67485.getClass(), "unknownCount", 0);
        setBooleanField(term67485, term67485.getClass(), "inExterns", false);
        setIntField(term67485, term67485.getClass(), "noTypeCheckSection", 0);
        term67486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67486, term67486.getClass(), "type", 52);
        setField(term67486, term67486.getClass(), "next", null);
        setField(term67486, term67486.getClass(), "first", null);
        setField(term67486, term67486.getClass(), "last", null);
        setField(term67486, term67486.getClass(), "propListHead", null);
        setIntField(term67486, term67486.getClass(), "sourcePosition", 0);
        setField(term67486, term67486.getClass(), "jsType", null);
        setField(term67486, term67486.getClass(), "parent", term67486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term67466;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term67396, args);
        assertTrue(recursiveEquals(term67396, term67485));
        assertTrue(recursiveEquals(term67466, term67486));
        assertTrue(recursiveEquals(retValue, true));
    }

};


