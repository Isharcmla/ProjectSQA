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

public class TypeCheck_visit_8595247841252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367300;
     Object term367370;
     Object term367440;
     Object term367630;
     Object term367631;
     Object term367633;

    public TypeCheck_visit_8595247841252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367300 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term367370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term367370, term367370.getClass(), "type", 64);
        setField(term367370, term367370.getClass(), "jsType", null);
        term367440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term367440, term367440.getClass(), "jsType", term367532);
        term367630 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term367630, term367630.getClass(), "compiler", null);
        setField(term367630, term367630.getClass(), "validator", null);
        setField(term367630, term367630.getClass(), "reverseInterpreter", null);
        setField(term367630, term367630.getClass(), "typeRegistry", null);
        setField(term367630, term367630.getClass(), "topScope", null);
        setField(term367630, term367630.getClass(), "scopeCreator", null);
        setField(term367630, term367630.getClass(), "reportMissingOverride", null);
        setField(term367630, term367630.getClass(), "reportUnknownTypes", null);
        setBooleanField(term367630, term367630.getClass(), "reportMissingProperties", false);
        setField(term367630, term367630.getClass(), "inferJSDocInfo", null);
        setIntField(term367630, term367630.getClass(), "typedCount", 1);
        setIntField(term367630, term367630.getClass(), "nullCount", 0);
        setIntField(term367630, term367630.getClass(), "unknownCount", 0);
        setBooleanField(term367630, term367630.getClass(), "inExterns", false);
        setIntField(term367630, term367630.getClass(), "noTypeCheckSection", 0);
        term367631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term367631, term367631.getClass(), "type", 64);
        setField(term367631, term367631.getClass(), "next", null);
        setField(term367631, term367631.getClass(), "first", null);
        setField(term367631, term367631.getClass(), "last", null);
        setField(term367631, term367631.getClass(), "propListHead", null);
        setIntField(term367631, term367631.getClass(), "sourcePosition", 0);
        setField(term367632, term367632.getClass(), "source", null);
        setField(term367632, term367632.getClass(), "elementsType", null);
        setField(term367632, term367632.getClass(), "elements", null);
        setField(term367632, term367632.getClass(), "className", null);
        setField(term367632, term367632.getClass(), "properties", null);
        setBooleanField(term367632, term367632.getClass(), "nativeType", false);
        setField(term367632, term367632.getClass(), "implicitPrototypeFallback", null);
        setField(term367632, term367632.getClass(), "ownerFunction", null);
        setBooleanField(term367632, term367632.getClass(), "prettyPrint", false);
        setBooleanField(term367632, term367632.getClass(), "visited", false);
        setField(term367632, term367632.getClass(), "docInfo", null);
        setBooleanField(term367632, term367632.getClass(), "unknown", false);
        setBooleanField(term367632, term367632.getClass(), "resolved", false);
        setField(term367632, term367632.getClass(), "resolveResult", null);
        setBooleanField(term367632, term367632.getClass(), "inTemplatedCheckVisit", false);
        setField(term367632, term367632.getClass(), "registry", null);
        setField(term367631, term367631.getClass(), "jsType", term367632);
        setField(term367631, term367631.getClass(), "parent", null);
        term367633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term367633, term367633.getClass(), "type", 0);
        setField(term367633, term367633.getClass(), "next", null);
        setField(term367633, term367633.getClass(), "first", null);
        setField(term367633, term367633.getClass(), "last", null);
        setField(term367633, term367633.getClass(), "propListHead", null);
        setIntField(term367633, term367633.getClass(), "sourcePosition", 0);
        setField(term367634, term367634.getClass(), "source", null);
        setField(term367634, term367634.getClass(), "elementsType", null);
        setField(term367634, term367634.getClass(), "elements", null);
        setField(term367634, term367634.getClass(), "className", null);
        setField(term367634, term367634.getClass(), "properties", null);
        setBooleanField(term367634, term367634.getClass(), "nativeType", false);
        setField(term367634, term367634.getClass(), "implicitPrototypeFallback", null);
        setField(term367634, term367634.getClass(), "ownerFunction", null);
        setBooleanField(term367634, term367634.getClass(), "prettyPrint", false);
        setBooleanField(term367634, term367634.getClass(), "visited", false);
        setField(term367634, term367634.getClass(), "docInfo", null);
        setBooleanField(term367634, term367634.getClass(), "unknown", false);
        setBooleanField(term367634, term367634.getClass(), "resolved", false);
        setField(term367634, term367634.getClass(), "resolveResult", null);
        setBooleanField(term367634, term367634.getClass(), "inTemplatedCheckVisit", false);
        setField(term367634, term367634.getClass(), "registry", null);
        setField(term367633, term367633.getClass(), "jsType", term367634);
        setField(term367633, term367633.getClass(), "parent", null);
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
        args[1] = term367370;
        args[2] = term367440;
        callMethod(klass, "visit", argTypes, term367300, args);
        assertTrue(recursiveEquals(term367300, term367630));
        assertTrue(recursiveEquals(term367370, term367633));
        assertTrue(recursiveEquals(term367440, null));
    }

};


