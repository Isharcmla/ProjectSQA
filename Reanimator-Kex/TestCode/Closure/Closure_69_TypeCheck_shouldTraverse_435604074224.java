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
import java.lang.Object;

public class TypeCheck_shouldTraverse_435604074224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65147;
     Object term65307;
     Object term65851;
     Object term65853;

    public TypeCheck_shouldTraverse_435604074224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term65237 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term65147, term65147.getClass(), "validator", term65237);
        setIntField(term65147, term65147.getClass(), "noTypeCheckSection", 0);
        term65307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65307, term65307.getClass(), "type", 118);
        setField(term65307, term65307.getClass(), "propListHead", null);
        term65851 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term65852 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term65851, term65851.getClass(), "compiler", null);
        setField(term65852, term65852.getClass(), "compiler", null);
        setField(term65852, term65852.getClass(), "typeRegistry", null);
        setField(term65852, term65852.getClass(), "allValueTypes", null);
        setBooleanField(term65852, term65852.getClass(), "shouldReport", true);
        setField(term65852, term65852.getClass(), "nullOrUndefined", null);
        setField(term65852, term65852.getClass(), "mismatches", null);
        setField(term65851, term65851.getClass(), "validator", term65852);
        setField(term65851, term65851.getClass(), "reverseInterpreter", null);
        setField(term65851, term65851.getClass(), "typeRegistry", null);
        setField(term65851, term65851.getClass(), "topScope", null);
        setField(term65851, term65851.getClass(), "scopeCreator", null);
        setField(term65851, term65851.getClass(), "reportMissingOverride", null);
        setField(term65851, term65851.getClass(), "reportUnknownTypes", null);
        setBooleanField(term65851, term65851.getClass(), "reportMissingProperties", false);
        setField(term65851, term65851.getClass(), "inferJSDocInfo", null);
        setIntField(term65851, term65851.getClass(), "typedCount", 0);
        setIntField(term65851, term65851.getClass(), "nullCount", 0);
        setIntField(term65851, term65851.getClass(), "unknownCount", 0);
        setBooleanField(term65851, term65851.getClass(), "inExterns", false);
        setIntField(term65851, term65851.getClass(), "noTypeCheckSection", 0);
        term65853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65853, term65853.getClass(), "type", 118);
        setField(term65853, term65853.getClass(), "next", null);
        setField(term65853, term65853.getClass(), "first", null);
        setField(term65853, term65853.getClass(), "last", null);
        setField(term65853, term65853.getClass(), "propListHead", null);
        setIntField(term65853, term65853.getClass(), "sourcePosition", 0);
        setField(term65853, term65853.getClass(), "jsType", null);
        setField(term65853, term65853.getClass(), "parent", null);
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
        args[1] = term65307;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term65147, args);
        assertTrue(recursiveEquals(term65147, term65851));
        assertTrue(recursiveEquals(term65307, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


