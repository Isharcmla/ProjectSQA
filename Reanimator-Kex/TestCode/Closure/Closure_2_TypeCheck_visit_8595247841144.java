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

public class TypeCheck_visit_8595247841144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328546;
     Object term328638;
     Object term328655;
     Object term328656;

    public TypeCheck_visit_8595247841144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328546 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term328638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term328638, term328638.getClass(), "type", 49);
        term328655 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term328655, term328655.getClass(), "compiler", null);
        setField(term328655, term328655.getClass(), "validator", null);
        setField(term328655, term328655.getClass(), "reverseInterpreter", null);
        setField(term328655, term328655.getClass(), "typeRegistry", null);
        setField(term328655, term328655.getClass(), "topScope", null);
        setField(term328655, term328655.getClass(), "scopeCreator", null);
        setField(term328655, term328655.getClass(), "reportMissingOverride", null);
        setField(term328655, term328655.getClass(), "reportUnknownTypes", null);
        setBooleanField(term328655, term328655.getClass(), "reportMissingProperties", false);
        setField(term328655, term328655.getClass(), "inferJSDocInfo", null);
        setIntField(term328655, term328655.getClass(), "typedCount", 0);
        setIntField(term328655, term328655.getClass(), "nullCount", 0);
        setIntField(term328655, term328655.getClass(), "unknownCount", 0);
        setBooleanField(term328655, term328655.getClass(), "inExterns", false);
        setIntField(term328655, term328655.getClass(), "noTypeCheckSection", 0);
        term328656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term328656, term328656.getClass(), "number", 0.0);
        setIntField(term328656, term328656.getClass(), "type", 49);
        setField(term328656, term328656.getClass(), "next", null);
        setField(term328656, term328656.getClass(), "first", null);
        setField(term328656, term328656.getClass(), "last", null);
        setField(term328656, term328656.getClass(), "propListHead", null);
        setIntField(term328656, term328656.getClass(), "sourcePosition", 0);
        setField(term328656, term328656.getClass(), "jsType", null);
        setField(term328656, term328656.getClass(), "parent", null);
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
        args[1] = term328638;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term328546, args);
        assertTrue(recursiveEquals(term328546, term328655));
        assertTrue(recursiveEquals(term328638, null));
    }

};


