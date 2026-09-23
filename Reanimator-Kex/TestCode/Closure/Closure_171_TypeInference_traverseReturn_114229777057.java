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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeInference_traverseReturn_114229777057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2339;
     Object term2381;

    public TypeInference_traverseReturn_114229777057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27651 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term27650 = ((Class) term27651).getDeclaredField((String) "PRIVATE");
        ((Field) term27650).setAccessible(true);
        Object enum73 = ((Field) term27650).get((Object) null);
        term2339 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term2340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2355 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2356 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2359 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2366 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2367 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term2374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2339, term2339.getClass(), "compiler", null);
        setField(term2341, term2341.getClass(), "name", "kVEZMHmRtR");
        setField(term2341, term2341.getClass(), "referencedType", null);
        setField(term2341, term2341.getClass(), "referencedObjType", null);
        setBooleanField(term2341, term2341.getClass(), "visited", true);
        setField(term2356, term2356.getClass(), "baseType", null);
        setField(term2356, term2356.getClass(), "extendedInterfaces", null);
        setField(term2356, term2356.getClass(), "implementedInterfaces", null);
        setField(term2356, term2356.getClass(), "parameters", null);
        setField(term2356, term2356.getClass(), "thrownTypes", null);
        setField(term2356, term2356.getClass(), "templateTypeNames", null);
        setField(term2356, term2356.getClass(), "description", null);
        setField(term2356, term2356.getClass(), "meaning", null);
        setField(term2356, term2356.getClass(), "deprecated", null);
        setField(term2356, term2356.getClass(), "license", null);
        setField(term2356, term2356.getClass(), "suppressions", null);
        setField(term2356, term2356.getClass(), "modifies", null);
        setField(term2356, term2356.getClass(), "lendsName", null);
        setBooleanField(term2356, term2356.getClass(), "ngInject", true);
        setBooleanField(term2356, term2356.getClass(), "wizaction", false);
        setField(term2355, term2355.getClass(), "info", term2356);
        setField(term2359, term2359.getClass(), "sourceComment", null);
        setField(term2359, term2359.getClass(), "markers", null);
        setField(term2359, term2359.getClass(), "parameters", null);
        setField(term2359, term2359.getClass(), "throwsDescriptions", null);
        setField(term2359, term2359.getClass(), "blockDescription", null);
        setField(term2359, term2359.getClass(), "fileOverview", null);
        setField(term2359, term2359.getClass(), "returnDescription", null);
        setField(term2359, term2359.getClass(), "version", null);
        setField(term2359, term2359.getClass(), "authors", null);
        setField(term2359, term2359.getClass(), "sees", null);
        setField(term2355, term2355.getClass(), "documentation", term2359);
        setIntField(term2360, term2360.getClass(), "type", 0);
        setField(term2360, term2360.getClass(), "next", null);
        setField(term2360, term2360.getClass(), "first", null);
        setField(term2360, term2360.getClass(), "last", null);
        setField(term2360, term2360.getClass(), "propListHead", null);
        setIntField(term2360, term2360.getClass(), "sourcePosition", 0);
        setField(term2360, term2360.getClass(), "jsType", null);
        setField(term2360, term2360.getClass(), "parent", null);
        setField(term2355, term2355.getClass(), "associatedNode", term2360);
        setField(term2355, term2355.getClass(), "visibility", enum73);
        setIntField(term2355, term2355.getClass(), "bitset", 1442160736);
        setField(term2366, term2366.getClass(), "root", null);
        setField(term2366, term2366.getClass(), "sourceName", null);
        setField(term2355, term2355.getClass(), "type", term2366);
        setField(term2367, term2367.getClass(), "root", null);
        setField(term2367, term2367.getClass(), "sourceName", null);
        setField(term2355, term2355.getClass(), "thisType", term2367);
        setBooleanField(term2355, term2355.getClass(), "includeDocumentation", true);
        setIntField(term2355, term2355.getClass(), "originalCommentPosition", 1114000454);
        setField(term2341, term2341.getClass(), "docInfo", term2355);
        setBooleanField(term2341, term2341.getClass(), "unknown", false);
        setBooleanField(term2341, term2341.getClass(), "resolved", false);
        setField(term2341, term2341.getClass(), "resolveResult", null);
        setField(term2372, term2372.getClass(), "templateKeys", null);
        setField(term2372, term2372.getClass(), "templateValues", null);
        setField(term2372, term2372.getClass(), "resolvedTemplateValues", null);
        setField(term2372, term2372.getClass(), "registry", null);
        setField(term2341, term2341.getClass(), "templateTypeMap", term2372);
        setBooleanField(term2341, term2341.getClass(), "inTemplatedCheckVisit", true);
        setField(term2341, term2341.getClass(), "registry", null);
        setField(term2340, term2340.getClass(), "objectIndexTemplateKey", term2341);
        setField(term2374, term2374.getClass(), "name", null);
        setField(term2374, term2374.getClass(), "referencedType", null);
        setField(term2374, term2374.getClass(), "referencedObjType", null);
        setBooleanField(term2374, term2374.getClass(), "visited", false);
        setField(term2374, term2374.getClass(), "docInfo", null);
        setBooleanField(term2374, term2374.getClass(), "unknown", false);
        setBooleanField(term2374, term2374.getClass(), "resolved", false);
        setField(term2374, term2374.getClass(), "resolveResult", null);
        setField(term2374, term2374.getClass(), "templateTypeMap", null);
        setBooleanField(term2374, term2374.getClass(), "inTemplatedCheckVisit", false);
        setField(term2374, term2374.getClass(), "registry", null);
        setField(term2340, term2340.getClass(), "objectElementTemplateKey", term2374);
        setField(term2340, term2340.getClass(), "reporter", null);
        setField(term2340, term2340.getClass(), "nativeTypes", null);
        setField(term2340, term2340.getClass(), "namesToTypes", null);
        setField(term2340, term2340.getClass(), "namespaces", null);
        setField(term2340, term2340.getClass(), "nonNullableTypeNames", null);
        setField(term2340, term2340.getClass(), "forwardDeclaredTypes", null);
        setField(term2340, term2340.getClass(), "typesIndexedByProperty", null);
        setField(term2340, term2340.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term2340, term2340.getClass(), "greatestSubtypeByProperty", null);
        setField(term2340, term2340.getClass(), "interfaceToImplementors", null);
        setField(term2340, term2340.getClass(), "unresolvedNamedTypes", null);
        setField(term2340, term2340.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2340, term2340.getClass(), "lastGeneration", false);
        setField(term2340, term2340.getClass(), "templateTypes", null);
        setField(term2340, term2340.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term2340, term2340.getClass(), "tolerateUndefinedValues", false);
        setField(term2340, term2340.getClass(), "resolveMode", null);
        setField(term2339, term2339.getClass(), "registry", term2340);
        setField(term2339, term2339.getClass(), "reverseInterpreter", null);
        setField(term2339, term2339.getClass(), "syntacticScope", null);
        setField(term2339, term2339.getClass(), "functionScope", null);
        setField(term2339, term2339.getClass(), "bottomScope", null);
        setField(term2339, term2339.getClass(), "assertionFunctionsMap", null);
        setField(term2339, term2339.getClass(), "unknownType", null);
        setField(term2339, term2339.getClass(), "cfg", null);
        setField(term2339, term2339.getClass(), "joinOp", null);
        setField(term2339, term2339.getClass(), "orderedWorkSet", null);
        term2381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2381, term2381.getClass(), "type", -1772434990);
        setIntField(term2383, term2383.getClass(), "type", -1845499264);
        setIntField(term2385, term2385.getClass(), "type", -505439934);
        setIntField(term2387, term2387.getClass(), "type", -344842608);
        setIntField(term2389, term2389.getClass(), "type", 941650513);
        setField(term2389, term2389.getClass(), "next", null);
        setField(term2389, term2389.getClass(), "first", null);
        setField(term2389, term2389.getClass(), "last", null);
        setField(term2389, term2389.getClass(), "propListHead", null);
        setIntField(term2389, term2389.getClass(), "sourcePosition", 0);
        setField(term2389, term2389.getClass(), "jsType", null);
        setField(term2389, term2389.getClass(), "parent", null);
        setField(term2387, term2387.getClass(), "next", term2389);
        setIntField(term2392, term2392.getClass(), "type", 444029505);
        setField(term2392, term2392.getClass(), "next", null);
        setField(term2392, term2392.getClass(), "first", null);
        setField(term2392, term2392.getClass(), "last", term2389);
        setField(term2392, term2392.getClass(), "propListHead", null);
        setIntField(term2392, term2392.getClass(), "sourcePosition", 0);
        setField(term2392, term2392.getClass(), "jsType", null);
        setField(term2392, term2392.getClass(), "parent", null);
        setField(term2387, term2387.getClass(), "first", term2392);
        setField(term2387, term2387.getClass(), "last", term2385);
        setField(term2387, term2387.getClass(), "propListHead", null);
        setIntField(term2387, term2387.getClass(), "sourcePosition", 0);
        setField(term2387, term2387.getClass(), "jsType", null);
        setField(term2387, term2387.getClass(), "parent", null);
        setField(term2385, term2385.getClass(), "next", term2387);
        setField(term2385, term2385.getClass(), "first", term2389);
        setIntField(term2396, term2396.getClass(), "type", -1263114719);
        setIntField(term2398, term2398.getClass(), "type", -894662986);
        setField(term2398, term2398.getClass(), "next", null);
        setField(term2398, term2398.getClass(), "first", term2392);
        setField(term2398, term2398.getClass(), "last", term2387);
        setField(term2398, term2398.getClass(), "propListHead", null);
        setIntField(term2398, term2398.getClass(), "sourcePosition", 0);
        setField(term2398, term2398.getClass(), "jsType", null);
        setField(term2398, term2398.getClass(), "parent", null);
        setField(term2396, term2396.getClass(), "next", term2398);
        setField(term2396, term2396.getClass(), "first", term2383);
        setField(term2396, term2396.getClass(), "last", term2383);
        setField(term2396, term2396.getClass(), "propListHead", null);
        setIntField(term2396, term2396.getClass(), "sourcePosition", 0);
        setField(term2396, term2396.getClass(), "jsType", null);
        setField(term2396, term2396.getClass(), "parent", null);
        setField(term2385, term2385.getClass(), "last", term2396);
        setField(term2385, term2385.getClass(), "propListHead", null);
        setIntField(term2385, term2385.getClass(), "sourcePosition", 0);
        setField(term2385, term2385.getClass(), "jsType", null);
        setField(term2385, term2385.getClass(), "parent", null);
        setField(term2383, term2383.getClass(), "next", term2385);
        setIntField(term2403, term2403.getClass(), "type", 304775596);
        setField(term2403, term2403.getClass(), "next", term2396);
        setField(term2403, term2403.getClass(), "first", term2398);
        setField(term2403, term2403.getClass(), "last", term2381);
        setField(term2403, term2403.getClass(), "propListHead", null);
        setIntField(term2403, term2403.getClass(), "sourcePosition", 0);
        setField(term2403, term2403.getClass(), "jsType", null);
        setField(term2403, term2403.getClass(), "parent", null);
        setField(term2383, term2383.getClass(), "first", term2403);
        setField(term2383, term2383.getClass(), "last", term2403);
        setField(term2383, term2383.getClass(), "propListHead", null);
        setIntField(term2383, term2383.getClass(), "sourcePosition", 0);
        setField(term2383, term2383.getClass(), "jsType", null);
        setField(term2383, term2383.getClass(), "parent", null);
        setField(term2381, term2381.getClass(), "next", term2383);
        setField(term2381, term2381.getClass(), "first", term2387);
        setField(term2381, term2381.getClass(), "last", term2389);
        setField(term2381, term2381.getClass(), "propListHead", null);
        setIntField(term2381, term2381.getClass(), "sourcePosition", 0);
        setField(term2381, term2381.getClass(), "jsType", null);
        setField(term2381, term2381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2381;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term2339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


