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

public class TypeInference_getNativeType_159300705577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16125;
     Object enum116;

    public TypeInference_getNativeType_159300705577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16128 = new HashMap();
        HashMap term16137 = new HashMap();
        Set<Object> term50315 =  ((Map) term16137).keySet();
        HashSet term16136 = new HashSet((Collection<? extends Object>) term50315);
        HashMap term16144 = new HashMap();
        Set<Object> term50316 =  ((Map) term16144).keySet();
        HashSet term16143 = new HashSet((Collection<? extends Object>) term50316);
        HashMap term16151 = new HashMap();
        Set<Object> term50317 =  ((Map) term16151).keySet();
        HashSet term16150 = new HashSet((Collection<? extends Object>) term50317);
        HashMap term16157 = new HashMap();
        HashMap term16162 = new HashMap();
        Class<? extends Object> term50339 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term50338 = ((Class) term50339).getDeclaredField((String) "PUBLIC");
        ((Field) term50338).setAccessible(true);
        Object enum115 = ((Field) term50338).get((Object) null);
        term16125 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term16126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term16127 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term16183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16197 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16198 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16199 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16204 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16205 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16209 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term16125, term16125.getClass(), "compiler", null);
        setField(term16126, term16126.getClass(), "reporter", null);
        setField(term16126, term16126.getClass(), "nativeTypes", term16127);
        setField(term16126, term16126.getClass(), "namesToTypes", term16128);
        setField(term16126, term16126.getClass(), "namespaces", term16136);
        setField(term16126, term16126.getClass(), "enumTypeNames", term16143);
        setField(term16126, term16126.getClass(), "forwardDeclaredTypes", term16150);
        setField(term16126, term16126.getClass(), "typesIndexedByProperty", term16157);
        setField(term16126, term16126.getClass(), "greatestSubtypeByProperty", term16162);
        setField(term16126, term16126.getClass(), "interfaceToImplementors", null);
        setField(term16126, term16126.getClass(), "unresolvedNamedTypes", null);
        setField(term16126, term16126.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16126, term16126.getClass(), "lastGeneration", false);
        setField(term16126, term16126.getClass(), "templateTypeName", "LvztehSlhM");
        setField(term16183, term16183.getClass(), "name", "njvnWFTMxN");
        setField(term16183, term16183.getClass(), "referencedType", null);
        setBooleanField(term16183, term16183.getClass(), "visited", true);
        setField(term16198, term16198.getClass(), "baseType", null);
        setField(term16198, term16198.getClass(), "implementedInterfaces", null);
        setField(term16198, term16198.getClass(), "parameters", null);
        setField(term16198, term16198.getClass(), "thrownTypes", null);
        setField(term16198, term16198.getClass(), "templateTypeName", null);
        setField(term16198, term16198.getClass(), "description", null);
        setField(term16198, term16198.getClass(), "deprecated", null);
        setField(term16198, term16198.getClass(), "license", null);
        setField(term16198, term16198.getClass(), "suppressions", null);
        setField(term16197, term16197.getClass(), "info", term16198);
        setField(term16199, term16199.getClass(), "markers", null);
        setField(term16199, term16199.getClass(), "parameters", null);
        setField(term16199, term16199.getClass(), "throwsDescriptions", null);
        setField(term16199, term16199.getClass(), "blockDescription", null);
        setField(term16199, term16199.getClass(), "fileOverview", null);
        setField(term16199, term16199.getClass(), "returnDescription", null);
        setField(term16199, term16199.getClass(), "version", null);
        setField(term16199, term16199.getClass(), "authors", null);
        setField(term16199, term16199.getClass(), "sees", null);
        setField(term16197, term16197.getClass(), "documentation", term16199);
        setField(term16197, term16197.getClass(), "sourceName", "");
        setField(term16197, term16197.getClass(), "visibility", enum115);
        setIntField(term16197, term16197.getClass(), "bitset", -1133405894);
        setField(term16204, term16204.getClass(), "root", null);
        setField(term16204, term16204.getClass(), "sourceName", null);
        setField(term16204, term16204.getClass(), "registry", null);
        setField(term16197, term16197.getClass(), "type", term16204);
        setField(term16205, term16205.getClass(), "root", null);
        setField(term16205, term16205.getClass(), "sourceName", null);
        setField(term16205, term16205.getClass(), "registry", null);
        setField(term16197, term16197.getClass(), "thisType", term16205);
        setBooleanField(term16197, term16197.getClass(), "includeDocumentation", false);
        setField(term16183, term16183.getClass(), "docInfo", term16197);
        setBooleanField(term16183, term16183.getClass(), "unknown", true);
        setBooleanField(term16183, term16183.getClass(), "resolved", false);
        setField(term16183, term16183.getClass(), "resolveResult", null);
        setField(term16183, term16183.getClass(), "registry", null);
        setField(term16126, term16126.getClass(), "templateType", term16183);
        setField(term16125, term16125.getClass(), "registry", term16126);
        setField(term16125, term16125.getClass(), "reverseInterpreter", null);
        setField(term16209, term16209.getClass(), "vars", null);
        setField(term16209, term16209.getClass(), "parent", null);
        setField(term16209, term16209.getClass(), "rootNode", null);
        setField(term16209, term16209.getClass(), "thisType", null);
        setBooleanField(term16209, term16209.getClass(), "isBottom", false);
        setField(term16125, term16125.getClass(), "syntacticScope", term16209);
        setField(term16125, term16125.getClass(), "functionScope", null);
        setField(term16125, term16125.getClass(), "bottomScope", null);
        setField(term16125, term16125.getClass(), "assignedOuterLocalVars", null);
        setField(term16125, term16125.getClass(), "unflowableVarNames", null);
        setField(term16125, term16125.getClass(), "cfg", null);
        setField(term16125, term16125.getClass(), "joinOp", null);
        setField(term16125, term16125.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term50604 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term50603 = ((Class) term50604).getDeclaredField((String) "REFERENCE_ERROR_TYPE");
        ((Field) term50603).setAccessible(true);
        enum116 = ((Field) term50603).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum116;
        try {
            callMethod(klass, "getNativeType", argTypes, term16125, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


