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

public class TypeCheck_visit_859524784636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171121;
     Object term171191;
     Object term171367;
     Object term171703;
     Object term171704;
     Object term171706;

    public TypeCheck_visit_859524784636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171121 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term171191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term171191, term171191.getClass(), "type", 38);
        setField(term171191, term171191.getClass(), "jsType", term171297);
        term171367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term171367, term171367.getClass(), "type", 38);
        term171703 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term171703, term171703.getClass(), "compiler", null);
        setField(term171703, term171703.getClass(), "validator", null);
        setField(term171703, term171703.getClass(), "reverseInterpreter", null);
        setField(term171703, term171703.getClass(), "typeRegistry", null);
        setField(term171703, term171703.getClass(), "topScope", null);
        setField(term171703, term171703.getClass(), "scopeCreator", null);
        setField(term171703, term171703.getClass(), "reportMissingOverride", null);
        setBooleanField(term171703, term171703.getClass(), "reportUnknownTypes", false);
        setBooleanField(term171703, term171703.getClass(), "reportMissingProperties", false);
        setField(term171703, term171703.getClass(), "inferJSDocInfo", null);
        setIntField(term171703, term171703.getClass(), "typedCount", 1);
        setIntField(term171703, term171703.getClass(), "nullCount", 0);
        setIntField(term171703, term171703.getClass(), "unknownCount", 0);
        setBooleanField(term171703, term171703.getClass(), "inExterns", false);
        setIntField(term171703, term171703.getClass(), "noTypeCheckSection", 0);
        setField(term171703, term171703.getClass(), "editDistance", null);
        term171704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term171704, term171704.getClass(), "type", 38);
        setField(term171704, term171704.getClass(), "next", null);
        setField(term171704, term171704.getClass(), "first", null);
        setField(term171704, term171704.getClass(), "last", null);
        setField(term171704, term171704.getClass(), "propListHead", null);
        setIntField(term171704, term171704.getClass(), "sourcePosition", 0);
        setField(term171705, term171705.getClass(), "primitiveType", null);
        setField(term171705, term171705.getClass(), "primitiveObjectType", null);
        setField(term171705, term171705.getClass(), "name", null);
        setBooleanField(term171705, term171705.getClass(), "visited", false);
        setField(term171705, term171705.getClass(), "docInfo", null);
        setBooleanField(term171705, term171705.getClass(), "unknown", false);
        setBooleanField(term171705, term171705.getClass(), "resolved", false);
        setField(term171705, term171705.getClass(), "resolveResult", null);
        setField(term171705, term171705.getClass(), "templateTypeMap", null);
        setBooleanField(term171705, term171705.getClass(), "inTemplatedCheckVisit", false);
        setField(term171705, term171705.getClass(), "registry", null);
        setField(term171704, term171704.getClass(), "jsType", term171705);
        setField(term171704, term171704.getClass(), "parent", null);
        term171706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term171706, term171706.getClass(), "type", 38);
        setField(term171706, term171706.getClass(), "next", null);
        setField(term171706, term171706.getClass(), "first", null);
        setField(term171706, term171706.getClass(), "last", null);
        setField(term171706, term171706.getClass(), "propListHead", null);
        setIntField(term171706, term171706.getClass(), "sourcePosition", 0);
        setField(term171706, term171706.getClass(), "jsType", null);
        setField(term171706, term171706.getClass(), "parent", null);
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
        args[1] = term171191;
        args[2] = term171367;
        callMethod(klass, "visit", argTypes, term171121, args);
        assertTrue(recursiveEquals(term171121, term171703));
        assertTrue(recursiveEquals(term171191, term171706));
        assertTrue(recursiveEquals(term171367, null));
    }

};


