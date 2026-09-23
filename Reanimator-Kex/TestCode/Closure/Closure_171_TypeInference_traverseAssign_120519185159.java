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

public class TypeInference_traverseAssign_120519185159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3036;
     Object term3078;

    public TypeInference_traverseAssign_120519185159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29259 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term29258 = ((Class) term29259).getDeclaredField((String) "PROTECTED");
        ((Field) term29258).setAccessible(true);
        Object enum76 = ((Field) term29258).get((Object) null);
        term3036 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term3037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term3038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3052 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3053 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term3056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term3057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3063 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3064 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term3071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term3036, term3036.getClass(), "compiler", null);
        setField(term3038, term3038.getClass(), "name", "OcJCIDNIXA");
        setField(term3038, term3038.getClass(), "referencedType", null);
        setField(term3038, term3038.getClass(), "referencedObjType", null);
        setBooleanField(term3038, term3038.getClass(), "visited", false);
        setField(term3053, term3053.getClass(), "baseType", null);
        setField(term3053, term3053.getClass(), "extendedInterfaces", null);
        setField(term3053, term3053.getClass(), "implementedInterfaces", null);
        setField(term3053, term3053.getClass(), "parameters", null);
        setField(term3053, term3053.getClass(), "thrownTypes", null);
        setField(term3053, term3053.getClass(), "templateTypeNames", null);
        setField(term3053, term3053.getClass(), "description", null);
        setField(term3053, term3053.getClass(), "meaning", null);
        setField(term3053, term3053.getClass(), "deprecated", null);
        setField(term3053, term3053.getClass(), "license", null);
        setField(term3053, term3053.getClass(), "suppressions", null);
        setField(term3053, term3053.getClass(), "modifies", null);
        setField(term3053, term3053.getClass(), "lendsName", null);
        setBooleanField(term3053, term3053.getClass(), "ngInject", false);
        setBooleanField(term3053, term3053.getClass(), "wizaction", true);
        setField(term3052, term3052.getClass(), "info", term3053);
        setField(term3056, term3056.getClass(), "sourceComment", null);
        setField(term3056, term3056.getClass(), "markers", null);
        setField(term3056, term3056.getClass(), "parameters", null);
        setField(term3056, term3056.getClass(), "throwsDescriptions", null);
        setField(term3056, term3056.getClass(), "blockDescription", null);
        setField(term3056, term3056.getClass(), "fileOverview", null);
        setField(term3056, term3056.getClass(), "returnDescription", null);
        setField(term3056, term3056.getClass(), "version", null);
        setField(term3056, term3056.getClass(), "authors", null);
        setField(term3056, term3056.getClass(), "sees", null);
        setField(term3052, term3052.getClass(), "documentation", term3056);
        setIntField(term3057, term3057.getClass(), "type", 0);
        setField(term3057, term3057.getClass(), "next", null);
        setField(term3057, term3057.getClass(), "first", null);
        setField(term3057, term3057.getClass(), "last", null);
        setField(term3057, term3057.getClass(), "propListHead", null);
        setIntField(term3057, term3057.getClass(), "sourcePosition", 0);
        setField(term3057, term3057.getClass(), "jsType", null);
        setField(term3057, term3057.getClass(), "parent", null);
        setField(term3052, term3052.getClass(), "associatedNode", term3057);
        setField(term3052, term3052.getClass(), "visibility", enum76);
        setIntField(term3052, term3052.getClass(), "bitset", 691577392);
        setField(term3063, term3063.getClass(), "root", null);
        setField(term3063, term3063.getClass(), "sourceName", null);
        setField(term3052, term3052.getClass(), "type", term3063);
        setField(term3064, term3064.getClass(), "root", null);
        setField(term3064, term3064.getClass(), "sourceName", null);
        setField(term3052, term3052.getClass(), "thisType", term3064);
        setBooleanField(term3052, term3052.getClass(), "includeDocumentation", true);
        setIntField(term3052, term3052.getClass(), "originalCommentPosition", -893623680);
        setField(term3038, term3038.getClass(), "docInfo", term3052);
        setBooleanField(term3038, term3038.getClass(), "unknown", false);
        setBooleanField(term3038, term3038.getClass(), "resolved", false);
        setField(term3038, term3038.getClass(), "resolveResult", null);
        setField(term3069, term3069.getClass(), "templateKeys", null);
        setField(term3069, term3069.getClass(), "templateValues", null);
        setField(term3069, term3069.getClass(), "resolvedTemplateValues", null);
        setField(term3069, term3069.getClass(), "registry", null);
        setField(term3038, term3038.getClass(), "templateTypeMap", term3069);
        setBooleanField(term3038, term3038.getClass(), "inTemplatedCheckVisit", true);
        setField(term3038, term3038.getClass(), "registry", null);
        setField(term3037, term3037.getClass(), "objectIndexTemplateKey", term3038);
        setField(term3071, term3071.getClass(), "name", null);
        setField(term3071, term3071.getClass(), "referencedType", null);
        setField(term3071, term3071.getClass(), "referencedObjType", null);
        setBooleanField(term3071, term3071.getClass(), "visited", false);
        setField(term3071, term3071.getClass(), "docInfo", null);
        setBooleanField(term3071, term3071.getClass(), "unknown", false);
        setBooleanField(term3071, term3071.getClass(), "resolved", false);
        setField(term3071, term3071.getClass(), "resolveResult", null);
        setField(term3071, term3071.getClass(), "templateTypeMap", null);
        setBooleanField(term3071, term3071.getClass(), "inTemplatedCheckVisit", false);
        setField(term3071, term3071.getClass(), "registry", null);
        setField(term3037, term3037.getClass(), "objectElementTemplateKey", term3071);
        setField(term3037, term3037.getClass(), "reporter", null);
        setField(term3037, term3037.getClass(), "nativeTypes", null);
        setField(term3037, term3037.getClass(), "namesToTypes", null);
        setField(term3037, term3037.getClass(), "namespaces", null);
        setField(term3037, term3037.getClass(), "nonNullableTypeNames", null);
        setField(term3037, term3037.getClass(), "forwardDeclaredTypes", null);
        setField(term3037, term3037.getClass(), "typesIndexedByProperty", null);
        setField(term3037, term3037.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term3037, term3037.getClass(), "greatestSubtypeByProperty", null);
        setField(term3037, term3037.getClass(), "interfaceToImplementors", null);
        setField(term3037, term3037.getClass(), "unresolvedNamedTypes", null);
        setField(term3037, term3037.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3037, term3037.getClass(), "lastGeneration", false);
        setField(term3037, term3037.getClass(), "templateTypes", null);
        setField(term3037, term3037.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term3037, term3037.getClass(), "tolerateUndefinedValues", false);
        setField(term3037, term3037.getClass(), "resolveMode", null);
        setField(term3036, term3036.getClass(), "registry", term3037);
        setField(term3036, term3036.getClass(), "reverseInterpreter", null);
        setField(term3036, term3036.getClass(), "syntacticScope", null);
        setField(term3036, term3036.getClass(), "functionScope", null);
        setField(term3036, term3036.getClass(), "bottomScope", null);
        setField(term3036, term3036.getClass(), "assertionFunctionsMap", null);
        setField(term3036, term3036.getClass(), "unknownType", null);
        setField(term3036, term3036.getClass(), "cfg", null);
        setField(term3036, term3036.getClass(), "joinOp", null);
        setField(term3036, term3036.getClass(), "orderedWorkSet", null);
        term3078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3078, term3078.getClass(), "type", 906181092);
        setIntField(term3080, term3080.getClass(), "type", 1045657203);
        setIntField(term3082, term3082.getClass(), "type", 1386130016);
        setIntField(term3084, term3084.getClass(), "type", 1072005683);
        setIntField(term3086, term3086.getClass(), "type", 1861318859);
        setField(term3086, term3086.getClass(), "next", null);
        setField(term3086, term3086.getClass(), "first", null);
        setField(term3086, term3086.getClass(), "last", null);
        setField(term3086, term3086.getClass(), "propListHead", null);
        setIntField(term3086, term3086.getClass(), "sourcePosition", 0);
        setField(term3086, term3086.getClass(), "jsType", null);
        setField(term3086, term3086.getClass(), "parent", null);
        setField(term3084, term3084.getClass(), "next", term3086);
        setIntField(term3089, term3089.getClass(), "type", 1474524152);
        setField(term3089, term3089.getClass(), "next", null);
        setField(term3089, term3089.getClass(), "first", null);
        setField(term3089, term3089.getClass(), "last", term3086);
        setField(term3089, term3089.getClass(), "propListHead", null);
        setIntField(term3089, term3089.getClass(), "sourcePosition", 0);
        setField(term3089, term3089.getClass(), "jsType", null);
        setField(term3089, term3089.getClass(), "parent", null);
        setField(term3084, term3084.getClass(), "first", term3089);
        setField(term3084, term3084.getClass(), "last", term3082);
        setField(term3084, term3084.getClass(), "propListHead", null);
        setIntField(term3084, term3084.getClass(), "sourcePosition", 0);
        setField(term3084, term3084.getClass(), "jsType", null);
        setField(term3084, term3084.getClass(), "parent", null);
        setField(term3082, term3082.getClass(), "next", term3084);
        setField(term3082, term3082.getClass(), "first", term3086);
        setIntField(term3093, term3093.getClass(), "type", 53410913);
        setIntField(term3095, term3095.getClass(), "type", -375014958);
        setField(term3095, term3095.getClass(), "next", null);
        setField(term3095, term3095.getClass(), "first", term3089);
        setField(term3095, term3095.getClass(), "last", term3084);
        setField(term3095, term3095.getClass(), "propListHead", null);
        setIntField(term3095, term3095.getClass(), "sourcePosition", 0);
        setField(term3095, term3095.getClass(), "jsType", null);
        setField(term3095, term3095.getClass(), "parent", null);
        setField(term3093, term3093.getClass(), "next", term3095);
        setField(term3093, term3093.getClass(), "first", term3080);
        setField(term3093, term3093.getClass(), "last", term3080);
        setField(term3093, term3093.getClass(), "propListHead", null);
        setIntField(term3093, term3093.getClass(), "sourcePosition", 0);
        setField(term3093, term3093.getClass(), "jsType", null);
        setField(term3093, term3093.getClass(), "parent", null);
        setField(term3082, term3082.getClass(), "last", term3093);
        setField(term3082, term3082.getClass(), "propListHead", null);
        setIntField(term3082, term3082.getClass(), "sourcePosition", 0);
        setField(term3082, term3082.getClass(), "jsType", null);
        setField(term3082, term3082.getClass(), "parent", null);
        setField(term3080, term3080.getClass(), "next", term3082);
        setIntField(term3100, term3100.getClass(), "type", 1107176718);
        setField(term3100, term3100.getClass(), "next", term3093);
        setField(term3100, term3100.getClass(), "first", term3095);
        setField(term3100, term3100.getClass(), "last", term3078);
        setField(term3100, term3100.getClass(), "propListHead", null);
        setIntField(term3100, term3100.getClass(), "sourcePosition", 0);
        setField(term3100, term3100.getClass(), "jsType", null);
        setField(term3100, term3100.getClass(), "parent", null);
        setField(term3080, term3080.getClass(), "first", term3100);
        setField(term3080, term3080.getClass(), "last", term3100);
        setField(term3080, term3080.getClass(), "propListHead", null);
        setIntField(term3080, term3080.getClass(), "sourcePosition", 0);
        setField(term3080, term3080.getClass(), "jsType", null);
        setField(term3080, term3080.getClass(), "parent", null);
        setField(term3078, term3078.getClass(), "next", term3080);
        setField(term3078, term3078.getClass(), "first", term3084);
        setField(term3078, term3078.getClass(), "last", term3086);
        setField(term3078, term3078.getClass(), "propListHead", null);
        setIntField(term3078, term3078.getClass(), "sourcePosition", 0);
        setField(term3078, term3078.getClass(), "jsType", null);
        setField(term3078, term3078.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3078;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term3036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


