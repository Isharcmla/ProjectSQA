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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_updateScopeForTypeChange_92580065149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3286;
     Object term3371;

    public TypeInference_updateScopeForTypeChange_92580065149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3289 = new HashMap();
        HashMap term3298 = new HashMap();
        Set<Object> term25291 =  ((Map) term3298).keySet();
        HashSet term3297 = new HashSet((Collection<? extends Object>) term25291);
        HashMap term3304 = new HashMap();
        Set<Object> term25292 =  ((Map) term3304).keySet();
        HashSet term3303 = new HashSet((Collection<? extends Object>) term25292);
        HashMap term3311 = new HashMap();
        Set<Object> term25293 =  ((Map) term3311).keySet();
        HashSet term3310 = new HashSet((Collection<? extends Object>) term25293);
        HashMap term3317 = new HashMap();
        HashMap term3322 = new HashMap();
        Class<? extends Object> term25315 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term25314 = ((Class) term25315).getDeclaredField((String) "PUBLIC");
        ((Field) term25314).setAccessible(true);
        Object enum58 = ((Field) term25314).get((Object) null);
        term3286 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term3287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3288 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term3343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3358 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term3359 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term3364 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3365 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3369 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term3286, term3286.getClass(), "compiler", null);
        setField(term3287, term3287.getClass(), "reporter", null);
        setField(term3287, term3287.getClass(), "nativeTypes", term3288);
        setField(term3287, term3287.getClass(), "namesToTypes", term3289);
        setField(term3287, term3287.getClass(), "namespaces", term3297);
        setField(term3287, term3287.getClass(), "enumTypeNames", term3303);
        setField(term3287, term3287.getClass(), "forwardDeclaredTypes", term3310);
        setField(term3287, term3287.getClass(), "typesIndexedByProperty", term3317);
        setField(term3287, term3287.getClass(), "greatestSubtypeByProperty", term3322);
        setField(term3287, term3287.getClass(), "interfaceToImplementors", null);
        setField(term3287, term3287.getClass(), "unresolvedNamedTypes", null);
        setField(term3287, term3287.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3287, term3287.getClass(), "lastGeneration", false);
        setField(term3287, term3287.getClass(), "templateTypeName", "jwsfVjMoJT");
        setField(term3343, term3343.getClass(), "name", "ZfdXfCCFDf");
        setField(term3343, term3343.getClass(), "referencedType", null);
        setBooleanField(term3343, term3343.getClass(), "visited", false);
        setField(term3358, term3358.getClass(), "baseType", null);
        setField(term3358, term3358.getClass(), "implementedInterfaces", null);
        setField(term3358, term3358.getClass(), "parameters", null);
        setField(term3358, term3358.getClass(), "thrownTypes", null);
        setField(term3358, term3358.getClass(), "templateTypeName", null);
        setField(term3358, term3358.getClass(), "description", null);
        setField(term3358, term3358.getClass(), "deprecated", null);
        setField(term3358, term3358.getClass(), "license", null);
        setField(term3358, term3358.getClass(), "suppressions", null);
        setField(term3357, term3357.getClass(), "info", term3358);
        setField(term3359, term3359.getClass(), "markers", null);
        setField(term3359, term3359.getClass(), "parameters", null);
        setField(term3359, term3359.getClass(), "throwsDescriptions", null);
        setField(term3359, term3359.getClass(), "blockDescription", null);
        setField(term3359, term3359.getClass(), "fileOverview", null);
        setField(term3359, term3359.getClass(), "returnDescription", null);
        setField(term3359, term3359.getClass(), "version", null);
        setField(term3359, term3359.getClass(), "authors", null);
        setField(term3359, term3359.getClass(), "sees", null);
        setField(term3357, term3357.getClass(), "documentation", term3359);
        setField(term3357, term3357.getClass(), "sourceName", "");
        setField(term3357, term3357.getClass(), "visibility", enum58);
        setIntField(term3357, term3357.getClass(), "bitset", 1861318859);
        setField(term3364, term3364.getClass(), "root", null);
        setField(term3364, term3364.getClass(), "sourceName", null);
        setField(term3364, term3364.getClass(), "registry", null);
        setField(term3357, term3357.getClass(), "type", term3364);
        setField(term3365, term3365.getClass(), "root", null);
        setField(term3365, term3365.getClass(), "sourceName", null);
        setField(term3365, term3365.getClass(), "registry", null);
        setField(term3357, term3357.getClass(), "thisType", term3365);
        setBooleanField(term3357, term3357.getClass(), "includeDocumentation", true);
        setField(term3343, term3343.getClass(), "docInfo", term3357);
        setBooleanField(term3343, term3343.getClass(), "unknown", true);
        setBooleanField(term3343, term3343.getClass(), "resolved", false);
        setField(term3343, term3343.getClass(), "resolveResult", null);
        setField(term3343, term3343.getClass(), "registry", null);
        setField(term3287, term3287.getClass(), "templateType", term3343);
        setField(term3286, term3286.getClass(), "registry", term3287);
        setField(term3286, term3286.getClass(), "reverseInterpreter", null);
        setField(term3369, term3369.getClass(), "vars", null);
        setField(term3369, term3369.getClass(), "parent", null);
        setField(term3369, term3369.getClass(), "rootNode", null);
        setField(term3369, term3369.getClass(), "thisType", null);
        setBooleanField(term3369, term3369.getClass(), "isBottom", false);
        setField(term3286, term3286.getClass(), "syntacticScope", term3369);
        setField(term3286, term3286.getClass(), "functionScope", null);
        setField(term3286, term3286.getClass(), "bottomScope", null);
        setField(term3286, term3286.getClass(), "assignedOuterLocalVars", null);
        setField(term3286, term3286.getClass(), "unflowableVarNames", null);
        setField(term3286, term3286.getClass(), "cfg", null);
        setField(term3286, term3286.getClass(), "joinOp", null);
        setField(term3286, term3286.getClass(), "orderedWorkSet", null);
        term3371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3384 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3394 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3371, term3371.getClass(), "type", 1107176718);
        setIntField(term3373, term3373.getClass(), "type", 538259104);
        setIntField(term3375, term3375.getClass(), "type", 0);
        setField(term3375, term3375.getClass(), "next", null);
        setField(term3375, term3375.getClass(), "first", null);
        setField(term3375, term3375.getClass(), "last", null);
        setField(term3375, term3375.getClass(), "propListHead", null);
        setIntField(term3375, term3375.getClass(), "sourcePosition", 0);
        setField(term3375, term3375.getClass(), "jsType", null);
        setField(term3375, term3375.getClass(), "parent", null);
        setField(term3373, term3373.getClass(), "next", term3375);
        setIntField(term3378, term3378.getClass(), "type", 0);
        setField(term3378, term3378.getClass(), "next", null);
        setField(term3378, term3378.getClass(), "first", null);
        setField(term3378, term3378.getClass(), "last", null);
        setField(term3378, term3378.getClass(), "propListHead", null);
        setIntField(term3378, term3378.getClass(), "sourcePosition", 0);
        setField(term3378, term3378.getClass(), "jsType", null);
        setField(term3378, term3378.getClass(), "parent", null);
        setField(term3373, term3373.getClass(), "first", term3378);
        setIntField(term3381, term3381.getClass(), "type", 0);
        setField(term3381, term3381.getClass(), "next", null);
        setField(term3381, term3381.getClass(), "first", null);
        setField(term3381, term3381.getClass(), "last", null);
        setField(term3381, term3381.getClass(), "propListHead", null);
        setIntField(term3381, term3381.getClass(), "sourcePosition", 0);
        setField(term3381, term3381.getClass(), "jsType", null);
        setField(term3381, term3381.getClass(), "parent", null);
        setField(term3373, term3373.getClass(), "last", term3381);
        setField(term3384, term3384.getClass(), "next", null);
        setIntField(term3384, term3384.getClass(), "type", 0);
        setIntField(term3384, term3384.getClass(), "intValue", 0);
        setField(term3384, term3384.getClass(), "objectValue", null);
        setField(term3373, term3373.getClass(), "propListHead", term3384);
        setIntField(term3373, term3373.getClass(), "sourcePosition", 107945604);
        setField(term3373, term3373.getClass(), "jsType", null);
        setField(term3373, term3373.getClass(), "parent", null);
        setField(term3371, term3371.getClass(), "next", term3373);
        setIntField(term3388, term3388.getClass(), "type", 0);
        setField(term3388, term3388.getClass(), "next", null);
        setField(term3388, term3388.getClass(), "first", null);
        setField(term3388, term3388.getClass(), "last", null);
        setField(term3388, term3388.getClass(), "propListHead", null);
        setIntField(term3388, term3388.getClass(), "sourcePosition", 0);
        setField(term3388, term3388.getClass(), "jsType", null);
        setField(term3388, term3388.getClass(), "parent", null);
        setField(term3371, term3371.getClass(), "first", term3388);
        setIntField(term3391, term3391.getClass(), "type", 0);
        setField(term3391, term3391.getClass(), "next", null);
        setField(term3391, term3391.getClass(), "first", null);
        setField(term3391, term3391.getClass(), "last", null);
        setField(term3391, term3391.getClass(), "propListHead", null);
        setIntField(term3391, term3391.getClass(), "sourcePosition", 0);
        setField(term3391, term3391.getClass(), "jsType", null);
        setField(term3391, term3391.getClass(), "parent", null);
        setField(term3371, term3371.getClass(), "last", term3391);
        setField(term3394, term3394.getClass(), "next", null);
        setIntField(term3394, term3394.getClass(), "type", 0);
        setIntField(term3394, term3394.getClass(), "intValue", 0);
        setField(term3394, term3394.getClass(), "objectValue", null);
        setField(term3371, term3371.getClass(), "propListHead", term3394);
        setIntField(term3371, term3371.getClass(), "sourcePosition", -1963464809);
        setField(term3371, term3371.getClass(), "jsType", null);
        setField(term3371, term3371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3371;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "updateScopeForTypeChange", argTypes, term3286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


