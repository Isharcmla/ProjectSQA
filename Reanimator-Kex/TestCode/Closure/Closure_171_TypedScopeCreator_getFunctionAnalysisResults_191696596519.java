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

public class TypedScopeCreator_getFunctionAnalysisResults_191696596519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2721;
     Object term2743;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2721 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2722 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2727 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term2735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2721, term2721.getClass(), "compiler", null);
        setField(term2721, term2721.getClass(), "typeParsingErrorReporter", null);
        setField(term2722, term2722.getClass(), "compiler", null);
        setField(term2724, term2724.getClass(), "name", "");
        setField(term2724, term2724.getClass(), "referencedType", null);
        setField(term2724, term2724.getClass(), "referencedObjType", null);
        setBooleanField(term2724, term2724.getClass(), "visited", false);
        setField(term2727, term2727.getClass(), "info", null);
        setField(term2727, term2727.getClass(), "documentation", null);
        setField(term2727, term2727.getClass(), "associatedNode", null);
        setField(term2727, term2727.getClass(), "visibility", null);
        setIntField(term2727, term2727.getClass(), "bitset", -1034506028);
        setField(term2727, term2727.getClass(), "type", null);
        setField(term2727, term2727.getClass(), "thisType", null);
        setBooleanField(term2727, term2727.getClass(), "includeDocumentation", false);
        setIntField(term2727, term2727.getClass(), "originalCommentPosition", -1263114719);
        setField(term2724, term2724.getClass(), "docInfo", term2727);
        setBooleanField(term2724, term2724.getClass(), "unknown", true);
        setBooleanField(term2724, term2724.getClass(), "resolved", true);
        setField(term2724, term2724.getClass(), "resolveResult", null);
        setField(term2733, term2733.getClass(), "templateKeys", null);
        setField(term2733, term2733.getClass(), "templateValues", null);
        setField(term2733, term2733.getClass(), "resolvedTemplateValues", null);
        setField(term2733, term2733.getClass(), "registry", null);
        setField(term2724, term2724.getClass(), "templateTypeMap", term2733);
        setBooleanField(term2724, term2724.getClass(), "inTemplatedCheckVisit", false);
        setField(term2724, term2724.getClass(), "registry", null);
        setField(term2723, term2723.getClass(), "objectIndexTemplateKey", term2724);
        setField(term2735, term2735.getClass(), "name", null);
        setField(term2735, term2735.getClass(), "referencedType", null);
        setField(term2735, term2735.getClass(), "referencedObjType", null);
        setBooleanField(term2735, term2735.getClass(), "visited", false);
        setField(term2735, term2735.getClass(), "docInfo", null);
        setBooleanField(term2735, term2735.getClass(), "unknown", false);
        setBooleanField(term2735, term2735.getClass(), "resolved", false);
        setField(term2735, term2735.getClass(), "resolveResult", null);
        setField(term2735, term2735.getClass(), "templateTypeMap", null);
        setBooleanField(term2735, term2735.getClass(), "inTemplatedCheckVisit", false);
        setField(term2735, term2735.getClass(), "registry", null);
        setField(term2723, term2723.getClass(), "objectElementTemplateKey", term2735);
        setField(term2723, term2723.getClass(), "reporter", null);
        setField(term2723, term2723.getClass(), "nativeTypes", null);
        setField(term2723, term2723.getClass(), "namesToTypes", null);
        setField(term2723, term2723.getClass(), "namespaces", null);
        setField(term2723, term2723.getClass(), "nonNullableTypeNames", null);
        setField(term2723, term2723.getClass(), "forwardDeclaredTypes", null);
        setField(term2723, term2723.getClass(), "typesIndexedByProperty", null);
        setField(term2723, term2723.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term2723, term2723.getClass(), "greatestSubtypeByProperty", null);
        setField(term2723, term2723.getClass(), "interfaceToImplementors", null);
        setField(term2723, term2723.getClass(), "unresolvedNamedTypes", null);
        setField(term2723, term2723.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2723, term2723.getClass(), "lastGeneration", false);
        setField(term2723, term2723.getClass(), "templateTypes", null);
        setField(term2723, term2723.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term2723, term2723.getClass(), "tolerateUndefinedValues", false);
        setField(term2723, term2723.getClass(), "resolveMode", null);
        setField(term2722, term2722.getClass(), "typeRegistry", term2723);
        setField(term2722, term2722.getClass(), "allValueTypes", null);
        setBooleanField(term2722, term2722.getClass(), "shouldReport", false);
        setField(term2722, term2722.getClass(), "nullOrUndefined", null);
        setField(term2722, term2722.getClass(), "mismatches", null);
        setField(term2721, term2721.getClass(), "validator", term2722);
        setField(term2721, term2721.getClass(), "codingConvention", null);
        setField(term2721, term2721.getClass(), "typeRegistry", null);
        setField(term2721, term2721.getClass(), "delegateProxyPrototypes", null);
        setField(term2721, term2721.getClass(), "delegateCallingConventions", null);
        setField(term2721, term2721.getClass(), "functionAnalysisResults", null);
        setField(term2721, term2721.getClass(), "unknownType", null);
        term2743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2743, term2743.getClass(), "type", 304775596);
        setIntField(term2745, term2745.getClass(), "type", -1347665717);
        setIntField(term2747, term2747.getClass(), "type", -1888585309);
        setIntField(term2749, term2749.getClass(), "type", 683666002);
        setIntField(term2751, term2751.getClass(), "type", 1596213415);
        setField(term2751, term2751.getClass(), "next", null);
        setField(term2751, term2751.getClass(), "first", null);
        setField(term2751, term2751.getClass(), "last", null);
        setField(term2751, term2751.getClass(), "propListHead", null);
        setIntField(term2751, term2751.getClass(), "sourcePosition", 0);
        setField(term2751, term2751.getClass(), "jsType", null);
        setField(term2751, term2751.getClass(), "parent", null);
        setField(term2749, term2749.getClass(), "next", term2751);
        setIntField(term2754, term2754.getClass(), "type", -268815336);
        setField(term2754, term2754.getClass(), "next", null);
        setField(term2754, term2754.getClass(), "first", null);
        setField(term2754, term2754.getClass(), "last", term2751);
        setField(term2754, term2754.getClass(), "propListHead", null);
        setIntField(term2754, term2754.getClass(), "sourcePosition", 0);
        setField(term2754, term2754.getClass(), "jsType", null);
        setField(term2754, term2754.getClass(), "parent", null);
        setField(term2749, term2749.getClass(), "first", term2754);
        setField(term2749, term2749.getClass(), "last", term2747);
        setField(term2749, term2749.getClass(), "propListHead", null);
        setIntField(term2749, term2749.getClass(), "sourcePosition", 0);
        setField(term2749, term2749.getClass(), "jsType", null);
        setField(term2749, term2749.getClass(), "parent", null);
        setField(term2747, term2747.getClass(), "next", term2749);
        setField(term2747, term2747.getClass(), "first", term2751);
        setIntField(term2758, term2758.getClass(), "type", -663691365);
        setIntField(term2760, term2760.getClass(), "type", 339854490);
        setField(term2760, term2760.getClass(), "next", null);
        setField(term2760, term2760.getClass(), "first", term2754);
        setField(term2760, term2760.getClass(), "last", term2749);
        setField(term2760, term2760.getClass(), "propListHead", null);
        setIntField(term2760, term2760.getClass(), "sourcePosition", 0);
        setField(term2760, term2760.getClass(), "jsType", null);
        setField(term2760, term2760.getClass(), "parent", null);
        setField(term2758, term2758.getClass(), "next", term2760);
        setField(term2758, term2758.getClass(), "first", term2745);
        setField(term2758, term2758.getClass(), "last", term2745);
        setField(term2758, term2758.getClass(), "propListHead", null);
        setIntField(term2758, term2758.getClass(), "sourcePosition", 0);
        setField(term2758, term2758.getClass(), "jsType", null);
        setField(term2758, term2758.getClass(), "parent", null);
        setField(term2747, term2747.getClass(), "last", term2758);
        setField(term2747, term2747.getClass(), "propListHead", null);
        setIntField(term2747, term2747.getClass(), "sourcePosition", 0);
        setField(term2747, term2747.getClass(), "jsType", null);
        setField(term2747, term2747.getClass(), "parent", null);
        setField(term2745, term2745.getClass(), "next", term2747);
        setIntField(term2765, term2765.getClass(), "type", -615654495);
        setField(term2765, term2765.getClass(), "next", term2758);
        setField(term2765, term2765.getClass(), "first", term2760);
        setField(term2765, term2765.getClass(), "last", term2743);
        setField(term2765, term2765.getClass(), "propListHead", null);
        setIntField(term2765, term2765.getClass(), "sourcePosition", 0);
        setField(term2765, term2765.getClass(), "jsType", null);
        setField(term2765, term2765.getClass(), "parent", null);
        setField(term2745, term2745.getClass(), "first", term2765);
        setField(term2745, term2745.getClass(), "last", term2765);
        setField(term2745, term2745.getClass(), "propListHead", null);
        setIntField(term2745, term2745.getClass(), "sourcePosition", 0);
        setField(term2745, term2745.getClass(), "jsType", null);
        setField(term2745, term2745.getClass(), "parent", null);
        setField(term2743, term2743.getClass(), "next", term2745);
        setField(term2743, term2743.getClass(), "first", term2749);
        setField(term2743, term2743.getClass(), "last", term2751);
        setField(term2743, term2743.getClass(), "propListHead", null);
        setIntField(term2743, term2743.getClass(), "sourcePosition", 0);
        setField(term2743, term2743.getClass(), "jsType", null);
        setField(term2743, term2743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2743;
        try {
            callMethod(klass, "getFunctionAnalysisResults", argTypes, term2721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


