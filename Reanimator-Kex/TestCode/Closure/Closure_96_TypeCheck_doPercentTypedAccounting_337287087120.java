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

public class TypeCheck_doPercentTypedAccounting_337287087120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66637;
     Object term66707;
     Object term66840;
     Object term66841;

    public TypeCheck_doPercentTypedAccounting_337287087120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66637 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term66707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66707, term66707.getClass(), "jsType", term66807);
        term66840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term66840, term66840.getClass(), "compiler", null);
        setField(term66840, term66840.getClass(), "validator", null);
        setField(term66840, term66840.getClass(), "reverseInterpreter", null);
        setField(term66840, term66840.getClass(), "typeRegistry", null);
        setField(term66840, term66840.getClass(), "topScope", null);
        setField(term66840, term66840.getClass(), "scopeCreator", null);
        setField(term66840, term66840.getClass(), "reportMissingOverride", null);
        setField(term66840, term66840.getClass(), "reportUnknownTypes", null);
        setBooleanField(term66840, term66840.getClass(), "reportMissingProperties", false);
        setField(term66840, term66840.getClass(), "inferJSDocInfo", null);
        setIntField(term66840, term66840.getClass(), "typedCount", 1);
        setIntField(term66840, term66840.getClass(), "nullCount", 0);
        setIntField(term66840, term66840.getClass(), "unknownCount", 0);
        setBooleanField(term66840, term66840.getClass(), "inExterns", false);
        setIntField(term66840, term66840.getClass(), "noTypeCheckSection", 0);
        term66841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term66841, term66841.getClass(), "type", 0);
        setField(term66841, term66841.getClass(), "next", null);
        setField(term66841, term66841.getClass(), "first", null);
        setField(term66841, term66841.getClass(), "last", null);
        setField(term66841, term66841.getClass(), "propListHead", null);
        setIntField(term66841, term66841.getClass(), "sourcePosition", 0);
        setField(term66842, term66842.getClass(), "call", null);
        setField(term66842, term66842.getClass(), "prototype", null);
        setField(term66842, term66842.getClass(), "kind", null);
        setField(term66842, term66842.getClass(), "typeOfThis", null);
        setField(term66842, term66842.getClass(), "source", null);
        setField(term66842, term66842.getClass(), "implementedInterfaces", null);
        setField(term66842, term66842.getClass(), "subTypes", null);
        setField(term66842, term66842.getClass(), "templateTypeName", null);
        setField(term66842, term66842.getClass(), "className", null);
        setField(term66842, term66842.getClass(), "properties", null);
        setField(term66842, term66842.getClass(), "implicitPrototype", null);
        setBooleanField(term66842, term66842.getClass(), "nativeType", false);
        setBooleanField(term66842, term66842.getClass(), "prettyPrint", false);
        setBooleanField(term66842, term66842.getClass(), "visited", false);
        setField(term66842, term66842.getClass(), "docInfo", null);
        setBooleanField(term66842, term66842.getClass(), "unknown", false);
        setBooleanField(term66842, term66842.getClass(), "resolved", false);
        setField(term66842, term66842.getClass(), "resolveResult", null);
        setField(term66842, term66842.getClass(), "registry", null);
        setField(term66841, term66841.getClass(), "jsType", term66842);
        setField(term66841, term66841.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term66707;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term66637, args);
        assertTrue(recursiveEquals(term66637, term66840));
        assertTrue(recursiveEquals(term66707, null));
    }

};


