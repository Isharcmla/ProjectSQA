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
     Object term89967;
     Object term90037;
     Object term90057;
     Object term90058;

    public TypeCheck_isPropertyTest_657275882324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89967 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term90037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90037, term90037.getClass(), "parent", term90037);
        setIntField(term90037, term90037.getClass(), "type", 101);
        setField(term90037, term90037.getClass(), "first", term90037);
        term90057 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term90057, term90057.getClass(), "compiler", null);
        setField(term90057, term90057.getClass(), "validator", null);
        setField(term90057, term90057.getClass(), "reverseInterpreter", null);
        setField(term90057, term90057.getClass(), "typeRegistry", null);
        setField(term90057, term90057.getClass(), "topScope", null);
        setField(term90057, term90057.getClass(), "scopeCreator", null);
        setField(term90057, term90057.getClass(), "reportMissingOverride", null);
        setField(term90057, term90057.getClass(), "reportUnknownTypes", null);
        setBooleanField(term90057, term90057.getClass(), "reportMissingProperties", false);
        setField(term90057, term90057.getClass(), "inferJSDocInfo", null);
        setIntField(term90057, term90057.getClass(), "typedCount", 0);
        setIntField(term90057, term90057.getClass(), "nullCount", 0);
        setIntField(term90057, term90057.getClass(), "unknownCount", 0);
        setBooleanField(term90057, term90057.getClass(), "inExterns", false);
        setIntField(term90057, term90057.getClass(), "noTypeCheckSection", 0);
        term90058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90058, term90058.getClass(), "type", 101);
        setField(term90058, term90058.getClass(), "next", null);
        setField(term90058, term90058.getClass(), "first", term90058);
        setField(term90058, term90058.getClass(), "last", null);
        setField(term90058, term90058.getClass(), "propListHead", null);
        setIntField(term90058, term90058.getClass(), "sourcePosition", 0);
        setField(term90058, term90058.getClass(), "jsType", null);
        setField(term90058, term90058.getClass(), "parent", term90058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term90037;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term89967, args);
        assertTrue(recursiveEquals(term89967, term90057));
        assertTrue(recursiveEquals(term90037, term90058));
        assertTrue(recursiveEquals(retValue, true));
    }

};


