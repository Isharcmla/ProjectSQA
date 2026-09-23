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

public class TypeCheck_isPropertyTest_657275882121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32900;
     Object term32970;
     Object term33154;
     Object term33155;

    public TypeCheck_isPropertyTest_657275882121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32900 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term32970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32970, term32970.getClass(), "parent", term32970);
        term33154 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term33154, term33154.getClass(), "compiler", null);
        setField(term33154, term33154.getClass(), "validator", null);
        setField(term33154, term33154.getClass(), "reverseInterpreter", null);
        setField(term33154, term33154.getClass(), "typeRegistry", null);
        setField(term33154, term33154.getClass(), "topScope", null);
        setField(term33154, term33154.getClass(), "scopeCreator", null);
        setField(term33154, term33154.getClass(), "reportMissingOverride", null);
        setField(term33154, term33154.getClass(), "reportUnknownTypes", null);
        setBooleanField(term33154, term33154.getClass(), "reportMissingProperties", false);
        setField(term33154, term33154.getClass(), "inferJSDocInfo", null);
        setIntField(term33154, term33154.getClass(), "typedCount", 0);
        setIntField(term33154, term33154.getClass(), "nullCount", 0);
        setIntField(term33154, term33154.getClass(), "unknownCount", 0);
        setBooleanField(term33154, term33154.getClass(), "inExterns", false);
        setIntField(term33154, term33154.getClass(), "noTypeCheckSection", 0);
        term33155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33155, term33155.getClass(), "type", 0);
        setField(term33155, term33155.getClass(), "next", null);
        setField(term33155, term33155.getClass(), "first", null);
        setField(term33155, term33155.getClass(), "last", null);
        setField(term33155, term33155.getClass(), "propListHead", null);
        setIntField(term33155, term33155.getClass(), "sourcePosition", 0);
        setField(term33155, term33155.getClass(), "jsType", null);
        setField(term33155, term33155.getClass(), "parent", term33155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32970;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term32900, args);
        assertTrue(recursiveEquals(term32900, term33154));
        assertTrue(recursiveEquals(term32970, term33155));
        assertTrue(recursiveEquals(retValue, false));
    }

};


