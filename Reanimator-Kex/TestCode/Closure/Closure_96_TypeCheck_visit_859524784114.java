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

public class TypeCheck_visit_859524784114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65210;
     Object term65280;
     Object term65647;
     Object term65648;

    public TypeCheck_visit_859524784114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term65280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65280, term65280.getClass(), "type", 112);
        term65647 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term65647, term65647.getClass(), "compiler", null);
        setField(term65647, term65647.getClass(), "validator", null);
        setField(term65647, term65647.getClass(), "reverseInterpreter", null);
        setField(term65647, term65647.getClass(), "typeRegistry", null);
        setField(term65647, term65647.getClass(), "topScope", null);
        setField(term65647, term65647.getClass(), "scopeCreator", null);
        setField(term65647, term65647.getClass(), "reportMissingOverride", null);
        setField(term65647, term65647.getClass(), "reportUnknownTypes", null);
        setBooleanField(term65647, term65647.getClass(), "reportMissingProperties", false);
        setField(term65647, term65647.getClass(), "inferJSDocInfo", null);
        setIntField(term65647, term65647.getClass(), "typedCount", 0);
        setIntField(term65647, term65647.getClass(), "nullCount", 0);
        setIntField(term65647, term65647.getClass(), "unknownCount", 0);
        setBooleanField(term65647, term65647.getClass(), "inExterns", false);
        setIntField(term65647, term65647.getClass(), "noTypeCheckSection", 0);
        term65648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65648, term65648.getClass(), "type", 112);
        setField(term65648, term65648.getClass(), "next", null);
        setField(term65648, term65648.getClass(), "first", null);
        setField(term65648, term65648.getClass(), "last", null);
        setField(term65648, term65648.getClass(), "propListHead", null);
        setIntField(term65648, term65648.getClass(), "sourcePosition", 0);
        setField(term65648, term65648.getClass(), "jsType", null);
        setField(term65648, term65648.getClass(), "parent", null);
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
        args[1] = term65280;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term65210, args);
        assertTrue(recursiveEquals(term65210, term65647));
        assertTrue(recursiveEquals(term65280, null));
    }

};


