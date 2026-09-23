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

public class TypeCheck_visit_8595247841308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388592;
     Object term388684;
     Object term388701;
     Object term388702;

    public TypeCheck_visit_8595247841308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388592 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term388684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term388684, term388684.getClass(), "type", 112);
        term388701 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term388701, term388701.getClass(), "compiler", null);
        setField(term388701, term388701.getClass(), "validator", null);
        setField(term388701, term388701.getClass(), "reverseInterpreter", null);
        setField(term388701, term388701.getClass(), "typeRegistry", null);
        setField(term388701, term388701.getClass(), "topScope", null);
        setField(term388701, term388701.getClass(), "scopeCreator", null);
        setField(term388701, term388701.getClass(), "reportMissingOverride", null);
        setField(term388701, term388701.getClass(), "reportUnknownTypes", null);
        setBooleanField(term388701, term388701.getClass(), "reportMissingProperties", false);
        setField(term388701, term388701.getClass(), "inferJSDocInfo", null);
        setIntField(term388701, term388701.getClass(), "typedCount", 0);
        setIntField(term388701, term388701.getClass(), "nullCount", 0);
        setIntField(term388701, term388701.getClass(), "unknownCount", 0);
        setBooleanField(term388701, term388701.getClass(), "inExterns", false);
        setIntField(term388701, term388701.getClass(), "noTypeCheckSection", 0);
        term388702 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term388702, term388702.getClass(), "number", 0.0);
        setIntField(term388702, term388702.getClass(), "type", 112);
        setField(term388702, term388702.getClass(), "next", null);
        setField(term388702, term388702.getClass(), "first", null);
        setField(term388702, term388702.getClass(), "last", null);
        setField(term388702, term388702.getClass(), "propListHead", null);
        setIntField(term388702, term388702.getClass(), "sourcePosition", 0);
        setField(term388702, term388702.getClass(), "jsType", null);
        setField(term388702, term388702.getClass(), "parent", null);
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
        args[1] = term388684;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term388592, args);
        assertTrue(recursiveEquals(term388592, term388701));
        assertTrue(recursiveEquals(term388684, null));
    }

};


