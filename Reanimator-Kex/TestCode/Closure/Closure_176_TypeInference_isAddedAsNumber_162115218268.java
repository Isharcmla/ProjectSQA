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

public class TypeInference_isAddedAsNumber_162115218268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6201;

    public TypeInference_isAddedAsNumber_162115218268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35450 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term35449 = ((Class) term35450).getDeclaredField((String) "PUBLIC");
        ((Field) term35449).setAccessible(true);
        Object enum88 = ((Field) term35449).get((Object) null);
        term6201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term6203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6217 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6218 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6224 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6231 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6232 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term6239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term6201, term6201.getClass(), "compiler", null);
        setField(term6203, term6203.getClass(), "name", "HqoTWlkbwF");
        setField(term6203, term6203.getClass(), "referencedType", null);
        setField(term6203, term6203.getClass(), "referencedObjType", null);
        setBooleanField(term6203, term6203.getClass(), "visited", false);
        setField(term6218, term6218.getClass(), "baseType", null);
        setField(term6218, term6218.getClass(), "extendedInterfaces", null);
        setField(term6218, term6218.getClass(), "implementedInterfaces", null);
        setField(term6218, term6218.getClass(), "parameters", null);
        setField(term6218, term6218.getClass(), "thrownTypes", null);
        setField(term6218, term6218.getClass(), "templateTypeNames", null);
        setField(term6218, term6218.getClass(), "disposedParameters", null);
        setField(term6218, term6218.getClass(), "description", null);
        setField(term6218, term6218.getClass(), "meaning", null);
        setField(term6218, term6218.getClass(), "deprecated", null);
        setField(term6218, term6218.getClass(), "license", null);
        setField(term6218, term6218.getClass(), "suppressions", null);
        setField(term6218, term6218.getClass(), "modifies", null);
        setField(term6218, term6218.getClass(), "lendsName", null);
        setBooleanField(term6218, term6218.getClass(), "ngInject", true);
        setBooleanField(term6218, term6218.getClass(), "wizaction", true);
        setBooleanField(term6218, term6218.getClass(), "jaggerInject", true);
        setBooleanField(term6218, term6218.getClass(), "jaggerProvide", false);
        setBooleanField(term6218, term6218.getClass(), "jaggerModule", true);
        setField(term6217, term6217.getClass(), "info", term6218);
        setField(term6224, term6224.getClass(), "sourceComment", null);
        setField(term6224, term6224.getClass(), "markers", null);
        setField(term6224, term6224.getClass(), "parameters", null);
        setField(term6224, term6224.getClass(), "throwsDescriptions", null);
        setField(term6224, term6224.getClass(), "blockDescription", null);
        setField(term6224, term6224.getClass(), "fileOverview", null);
        setField(term6224, term6224.getClass(), "returnDescription", null);
        setField(term6224, term6224.getClass(), "version", null);
        setField(term6224, term6224.getClass(), "authors", null);
        setField(term6224, term6224.getClass(), "sees", null);
        setField(term6217, term6217.getClass(), "documentation", term6224);
        setIntField(term6225, term6225.getClass(), "type", 0);
        setField(term6225, term6225.getClass(), "next", null);
        setField(term6225, term6225.getClass(), "first", null);
        setField(term6225, term6225.getClass(), "last", null);
        setField(term6225, term6225.getClass(), "propListHead", null);
        setIntField(term6225, term6225.getClass(), "sourcePosition", 0);
        setField(term6225, term6225.getClass(), "jsType", null);
        setField(term6225, term6225.getClass(), "parent", null);
        setField(term6217, term6217.getClass(), "associatedNode", term6225);
        setField(term6217, term6217.getClass(), "visibility", enum88);
        setIntField(term6217, term6217.getClass(), "bitset", -130649791);
        setField(term6231, term6231.getClass(), "root", null);
        setField(term6231, term6231.getClass(), "sourceName", null);
        setField(term6217, term6217.getClass(), "type", term6231);
        setField(term6232, term6232.getClass(), "root", null);
        setField(term6232, term6232.getClass(), "sourceName", null);
        setField(term6217, term6217.getClass(), "thisType", term6232);
        setBooleanField(term6217, term6217.getClass(), "includeDocumentation", false);
        setIntField(term6217, term6217.getClass(), "originalCommentPosition", 534834644);
        setField(term6203, term6203.getClass(), "docInfo", term6217);
        setBooleanField(term6203, term6203.getClass(), "unknown", true);
        setBooleanField(term6203, term6203.getClass(), "resolved", false);
        setField(term6203, term6203.getClass(), "resolveResult", null);
        setField(term6237, term6237.getClass(), "templateKeys", null);
        setField(term6237, term6237.getClass(), "templateValues", null);
        setField(term6237, term6237.getClass(), "resolvedTemplateValues", null);
        setField(term6237, term6237.getClass(), "registry", null);
        setField(term6203, term6203.getClass(), "templateTypeMap", term6237);
        setBooleanField(term6203, term6203.getClass(), "inTemplatedCheckVisit", false);
        setField(term6203, term6203.getClass(), "registry", null);
        setField(term6202, term6202.getClass(), "objectIndexTemplateKey", term6203);
        setField(term6239, term6239.getClass(), "name", null);
        setField(term6239, term6239.getClass(), "referencedType", null);
        setField(term6239, term6239.getClass(), "referencedObjType", null);
        setBooleanField(term6239, term6239.getClass(), "visited", false);
        setField(term6239, term6239.getClass(), "docInfo", null);
        setBooleanField(term6239, term6239.getClass(), "unknown", false);
        setBooleanField(term6239, term6239.getClass(), "resolved", false);
        setField(term6239, term6239.getClass(), "resolveResult", null);
        setField(term6239, term6239.getClass(), "templateTypeMap", null);
        setBooleanField(term6239, term6239.getClass(), "inTemplatedCheckVisit", false);
        setField(term6239, term6239.getClass(), "registry", null);
        setField(term6202, term6202.getClass(), "objectElementTemplateKey", term6239);
        setField(term6202, term6202.getClass(), "reporter", null);
        setField(term6202, term6202.getClass(), "nativeTypes", null);
        setField(term6202, term6202.getClass(), "namesToTypes", null);
        setField(term6202, term6202.getClass(), "namespaces", null);
        setField(term6202, term6202.getClass(), "nonNullableTypeNames", null);
        setField(term6202, term6202.getClass(), "forwardDeclaredTypes", null);
        setField(term6202, term6202.getClass(), "typesIndexedByProperty", null);
        setField(term6202, term6202.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term6202, term6202.getClass(), "greatestSubtypeByProperty", null);
        setField(term6202, term6202.getClass(), "interfaceToImplementors", null);
        setField(term6202, term6202.getClass(), "unresolvedNamedTypes", null);
        setField(term6202, term6202.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6202, term6202.getClass(), "lastGeneration", false);
        setField(term6202, term6202.getClass(), "templateTypes", null);
        setField(term6202, term6202.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term6202, term6202.getClass(), "tolerateUndefinedValues", false);
        setField(term6201, term6201.getClass(), "registry", term6202);
        setField(term6201, term6201.getClass(), "reverseInterpreter", null);
        setField(term6201, term6201.getClass(), "syntacticScope", null);
        setField(term6201, term6201.getClass(), "functionScope", null);
        setField(term6201, term6201.getClass(), "bottomScope", null);
        setField(term6201, term6201.getClass(), "assertionFunctionsMap", null);
        setField(term6201, term6201.getClass(), "unknownType", null);
        setField(term6201, term6201.getClass(), "cfg", null);
        setField(term6201, term6201.getClass(), "joinOp", null);
        setField(term6201, term6201.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isAddedAsNumber", argTypes, term6201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


