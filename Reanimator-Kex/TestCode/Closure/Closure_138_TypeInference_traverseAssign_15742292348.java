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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_traverseAssign_15742292348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2885;
     Object term2971;

    public TypeInference_traverseAssign_15742292348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2888 = new HashMap();
        HashMap term2897 = new HashMap();
        Set<Object> term24452 =  ((Map) term2897).keySet();
        HashSet term2896 = new HashSet((Collection<? extends Object>) term24452);
        HashMap term2904 = new HashMap();
        Set<Object> term24453 =  ((Map) term2904).keySet();
        HashSet term2903 = new HashSet((Collection<? extends Object>) term24453);
        HashMap term2911 = new HashMap();
        Set<Object> term24454 =  ((Map) term2911).keySet();
        HashSet term2910 = new HashSet((Collection<? extends Object>) term24454);
        HashMap term2917 = new HashMap();
        HashMap term2922 = new HashMap();
        Class<? extends Object> term24476 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term24475 = ((Class) term24476).getDeclaredField((String) "PRIVATE");
        ((Field) term24475).setAccessible(true);
        Object enum56 = ((Field) term24475).get((Object) null);
        term2885 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term2886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2887 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term2943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2957 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2958 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2959 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2964 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2965 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2969 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2885, term2885.getClass(), "compiler", null);
        setField(term2886, term2886.getClass(), "reporter", null);
        setField(term2886, term2886.getClass(), "nativeTypes", term2887);
        setField(term2886, term2886.getClass(), "namesToTypes", term2888);
        setField(term2886, term2886.getClass(), "namespaces", term2896);
        setField(term2886, term2886.getClass(), "enumTypeNames", term2903);
        setField(term2886, term2886.getClass(), "forwardDeclaredTypes", term2910);
        setField(term2886, term2886.getClass(), "typesIndexedByProperty", term2917);
        setField(term2886, term2886.getClass(), "greatestSubtypeByProperty", term2922);
        setField(term2886, term2886.getClass(), "interfaceToImplementors", null);
        setField(term2886, term2886.getClass(), "unresolvedNamedTypes", null);
        setField(term2886, term2886.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2886, term2886.getClass(), "lastGeneration", true);
        setField(term2886, term2886.getClass(), "templateTypeName", "wfaXBpWAUH");
        setField(term2943, term2943.getClass(), "name", "VMeAzAHwZj");
        setField(term2943, term2943.getClass(), "referencedType", null);
        setBooleanField(term2943, term2943.getClass(), "visited", true);
        setField(term2958, term2958.getClass(), "baseType", null);
        setField(term2958, term2958.getClass(), "implementedInterfaces", null);
        setField(term2958, term2958.getClass(), "parameters", null);
        setField(term2958, term2958.getClass(), "thrownTypes", null);
        setField(term2958, term2958.getClass(), "templateTypeName", null);
        setField(term2958, term2958.getClass(), "description", null);
        setField(term2958, term2958.getClass(), "deprecated", null);
        setField(term2958, term2958.getClass(), "license", null);
        setField(term2958, term2958.getClass(), "suppressions", null);
        setField(term2957, term2957.getClass(), "info", term2958);
        setField(term2959, term2959.getClass(), "markers", null);
        setField(term2959, term2959.getClass(), "parameters", null);
        setField(term2959, term2959.getClass(), "throwsDescriptions", null);
        setField(term2959, term2959.getClass(), "blockDescription", null);
        setField(term2959, term2959.getClass(), "fileOverview", null);
        setField(term2959, term2959.getClass(), "returnDescription", null);
        setField(term2959, term2959.getClass(), "version", null);
        setField(term2959, term2959.getClass(), "authors", null);
        setField(term2959, term2959.getClass(), "sees", null);
        setField(term2957, term2957.getClass(), "documentation", term2959);
        setField(term2957, term2957.getClass(), "sourceName", "");
        setField(term2957, term2957.getClass(), "visibility", enum56);
        setIntField(term2957, term2957.getClass(), "bitset", -615654495);
        setField(term2964, term2964.getClass(), "root", null);
        setField(term2964, term2964.getClass(), "sourceName", null);
        setField(term2964, term2964.getClass(), "registry", null);
        setField(term2957, term2957.getClass(), "type", term2964);
        setField(term2965, term2965.getClass(), "root", null);
        setField(term2965, term2965.getClass(), "sourceName", null);
        setField(term2965, term2965.getClass(), "registry", null);
        setField(term2957, term2957.getClass(), "thisType", term2965);
        setBooleanField(term2957, term2957.getClass(), "includeDocumentation", true);
        setField(term2943, term2943.getClass(), "docInfo", term2957);
        setBooleanField(term2943, term2943.getClass(), "unknown", true);
        setBooleanField(term2943, term2943.getClass(), "resolved", false);
        setField(term2943, term2943.getClass(), "resolveResult", null);
        setField(term2943, term2943.getClass(), "registry", null);
        setField(term2886, term2886.getClass(), "templateType", term2943);
        setField(term2885, term2885.getClass(), "registry", term2886);
        setField(term2885, term2885.getClass(), "reverseInterpreter", null);
        setField(term2969, term2969.getClass(), "vars", null);
        setField(term2969, term2969.getClass(), "parent", null);
        setField(term2969, term2969.getClass(), "rootNode", null);
        setField(term2969, term2969.getClass(), "thisType", null);
        setBooleanField(term2969, term2969.getClass(), "isBottom", false);
        setField(term2885, term2885.getClass(), "syntacticScope", term2969);
        setField(term2885, term2885.getClass(), "functionScope", null);
        setField(term2885, term2885.getClass(), "bottomScope", null);
        setField(term2885, term2885.getClass(), "assignedOuterLocalVars", null);
        setField(term2885, term2885.getClass(), "unflowableVarNames", null);
        setField(term2885, term2885.getClass(), "cfg", null);
        setField(term2885, term2885.getClass(), "joinOp", null);
        setField(term2885, term2885.getClass(), "orderedWorkSet", null);
        term2971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2984 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2994 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2971, term2971.getClass(), "type", 1141317871);
        setIntField(term2973, term2973.getClass(), "type", -1963434938);
        setIntField(term2975, term2975.getClass(), "type", 0);
        setField(term2975, term2975.getClass(), "next", null);
        setField(term2975, term2975.getClass(), "first", null);
        setField(term2975, term2975.getClass(), "last", null);
        setField(term2975, term2975.getClass(), "propListHead", null);
        setIntField(term2975, term2975.getClass(), "sourcePosition", 0);
        setField(term2975, term2975.getClass(), "jsType", null);
        setField(term2975, term2975.getClass(), "parent", null);
        setField(term2973, term2973.getClass(), "next", term2975);
        setIntField(term2978, term2978.getClass(), "type", 0);
        setField(term2978, term2978.getClass(), "next", null);
        setField(term2978, term2978.getClass(), "first", null);
        setField(term2978, term2978.getClass(), "last", null);
        setField(term2978, term2978.getClass(), "propListHead", null);
        setIntField(term2978, term2978.getClass(), "sourcePosition", 0);
        setField(term2978, term2978.getClass(), "jsType", null);
        setField(term2978, term2978.getClass(), "parent", null);
        setField(term2973, term2973.getClass(), "first", term2978);
        setIntField(term2981, term2981.getClass(), "type", 0);
        setField(term2981, term2981.getClass(), "next", null);
        setField(term2981, term2981.getClass(), "first", null);
        setField(term2981, term2981.getClass(), "last", null);
        setField(term2981, term2981.getClass(), "propListHead", null);
        setIntField(term2981, term2981.getClass(), "sourcePosition", 0);
        setField(term2981, term2981.getClass(), "jsType", null);
        setField(term2981, term2981.getClass(), "parent", null);
        setField(term2973, term2973.getClass(), "last", term2981);
        setField(term2984, term2984.getClass(), "next", null);
        setIntField(term2984, term2984.getClass(), "type", 0);
        setIntField(term2984, term2984.getClass(), "intValue", 0);
        setField(term2984, term2984.getClass(), "objectValue", null);
        setField(term2973, term2973.getClass(), "propListHead", term2984);
        setIntField(term2973, term2973.getClass(), "sourcePosition", 1386130016);
        setField(term2973, term2973.getClass(), "jsType", null);
        setField(term2973, term2973.getClass(), "parent", null);
        setField(term2971, term2971.getClass(), "next", term2973);
        setIntField(term2988, term2988.getClass(), "type", 0);
        setField(term2988, term2988.getClass(), "next", null);
        setField(term2988, term2988.getClass(), "first", null);
        setField(term2988, term2988.getClass(), "last", null);
        setField(term2988, term2988.getClass(), "propListHead", null);
        setIntField(term2988, term2988.getClass(), "sourcePosition", 0);
        setField(term2988, term2988.getClass(), "jsType", null);
        setField(term2988, term2988.getClass(), "parent", null);
        setField(term2971, term2971.getClass(), "first", term2988);
        setIntField(term2991, term2991.getClass(), "type", 0);
        setField(term2991, term2991.getClass(), "next", null);
        setField(term2991, term2991.getClass(), "first", null);
        setField(term2991, term2991.getClass(), "last", null);
        setField(term2991, term2991.getClass(), "propListHead", null);
        setIntField(term2991, term2991.getClass(), "sourcePosition", 0);
        setField(term2991, term2991.getClass(), "jsType", null);
        setField(term2991, term2991.getClass(), "parent", null);
        setField(term2971, term2971.getClass(), "last", term2991);
        setField(term2994, term2994.getClass(), "next", null);
        setIntField(term2994, term2994.getClass(), "type", 0);
        setIntField(term2994, term2994.getClass(), "intValue", 0);
        setField(term2994, term2994.getClass(), "objectValue", null);
        setField(term2971, term2971.getClass(), "propListHead", term2994);
        setIntField(term2971, term2971.getClass(), "sourcePosition", 1072005683);
        setField(term2971, term2971.getClass(), "jsType", null);
        setField(term2971, term2971.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2971;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term2885, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


