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

public class TypeCheck_checkPropertyAccessHelper_1729227470169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39503;
     Object term39603;
     Object term41645;
     Object term41646;

    public TypeCheck_checkPropertyAccessHelper_1729227470169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39503 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term39603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term41645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term41645, term41645.getClass(), "compiler", null);
        setField(term41645, term41645.getClass(), "validator", null);
        setField(term41645, term41645.getClass(), "reverseInterpreter", null);
        setField(term41645, term41645.getClass(), "typeRegistry", null);
        setField(term41645, term41645.getClass(), "topScope", null);
        setField(term41645, term41645.getClass(), "scopeCreator", null);
        setField(term41645, term41645.getClass(), "reportMissingOverride", null);
        setBooleanField(term41645, term41645.getClass(), "reportUnknownTypes", false);
        setBooleanField(term41645, term41645.getClass(), "reportMissingProperties", false);
        setField(term41645, term41645.getClass(), "inferJSDocInfo", null);
        setIntField(term41645, term41645.getClass(), "typedCount", 0);
        setIntField(term41645, term41645.getClass(), "nullCount", 0);
        setIntField(term41645, term41645.getClass(), "unknownCount", 0);
        setBooleanField(term41645, term41645.getClass(), "inExterns", false);
        setIntField(term41645, term41645.getClass(), "noTypeCheckSection", 0);
        setField(term41645, term41645.getClass(), "editDistance", null);
        term41646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term41646, term41646.getClass(), "call", null);
        setField(term41646, term41646.getClass(), "prototypeSlot", null);
        setField(term41646, term41646.getClass(), "kind", null);
        setField(term41646, term41646.getClass(), "propAccess", null);
        setField(term41646, term41646.getClass(), "typeOfThis", null);
        setField(term41646, term41646.getClass(), "source", null);
        setField(term41646, term41646.getClass(), "implementedInterfaces", null);
        setField(term41646, term41646.getClass(), "extendedInterfaces", null);
        setField(term41646, term41646.getClass(), "subTypes", null);
        setField(term41646, term41646.getClass(), "className", null);
        setField(term41646, term41646.getClass(), "properties", null);
        setBooleanField(term41646, term41646.getClass(), "nativeType", false);
        setField(term41646, term41646.getClass(), "implicitPrototypeFallback", null);
        setField(term41646, term41646.getClass(), "ownerFunction", null);
        setBooleanField(term41646, term41646.getClass(), "prettyPrint", false);
        setBooleanField(term41646, term41646.getClass(), "visited", false);
        setField(term41646, term41646.getClass(), "docInfo", null);
        setBooleanField(term41646, term41646.getClass(), "unknown", false);
        setBooleanField(term41646, term41646.getClass(), "resolved", false);
        setField(term41646, term41646.getClass(), "resolveResult", null);
        setField(term41646, term41646.getClass(), "templateTypeMap", null);
        setBooleanField(term41646, term41646.getClass(), "inTemplatedCheckVisit", false);
        setField(term41646, term41646.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = term39603;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "checkPropertyAccessHelper", argTypes, term39503, args);
        assertTrue(recursiveEquals(term39503, term41645));
        assertTrue(recursiveEquals(term39603, term41646));
    }

};


