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

public class TypeCheck_visit_859524784227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62972;
     Object term63042;
     Object term63352;
     Object term63353;

    public TypeCheck_visit_859524784227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62972 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term63042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63042, term63042.getClass(), "type", 110);
        term63352 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term63352, term63352.getClass(), "compiler", null);
        setField(term63352, term63352.getClass(), "validator", null);
        setField(term63352, term63352.getClass(), "reverseInterpreter", null);
        setField(term63352, term63352.getClass(), "typeRegistry", null);
        setField(term63352, term63352.getClass(), "topScope", null);
        setField(term63352, term63352.getClass(), "scopeCreator", null);
        setField(term63352, term63352.getClass(), "reportMissingOverride", null);
        setField(term63352, term63352.getClass(), "reportUnknownTypes", null);
        setBooleanField(term63352, term63352.getClass(), "reportMissingProperties", false);
        setField(term63352, term63352.getClass(), "inferJSDocInfo", null);
        setIntField(term63352, term63352.getClass(), "typedCount", 0);
        setIntField(term63352, term63352.getClass(), "nullCount", 0);
        setIntField(term63352, term63352.getClass(), "unknownCount", 0);
        setBooleanField(term63352, term63352.getClass(), "inExterns", false);
        setIntField(term63352, term63352.getClass(), "noTypeCheckSection", 0);
        term63353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63353, term63353.getClass(), "type", 110);
        setField(term63353, term63353.getClass(), "next", null);
        setField(term63353, term63353.getClass(), "first", null);
        setField(term63353, term63353.getClass(), "last", null);
        setField(term63353, term63353.getClass(), "propListHead", null);
        setIntField(term63353, term63353.getClass(), "sourcePosition", 0);
        setField(term63353, term63353.getClass(), "jsType", null);
        setField(term63353, term63353.getClass(), "parent", null);
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
        args[1] = term63042;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term62972, args);
        assertTrue(recursiveEquals(term62972, term63352));
        assertTrue(recursiveEquals(term63042, null));
    }

};


