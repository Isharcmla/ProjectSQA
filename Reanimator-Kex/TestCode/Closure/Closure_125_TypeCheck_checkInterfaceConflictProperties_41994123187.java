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

public class TypeCheck_checkInterfaceConflictProperties_41994123187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44599;
     Object term44723;
     Object term45181;
     Object term45182;

    public TypeCheck_checkInterfaceConflictProperties_41994123187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44599 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term44723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term45181 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term45181, term45181.getClass(), "compiler", null);
        setField(term45181, term45181.getClass(), "validator", null);
        setField(term45181, term45181.getClass(), "reverseInterpreter", null);
        setField(term45181, term45181.getClass(), "typeRegistry", null);
        setField(term45181, term45181.getClass(), "topScope", null);
        setField(term45181, term45181.getClass(), "scopeCreator", null);
        setField(term45181, term45181.getClass(), "reportMissingOverride", null);
        setBooleanField(term45181, term45181.getClass(), "reportUnknownTypes", false);
        setBooleanField(term45181, term45181.getClass(), "reportMissingProperties", false);
        setField(term45181, term45181.getClass(), "inferJSDocInfo", null);
        setIntField(term45181, term45181.getClass(), "typedCount", 0);
        setIntField(term45181, term45181.getClass(), "nullCount", 0);
        setIntField(term45181, term45181.getClass(), "unknownCount", 0);
        setBooleanField(term45181, term45181.getClass(), "inExterns", false);
        setIntField(term45181, term45181.getClass(), "noTypeCheckSection", 0);
        setField(term45181, term45181.getClass(), "editDistance", null);
        term45182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term45182, term45182.getClass(), "typeExpr", null);
        setField(term45182, term45182.getClass(), "sourceName", null);
        setBooleanField(term45182, term45182.getClass(), "isChecked", false);
        setBooleanField(term45182, term45182.getClass(), "visited", false);
        setField(term45182, term45182.getClass(), "docInfo", null);
        setBooleanField(term45182, term45182.getClass(), "unknown", false);
        setBooleanField(term45182, term45182.getClass(), "resolved", false);
        setField(term45182, term45182.getClass(), "resolveResult", null);
        setField(term45182, term45182.getClass(), "templateTypeMap", null);
        setBooleanField(term45182, term45182.getClass(), "inTemplatedCheckVisit", false);
        setField(term45182, term45182.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.HashMap");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term44723;
        callMethod(klass, "checkInterfaceConflictProperties", argTypes, term44599, args);
        assertTrue(recursiveEquals(term44599, term45181));
        assertTrue(recursiveEquals(term44723, null));
    }

};


