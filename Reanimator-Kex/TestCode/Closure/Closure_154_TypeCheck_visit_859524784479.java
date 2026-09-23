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

public class TypeCheck_visit_859524784479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133059;
     Object term133151;
     Object term133168;
     Object term133169;

    public TypeCheck_visit_859524784479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133059 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term133151 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term133151, term133151.getClass(), "type", 117);
        term133168 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term133168, term133168.getClass(), "compiler", null);
        setField(term133168, term133168.getClass(), "validator", null);
        setField(term133168, term133168.getClass(), "reverseInterpreter", null);
        setField(term133168, term133168.getClass(), "typeRegistry", null);
        setField(term133168, term133168.getClass(), "topScope", null);
        setField(term133168, term133168.getClass(), "scopeCreator", null);
        setField(term133168, term133168.getClass(), "reportMissingOverride", null);
        setField(term133168, term133168.getClass(), "reportUnknownTypes", null);
        setBooleanField(term133168, term133168.getClass(), "reportMissingProperties", false);
        setField(term133168, term133168.getClass(), "inferJSDocInfo", null);
        setIntField(term133168, term133168.getClass(), "typedCount", 0);
        setIntField(term133168, term133168.getClass(), "nullCount", 0);
        setIntField(term133168, term133168.getClass(), "unknownCount", 0);
        setBooleanField(term133168, term133168.getClass(), "inExterns", false);
        setIntField(term133168, term133168.getClass(), "noTypeCheckSection", 0);
        term133169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133169, term133169.getClass(), "number", 0.0);
        setIntField(term133169, term133169.getClass(), "type", 117);
        setField(term133169, term133169.getClass(), "next", null);
        setField(term133169, term133169.getClass(), "first", null);
        setField(term133169, term133169.getClass(), "last", null);
        setField(term133169, term133169.getClass(), "propListHead", null);
        setIntField(term133169, term133169.getClass(), "sourcePosition", 0);
        setField(term133169, term133169.getClass(), "jsType", null);
        setField(term133169, term133169.getClass(), "parent", null);
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
        args[1] = term133151;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term133059, args);
        assertTrue(recursiveEquals(term133059, term133168));
        assertTrue(recursiveEquals(term133151, null));
    }

};


