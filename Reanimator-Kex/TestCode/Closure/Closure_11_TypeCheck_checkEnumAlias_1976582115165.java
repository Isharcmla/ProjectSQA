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

public class TypeCheck_checkEnumAlias_1976582115165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37028;
     Object term37108;
     Object term37286;
     Object term37287;

    public TypeCheck_checkEnumAlias_1976582115165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37028 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term37108 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term37286 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term37286, term37286.getClass(), "compiler", null);
        setField(term37286, term37286.getClass(), "validator", null);
        setField(term37286, term37286.getClass(), "reverseInterpreter", null);
        setField(term37286, term37286.getClass(), "typeRegistry", null);
        setField(term37286, term37286.getClass(), "topScope", null);
        setField(term37286, term37286.getClass(), "scopeCreator", null);
        setField(term37286, term37286.getClass(), "reportMissingOverride", null);
        setField(term37286, term37286.getClass(), "reportUnknownTypes", null);
        setBooleanField(term37286, term37286.getClass(), "reportMissingProperties", false);
        setField(term37286, term37286.getClass(), "inferJSDocInfo", null);
        setIntField(term37286, term37286.getClass(), "typedCount", 0);
        setIntField(term37286, term37286.getClass(), "nullCount", 0);
        setIntField(term37286, term37286.getClass(), "unknownCount", 0);
        setBooleanField(term37286, term37286.getClass(), "inExterns", false);
        setIntField(term37286, term37286.getClass(), "noTypeCheckSection", 0);
        term37287 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term37287, term37287.getClass(), "info", null);
        setField(term37287, term37287.getClass(), "documentation", null);
        setField(term37287, term37287.getClass(), "associatedNode", null);
        setField(term37287, term37287.getClass(), "visibility", null);
        setIntField(term37287, term37287.getClass(), "bitset", 0);
        setField(term37287, term37287.getClass(), "type", null);
        setField(term37287, term37287.getClass(), "thisType", null);
        setBooleanField(term37287, term37287.getClass(), "includeDocumentation", false);
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
        args[1] = term37108;
        args[2] = null;
        callMethod(klass, "checkEnumAlias", argTypes, term37028, args);
        assertTrue(recursiveEquals(term37028, term37286));
        assertTrue(recursiveEquals(term37108, null));
    }

};


