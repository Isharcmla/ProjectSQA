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

public class TypeCheck_checkEnumAlias_1976582115106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10468;
     Object term25867;

    public TypeCheck_checkEnumAlias_1976582115106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term10468, term10468.getClass(), "compiler", null);
        setField(term10468, term10468.getClass(), "validator", null);
        setField(term10468, term10468.getClass(), "reverseInterpreter", null);
        setField(term10468, term10468.getClass(), "typeRegistry", null);
        setField(term10468, term10468.getClass(), "topScope", null);
        setField(term10468, term10468.getClass(), "scopeCreator", null);
        setField(term10468, term10468.getClass(), "reportMissingOverride", null);
        setBooleanField(term10468, term10468.getClass(), "reportUnknownTypes", false);
        setBooleanField(term10468, term10468.getClass(), "reportMissingProperties", false);
        setField(term10468, term10468.getClass(), "inferJSDocInfo", null);
        setIntField(term10468, term10468.getClass(), "typedCount", 0);
        setIntField(term10468, term10468.getClass(), "nullCount", 0);
        setIntField(term10468, term10468.getClass(), "unknownCount", 0);
        setBooleanField(term10468, term10468.getClass(), "inExterns", false);
        setIntField(term10468, term10468.getClass(), "noTypeCheckSection", 0);
        setField(term10468, term10468.getClass(), "editDistance", null);
        term25867 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term25867, term25867.getClass(), "compiler", null);
        setField(term25867, term25867.getClass(), "validator", null);
        setField(term25867, term25867.getClass(), "reverseInterpreter", null);
        setField(term25867, term25867.getClass(), "typeRegistry", null);
        setField(term25867, term25867.getClass(), "topScope", null);
        setField(term25867, term25867.getClass(), "scopeCreator", null);
        setField(term25867, term25867.getClass(), "reportMissingOverride", null);
        setBooleanField(term25867, term25867.getClass(), "reportUnknownTypes", false);
        setBooleanField(term25867, term25867.getClass(), "reportMissingProperties", false);
        setField(term25867, term25867.getClass(), "inferJSDocInfo", null);
        setIntField(term25867, term25867.getClass(), "typedCount", 0);
        setIntField(term25867, term25867.getClass(), "nullCount", 0);
        setIntField(term25867, term25867.getClass(), "unknownCount", 0);
        setBooleanField(term25867, term25867.getClass(), "inExterns", false);
        setIntField(term25867, term25867.getClass(), "noTypeCheckSection", 0);
        setField(term25867, term25867.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "checkEnumAlias", argTypes, term10468, args);
        assertTrue(recursiveEquals(term10468, term25867));
    }

};


