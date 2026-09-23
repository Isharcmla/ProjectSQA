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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class TypeCheck_init_100985953772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;

    public TypeCheck_init_100985953772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1351 = new ArrayList();
        ((ArrayList) term1351).add((Object)null);
        ArrayList term1354 = new ArrayList();
        HashMap term1357 = new HashMap();
        ArrayList term1362 = new ArrayList();
        ((ArrayList) term1362).add((Object)null);
        ((ArrayList) term1362).add((Object)null);
        HashSet term1369 = new HashSet();
        HashSet term1370 = new HashSet();
        ArrayList term1376 = new ArrayList();
        ((ArrayList) term1376).add((Object)null);
        HashMap term1379 = new HashMap();
        Class<? extends Object> term14949 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term14948 = ((Class) term14949).getDeclaredField((String) "INHERITED");
        ((Field) term14948).setAccessible(true);
        Object enum22 = ((Field) term14948).get((Object) null);
        term1333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term1334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1348 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1349 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1350 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1374 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1391 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1392 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term1399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1334, term1334.getClass(), "name", "UoYtihxVaS");
        setField(term1334, term1334.getClass(), "referencedType", null);
        setField(term1334, term1334.getClass(), "referencedObjType", null);
        setBooleanField(term1334, term1334.getClass(), "visited", false);
        setField(term1350, term1350.getClass(), "root", null);
        setField(term1350, term1350.getClass(), "sourceName", null);
        setField(term1349, term1349.getClass(), "baseType", term1350);
        setField(term1349, term1349.getClass(), "extendedInterfaces", term1351);
        setField(term1349, term1349.getClass(), "implementedInterfaces", term1354);
        setField(term1349, term1349.getClass(), "parameters", term1357);
        setField(term1349, term1349.getClass(), "thrownTypes", term1362);
        setField(term1349, term1349.getClass(), "templateTypeNames", null);
        setField(term1349, term1349.getClass(), "description", "");
        setField(term1349, term1349.getClass(), "meaning", "");
        setField(term1349, term1349.getClass(), "deprecated", "");
        setField(term1349, term1349.getClass(), "license", "");
        setField(term1349, term1349.getClass(), "suppressions", term1369);
        setField(term1349, term1349.getClass(), "modifies", term1370);
        setField(term1349, term1349.getClass(), "lendsName", "");
        setBooleanField(term1349, term1349.getClass(), "ngInject", true);
        setBooleanField(term1349, term1349.getClass(), "wizaction", true);
        setField(term1348, term1348.getClass(), "info", term1349);
        setField(term1374, term1374.getClass(), "sourceComment", "");
        setField(term1374, term1374.getClass(), "markers", term1376);
        setField(term1374, term1374.getClass(), "parameters", term1379);
        setField(term1374, term1374.getClass(), "throwsDescriptions", null);
        setField(term1374, term1374.getClass(), "blockDescription", null);
        setField(term1374, term1374.getClass(), "fileOverview", null);
        setField(term1374, term1374.getClass(), "returnDescription", null);
        setField(term1374, term1374.getClass(), "version", null);
        setField(term1374, term1374.getClass(), "authors", null);
        setField(term1374, term1374.getClass(), "sees", null);
        setField(term1348, term1348.getClass(), "documentation", term1374);
        setIntField(term1384, term1384.getClass(), "type", 0);
        setField(term1384, term1384.getClass(), "next", null);
        setField(term1384, term1384.getClass(), "first", null);
        setField(term1384, term1384.getClass(), "last", null);
        setField(term1384, term1384.getClass(), "propListHead", null);
        setIntField(term1384, term1384.getClass(), "sourcePosition", 0);
        setField(term1384, term1384.getClass(), "jsType", null);
        setField(term1384, term1384.getClass(), "parent", null);
        setField(term1348, term1348.getClass(), "associatedNode", term1384);
        setField(term1348, term1348.getClass(), "visibility", enum22);
        setIntField(term1348, term1348.getClass(), "bitset", -226514366);
        setField(term1391, term1391.getClass(), "root", null);
        setField(term1391, term1391.getClass(), "sourceName", null);
        setField(term1348, term1348.getClass(), "type", term1391);
        setField(term1392, term1392.getClass(), "root", null);
        setField(term1392, term1392.getClass(), "sourceName", null);
        setField(term1348, term1348.getClass(), "thisType", term1392);
        setBooleanField(term1348, term1348.getClass(), "includeDocumentation", false);
        setIntField(term1348, term1348.getClass(), "originalCommentPosition", 1193880199);
        setField(term1334, term1334.getClass(), "docInfo", term1348);
        setBooleanField(term1334, term1334.getClass(), "unknown", false);
        setBooleanField(term1334, term1334.getClass(), "resolved", true);
        setField(term1334, term1334.getClass(), "resolveResult", null);
        setField(term1397, term1397.getClass(), "templateKeys", null);
        setField(term1397, term1397.getClass(), "templateValues", null);
        setField(term1397, term1397.getClass(), "resolvedTemplateValues", null);
        setField(term1397, term1397.getClass(), "registry", null);
        setField(term1334, term1334.getClass(), "templateTypeMap", term1397);
        setBooleanField(term1334, term1334.getClass(), "inTemplatedCheckVisit", true);
        setField(term1334, term1334.getClass(), "registry", null);
        setField(term1333, term1333.getClass(), "objectIndexTemplateKey", term1334);
        setField(term1399, term1399.getClass(), "name", null);
        setField(term1399, term1399.getClass(), "referencedType", null);
        setField(term1399, term1399.getClass(), "referencedObjType", null);
        setBooleanField(term1399, term1399.getClass(), "visited", false);
        setField(term1399, term1399.getClass(), "docInfo", null);
        setBooleanField(term1399, term1399.getClass(), "unknown", false);
        setBooleanField(term1399, term1399.getClass(), "resolved", false);
        setField(term1399, term1399.getClass(), "resolveResult", null);
        setField(term1399, term1399.getClass(), "templateTypeMap", null);
        setBooleanField(term1399, term1399.getClass(), "inTemplatedCheckVisit", false);
        setField(term1399, term1399.getClass(), "registry", null);
        setField(term1333, term1333.getClass(), "objectElementTemplateKey", term1399);
        setField(term1333, term1333.getClass(), "reporter", null);
        setField(term1333, term1333.getClass(), "nativeTypes", null);
        setField(term1333, term1333.getClass(), "namesToTypes", null);
        setField(term1333, term1333.getClass(), "namespaces", null);
        setField(term1333, term1333.getClass(), "nonNullableTypeNames", null);
        setField(term1333, term1333.getClass(), "forwardDeclaredTypes", null);
        setField(term1333, term1333.getClass(), "typesIndexedByProperty", null);
        setField(term1333, term1333.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term1333, term1333.getClass(), "greatestSubtypeByProperty", null);
        setField(term1333, term1333.getClass(), "interfaceToImplementors", null);
        setField(term1333, term1333.getClass(), "unresolvedNamedTypes", null);
        setField(term1333, term1333.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1333, term1333.getClass(), "lastGeneration", false);
        setField(term1333, term1333.getClass(), "templateTypes", null);
        setField(term1333, term1333.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term1333, term1333.getClass(), "tolerateUndefinedValues", false);
        setField(term1333, term1333.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1333;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


