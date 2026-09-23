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

public class TypeValidator_expectSuperType_445618332128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46250;
     Object term46352;
     Object term46564;
     Object term46565;

    public TypeValidator_expectSuperType_445618332128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term46352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamespaceType"));
        term46564 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term46564, term46564.getClass(), "compiler", null);
        setField(term46564, term46564.getClass(), "typeRegistry", null);
        setField(term46564, term46564.getClass(), "allValueTypes", null);
        setBooleanField(term46564, term46564.getClass(), "shouldReport", false);
        setField(term46564, term46564.getClass(), "nullOrUndefined", null);
        setField(term46564, term46564.getClass(), "mismatches", null);
        term46565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamespaceType"));
        setField(term46565, term46565.getClass(), "reference", null);
        setField(term46565, term46565.getClass(), "sourceName", null);
        setIntField(term46565, term46565.getClass(), "lineno", 0);
        setIntField(term46565, term46565.getClass(), "charno", 0);
        setField(term46565, term46565.getClass(), "validator", null);
        setField(term46565, term46565.getClass(), "propertyContinuations", null);
        setField(term46565, term46565.getClass(), "referencedType", null);
        setField(term46565, term46565.getClass(), "referencedObjType", null);
        setBooleanField(term46565, term46565.getClass(), "visited", false);
        setField(term46565, term46565.getClass(), "docInfo", null);
        setBooleanField(term46565, term46565.getClass(), "unknown", false);
        setBooleanField(term46565, term46565.getClass(), "resolved", false);
        setField(term46565, term46565.getClass(), "resolveResult", null);
        setField(term46565, term46565.getClass(), "templateTypeMap", null);
        setBooleanField(term46565, term46565.getClass(), "inTemplatedCheckVisit", false);
        setField(term46565, term46565.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term46352;
        callMethod(klass, "expectSuperType", argTypes, term46250, args);
        assertTrue(recursiveEquals(term46250, term46564));
        assertTrue(recursiveEquals(term46352, null));
    }

};


