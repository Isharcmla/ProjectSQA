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

public class TypeCheck_doPercentTypedAccounting_337287087140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33450;
     Object term33520;
     Object term33972;
     Object term33973;

    public TypeCheck_doPercentTypedAccounting_337287087140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33450 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term33520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term33972 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term33972, term33972.getClass(), "compiler", null);
        setField(term33972, term33972.getClass(), "validator", null);
        setField(term33972, term33972.getClass(), "reverseInterpreter", null);
        setField(term33972, term33972.getClass(), "typeRegistry", null);
        setField(term33972, term33972.getClass(), "topScope", null);
        setField(term33972, term33972.getClass(), "scopeCreator", null);
        setField(term33972, term33972.getClass(), "reportMissingOverride", null);
        setBooleanField(term33972, term33972.getClass(), "reportUnknownTypes", false);
        setBooleanField(term33972, term33972.getClass(), "reportMissingProperties", false);
        setField(term33972, term33972.getClass(), "inferJSDocInfo", null);
        setIntField(term33972, term33972.getClass(), "typedCount", 0);
        setIntField(term33972, term33972.getClass(), "nullCount", 1);
        setIntField(term33972, term33972.getClass(), "unknownCount", 0);
        setBooleanField(term33972, term33972.getClass(), "inExterns", false);
        setIntField(term33972, term33972.getClass(), "noTypeCheckSection", 0);
        setField(term33972, term33972.getClass(), "editDistance", null);
        term33973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33973, term33973.getClass(), "type", 0);
        setField(term33973, term33973.getClass(), "next", null);
        setField(term33973, term33973.getClass(), "first", null);
        setField(term33973, term33973.getClass(), "last", null);
        setField(term33973, term33973.getClass(), "propListHead", null);
        setIntField(term33973, term33973.getClass(), "sourcePosition", 0);
        setField(term33973, term33973.getClass(), "jsType", null);
        setField(term33973, term33973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33520;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term33450, args);
        assertTrue(recursiveEquals(term33450, term33972));
        assertTrue(recursiveEquals(term33520, null));
    }

};


