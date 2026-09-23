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

public class TypeCheck_checkEnumAlias_1976582115179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44447;
     Object term44527;
     Object term44709;
     Object term44710;

    public TypeCheck_checkEnumAlias_1976582115179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44447 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term44527 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term44709 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term44709, term44709.getClass(), "compiler", null);
        setField(term44709, term44709.getClass(), "validator", null);
        setField(term44709, term44709.getClass(), "reverseInterpreter", null);
        setField(term44709, term44709.getClass(), "typeRegistry", null);
        setField(term44709, term44709.getClass(), "topScope", null);
        setField(term44709, term44709.getClass(), "scopeCreator", null);
        setField(term44709, term44709.getClass(), "reportMissingOverride", null);
        setField(term44709, term44709.getClass(), "reportUnknownTypes", null);
        setBooleanField(term44709, term44709.getClass(), "reportMissingProperties", false);
        setField(term44709, term44709.getClass(), "inferJSDocInfo", null);
        setIntField(term44709, term44709.getClass(), "typedCount", 0);
        setIntField(term44709, term44709.getClass(), "nullCount", 0);
        setIntField(term44709, term44709.getClass(), "unknownCount", 0);
        setBooleanField(term44709, term44709.getClass(), "inExterns", false);
        setIntField(term44709, term44709.getClass(), "noTypeCheckSection", 0);
        term44710 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term44710, term44710.getClass(), "info", null);
        setField(term44710, term44710.getClass(), "documentation", null);
        setField(term44710, term44710.getClass(), "associatedNode", null);
        setField(term44710, term44710.getClass(), "visibility", null);
        setIntField(term44710, term44710.getClass(), "bitset", 0);
        setField(term44710, term44710.getClass(), "type", null);
        setField(term44710, term44710.getClass(), "thisType", null);
        setBooleanField(term44710, term44710.getClass(), "includeDocumentation", false);
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
        args[1] = term44527;
        args[2] = null;
        callMethod(klass, "checkEnumAlias", argTypes, term44447, args);
        assertTrue(recursiveEquals(term44447, term44709));
        assertTrue(recursiveEquals(term44527, null));
    }

};


