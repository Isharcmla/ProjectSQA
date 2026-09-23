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

public class TypeInference_ensurePropertyDeclared_180733304751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4098;
     Object term4184;

    public TypeInference_ensurePropertyDeclared_180733304751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4101 = new HashMap();
        HashMap term4110 = new HashMap();
        Set<Object> term26524 =  ((Map) term4110).keySet();
        HashSet term4109 = new HashSet((Collection<? extends Object>) term26524);
        HashMap term4117 = new HashMap();
        Set<Object> term26525 =  ((Map) term4117).keySet();
        HashSet term4116 = new HashSet((Collection<? extends Object>) term26525);
        HashMap term4124 = new HashMap();
        Set<Object> term26526 =  ((Map) term4124).keySet();
        HashSet term4123 = new HashSet((Collection<? extends Object>) term26526);
        HashMap term4130 = new HashMap();
        HashMap term4135 = new HashMap();
        Class<? extends Object> term26548 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term26547 = ((Class) term26548).getDeclaredField((String) "PRIVATE");
        ((Field) term26547).setAccessible(true);
        Object enum60 = ((Field) term26547).get((Object) null);
        term4098 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4100 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term4156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4170 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4171 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4172 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4177 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4178 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4182 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4098, term4098.getClass(), "compiler", null);
        setField(term4099, term4099.getClass(), "reporter", null);
        setField(term4099, term4099.getClass(), "nativeTypes", term4100);
        setField(term4099, term4099.getClass(), "namesToTypes", term4101);
        setField(term4099, term4099.getClass(), "namespaces", term4109);
        setField(term4099, term4099.getClass(), "enumTypeNames", term4116);
        setField(term4099, term4099.getClass(), "forwardDeclaredTypes", term4123);
        setField(term4099, term4099.getClass(), "typesIndexedByProperty", term4130);
        setField(term4099, term4099.getClass(), "greatestSubtypeByProperty", term4135);
        setField(term4099, term4099.getClass(), "interfaceToImplementors", null);
        setField(term4099, term4099.getClass(), "unresolvedNamedTypes", null);
        setField(term4099, term4099.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4099, term4099.getClass(), "lastGeneration", false);
        setField(term4099, term4099.getClass(), "templateTypeName", "lFRJFUMVbx");
        setField(term4156, term4156.getClass(), "name", "sZdUNdggUW");
        setField(term4156, term4156.getClass(), "referencedType", null);
        setBooleanField(term4156, term4156.getClass(), "visited", false);
        setField(term4171, term4171.getClass(), "baseType", null);
        setField(term4171, term4171.getClass(), "implementedInterfaces", null);
        setField(term4171, term4171.getClass(), "parameters", null);
        setField(term4171, term4171.getClass(), "thrownTypes", null);
        setField(term4171, term4171.getClass(), "templateTypeName", null);
        setField(term4171, term4171.getClass(), "description", null);
        setField(term4171, term4171.getClass(), "deprecated", null);
        setField(term4171, term4171.getClass(), "license", null);
        setField(term4171, term4171.getClass(), "suppressions", null);
        setField(term4170, term4170.getClass(), "info", term4171);
        setField(term4172, term4172.getClass(), "markers", null);
        setField(term4172, term4172.getClass(), "parameters", null);
        setField(term4172, term4172.getClass(), "throwsDescriptions", null);
        setField(term4172, term4172.getClass(), "blockDescription", null);
        setField(term4172, term4172.getClass(), "fileOverview", null);
        setField(term4172, term4172.getClass(), "returnDescription", null);
        setField(term4172, term4172.getClass(), "version", null);
        setField(term4172, term4172.getClass(), "authors", null);
        setField(term4172, term4172.getClass(), "sees", null);
        setField(term4170, term4170.getClass(), "documentation", term4172);
        setField(term4170, term4170.getClass(), "sourceName", "");
        setField(term4170, term4170.getClass(), "visibility", enum60);
        setIntField(term4170, term4170.getClass(), "bitset", -1697741339);
        setField(term4177, term4177.getClass(), "root", null);
        setField(term4177, term4177.getClass(), "sourceName", null);
        setField(term4177, term4177.getClass(), "registry", null);
        setField(term4170, term4170.getClass(), "type", term4177);
        setField(term4178, term4178.getClass(), "root", null);
        setField(term4178, term4178.getClass(), "sourceName", null);
        setField(term4178, term4178.getClass(), "registry", null);
        setField(term4170, term4170.getClass(), "thisType", term4178);
        setBooleanField(term4170, term4170.getClass(), "includeDocumentation", true);
        setField(term4156, term4156.getClass(), "docInfo", term4170);
        setBooleanField(term4156, term4156.getClass(), "unknown", false);
        setBooleanField(term4156, term4156.getClass(), "resolved", true);
        setField(term4156, term4156.getClass(), "resolveResult", null);
        setField(term4156, term4156.getClass(), "registry", null);
        setField(term4099, term4099.getClass(), "templateType", term4156);
        setField(term4098, term4098.getClass(), "registry", term4099);
        setField(term4098, term4098.getClass(), "reverseInterpreter", null);
        setField(term4182, term4182.getClass(), "vars", null);
        setField(term4182, term4182.getClass(), "parent", null);
        setField(term4182, term4182.getClass(), "rootNode", null);
        setField(term4182, term4182.getClass(), "thisType", null);
        setBooleanField(term4182, term4182.getClass(), "isBottom", false);
        setField(term4098, term4098.getClass(), "syntacticScope", term4182);
        setField(term4098, term4098.getClass(), "functionScope", null);
        setField(term4098, term4098.getClass(), "bottomScope", null);
        setField(term4098, term4098.getClass(), "assignedOuterLocalVars", null);
        setField(term4098, term4098.getClass(), "unflowableVarNames", null);
        setField(term4098, term4098.getClass(), "cfg", null);
        setField(term4098, term4098.getClass(), "joinOp", null);
        setField(term4098, term4098.getClass(), "orderedWorkSet", null);
        term4184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4197 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4207 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4184, term4184.getClass(), "type", 1598895173);
        setIntField(term4186, term4186.getClass(), "type", 1953277050);
        setIntField(term4188, term4188.getClass(), "type", 0);
        setField(term4188, term4188.getClass(), "next", null);
        setField(term4188, term4188.getClass(), "first", null);
        setField(term4188, term4188.getClass(), "last", null);
        setField(term4188, term4188.getClass(), "propListHead", null);
        setIntField(term4188, term4188.getClass(), "sourcePosition", 0);
        setField(term4188, term4188.getClass(), "jsType", null);
        setField(term4188, term4188.getClass(), "parent", null);
        setField(term4186, term4186.getClass(), "next", term4188);
        setIntField(term4191, term4191.getClass(), "type", 0);
        setField(term4191, term4191.getClass(), "next", null);
        setField(term4191, term4191.getClass(), "first", null);
        setField(term4191, term4191.getClass(), "last", null);
        setField(term4191, term4191.getClass(), "propListHead", null);
        setIntField(term4191, term4191.getClass(), "sourcePosition", 0);
        setField(term4191, term4191.getClass(), "jsType", null);
        setField(term4191, term4191.getClass(), "parent", null);
        setField(term4186, term4186.getClass(), "first", term4191);
        setIntField(term4194, term4194.getClass(), "type", 0);
        setField(term4194, term4194.getClass(), "next", null);
        setField(term4194, term4194.getClass(), "first", null);
        setField(term4194, term4194.getClass(), "last", null);
        setField(term4194, term4194.getClass(), "propListHead", null);
        setIntField(term4194, term4194.getClass(), "sourcePosition", 0);
        setField(term4194, term4194.getClass(), "jsType", null);
        setField(term4194, term4194.getClass(), "parent", null);
        setField(term4186, term4186.getClass(), "last", term4194);
        setField(term4197, term4197.getClass(), "next", null);
        setIntField(term4197, term4197.getClass(), "type", 0);
        setIntField(term4197, term4197.getClass(), "intValue", 0);
        setField(term4197, term4197.getClass(), "objectValue", null);
        setField(term4186, term4186.getClass(), "propListHead", term4197);
        setIntField(term4186, term4186.getClass(), "sourcePosition", 1398204340);
        setField(term4186, term4186.getClass(), "jsType", null);
        setField(term4186, term4186.getClass(), "parent", null);
        setField(term4184, term4184.getClass(), "next", term4186);
        setIntField(term4201, term4201.getClass(), "type", 0);
        setField(term4201, term4201.getClass(), "next", null);
        setField(term4201, term4201.getClass(), "first", null);
        setField(term4201, term4201.getClass(), "last", null);
        setField(term4201, term4201.getClass(), "propListHead", null);
        setIntField(term4201, term4201.getClass(), "sourcePosition", 0);
        setField(term4201, term4201.getClass(), "jsType", null);
        setField(term4201, term4201.getClass(), "parent", null);
        setField(term4184, term4184.getClass(), "first", term4201);
        setIntField(term4204, term4204.getClass(), "type", 0);
        setField(term4204, term4204.getClass(), "next", null);
        setField(term4204, term4204.getClass(), "first", null);
        setField(term4204, term4204.getClass(), "last", null);
        setField(term4204, term4204.getClass(), "propListHead", null);
        setIntField(term4204, term4204.getClass(), "sourcePosition", 0);
        setField(term4204, term4204.getClass(), "jsType", null);
        setField(term4204, term4204.getClass(), "parent", null);
        setField(term4184, term4184.getClass(), "last", term4204);
        setField(term4207, term4207.getClass(), "next", null);
        setIntField(term4207, term4207.getClass(), "type", 0);
        setIntField(term4207, term4207.getClass(), "intValue", 0);
        setField(term4207, term4207.getClass(), "objectValue", null);
        setField(term4184, term4184.getClass(), "propListHead", term4207);
        setIntField(term4184, term4184.getClass(), "sourcePosition", 229204365);
        setField(term4184, term4184.getClass(), "jsType", null);
        setField(term4184, term4184.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4184;
        try {
            callMethod(klass, "ensurePropertyDeclared", argTypes, term4098, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


