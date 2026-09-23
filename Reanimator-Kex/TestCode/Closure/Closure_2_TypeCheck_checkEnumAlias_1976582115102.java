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

public class TypeCheck_checkEnumAlias_1976582115102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11020;
     Object term24696;

    public TypeCheck_checkEnumAlias_1976582115102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11020 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term11020, term11020.getClass(), "compiler", null);
        setField(term11020, term11020.getClass(), "validator", null);
        setField(term11020, term11020.getClass(), "reverseInterpreter", null);
        setField(term11020, term11020.getClass(), "typeRegistry", null);
        setField(term11020, term11020.getClass(), "topScope", null);
        setField(term11020, term11020.getClass(), "scopeCreator", null);
        setField(term11020, term11020.getClass(), "reportMissingOverride", null);
        setField(term11020, term11020.getClass(), "reportUnknownTypes", null);
        setBooleanField(term11020, term11020.getClass(), "reportMissingProperties", false);
        setField(term11020, term11020.getClass(), "inferJSDocInfo", null);
        setIntField(term11020, term11020.getClass(), "typedCount", 0);
        setIntField(term11020, term11020.getClass(), "nullCount", 0);
        setIntField(term11020, term11020.getClass(), "unknownCount", 0);
        setBooleanField(term11020, term11020.getClass(), "inExterns", false);
        setIntField(term11020, term11020.getClass(), "noTypeCheckSection", 0);
        term24696 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term24696, term24696.getClass(), "compiler", null);
        setField(term24696, term24696.getClass(), "validator", null);
        setField(term24696, term24696.getClass(), "reverseInterpreter", null);
        setField(term24696, term24696.getClass(), "typeRegistry", null);
        setField(term24696, term24696.getClass(), "topScope", null);
        setField(term24696, term24696.getClass(), "scopeCreator", null);
        setField(term24696, term24696.getClass(), "reportMissingOverride", null);
        setField(term24696, term24696.getClass(), "reportUnknownTypes", null);
        setBooleanField(term24696, term24696.getClass(), "reportMissingProperties", false);
        setField(term24696, term24696.getClass(), "inferJSDocInfo", null);
        setIntField(term24696, term24696.getClass(), "typedCount", 0);
        setIntField(term24696, term24696.getClass(), "nullCount", 0);
        setIntField(term24696, term24696.getClass(), "unknownCount", 0);
        setBooleanField(term24696, term24696.getClass(), "inExterns", false);
        setIntField(term24696, term24696.getClass(), "noTypeCheckSection", 0);
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
        callMethod(klass, "checkEnumAlias", argTypes, term11020, args);
        assertTrue(recursiveEquals(term11020, term24696));
    }

};


