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

public class TypeCheck_visit_859524784176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45409;
     Object term45479;
     Object term46034;
     Object term46035;

    public TypeCheck_visit_859524784176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45409 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term45479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45479, term45479.getClass(), "type", 108);
        term46034 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term46034, term46034.getClass(), "compiler", null);
        setField(term46034, term46034.getClass(), "validator", null);
        setField(term46034, term46034.getClass(), "reverseInterpreter", null);
        setField(term46034, term46034.getClass(), "typeRegistry", null);
        setField(term46034, term46034.getClass(), "topScope", null);
        setField(term46034, term46034.getClass(), "scopeCreator", null);
        setField(term46034, term46034.getClass(), "reportMissingOverride", null);
        setField(term46034, term46034.getClass(), "reportUnknownTypes", null);
        setBooleanField(term46034, term46034.getClass(), "reportMissingProperties", false);
        setField(term46034, term46034.getClass(), "inferJSDocInfo", null);
        setIntField(term46034, term46034.getClass(), "typedCount", 0);
        setIntField(term46034, term46034.getClass(), "nullCount", 0);
        setIntField(term46034, term46034.getClass(), "unknownCount", 0);
        setBooleanField(term46034, term46034.getClass(), "inExterns", false);
        setIntField(term46034, term46034.getClass(), "noTypeCheckSection", 0);
        term46035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46035, term46035.getClass(), "type", 108);
        setField(term46035, term46035.getClass(), "next", null);
        setField(term46035, term46035.getClass(), "first", null);
        setField(term46035, term46035.getClass(), "last", null);
        setField(term46035, term46035.getClass(), "propListHead", null);
        setIntField(term46035, term46035.getClass(), "sourcePosition", 0);
        setField(term46035, term46035.getClass(), "jsType", null);
        setField(term46035, term46035.getClass(), "parent", null);
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
        args[1] = term45479;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term45409, args);
        assertTrue(recursiveEquals(term45409, term46034));
        assertTrue(recursiveEquals(term45479, null));
    }

};


