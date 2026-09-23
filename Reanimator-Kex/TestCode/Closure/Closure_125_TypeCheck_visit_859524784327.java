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

public class TypeCheck_visit_859524784327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79882;
     Object term79952;
     Object term80239;
     Object term80240;

    public TypeCheck_visit_859524784327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79882 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term79952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79952, term79952.getClass(), "type", 130);
        term80239 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term80239, term80239.getClass(), "compiler", null);
        setField(term80239, term80239.getClass(), "validator", null);
        setField(term80239, term80239.getClass(), "reverseInterpreter", null);
        setField(term80239, term80239.getClass(), "typeRegistry", null);
        setField(term80239, term80239.getClass(), "topScope", null);
        setField(term80239, term80239.getClass(), "scopeCreator", null);
        setField(term80239, term80239.getClass(), "reportMissingOverride", null);
        setBooleanField(term80239, term80239.getClass(), "reportUnknownTypes", false);
        setBooleanField(term80239, term80239.getClass(), "reportMissingProperties", false);
        setField(term80239, term80239.getClass(), "inferJSDocInfo", null);
        setIntField(term80239, term80239.getClass(), "typedCount", 0);
        setIntField(term80239, term80239.getClass(), "nullCount", 0);
        setIntField(term80239, term80239.getClass(), "unknownCount", 0);
        setBooleanField(term80239, term80239.getClass(), "inExterns", false);
        setIntField(term80239, term80239.getClass(), "noTypeCheckSection", 0);
        setField(term80239, term80239.getClass(), "editDistance", null);
        term80240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80240, term80240.getClass(), "type", 130);
        setField(term80240, term80240.getClass(), "next", null);
        setField(term80240, term80240.getClass(), "first", null);
        setField(term80240, term80240.getClass(), "last", null);
        setField(term80240, term80240.getClass(), "propListHead", null);
        setIntField(term80240, term80240.getClass(), "sourcePosition", 0);
        setField(term80240, term80240.getClass(), "jsType", null);
        setField(term80240, term80240.getClass(), "parent", null);
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
        args[1] = term79952;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term79882, args);
        assertTrue(recursiveEquals(term79882, term80239));
        assertTrue(recursiveEquals(term79952, null));
    }

};


