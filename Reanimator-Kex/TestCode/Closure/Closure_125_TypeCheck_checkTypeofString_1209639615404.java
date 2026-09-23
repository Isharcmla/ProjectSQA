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

public class TypeCheck_checkTypeofString_1209639615404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99155;
     Object term99226;

    public TypeCheck_checkTypeofString_1209639615404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99155 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term99226 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term99226, term99226.getClass(), "compiler", null);
        setField(term99226, term99226.getClass(), "validator", null);
        setField(term99226, term99226.getClass(), "reverseInterpreter", null);
        setField(term99226, term99226.getClass(), "typeRegistry", null);
        setField(term99226, term99226.getClass(), "topScope", null);
        setField(term99226, term99226.getClass(), "scopeCreator", null);
        setField(term99226, term99226.getClass(), "reportMissingOverride", null);
        setBooleanField(term99226, term99226.getClass(), "reportUnknownTypes", false);
        setBooleanField(term99226, term99226.getClass(), "reportMissingProperties", false);
        setField(term99226, term99226.getClass(), "inferJSDocInfo", null);
        setIntField(term99226, term99226.getClass(), "typedCount", 0);
        setIntField(term99226, term99226.getClass(), "nullCount", 0);
        setIntField(term99226, term99226.getClass(), "unknownCount", 0);
        setBooleanField(term99226, term99226.getClass(), "inExterns", false);
        setIntField(term99226, term99226.getClass(), "noTypeCheckSection", 0);
        setField(term99226, term99226.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = "undefined";
        callMethod(klass, "checkTypeofString", argTypes, term99155, args);
        assertTrue(recursiveEquals(term99155, term99226));
    }

};


