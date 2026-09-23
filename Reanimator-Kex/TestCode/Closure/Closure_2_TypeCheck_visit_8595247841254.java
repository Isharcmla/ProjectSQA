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
import java.lang.Object;

public class TypeCheck_visit_8595247841254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376037;
     Object term376107;
     Object term376273;
     Object term376331;
     Object term376332;
     Object term376334;

    public TypeCheck_visit_8595247841254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376037 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term376107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term376107, term376107.getClass(), "type", 38);
        setField(term376107, term376107.getClass(), "jsType", term376203);
        term376273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term376273, term376273.getClass(), "type", 38);
        term376331 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term376331, term376331.getClass(), "compiler", null);
        setField(term376331, term376331.getClass(), "validator", null);
        setField(term376331, term376331.getClass(), "reverseInterpreter", null);
        setField(term376331, term376331.getClass(), "typeRegistry", null);
        setField(term376331, term376331.getClass(), "topScope", null);
        setField(term376331, term376331.getClass(), "scopeCreator", null);
        setField(term376331, term376331.getClass(), "reportMissingOverride", null);
        setField(term376331, term376331.getClass(), "reportUnknownTypes", null);
        setBooleanField(term376331, term376331.getClass(), "reportMissingProperties", false);
        setField(term376331, term376331.getClass(), "inferJSDocInfo", null);
        setIntField(term376331, term376331.getClass(), "typedCount", 1);
        setIntField(term376331, term376331.getClass(), "nullCount", 0);
        setIntField(term376331, term376331.getClass(), "unknownCount", 0);
        setBooleanField(term376331, term376331.getClass(), "inExterns", false);
        setIntField(term376331, term376331.getClass(), "noTypeCheckSection", 0);
        term376332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term376332, term376332.getClass(), "type", 38);
        setField(term376332, term376332.getClass(), "next", null);
        setField(term376332, term376332.getClass(), "first", null);
        setField(term376332, term376332.getClass(), "last", null);
        setField(term376332, term376332.getClass(), "propListHead", null);
        setIntField(term376332, term376332.getClass(), "sourcePosition", 0);
        setBooleanField(term376333, term376333.getClass(), "resolved", false);
        setField(term376333, term376333.getClass(), "resolveResult", null);
        setField(term376333, term376333.getClass(), "templateKeys", null);
        setField(term376333, term376333.getClass(), "templatizedTypes", null);
        setBooleanField(term376333, term376333.getClass(), "inTemplatedCheckVisit", false);
        setField(term376333, term376333.getClass(), "registry", null);
        setField(term376332, term376332.getClass(), "jsType", term376333);
        setField(term376332, term376332.getClass(), "parent", null);
        term376334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term376334, term376334.getClass(), "type", 38);
        setField(term376334, term376334.getClass(), "next", null);
        setField(term376334, term376334.getClass(), "first", null);
        setField(term376334, term376334.getClass(), "last", null);
        setField(term376334, term376334.getClass(), "propListHead", null);
        setIntField(term376334, term376334.getClass(), "sourcePosition", 0);
        setField(term376334, term376334.getClass(), "jsType", null);
        setField(term376334, term376334.getClass(), "parent", null);
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
        args[1] = term376107;
        args[2] = term376273;
        callMethod(klass, "visit", argTypes, term376037, args);
        assertTrue(recursiveEquals(term376037, term376331));
        assertTrue(recursiveEquals(term376107, term376334));
        assertTrue(recursiveEquals(term376273, null));
    }

};


