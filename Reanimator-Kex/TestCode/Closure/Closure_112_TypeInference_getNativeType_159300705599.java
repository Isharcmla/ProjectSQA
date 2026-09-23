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

public class TypeInference_getNativeType_159300705599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20452;
     Object enum157;

    public TypeInference_getNativeType_159300705599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63044 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term63043 = ((Class) term63044).getDeclaredField((String) "PUBLIC");
        ((Field) term63043).setAccessible(true);
        Object enum156 = ((Field) term63043).get((Object) null);
        term20452 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term20453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term20454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term20468 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20469 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term20475 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term20476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20482 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20483 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term20490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term20452, term20452.getClass(), "compiler", null);
        setField(term20454, term20454.getClass(), "name", "RlyxtfCqKY");
        setField(term20454, term20454.getClass(), "referencedType", null);
        setField(term20454, term20454.getClass(), "referencedObjType", null);
        setBooleanField(term20454, term20454.getClass(), "visited", false);
        setField(term20469, term20469.getClass(), "baseType", null);
        setField(term20469, term20469.getClass(), "extendedInterfaces", null);
        setField(term20469, term20469.getClass(), "implementedInterfaces", null);
        setField(term20469, term20469.getClass(), "parameters", null);
        setField(term20469, term20469.getClass(), "thrownTypes", null);
        setField(term20469, term20469.getClass(), "templateTypeNames", null);
        setField(term20469, term20469.getClass(), "disposedParameters", null);
        setField(term20469, term20469.getClass(), "description", null);
        setField(term20469, term20469.getClass(), "meaning", null);
        setField(term20469, term20469.getClass(), "deprecated", null);
        setField(term20469, term20469.getClass(), "license", null);
        setField(term20469, term20469.getClass(), "suppressions", null);
        setField(term20469, term20469.getClass(), "modifies", null);
        setField(term20469, term20469.getClass(), "lendsName", null);
        setBooleanField(term20469, term20469.getClass(), "ngInject", false);
        setBooleanField(term20469, term20469.getClass(), "wizaction", true);
        setBooleanField(term20469, term20469.getClass(), "jaggerInject", true);
        setBooleanField(term20469, term20469.getClass(), "jaggerProvide", false);
        setBooleanField(term20469, term20469.getClass(), "jaggerModule", true);
        setField(term20468, term20468.getClass(), "info", term20469);
        setField(term20475, term20475.getClass(), "sourceComment", null);
        setField(term20475, term20475.getClass(), "markers", null);
        setField(term20475, term20475.getClass(), "parameters", null);
        setField(term20475, term20475.getClass(), "throwsDescriptions", null);
        setField(term20475, term20475.getClass(), "blockDescription", null);
        setField(term20475, term20475.getClass(), "fileOverview", null);
        setField(term20475, term20475.getClass(), "returnDescription", null);
        setField(term20475, term20475.getClass(), "version", null);
        setField(term20475, term20475.getClass(), "authors", null);
        setField(term20475, term20475.getClass(), "sees", null);
        setField(term20468, term20468.getClass(), "documentation", term20475);
        setIntField(term20476, term20476.getClass(), "type", 0);
        setField(term20476, term20476.getClass(), "next", null);
        setField(term20476, term20476.getClass(), "first", null);
        setField(term20476, term20476.getClass(), "last", null);
        setField(term20476, term20476.getClass(), "propListHead", null);
        setIntField(term20476, term20476.getClass(), "sourcePosition", 0);
        setField(term20476, term20476.getClass(), "jsType", null);
        setField(term20476, term20476.getClass(), "parent", null);
        setField(term20468, term20468.getClass(), "associatedNode", term20476);
        setField(term20468, term20468.getClass(), "visibility", enum156);
        setIntField(term20468, term20468.getClass(), "bitset", 872295704);
        setField(term20482, term20482.getClass(), "root", term20476);
        setField(term20482, term20482.getClass(), "sourceName", null);
        setField(term20468, term20468.getClass(), "type", term20482);
        setField(term20483, term20483.getClass(), "root", null);
        setField(term20483, term20483.getClass(), "sourceName", null);
        setField(term20468, term20468.getClass(), "thisType", term20483);
        setBooleanField(term20468, term20468.getClass(), "includeDocumentation", false);
        setIntField(term20468, term20468.getClass(), "originalCommentPosition", 86041387);
        setField(term20454, term20454.getClass(), "docInfo", term20468);
        setBooleanField(term20454, term20454.getClass(), "unknown", true);
        setBooleanField(term20454, term20454.getClass(), "resolved", true);
        setField(term20454, term20454.getClass(), "resolveResult", null);
        setField(term20488, term20488.getClass(), "templateKeys", null);
        setField(term20488, term20488.getClass(), "templateValues", null);
        setField(term20488, term20488.getClass(), "resolvedTemplateValues", null);
        setField(term20488, term20488.getClass(), "registry", null);
        setField(term20454, term20454.getClass(), "templateTypeMap", term20488);
        setBooleanField(term20454, term20454.getClass(), "inTemplatedCheckVisit", true);
        setField(term20454, term20454.getClass(), "registry", null);
        setField(term20453, term20453.getClass(), "objectIndexTemplateKey", term20454);
        setField(term20490, term20490.getClass(), "name", null);
        setField(term20490, term20490.getClass(), "referencedType", null);
        setField(term20490, term20490.getClass(), "referencedObjType", null);
        setBooleanField(term20490, term20490.getClass(), "visited", false);
        setField(term20490, term20490.getClass(), "docInfo", null);
        setBooleanField(term20490, term20490.getClass(), "unknown", false);
        setBooleanField(term20490, term20490.getClass(), "resolved", false);
        setField(term20490, term20490.getClass(), "resolveResult", null);
        setField(term20490, term20490.getClass(), "templateTypeMap", null);
        setBooleanField(term20490, term20490.getClass(), "inTemplatedCheckVisit", false);
        setField(term20490, term20490.getClass(), "registry", null);
        setField(term20453, term20453.getClass(), "objectElementTemplateKey", term20490);
        setField(term20453, term20453.getClass(), "reporter", null);
        setField(term20453, term20453.getClass(), "nativeTypes", null);
        setField(term20453, term20453.getClass(), "namesToTypes", null);
        setField(term20453, term20453.getClass(), "namespaces", null);
        setField(term20453, term20453.getClass(), "nonNullableTypeNames", null);
        setField(term20453, term20453.getClass(), "forwardDeclaredTypes", null);
        setField(term20453, term20453.getClass(), "typesIndexedByProperty", null);
        setField(term20453, term20453.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term20453, term20453.getClass(), "greatestSubtypeByProperty", null);
        setField(term20453, term20453.getClass(), "interfaceToImplementors", null);
        setField(term20453, term20453.getClass(), "unresolvedNamedTypes", null);
        setField(term20453, term20453.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20453, term20453.getClass(), "lastGeneration", false);
        setField(term20453, term20453.getClass(), "templateTypes", null);
        setField(term20453, term20453.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term20453, term20453.getClass(), "tolerateUndefinedValues", false);
        setField(term20452, term20452.getClass(), "registry", term20453);
        setField(term20452, term20452.getClass(), "reverseInterpreter", null);
        setField(term20452, term20452.getClass(), "syntacticScope", null);
        setField(term20452, term20452.getClass(), "functionScope", null);
        setField(term20452, term20452.getClass(), "bottomScope", null);
        setField(term20452, term20452.getClass(), "assertionFunctionsMap", null);
        setField(term20452, term20452.getClass(), "unknownType", null);
        setField(term20452, term20452.getClass(), "cfg", null);
        setField(term20452, term20452.getClass(), "joinOp", null);
        setField(term20452, term20452.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term63389 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term63388 = ((Class) term63389).getDeclaredField((String) "OBJECT_TYPE");
        ((Field) term63388).setAccessible(true);
        enum157 = ((Field) term63388).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum157;
        try {
            callMethod(klass, "getNativeType", argTypes, term20452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


