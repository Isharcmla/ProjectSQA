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
     Object term20699;
     Object enum160;

    public TypeInference_getNativeType_159300705599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64000 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term63999 = ((Class) term64000).getDeclaredField((String) "PRIVATE");
        ((Field) term63999).setAccessible(true);
        Object enum159 = ((Field) term63999).get((Object) null);
        term20699 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term20700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term20701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term20715 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20716 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term20719 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term20720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20726 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20727 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term20734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term20699, term20699.getClass(), "compiler", null);
        setField(term20701, term20701.getClass(), "name", "iApJWgnQkP");
        setField(term20701, term20701.getClass(), "referencedType", null);
        setField(term20701, term20701.getClass(), "referencedObjType", null);
        setBooleanField(term20701, term20701.getClass(), "visited", false);
        setField(term20716, term20716.getClass(), "baseType", null);
        setField(term20716, term20716.getClass(), "extendedInterfaces", null);
        setField(term20716, term20716.getClass(), "implementedInterfaces", null);
        setField(term20716, term20716.getClass(), "parameters", null);
        setField(term20716, term20716.getClass(), "thrownTypes", null);
        setField(term20716, term20716.getClass(), "templateTypeNames", null);
        setField(term20716, term20716.getClass(), "description", null);
        setField(term20716, term20716.getClass(), "meaning", null);
        setField(term20716, term20716.getClass(), "deprecated", null);
        setField(term20716, term20716.getClass(), "license", null);
        setField(term20716, term20716.getClass(), "suppressions", null);
        setField(term20716, term20716.getClass(), "modifies", null);
        setField(term20716, term20716.getClass(), "lendsName", null);
        setBooleanField(term20716, term20716.getClass(), "ngInject", false);
        setBooleanField(term20716, term20716.getClass(), "wizaction", true);
        setField(term20715, term20715.getClass(), "info", term20716);
        setField(term20719, term20719.getClass(), "sourceComment", null);
        setField(term20719, term20719.getClass(), "markers", null);
        setField(term20719, term20719.getClass(), "parameters", null);
        setField(term20719, term20719.getClass(), "throwsDescriptions", null);
        setField(term20719, term20719.getClass(), "blockDescription", null);
        setField(term20719, term20719.getClass(), "fileOverview", null);
        setField(term20719, term20719.getClass(), "returnDescription", null);
        setField(term20719, term20719.getClass(), "version", null);
        setField(term20719, term20719.getClass(), "authors", null);
        setField(term20719, term20719.getClass(), "sees", null);
        setField(term20715, term20715.getClass(), "documentation", term20719);
        setIntField(term20720, term20720.getClass(), "type", 0);
        setField(term20720, term20720.getClass(), "next", null);
        setField(term20720, term20720.getClass(), "first", null);
        setField(term20720, term20720.getClass(), "last", null);
        setField(term20720, term20720.getClass(), "propListHead", null);
        setIntField(term20720, term20720.getClass(), "sourcePosition", 0);
        setField(term20720, term20720.getClass(), "jsType", null);
        setField(term20720, term20720.getClass(), "parent", null);
        setField(term20715, term20715.getClass(), "associatedNode", term20720);
        setField(term20715, term20715.getClass(), "visibility", enum159);
        setIntField(term20715, term20715.getClass(), "bitset", 162113491);
        setField(term20726, term20726.getClass(), "root", term20720);
        setField(term20726, term20726.getClass(), "sourceName", null);
        setField(term20715, term20715.getClass(), "type", term20726);
        setField(term20727, term20727.getClass(), "root", term20720);
        setField(term20727, term20727.getClass(), "sourceName", null);
        setField(term20715, term20715.getClass(), "thisType", term20727);
        setBooleanField(term20715, term20715.getClass(), "includeDocumentation", false);
        setIntField(term20715, term20715.getClass(), "originalCommentPosition", -932147928);
        setField(term20701, term20701.getClass(), "docInfo", term20715);
        setBooleanField(term20701, term20701.getClass(), "unknown", false);
        setBooleanField(term20701, term20701.getClass(), "resolved", false);
        setField(term20701, term20701.getClass(), "resolveResult", null);
        setField(term20732, term20732.getClass(), "templateKeys", null);
        setField(term20732, term20732.getClass(), "templateValues", null);
        setField(term20732, term20732.getClass(), "resolvedTemplateValues", null);
        setField(term20732, term20732.getClass(), "registry", null);
        setField(term20701, term20701.getClass(), "templateTypeMap", term20732);
        setBooleanField(term20701, term20701.getClass(), "inTemplatedCheckVisit", false);
        setField(term20701, term20701.getClass(), "registry", null);
        setField(term20700, term20700.getClass(), "objectIndexTemplateKey", term20701);
        setField(term20734, term20734.getClass(), "name", null);
        setField(term20734, term20734.getClass(), "referencedType", null);
        setField(term20734, term20734.getClass(), "referencedObjType", null);
        setBooleanField(term20734, term20734.getClass(), "visited", false);
        setField(term20734, term20734.getClass(), "docInfo", null);
        setBooleanField(term20734, term20734.getClass(), "unknown", false);
        setBooleanField(term20734, term20734.getClass(), "resolved", false);
        setField(term20734, term20734.getClass(), "resolveResult", null);
        setField(term20734, term20734.getClass(), "templateTypeMap", null);
        setBooleanField(term20734, term20734.getClass(), "inTemplatedCheckVisit", false);
        setField(term20734, term20734.getClass(), "registry", null);
        setField(term20700, term20700.getClass(), "objectElementTemplateKey", term20734);
        setField(term20700, term20700.getClass(), "reporter", null);
        setField(term20700, term20700.getClass(), "nativeTypes", null);
        setField(term20700, term20700.getClass(), "namesToTypes", null);
        setField(term20700, term20700.getClass(), "namespaces", null);
        setField(term20700, term20700.getClass(), "nonNullableTypeNames", null);
        setField(term20700, term20700.getClass(), "forwardDeclaredTypes", null);
        setField(term20700, term20700.getClass(), "typesIndexedByProperty", null);
        setField(term20700, term20700.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term20700, term20700.getClass(), "greatestSubtypeByProperty", null);
        setField(term20700, term20700.getClass(), "interfaceToImplementors", null);
        setField(term20700, term20700.getClass(), "unresolvedNamedTypes", null);
        setField(term20700, term20700.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20700, term20700.getClass(), "lastGeneration", false);
        setField(term20700, term20700.getClass(), "templateTypes", null);
        setField(term20700, term20700.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term20700, term20700.getClass(), "tolerateUndefinedValues", false);
        setField(term20700, term20700.getClass(), "resolveMode", null);
        setField(term20699, term20699.getClass(), "registry", term20700);
        setField(term20699, term20699.getClass(), "reverseInterpreter", null);
        setField(term20699, term20699.getClass(), "syntacticScope", null);
        setField(term20699, term20699.getClass(), "functionScope", null);
        setField(term20699, term20699.getClass(), "bottomScope", null);
        setField(term20699, term20699.getClass(), "assertionFunctionsMap", null);
        setField(term20699, term20699.getClass(), "unknownType", null);
        setField(term20699, term20699.getClass(), "cfg", null);
        setField(term20699, term20699.getClass(), "joinOp", null);
        setField(term20699, term20699.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term64268 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term64267 = ((Class) term64268).getDeclaredField((String) "OBJECT_TYPE");
        ((Field) term64267).setAccessible(true);
        enum160 = ((Field) term64267).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum160;
        try {
            callMethod(klass, "getNativeType", argTypes, term20699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


