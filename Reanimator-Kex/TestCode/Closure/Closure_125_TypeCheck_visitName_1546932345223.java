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

public class TypeCheck_visitName_1546932345223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53517;
     Object term53587;
     Object term53769;
     Object term53770;

    public TypeCheck_visitName_1546932345223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53517 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term53587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53587, term53587.getClass(), "type", 83);
        term53769 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term53769, term53769.getClass(), "compiler", null);
        setField(term53769, term53769.getClass(), "validator", null);
        setField(term53769, term53769.getClass(), "reverseInterpreter", null);
        setField(term53769, term53769.getClass(), "typeRegistry", null);
        setField(term53769, term53769.getClass(), "topScope", null);
        setField(term53769, term53769.getClass(), "scopeCreator", null);
        setField(term53769, term53769.getClass(), "reportMissingOverride", null);
        setBooleanField(term53769, term53769.getClass(), "reportUnknownTypes", false);
        setBooleanField(term53769, term53769.getClass(), "reportMissingProperties", false);
        setField(term53769, term53769.getClass(), "inferJSDocInfo", null);
        setIntField(term53769, term53769.getClass(), "typedCount", 0);
        setIntField(term53769, term53769.getClass(), "nullCount", 0);
        setIntField(term53769, term53769.getClass(), "unknownCount", 0);
        setBooleanField(term53769, term53769.getClass(), "inExterns", false);
        setIntField(term53769, term53769.getClass(), "noTypeCheckSection", 0);
        setField(term53769, term53769.getClass(), "editDistance", null);
        term53770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53770, term53770.getClass(), "type", 83);
        setField(term53770, term53770.getClass(), "next", null);
        setField(term53770, term53770.getClass(), "first", null);
        setField(term53770, term53770.getClass(), "last", null);
        setField(term53770, term53770.getClass(), "propListHead", null);
        setIntField(term53770, term53770.getClass(), "sourcePosition", 0);
        setField(term53770, term53770.getClass(), "jsType", null);
        setField(term53770, term53770.getClass(), "parent", null);
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
        args[2] = term53587;
        Object retValue = callMethod(klass, "visitName", argTypes, term53517, args);
        assertTrue(recursiveEquals(term53517, term53769));
        assertTrue(recursiveEquals(term53587, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


