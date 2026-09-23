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

public class TypeCheck_visitName_1546932345171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44793;
     Object term44863;
     Object term45042;
     Object term45043;

    public TypeCheck_visitName_1546932345171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44793 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term44863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44863, term44863.getClass(), "type", 105);
        term45042 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term45042, term45042.getClass(), "compiler", null);
        setField(term45042, term45042.getClass(), "validator", null);
        setField(term45042, term45042.getClass(), "reverseInterpreter", null);
        setField(term45042, term45042.getClass(), "typeRegistry", null);
        setField(term45042, term45042.getClass(), "topScope", null);
        setField(term45042, term45042.getClass(), "scopeCreator", null);
        setField(term45042, term45042.getClass(), "reportMissingOverride", null);
        setField(term45042, term45042.getClass(), "reportUnknownTypes", null);
        setBooleanField(term45042, term45042.getClass(), "reportMissingProperties", false);
        setField(term45042, term45042.getClass(), "inferJSDocInfo", null);
        setIntField(term45042, term45042.getClass(), "typedCount", 0);
        setIntField(term45042, term45042.getClass(), "nullCount", 0);
        setIntField(term45042, term45042.getClass(), "unknownCount", 0);
        setBooleanField(term45042, term45042.getClass(), "inExterns", false);
        setIntField(term45042, term45042.getClass(), "noTypeCheckSection", 0);
        term45043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45043, term45043.getClass(), "type", 105);
        setField(term45043, term45043.getClass(), "next", null);
        setField(term45043, term45043.getClass(), "first", null);
        setField(term45043, term45043.getClass(), "last", null);
        setField(term45043, term45043.getClass(), "propListHead", null);
        setIntField(term45043, term45043.getClass(), "sourcePosition", 0);
        setField(term45043, term45043.getClass(), "jsType", null);
        setField(term45043, term45043.getClass(), "parent", null);
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
        args[2] = term44863;
        Object retValue = callMethod(klass, "visitName", argTypes, term44793, args);
        assertTrue(recursiveEquals(term44793, term45042));
        assertTrue(recursiveEquals(term44863, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


