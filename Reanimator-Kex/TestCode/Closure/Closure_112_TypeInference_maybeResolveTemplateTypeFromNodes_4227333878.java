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
import java.util.LinkedHashMap;

public class TypeInference_maybeResolveTemplateTypeFromNodes_4227333878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11766;
     Object term11811;

    public TypeInference_maybeResolveTemplateTypeFromNodes_4227333878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46134 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term46133 = ((Class) term46134).getDeclaredField((String) "PRIVATE");
        ((Field) term46133).setAccessible(true);
        Object enum113 = ((Field) term46133).get((Object) null);
        term11766 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11782 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11783 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11789 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11796 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11797 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term11804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11766, term11766.getClass(), "compiler", null);
        setField(term11768, term11768.getClass(), "name", "YfgYGgzYER");
        setField(term11768, term11768.getClass(), "referencedType", null);
        setField(term11768, term11768.getClass(), "referencedObjType", null);
        setBooleanField(term11768, term11768.getClass(), "visited", true);
        setField(term11783, term11783.getClass(), "baseType", null);
        setField(term11783, term11783.getClass(), "extendedInterfaces", null);
        setField(term11783, term11783.getClass(), "implementedInterfaces", null);
        setField(term11783, term11783.getClass(), "parameters", null);
        setField(term11783, term11783.getClass(), "thrownTypes", null);
        setField(term11783, term11783.getClass(), "templateTypeNames", null);
        setField(term11783, term11783.getClass(), "disposedParameters", null);
        setField(term11783, term11783.getClass(), "description", null);
        setField(term11783, term11783.getClass(), "meaning", null);
        setField(term11783, term11783.getClass(), "deprecated", null);
        setField(term11783, term11783.getClass(), "license", null);
        setField(term11783, term11783.getClass(), "suppressions", null);
        setField(term11783, term11783.getClass(), "modifies", null);
        setField(term11783, term11783.getClass(), "lendsName", null);
        setBooleanField(term11783, term11783.getClass(), "ngInject", true);
        setBooleanField(term11783, term11783.getClass(), "wizaction", true);
        setBooleanField(term11783, term11783.getClass(), "jaggerInject", true);
        setBooleanField(term11783, term11783.getClass(), "jaggerProvide", true);
        setBooleanField(term11783, term11783.getClass(), "jaggerModule", true);
        setField(term11782, term11782.getClass(), "info", term11783);
        setField(term11789, term11789.getClass(), "sourceComment", null);
        setField(term11789, term11789.getClass(), "markers", null);
        setField(term11789, term11789.getClass(), "parameters", null);
        setField(term11789, term11789.getClass(), "throwsDescriptions", null);
        setField(term11789, term11789.getClass(), "blockDescription", null);
        setField(term11789, term11789.getClass(), "fileOverview", null);
        setField(term11789, term11789.getClass(), "returnDescription", null);
        setField(term11789, term11789.getClass(), "version", null);
        setField(term11789, term11789.getClass(), "authors", null);
        setField(term11789, term11789.getClass(), "sees", null);
        setField(term11782, term11782.getClass(), "documentation", term11789);
        setIntField(term11790, term11790.getClass(), "type", -944542900);
        setField(term11790, term11790.getClass(), "next", null);
        setField(term11790, term11790.getClass(), "first", null);
        setField(term11790, term11790.getClass(), "last", null);
        setField(term11790, term11790.getClass(), "propListHead", null);
        setIntField(term11790, term11790.getClass(), "sourcePosition", 0);
        setField(term11790, term11790.getClass(), "jsType", null);
        setField(term11790, term11790.getClass(), "parent", null);
        setField(term11782, term11782.getClass(), "associatedNode", term11790);
        setField(term11782, term11782.getClass(), "visibility", enum113);
        setIntField(term11782, term11782.getClass(), "bitset", 2063762142);
        setField(term11796, term11796.getClass(), "root", null);
        setField(term11796, term11796.getClass(), "sourceName", null);
        setField(term11782, term11782.getClass(), "type", term11796);
        setField(term11797, term11797.getClass(), "root", null);
        setField(term11797, term11797.getClass(), "sourceName", null);
        setField(term11782, term11782.getClass(), "thisType", term11797);
        setBooleanField(term11782, term11782.getClass(), "includeDocumentation", true);
        setIntField(term11782, term11782.getClass(), "originalCommentPosition", 1658391716);
        setField(term11768, term11768.getClass(), "docInfo", term11782);
        setBooleanField(term11768, term11768.getClass(), "unknown", false);
        setBooleanField(term11768, term11768.getClass(), "resolved", false);
        setField(term11768, term11768.getClass(), "resolveResult", null);
        setField(term11802, term11802.getClass(), "templateKeys", null);
        setField(term11802, term11802.getClass(), "templateValues", null);
        setField(term11802, term11802.getClass(), "resolvedTemplateValues", null);
        setField(term11802, term11802.getClass(), "registry", null);
        setField(term11768, term11768.getClass(), "templateTypeMap", term11802);
        setBooleanField(term11768, term11768.getClass(), "inTemplatedCheckVisit", false);
        setField(term11768, term11768.getClass(), "registry", null);
        setField(term11767, term11767.getClass(), "objectIndexTemplateKey", term11768);
        setField(term11804, term11804.getClass(), "name", null);
        setField(term11804, term11804.getClass(), "referencedType", null);
        setField(term11804, term11804.getClass(), "referencedObjType", null);
        setBooleanField(term11804, term11804.getClass(), "visited", false);
        setField(term11804, term11804.getClass(), "docInfo", null);
        setBooleanField(term11804, term11804.getClass(), "unknown", false);
        setBooleanField(term11804, term11804.getClass(), "resolved", false);
        setField(term11804, term11804.getClass(), "resolveResult", null);
        setField(term11804, term11804.getClass(), "templateTypeMap", null);
        setBooleanField(term11804, term11804.getClass(), "inTemplatedCheckVisit", false);
        setField(term11804, term11804.getClass(), "registry", null);
        setField(term11767, term11767.getClass(), "objectElementTemplateKey", term11804);
        setField(term11767, term11767.getClass(), "reporter", null);
        setField(term11767, term11767.getClass(), "nativeTypes", null);
        setField(term11767, term11767.getClass(), "namesToTypes", null);
        setField(term11767, term11767.getClass(), "namespaces", null);
        setField(term11767, term11767.getClass(), "nonNullableTypeNames", null);
        setField(term11767, term11767.getClass(), "forwardDeclaredTypes", null);
        setField(term11767, term11767.getClass(), "typesIndexedByProperty", null);
        setField(term11767, term11767.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11767, term11767.getClass(), "greatestSubtypeByProperty", null);
        setField(term11767, term11767.getClass(), "interfaceToImplementors", null);
        setField(term11767, term11767.getClass(), "unresolvedNamedTypes", null);
        setField(term11767, term11767.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11767, term11767.getClass(), "lastGeneration", false);
        setField(term11767, term11767.getClass(), "templateTypes", null);
        setField(term11767, term11767.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term11767, term11767.getClass(), "tolerateUndefinedValues", false);
        setField(term11766, term11766.getClass(), "registry", term11767);
        setField(term11766, term11766.getClass(), "reverseInterpreter", null);
        setField(term11766, term11766.getClass(), "syntacticScope", null);
        setField(term11766, term11766.getClass(), "functionScope", null);
        setField(term11766, term11766.getClass(), "bottomScope", null);
        setField(term11766, term11766.getClass(), "assertionFunctionsMap", null);
        setField(term11766, term11766.getClass(), "unknownType", null);
        setField(term11766, term11766.getClass(), "cfg", null);
        setField(term11766, term11766.getClass(), "joinOp", null);
        setField(term11766, term11766.getClass(), "orderedWorkSet", null);
        term11811 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("java.lang.Iterable");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term11811;
        try {
            callMethod(klass, "maybeResolveTemplateTypeFromNodes", argTypes, term11766, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


