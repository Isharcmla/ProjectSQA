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

public class TypeCheck_isPropertyTest_657275882166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82236;
     Object term82306;
     Object term82594;
     Object term82595;

    public TypeCheck_isPropertyTest_657275882166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82236 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term82306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82306, term82306.getClass(), "parent", term82306);
        term82594 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term82594, term82594.getClass(), "compiler", null);
        setField(term82594, term82594.getClass(), "validator", null);
        setField(term82594, term82594.getClass(), "reverseInterpreter", null);
        setField(term82594, term82594.getClass(), "typeRegistry", null);
        setField(term82594, term82594.getClass(), "topScope", null);
        setField(term82594, term82594.getClass(), "scopeCreator", null);
        setField(term82594, term82594.getClass(), "reportMissingOverride", null);
        setField(term82594, term82594.getClass(), "reportUnknownTypes", null);
        setBooleanField(term82594, term82594.getClass(), "reportMissingProperties", false);
        setField(term82594, term82594.getClass(), "inferJSDocInfo", null);
        setIntField(term82594, term82594.getClass(), "typedCount", 0);
        setIntField(term82594, term82594.getClass(), "nullCount", 0);
        setIntField(term82594, term82594.getClass(), "unknownCount", 0);
        setBooleanField(term82594, term82594.getClass(), "inExterns", false);
        setIntField(term82594, term82594.getClass(), "noTypeCheckSection", 0);
        term82595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82595, term82595.getClass(), "type", 0);
        setField(term82595, term82595.getClass(), "next", null);
        setField(term82595, term82595.getClass(), "first", null);
        setField(term82595, term82595.getClass(), "last", null);
        setField(term82595, term82595.getClass(), "propListHead", null);
        setIntField(term82595, term82595.getClass(), "sourcePosition", 0);
        setField(term82595, term82595.getClass(), "jsType", null);
        setField(term82595, term82595.getClass(), "parent", term82595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82306;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term82236, args);
        assertTrue(recursiveEquals(term82236, term82594));
        assertTrue(recursiveEquals(term82306, term82595));
        assertTrue(recursiveEquals(retValue, false));
    }

};


