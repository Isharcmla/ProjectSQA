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

public class TypeCheck_visitVar_32894406552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145332;
     Object term145402;
     Object term145420;
     Object term145421;

    public TypeCheck_visitVar_32894406552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145332 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term145402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term145420 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term145420, term145420.getClass(), "compiler", null);
        setField(term145420, term145420.getClass(), "validator", null);
        setField(term145420, term145420.getClass(), "reverseInterpreter", null);
        setField(term145420, term145420.getClass(), "typeRegistry", null);
        setField(term145420, term145420.getClass(), "topScope", null);
        setField(term145420, term145420.getClass(), "scopeCreator", null);
        setField(term145420, term145420.getClass(), "reportMissingOverride", null);
        setBooleanField(term145420, term145420.getClass(), "reportUnknownTypes", false);
        setBooleanField(term145420, term145420.getClass(), "reportMissingProperties", false);
        setField(term145420, term145420.getClass(), "inferJSDocInfo", null);
        setIntField(term145420, term145420.getClass(), "typedCount", 0);
        setIntField(term145420, term145420.getClass(), "nullCount", 0);
        setIntField(term145420, term145420.getClass(), "unknownCount", 0);
        setBooleanField(term145420, term145420.getClass(), "inExterns", false);
        setIntField(term145420, term145420.getClass(), "noTypeCheckSection", 0);
        setField(term145420, term145420.getClass(), "editDistance", null);
        term145421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145421, term145421.getClass(), "type", 0);
        setField(term145421, term145421.getClass(), "next", null);
        setField(term145421, term145421.getClass(), "first", null);
        setField(term145421, term145421.getClass(), "last", null);
        setField(term145421, term145421.getClass(), "propListHead", null);
        setIntField(term145421, term145421.getClass(), "sourcePosition", 0);
        setField(term145421, term145421.getClass(), "jsType", null);
        setField(term145421, term145421.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term145402;
        callMethod(klass, "visitVar", argTypes, term145332, args);
        assertTrue(recursiveEquals(term145332, term145420));
        assertTrue(recursiveEquals(term145402, null));
    }

};


