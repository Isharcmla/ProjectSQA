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

public class TypeCheck_visitName_1546932345263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65360;
     Object term65430;
     Object term65610;
     Object term65611;

    public TypeCheck_visitName_1546932345263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65360 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term65430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65430, term65430.getClass(), "type", 105);
        term65610 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term65610, term65610.getClass(), "compiler", null);
        setField(term65610, term65610.getClass(), "validator", null);
        setField(term65610, term65610.getClass(), "reverseInterpreter", null);
        setField(term65610, term65610.getClass(), "typeRegistry", null);
        setField(term65610, term65610.getClass(), "topScope", null);
        setField(term65610, term65610.getClass(), "scopeCreator", null);
        setField(term65610, term65610.getClass(), "reportMissingOverride", null);
        setBooleanField(term65610, term65610.getClass(), "reportUnknownTypes", false);
        setBooleanField(term65610, term65610.getClass(), "reportMissingProperties", false);
        setField(term65610, term65610.getClass(), "inferJSDocInfo", null);
        setIntField(term65610, term65610.getClass(), "typedCount", 0);
        setIntField(term65610, term65610.getClass(), "nullCount", 0);
        setIntField(term65610, term65610.getClass(), "unknownCount", 0);
        setBooleanField(term65610, term65610.getClass(), "inExterns", false);
        setIntField(term65610, term65610.getClass(), "noTypeCheckSection", 0);
        setField(term65610, term65610.getClass(), "editDistance", null);
        term65611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65611, term65611.getClass(), "type", 105);
        setField(term65611, term65611.getClass(), "next", null);
        setField(term65611, term65611.getClass(), "first", null);
        setField(term65611, term65611.getClass(), "last", null);
        setField(term65611, term65611.getClass(), "propListHead", null);
        setIntField(term65611, term65611.getClass(), "sourcePosition", 0);
        setField(term65611, term65611.getClass(), "jsType", null);
        setField(term65611, term65611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term65430;
        Object retValue = callMethod(klass, "visitName", argTypes, term65360, args);
        assertTrue(recursiveEquals(term65360, term65610));
        assertTrue(recursiveEquals(term65430, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


