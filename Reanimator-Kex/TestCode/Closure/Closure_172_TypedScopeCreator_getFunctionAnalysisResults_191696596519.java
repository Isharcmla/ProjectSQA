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
     Object term2699;
     Object term2721;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2699 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2700 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2705 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term2713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2699, term2699.getClass(), "compiler", null);
        setField(term2699, term2699.getClass(), "typeParsingErrorReporter", null);
        setField(term2700, term2700.getClass(), "compiler", null);
        setField(term2702, term2702.getClass(), "name", "");
        setField(term2702, term2702.getClass(), "referencedType", null);
        setField(term2702, term2702.getClass(), "referencedObjType", null);
        setBooleanField(term2702, term2702.getClass(), "visited", true);
        setField(term2705, term2705.getClass(), "info", null);
        setField(term2705, term2705.getClass(), "documentation", null);
        setField(term2705, term2705.getClass(), "associatedNode", null);
        setField(term2705, term2705.getClass(), "visibility", null);
        setIntField(term2705, term2705.getClass(), "bitset", -344842608);
        setField(term2705, term2705.getClass(), "type", null);
        setField(term2705, term2705.getClass(), "thisType", null);
        setBooleanField(term2705, term2705.getClass(), "includeDocumentation", true);
        setIntField(term2705, term2705.getClass(), "originalCommentPosition", 941650513);
        setField(term2702, term2702.getClass(), "docInfo", term2705);
        setBooleanField(term2702, term2702.getClass(), "unknown", true);
        setBooleanField(term2702, term2702.getClass(), "resolved", true);
        setField(term2702, term2702.getClass(), "resolveResult", null);
        setField(term2711, term2711.getClass(), "templateKeys", null);
        setField(term2711, term2711.getClass(), "templateValues", null);
        setField(term2711, term2711.getClass(), "resolvedTemplateValues", null);
        setField(term2711, term2711.getClass(), "registry", null);
        setField(term2702, term2702.getClass(), "templateTypeMap", term2711);
        setBooleanField(term2702, term2702.getClass(), "inTemplatedCheckVisit", false);
        setField(term2702, term2702.getClass(), "registry", null);
        setField(term2701, term2701.getClass(), "objectIndexTemplateKey", term2702);
        setField(term2713, term2713.getClass(), "name", null);
        setField(term2713, term2713.getClass(), "referencedType", null);
        setField(term2713, term2713.getClass(), "referencedObjType", null);
        setBooleanField(term2713, term2713.getClass(), "visited", false);
        setField(term2713, term2713.getClass(), "docInfo", null);
        setBooleanField(term2713, term2713.getClass(), "unknown", false);
        setBooleanField(term2713, term2713.getClass(), "resolved", false);
        setField(term2713, term2713.getClass(), "resolveResult", null);
        setField(term2713, term2713.getClass(), "templateTypeMap", null);
        setBooleanField(term2713, term2713.getClass(), "inTemplatedCheckVisit", false);
        setField(term2713, term2713.getClass(), "registry", null);
        setField(term2701, term2701.getClass(), "objectElementTemplateKey", term2713);
        setField(term2701, term2701.getClass(), "reporter", null);
        setField(term2701, term2701.getClass(), "nativeTypes", null);
        setField(term2701, term2701.getClass(), "namesToTypes", null);
        setField(term2701, term2701.getClass(), "namespaces", null);
        setField(term2701, term2701.getClass(), "nonNullableTypeNames", null);
        setField(term2701, term2701.getClass(), "forwardDeclaredTypes", null);
        setField(term2701, term2701.getClass(), "typesIndexedByProperty", null);
        setField(term2701, term2701.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term2701, term2701.getClass(), "greatestSubtypeByProperty", null);
        setField(term2701, term2701.getClass(), "interfaceToImplementors", null);
        setField(term2701, term2701.getClass(), "unresolvedNamedTypes", null);
        setField(term2701, term2701.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2701, term2701.getClass(), "lastGeneration", false);
        setField(term2701, term2701.getClass(), "templateTypes", null);
        setField(term2701, term2701.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term2701, term2701.getClass(), "tolerateUndefinedValues", false);
        setField(term2701, term2701.getClass(), "resolveMode", null);
        setField(term2700, term2700.getClass(), "typeRegistry", term2701);
        setField(term2700, term2700.getClass(), "allValueTypes", null);
        setBooleanField(term2700, term2700.getClass(), "shouldReport", false);
        setField(term2700, term2700.getClass(), "nullOrUndefined", null);
        setField(term2700, term2700.getClass(), "mismatches", null);
        setField(term2699, term2699.getClass(), "validator", term2700);
        setField(term2699, term2699.getClass(), "codingConvention", null);
        setField(term2699, term2699.getClass(), "typeRegistry", null);
        setField(term2699, term2699.getClass(), "delegateProxyPrototypes", null);
        setField(term2699, term2699.getClass(), "delegateCallingConventions", null);
        setField(term2699, term2699.getClass(), "functionAnalysisResults", null);
        setField(term2699, term2699.getClass(), "unknownType", null);
        term2721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2721, term2721.getClass(), "type", -1034506028);
        setIntField(term2723, term2723.getClass(), "type", -1263114719);
        setIntField(term2725, term2725.getClass(), "type", -894662986);
        setIntField(term2727, term2727.getClass(), "type", 304775596);
        setIntField(term2729, term2729.getClass(), "type", -1347665717);
        setField(term2729, term2729.getClass(), "next", null);
        setField(term2729, term2729.getClass(), "first", null);
        setField(term2729, term2729.getClass(), "last", null);
        setField(term2729, term2729.getClass(), "propListHead", null);
        setIntField(term2729, term2729.getClass(), "sourcePosition", 0);
        setField(term2729, term2729.getClass(), "jsType", null);
        setField(term2729, term2729.getClass(), "parent", null);
        setField(term2727, term2727.getClass(), "next", term2729);
        setIntField(term2732, term2732.getClass(), "type", -1888585309);
        setField(term2732, term2732.getClass(), "next", null);
        setField(term2732, term2732.getClass(), "first", null);
        setField(term2732, term2732.getClass(), "last", term2729);
        setField(term2732, term2732.getClass(), "propListHead", null);
        setIntField(term2732, term2732.getClass(), "sourcePosition", 0);
        setField(term2732, term2732.getClass(), "jsType", null);
        setField(term2732, term2732.getClass(), "parent", null);
        setField(term2727, term2727.getClass(), "first", term2732);
        setField(term2727, term2727.getClass(), "last", term2725);
        setField(term2727, term2727.getClass(), "propListHead", null);
        setIntField(term2727, term2727.getClass(), "sourcePosition", 0);
        setField(term2727, term2727.getClass(), "jsType", null);
        setField(term2727, term2727.getClass(), "parent", null);
        setField(term2725, term2725.getClass(), "next", term2727);
        setField(term2725, term2725.getClass(), "first", term2729);
        setIntField(term2736, term2736.getClass(), "type", 1596213415);
        setIntField(term2738, term2738.getClass(), "type", -268815336);
        setField(term2738, term2738.getClass(), "next", null);
        setField(term2738, term2738.getClass(), "first", term2732);
        setField(term2738, term2738.getClass(), "last", term2727);
        setField(term2738, term2738.getClass(), "propListHead", null);
        setIntField(term2738, term2738.getClass(), "sourcePosition", 0);
        setField(term2738, term2738.getClass(), "jsType", null);
        setField(term2738, term2738.getClass(), "parent", null);
        setField(term2736, term2736.getClass(), "next", term2738);
        setField(term2736, term2736.getClass(), "first", term2723);
        setField(term2736, term2736.getClass(), "last", term2723);
        setField(term2736, term2736.getClass(), "propListHead", null);
        setIntField(term2736, term2736.getClass(), "sourcePosition", 0);
        setField(term2736, term2736.getClass(), "jsType", null);
        setField(term2736, term2736.getClass(), "parent", null);
        setField(term2725, term2725.getClass(), "last", term2736);
        setField(term2725, term2725.getClass(), "propListHead", null);
        setIntField(term2725, term2725.getClass(), "sourcePosition", 0);
        setField(term2725, term2725.getClass(), "jsType", null);
        setField(term2725, term2725.getClass(), "parent", null);
        setField(term2723, term2723.getClass(), "next", term2725);
        setIntField(term2743, term2743.getClass(), "type", -1210583429);
        setField(term2743, term2743.getClass(), "next", term2736);
        setField(term2743, term2743.getClass(), "first", term2738);
        setField(term2743, term2743.getClass(), "last", term2721);
        setField(term2743, term2743.getClass(), "propListHead", null);
        setIntField(term2743, term2743.getClass(), "sourcePosition", 0);
        setField(term2743, term2743.getClass(), "jsType", null);
        setField(term2743, term2743.getClass(), "parent", null);
        setField(term2723, term2723.getClass(), "first", term2743);
        setField(term2723, term2723.getClass(), "last", term2743);
        setField(term2723, term2723.getClass(), "propListHead", null);
        setIntField(term2723, term2723.getClass(), "sourcePosition", 0);
        setField(term2723, term2723.getClass(), "jsType", null);
        setField(term2723, term2723.getClass(), "parent", null);
        setField(term2721, term2721.getClass(), "next", term2723);
        setField(term2721, term2721.getClass(), "first", term2727);
        setField(term2721, term2721.getClass(), "last", term2729);
        setField(term2721, term2721.getClass(), "propListHead", null);
        setIntField(term2721, term2721.getClass(), "sourcePosition", 0);
        setField(term2721, term2721.getClass(), "jsType", null);
        setField(term2721, term2721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2721;
        try {
            callMethod(klass, "getFunctionAnalysisResults", argTypes, term2699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


