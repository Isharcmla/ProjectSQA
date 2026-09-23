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
     Object term20482;
     Object enum155;

    public TypeInference_getNativeType_159300705599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62671 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term62670 = ((Class) term62671).getDeclaredField((String) "PUBLIC");
        ((Field) term62670).setAccessible(true);
        Object enum154 = ((Field) term62670).get((Object) null);
        term20482 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term20483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term20484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term20498 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20499 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term20505 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term20506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20512 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20513 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term20520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term20482, term20482.getClass(), "compiler", null);
        setField(term20484, term20484.getClass(), "name", "iApJWgnQkP");
        setField(term20484, term20484.getClass(), "referencedType", null);
        setField(term20484, term20484.getClass(), "referencedObjType", null);
        setBooleanField(term20484, term20484.getClass(), "visited", true);
        setField(term20499, term20499.getClass(), "baseType", null);
        setField(term20499, term20499.getClass(), "extendedInterfaces", null);
        setField(term20499, term20499.getClass(), "implementedInterfaces", null);
        setField(term20499, term20499.getClass(), "parameters", null);
        setField(term20499, term20499.getClass(), "thrownTypes", null);
        setField(term20499, term20499.getClass(), "templateTypeNames", null);
        setField(term20499, term20499.getClass(), "disposedParameters", null);
        setField(term20499, term20499.getClass(), "description", null);
        setField(term20499, term20499.getClass(), "meaning", null);
        setField(term20499, term20499.getClass(), "deprecated", null);
        setField(term20499, term20499.getClass(), "license", null);
        setField(term20499, term20499.getClass(), "suppressions", null);
        setField(term20499, term20499.getClass(), "modifies", null);
        setField(term20499, term20499.getClass(), "lendsName", null);
        setBooleanField(term20499, term20499.getClass(), "ngInject", false);
        setBooleanField(term20499, term20499.getClass(), "wizaction", true);
        setBooleanField(term20499, term20499.getClass(), "jaggerInject", false);
        setBooleanField(term20499, term20499.getClass(), "jaggerProvide", false);
        setBooleanField(term20499, term20499.getClass(), "jaggerModule", false);
        setField(term20498, term20498.getClass(), "info", term20499);
        setField(term20505, term20505.getClass(), "sourceComment", null);
        setField(term20505, term20505.getClass(), "markers", null);
        setField(term20505, term20505.getClass(), "parameters", null);
        setField(term20505, term20505.getClass(), "throwsDescriptions", null);
        setField(term20505, term20505.getClass(), "blockDescription", null);
        setField(term20505, term20505.getClass(), "fileOverview", null);
        setField(term20505, term20505.getClass(), "returnDescription", null);
        setField(term20505, term20505.getClass(), "version", null);
        setField(term20505, term20505.getClass(), "authors", null);
        setField(term20505, term20505.getClass(), "sees", null);
        setField(term20498, term20498.getClass(), "documentation", term20505);
        setIntField(term20506, term20506.getClass(), "type", 0);
        setField(term20506, term20506.getClass(), "next", null);
        setField(term20506, term20506.getClass(), "first", null);
        setField(term20506, term20506.getClass(), "last", null);
        setField(term20506, term20506.getClass(), "propListHead", null);
        setIntField(term20506, term20506.getClass(), "sourcePosition", 0);
        setField(term20506, term20506.getClass(), "jsType", null);
        setField(term20506, term20506.getClass(), "parent", null);
        setField(term20498, term20498.getClass(), "associatedNode", term20506);
        setField(term20498, term20498.getClass(), "visibility", enum154);
        setIntField(term20498, term20498.getClass(), "bitset", 188512644);
        setField(term20512, term20512.getClass(), "root", null);
        setField(term20512, term20512.getClass(), "sourceName", null);
        setField(term20498, term20498.getClass(), "type", term20512);
        setField(term20513, term20513.getClass(), "root", null);
        setField(term20513, term20513.getClass(), "sourceName", null);
        setField(term20498, term20498.getClass(), "thisType", term20513);
        setBooleanField(term20498, term20498.getClass(), "includeDocumentation", true);
        setIntField(term20498, term20498.getClass(), "originalCommentPosition", 1851127634);
        setField(term20484, term20484.getClass(), "docInfo", term20498);
        setBooleanField(term20484, term20484.getClass(), "unknown", false);
        setBooleanField(term20484, term20484.getClass(), "resolved", true);
        setField(term20484, term20484.getClass(), "resolveResult", null);
        setField(term20518, term20518.getClass(), "templateKeys", null);
        setField(term20518, term20518.getClass(), "templateValues", null);
        setField(term20518, term20518.getClass(), "resolvedTemplateValues", null);
        setField(term20518, term20518.getClass(), "registry", null);
        setField(term20484, term20484.getClass(), "templateTypeMap", term20518);
        setBooleanField(term20484, term20484.getClass(), "inTemplatedCheckVisit", true);
        setField(term20484, term20484.getClass(), "registry", null);
        setField(term20483, term20483.getClass(), "objectIndexTemplateKey", term20484);
        setField(term20520, term20520.getClass(), "name", null);
        setField(term20520, term20520.getClass(), "referencedType", null);
        setField(term20520, term20520.getClass(), "referencedObjType", null);
        setBooleanField(term20520, term20520.getClass(), "visited", false);
        setField(term20520, term20520.getClass(), "docInfo", null);
        setBooleanField(term20520, term20520.getClass(), "unknown", false);
        setBooleanField(term20520, term20520.getClass(), "resolved", false);
        setField(term20520, term20520.getClass(), "resolveResult", null);
        setField(term20520, term20520.getClass(), "templateTypeMap", null);
        setBooleanField(term20520, term20520.getClass(), "inTemplatedCheckVisit", false);
        setField(term20520, term20520.getClass(), "registry", null);
        setField(term20483, term20483.getClass(), "objectElementTemplateKey", term20520);
        setField(term20483, term20483.getClass(), "reporter", null);
        setField(term20483, term20483.getClass(), "nativeTypes", null);
        setField(term20483, term20483.getClass(), "namesToTypes", null);
        setField(term20483, term20483.getClass(), "namespaces", null);
        setField(term20483, term20483.getClass(), "nonNullableTypeNames", null);
        setField(term20483, term20483.getClass(), "forwardDeclaredTypes", null);
        setField(term20483, term20483.getClass(), "typesIndexedByProperty", null);
        setField(term20483, term20483.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term20483, term20483.getClass(), "greatestSubtypeByProperty", null);
        setField(term20483, term20483.getClass(), "interfaceToImplementors", null);
        setField(term20483, term20483.getClass(), "unresolvedNamedTypes", null);
        setField(term20483, term20483.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20483, term20483.getClass(), "lastGeneration", false);
        setField(term20483, term20483.getClass(), "templateTypes", null);
        setField(term20483, term20483.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term20483, term20483.getClass(), "tolerateUndefinedValues", false);
        setField(term20482, term20482.getClass(), "registry", term20483);
        setField(term20482, term20482.getClass(), "reverseInterpreter", null);
        setField(term20482, term20482.getClass(), "syntacticScope", null);
        setField(term20482, term20482.getClass(), "functionScope", null);
        setField(term20482, term20482.getClass(), "bottomScope", null);
        setField(term20482, term20482.getClass(), "assertionFunctionsMap", null);
        setField(term20482, term20482.getClass(), "unknownType", null);
        setField(term20482, term20482.getClass(), "cfg", null);
        setField(term20482, term20482.getClass(), "joinOp", null);
        setField(term20482, term20482.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term62936 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term62935 = ((Class) term62936).getDeclaredField((String) "OBJECT_TYPE");
        ((Field) term62935).setAccessible(true);
        enum155 = ((Field) term62935).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum155;
        try {
            callMethod(klass, "getNativeType", argTypes, term20482, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


