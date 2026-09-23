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

public class TypeCheck_checkPropertyInheritanceOnGetpropAssign_8186833541114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320175;
     Object term320245;
     Object term320260;
     Object term320261;

    public TypeCheck_checkPropertyInheritanceOnGetpropAssign_8186833541114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320175 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term320245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term320260 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term320260, term320260.getClass(), "compiler", null);
        setField(term320260, term320260.getClass(), "validator", null);
        setField(term320260, term320260.getClass(), "reverseInterpreter", null);
        setField(term320260, term320260.getClass(), "typeRegistry", null);
        setField(term320260, term320260.getClass(), "topScope", null);
        setField(term320260, term320260.getClass(), "scopeCreator", null);
        setField(term320260, term320260.getClass(), "reportMissingOverride", null);
        setField(term320260, term320260.getClass(), "reportUnknownTypes", null);
        setBooleanField(term320260, term320260.getClass(), "reportMissingProperties", false);
        setField(term320260, term320260.getClass(), "inferJSDocInfo", null);
        setIntField(term320260, term320260.getClass(), "typedCount", 0);
        setIntField(term320260, term320260.getClass(), "nullCount", 0);
        setIntField(term320260, term320260.getClass(), "unknownCount", 0);
        setBooleanField(term320260, term320260.getClass(), "inExterns", false);
        setIntField(term320260, term320260.getClass(), "noTypeCheckSection", 0);
        term320261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term320261, term320261.getClass(), "type", 0);
        setField(term320261, term320261.getClass(), "next", null);
        setField(term320261, term320261.getClass(), "first", null);
        setField(term320261, term320261.getClass(), "last", null);
        setField(term320261, term320261.getClass(), "propListHead", null);
        setIntField(term320261, term320261.getClass(), "sourcePosition", 0);
        setField(term320261, term320261.getClass(), "jsType", null);
        setField(term320261, term320261.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term320245;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "checkPropertyInheritanceOnGetpropAssign", argTypes, term320175, args);
        assertTrue(recursiveEquals(term320175, term320260));
        assertTrue(recursiveEquals(term320245, null));
    }

};


