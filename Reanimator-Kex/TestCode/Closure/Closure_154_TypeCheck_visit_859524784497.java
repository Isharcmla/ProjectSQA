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

public class TypeCheck_visit_859524784497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139628;
     Object term139698;
     Object term139714;
     Object term139715;

    public TypeCheck_visit_859524784497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139628 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term139698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139698, term139698.getClass(), "type", 120);
        term139714 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term139714, term139714.getClass(), "compiler", null);
        setField(term139714, term139714.getClass(), "validator", null);
        setField(term139714, term139714.getClass(), "reverseInterpreter", null);
        setField(term139714, term139714.getClass(), "typeRegistry", null);
        setField(term139714, term139714.getClass(), "topScope", null);
        setField(term139714, term139714.getClass(), "scopeCreator", null);
        setField(term139714, term139714.getClass(), "reportMissingOverride", null);
        setField(term139714, term139714.getClass(), "reportUnknownTypes", null);
        setBooleanField(term139714, term139714.getClass(), "reportMissingProperties", false);
        setField(term139714, term139714.getClass(), "inferJSDocInfo", null);
        setIntField(term139714, term139714.getClass(), "typedCount", 0);
        setIntField(term139714, term139714.getClass(), "nullCount", 0);
        setIntField(term139714, term139714.getClass(), "unknownCount", 0);
        setBooleanField(term139714, term139714.getClass(), "inExterns", false);
        setIntField(term139714, term139714.getClass(), "noTypeCheckSection", 0);
        term139715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139715, term139715.getClass(), "type", 120);
        setField(term139715, term139715.getClass(), "next", null);
        setField(term139715, term139715.getClass(), "first", null);
        setField(term139715, term139715.getClass(), "last", null);
        setField(term139715, term139715.getClass(), "propListHead", null);
        setIntField(term139715, term139715.getClass(), "sourcePosition", 0);
        setField(term139715, term139715.getClass(), "jsType", null);
        setField(term139715, term139715.getClass(), "parent", null);
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
        args[1] = term139698;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term139628, args);
        assertTrue(recursiveEquals(term139628, term139714));
        assertTrue(recursiveEquals(term139698, null));
    }

};


