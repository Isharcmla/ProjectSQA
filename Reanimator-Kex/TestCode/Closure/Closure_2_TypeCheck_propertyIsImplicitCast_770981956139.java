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

public class TypeCheck_propertyIsImplicitCast_770981956139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32478;
     Object term32572;
     Object term32835;
     Object term32836;

    public TypeCheck_propertyIsImplicitCast_770981956139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32478 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term32572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term32835 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term32835, term32835.getClass(), "compiler", null);
        setField(term32835, term32835.getClass(), "validator", null);
        setField(term32835, term32835.getClass(), "reverseInterpreter", null);
        setField(term32835, term32835.getClass(), "typeRegistry", null);
        setField(term32835, term32835.getClass(), "topScope", null);
        setField(term32835, term32835.getClass(), "scopeCreator", null);
        setField(term32835, term32835.getClass(), "reportMissingOverride", null);
        setField(term32835, term32835.getClass(), "reportUnknownTypes", null);
        setBooleanField(term32835, term32835.getClass(), "reportMissingProperties", false);
        setField(term32835, term32835.getClass(), "inferJSDocInfo", null);
        setIntField(term32835, term32835.getClass(), "typedCount", 0);
        setIntField(term32835, term32835.getClass(), "nullCount", 0);
        setIntField(term32835, term32835.getClass(), "unknownCount", 0);
        setBooleanField(term32835, term32835.getClass(), "inExterns", false);
        setIntField(term32835, term32835.getClass(), "noTypeCheckSection", 0);
        term32836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term32836, term32836.getClass(), "reference", null);
        setField(term32836, term32836.getClass(), "sourceName", null);
        setIntField(term32836, term32836.getClass(), "lineno", 0);
        setIntField(term32836, term32836.getClass(), "charno", 0);
        setField(term32836, term32836.getClass(), "validator", null);
        setField(term32836, term32836.getClass(), "propertyContinuations", null);
        setField(term32836, term32836.getClass(), "referencedType", null);
        setField(term32836, term32836.getClass(), "referencedObjType", null);
        setBooleanField(term32836, term32836.getClass(), "visited", false);
        setField(term32836, term32836.getClass(), "docInfo", null);
        setBooleanField(term32836, term32836.getClass(), "unknown", false);
        setBooleanField(term32836, term32836.getClass(), "resolved", false);
        setField(term32836, term32836.getClass(), "resolveResult", null);
        setField(term32836, term32836.getClass(), "templateKeys", null);
        setField(term32836, term32836.getClass(), "templatizedTypes", null);
        setBooleanField(term32836, term32836.getClass(), "inTemplatedCheckVisit", false);
        setField(term32836, term32836.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term32572;
        args[1] = null;
        Object retValue = callMethod(klass, "propertyIsImplicitCast", argTypes, term32478, args);
        assertTrue(recursiveEquals(term32478, term32835));
        assertTrue(recursiveEquals(term32572, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


